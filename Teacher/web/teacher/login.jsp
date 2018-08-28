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
        <s:div cssClass="container">
            <s:div cssClass="container-login">
                <h1>Teacher Login</h1>
                <s:form action="login" method="post">
                    <s:textfield label="Name" key="username"/>               
                    <s:submit cssClass="btn btn-primary"/>
                </s:form>
            </s:div>
        </s:div>

    </body>
</html>
