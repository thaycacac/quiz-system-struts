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
        <meta http-equiv="refresh" content="3">
    </head>
    <body>
        <div class="container">
            <div class="container-teacher">
                <h1>${title}</h1>
                <hr>
                <table class="table table-hover ">
                    <thead>
                        <tr>
                            <th scope="col" class="bg-danger" style="color: white">Name</th>
                                <c:forEach var="num" items="${numQuestion}">
                                <th scope="col" class="bg-warning">${num}</th>
                                </c:forEach>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="record" items="${listRR}">
                            <tr>
                                <th scope="row" style="text-transform: uppercase">${record.name}
                                    <p style="display: inline; float: right">${record.process}%</p>
                                </th>
                                <c:forEach var="answer" items="${record.listAns}">
                                    <td class="${(answer == true) ? 'border-quiz-done' :'border-quiz' }"></td>
                                </c:forEach>
                            </tr>
                        </c:forEach>
                        <tr class="table-primary">
                            <th scope="row">All Class</th>
                                <c:forEach var="question" items="${listTotal}">
                                <td style="color: red">${question}%</td>
                            </c:forEach>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
