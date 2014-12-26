/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flights.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.flights.bean.ResultMapperBean;

/**
 *
 * @author prasannabalaji
 */
public class ParseJSONUtil {

    /**
     * Method to process JSON and pick the intended parameters
     * @param jarray
     * @return java.util.ArrayList
     * @throws java.io.IOException
     */
    public ArrayList<ResultMapperBean> parseJSON(String jarray) throws IOException {
        ArrayList<ResultMapperBean> resultBean = new ArrayList<ResultMapperBean>();
        JSONParser jsonParser = new JSONParser();
        //Splitting JSON array between multiple API response
        JSONArray jsonMasterArray = new JSONArray();
        try {
            jsonMasterArray = (JSONArray) jsonParser.parse(jarray);
        } catch (ParseException ex) {
            Logger.getLogger(ParseJSONUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        Iterator itr1 = jsonMasterArray.iterator();
        int flagSet = 0;
        while (itr1.hasNext()) {
            JSONObject innerObj = (JSONObject) itr1.next();
            if (flagSet == 0) {
                ++flagSet;
                continue;
            }

            JSONObject structure = (JSONObject) innerObj.get("data");
            JSONArray onwardflights = (JSONArray) structure.get("onwardflights");
            Iterator itr2 = onwardflights.iterator();

            while (itr2.hasNext()) {
                JSONObject intoInnerObj = (JSONObject) itr2.next();
                ResultMapperBean result = new ResultMapperBean(intoInnerObj.get("flightcode").toString(), intoInnerObj.get("airline").toString(), intoInnerObj.get("duration").toString(), intoInnerObj.get("arrdate").toString(), intoInnerObj.get("depdate").toString(), intoInnerObj.get("seatsavailable").toString());
                resultBean.add(result);
            }
        }
        return resultBean;

    }
}
