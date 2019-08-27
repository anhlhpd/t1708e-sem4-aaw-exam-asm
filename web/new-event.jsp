<%--
  Created by IntelliJ IDEA.
  User: Phuong Anh
  Date: 8/24/2019
  Time: 7:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>New Event</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <h1>New Event</h1>
    <s:form action="store" method="POST">
        <s:textfield label="When?" name="event.date" type="date"/>
        <s:textfield type="time" label="Time" name="event.time"/>
        <s:textfield label="What are you planning?" name="event.name"/>
        <s:textfield label="Where?" name="event.place"/>
        <s:textfield label="More infor?" name="event.description"/>
        <s:submit value="Create event" />
    </s:form>
</body>
</html>
