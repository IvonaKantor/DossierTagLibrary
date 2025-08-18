<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="my" uri="/WEB-INF/tags.tld" %>

<!DOCTYPE html>
<html>
<head>
    <title>Data entry form</title>
</head>
<body>
<h1>Enter your personal data</h1>

<my:dossier>
    <my:surname/><br/>
    <my:lastname/><br/>
    <my:sex/><br/>
    <my:submit/><br/>
</my:dossier>
</body>
</html>