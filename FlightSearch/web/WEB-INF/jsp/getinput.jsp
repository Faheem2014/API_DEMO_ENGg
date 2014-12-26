<%-- 
    Document   : getinput.jsp
    Created on : Nov 28, 2014, 6:15:19 PM
    Author     : Prasanna Balaji
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>API Onboard</title>

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <style>
            #container {
                width: 100%;
            }

            #header {
                width: 100%;
                height: 100px;
                background-color: blue;
            }

            #content {
                width: 100%;
                height: 500px;
                background-color: gray;
            }

            #appdetails {
                width: 50%;
                height: 500px;
                float: left;
            }

            #parameters {
                width: 50%;
                height: 500px;
                float: right;
            }
            #appdetails table {
                padding-left: 30px;

            }
            #header h1 {
                font-weight: bolder;
                padding-top: 20px;
                padding-left: 20px;
            }
        </style>
    </head>
    <body>
        <div id="container">
            <div id="header">
                <h1>API Onboarding POC</h1>
            </div>
            <div id="content">
                <form:form id="inputPage" commandName="inputentity" action="fetchdata.htm" method="post">
                    <div id="appdetails">

                        <table>
                            <thead>
                            <h2><b><center>API Details</center></b></h2>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><form:label path="apiName">API Name</form:label></td>
                                    <td>&nbsp;&nbsp;<form:input type="text" path="apiName" style="width:250px;" id="apiName" value="goibibo" maxlength="10" readonly="true"/></td>

                                </tr>

                                <tr>
                                    <td><form:label path="appID">App ID</form:label></td>
                                    <td>&nbsp;&nbsp;<form:input type="text" path="appID" style="width:250px;" id="appID" value="56f99418" maxlength="10" readonly="true"/></td>

                                </tr>

                                <tr>
                                    <td><form:label path="appSecretKey">APP Secret Key</form:label></td>
                                    <td>&nbsp;&nbsp;<form:input type="password" path="appSecretKey" style="width:250px;" id="appSecretKey" value="acd85914fbf523675df09c79f3176e5b" maxlength="30" readonly="true"/></td>

                                </tr>

                                <tr></tr>
                                <tr></tr>
                                <tr></tr>
                                <tr></tr>
                                <tr></tr>
                            </tbody>
                        </table>
                        <center><input id="showButton" type="button" value="Save Details" onclick="showParameters()"/></center>
                    </div>
                    <div id="parameters">

                        <table>
                            <thead>
                            <h2><b><center>Search Flights</center></b></h2>
                            </thead>
                            <tbody>
                                <tr>
                                    <td><form:label path="fromPlace">From*</form:label></td>
                                    <td>&nbsp;&nbsp;<form:input type="text" path="fromPlace" id="fromPlace" value="" maxlength="3"/></td>

                                    <td><form:label path="toPlace">To*</form:label></td>
                                    <td>&nbsp;&nbsp;<form:input type="text" path="toPlace" id="toPlace" value="" maxlength="3"/></td>

                                </tr>

                                <tr>
                                    <td><form:label path="date">Date*</form:label></td>
                                    <td>&nbsp;&nbsp;<form:input type="text" path="date" id="date" value="" maxlength="2"/></td>

                                    <td><form:label path="month">Month*</form:label></td>
                                    <td>&nbsp;&nbsp;<form:input type="text" path="month" id="month" value="" maxlength="2"/></td>

                                    <td><form:label path="year">Year*</form:label></td>
                                    <td>&nbsp;&nbsp;<form:input type="text" path="year" id="year" value="" maxlength="4"/></td>
                                </tr>

                                <tr>
                                    <td><form:label path="seatClass">Class*</form:label></td>
                                    <td>&nbsp;&nbsp<form:select path="seatClass" id="seatClass">
                                            <form:option value="E">E</form:option>
                                            <form:option value="B">B</form:option>
                                        </form:select>
                                    </td>
                                <tr>

                                <tr>
                                    <td><form:label path="adultCount">Adults*</form:label></td>
                                    <td>&nbsp;&nbsp;<form:input type="text" path="adultCount" id="adultCount" value="" maxlength="1"/></td>

                                    <td><form:label path="childCount">Child*</form:label></td>
                                    <td>&nbsp;&nbsp;<form:input type="text" path="childCount" id="childCount" value="" maxlength="1"/></td>

                                    <td><form:label path="infantCount">Infants*</form:label></td>
                                    <td>&nbsp;&nbsp;<form:input type="text" path="infantCount" id="infantCount" value="" maxlength="1"/></td>
                                </tr>
                                <tr></tr>
                                <tr></tr>
                                <tr></tr>
                                <tr></tr>
                            </tbody>
                        </table>
                        <center>  <input id="submitButton" type="button" value="Search Flights" onclick="if(formValidated()){this.form.submit();}"/></center>
                        </form:form>
                </div>
            </div>
        </div>
    </body>
    <script>
        $(function(){
            hideParameters();
        });
        function hideParameters(){
            $( "#parameters" ).hide();
        }

        function showParameters(){
            $( "#parameters" ).show();
        }
        function formValidated(){
            var fromPlace = $('#fromPlace').val();
            var toPlace = $('#toPlace').val();
            var date = $('#date').val();
            var month = $('#month').val();
            var year = $('#year').val();
            var adults = parseInt($('#adultCount').val());
            var child = parseInt($('#childCount').val());
            var infant = parseInt($('#infantCount').val());
            if(fromPlace=="" || fromPlace==null || fromPlace.length<3 || toPlace=="" || toPlace==null || toPlace.length<3){
                alert('Blank or incorrect Source & Destination');
                return false;
            }
            if(date=="" || date==null || date.length==0 || date==0 || month=="" || month==null || month.length==0 || month==0 || year=="" || year==null || year.length<4 ){
                alert('Blank or incorrect Date of Journey');
                return false;
            }
            if(adults=="" || adults==null || child=="" || child==null || infant=="" || infant==null ){
                alert('Enter Proper counts | If no children/infant available enter 0');
                return false;
            }
            if(infant>adults) {
                alert('Infant count cannot be greater than Adult count');
                return false;
            }
            return true;
        }
        
    </script>
</html>
