<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../myStyle.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
              crossorigin="anonymous">
        <title>Login Quiz</title>
    </head>
    <body>
        <div class="container">
            <div class="container-login">
                <h1>List Student ${teacher.id}</h1>
                <hr>
                <ul class="list-group">
                    <c:forEach var="quiz" items="${listqs}">
                        <s:form action="showResult" method="post">
                            <%--<s:hidden name="quizsessionid" key="1"/>--%>
                            <s:param name="quizsessionid">1</s:param>
                            <!--TODO-->
                            <li class="list-group-item">${quiz.titleQuiz}
                                <c:if test="${quiz.isInProgress == true}">
                                    <s:submit cssClass="btn btn-info" value="View Result" />
                                </c:if>
                            </li>
                            
                        </s:form>

                    </c:forEach>
                </ul>
            </div>
        </div>
    </body>
</html>
