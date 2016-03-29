<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title>Test page</title>
</head>
<body>
<h1>
    Grefier
    
    <form:form action="home">
    		<input type="submit" value="Inapoi"/>
    </form:form>
</h1>
</body>
</html>