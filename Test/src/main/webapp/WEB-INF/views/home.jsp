<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@taglib
	uri="http://www.springframework.org/tags/form" prefix="form"%><%@taglib
	uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<form:form action="home" method="POST">
		<input value="Bon" name="bon" type="submit" id="btnSave"
			class="submit_button">
		<input value="Afisaj" name="afisaj" type="submit" id="btnPrevious"
			class="submit_button">
		<input value="Grefier" name="grefier" type="submit" id="btnPrevious"
			class="submit_button">
	</form:form>
	
</body>
</html>
