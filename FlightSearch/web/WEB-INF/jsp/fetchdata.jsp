<%-- 
    Document   : showoutput
    Created on : Nov 28, 2014, 6:42:18 PM
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
        <title>Airline Details</title>

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

        <style>
            #displaydata {
                width : 100%;
                height: 600px;
            }
            #header {
                width : 100%;
                height: 100px;
            }
            #header h2 {
                text-align: center;
                font-weight: bolder;
                font-family: sans-serif;
            }
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 5px;
            }
            table {
                text-align: center;
                empty-cells: show;
            }
        </style>
    </head>
    <body>
        <div id="displaydata">
            <div id="header">
                <h2>Flight Search Results</h2>
                <span id="hint" style="font-size: 12px;font: italic; float: right; color: red">*Empty rows indicate no flights available for the search criteria</span>
            </div>
            <div id="content">
                <center>
                    <table>
                        <tr>
                            <th>Flight ID</th>
                            <th>Airlines</th>
                            <th>Duration</th>
                            <th>Departure Time</th>
                            <th>Arrival Time</th>
                            <th>Seats Available</th>
                        </tr>
                        <c:forEach items="${results}" var="result">
                            <tr>
                                <td>${result.flightcode}</td>
                                <td><c:out value="${result.airline}" /></td>
                                <td><c:out value="${result.duration}" /></td>
                                <td><c:out value="${result.depdate}" /></td>
                                <td><c:out value="${result.arrdate}" /></td>
                                <td><c:out value="${result.seatsavailable}" /></td>
                            </tr>
                        </c:forEach>
                    </table>
                </center>
            </div>
        </div>
    </body>

    <script>
        
        
    </script>  

</html>
