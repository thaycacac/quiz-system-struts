<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>Login</title>
    </head>

    <body>
        <s:form action="login" method="post">
            <s:textfield label="Login Id" key="username"/>
            <s:password label="Password" key="password"/>
            <s:submit/>
        </s:form>
    </body>
</html>

