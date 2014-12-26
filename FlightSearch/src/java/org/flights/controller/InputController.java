/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flights.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.flights.bean.InputFormBean;

/**
 *
 * @author prasannabalaji
 */
public class InputController {

    /**
     * Controller method for getting input parameters for API requests
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "getinput.htm")
    public ModelAndView getInput() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("inputentity", new InputFormBean());
        return modelAndView;
    }
}
