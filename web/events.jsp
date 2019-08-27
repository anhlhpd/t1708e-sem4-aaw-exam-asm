<%--
  Created by IntelliJ IDEA.
  User: Phuong Anh
  Date: 8/24/2019
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Events</title>
</head>
<body>
<h1>List Events</h1>
<ul>
    <s:iterator value="events" >
        <li>
            <div>
                <label>Date:</label>
                <s:property value="date"/>
            </div>
            <div>
                <label>Time:</label>
                <s:property value="time"/>
            </div>
            <div>
                <label>Name:</label>
                <s:property value="name"/>
            </div>
            <div>
                <label>Description:</label>
                <s:property value="description"/>
            </div>
            <div>
                <s:form action="edit">
                    <s:hidden name="editId" value="%{id}" />
                    <s:submit action="edit" value="Edit"/>
                </s:form>
                <s:form action="delete">
                    <s:hidden name="editId" value="%{id}" />
                    <s:submit action="delete" value="Delete"/>
                </s:form>
            </div>
            <div>
                -------------------------------------------------------------------
            </div>
        </li>
    </s:iterator>
</ul>
</body>
</html>
