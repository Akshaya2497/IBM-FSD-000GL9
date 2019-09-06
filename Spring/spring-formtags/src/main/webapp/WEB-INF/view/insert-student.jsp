<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Entry</title>
</head>
<body>
<form:form action="processform" modelAttribute="student">
Name <form:input path="name"/><br/>

Year <form:input path="year"/><br/>
Department:
<form:select path="department">
		
			<form:options items="${student.departmentoptions}" />
			
		</form:select><br/>
Interest:
Machine Learning <form:checkbox path="intrests" value="ml"/>
Artificial Intelligence <form:checkbox path="intrests" value="ai"/>	
Data Science <form:checkbox path="intrests" value="ds"/>	
		
		<input type="submit" value="Submit" />
</form:form>
</body>
</html>