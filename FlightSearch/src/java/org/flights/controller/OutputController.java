/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flights.controller;

import org.flights.util.ParseJSONUtil;
import com.reportinghub.clipcentric.impl.RequestHandler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.flights.bean.InputFormBean;
import org.flights.bean.ResultMapperBean;

/**
 *
 * @author Prasanna Balaji
 */
public class OutputController {

    /**
     * Controller method for fetching data from APIs and Process JSON
     * @param org.flights.bean.InputFormBean
     * @param org.springframework.ui.ModelMap
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "fetchdata.htm", method = RequestMethod.POST)
    public ModelAndView fetchData(@ModelAttribute("inputentity") InputFormBean inputBean, ModelMap model) {
        String jarray = "";
        ModelAndView modelAndView = new ModelAndView();
        RequestHandler reqhlr = new RequestHandler();
        ParseJSONUtil parserUtil = new ParseJSONUtil();
        ArrayList<ResultMapperBean> resultsBean = new ArrayList<ResultMapperBean>();

        //Method call for fetching multiple APIs response
        jarray = reqhlr.getMultiFlights(inputBean.getFromPlace(), inputBean.getToPlace(), inputBean.getDate(), inputBean.getMonth(), inputBean.getYear(), inputBean.getSeatClass(), inputBean.getAdultCount(), inputBean.getChildCount(), inputBean.getInfantCount());
        model.addAttribute("jarray", jarray);
        try {
            resultsBean = parserUtil.parseJSON(jarray);
            model.addAttribute("results", resultsBean);
        } catch (IOException ex) {
            Logger.getLogger(OutputController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelAndView;
    }
}
