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
    Genereaza bon
</h1>
    <form:form action="cauta">
    		<input type="text" name="nrDosar"/>
    		<input type="submit" value="Cauta"/>
    		<label>${firmaGasita}</label>
    </form:form>
    
   <form:form action="tipareste">
    		<input type="submit" value="Tipareste"/>    		
    </form:form>
    
    <form:form action="home">
    		<input type="submit" value="Inapoi"/>
    </form:form>
</body>
</html>