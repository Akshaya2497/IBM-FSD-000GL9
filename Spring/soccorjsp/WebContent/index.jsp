<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>

<h1>Add A New League....</h1><br/>
	<form id="form-1" action="add_league.do" method="get">
	
		<label for="input-1">League Title</label>
		<input id="input-1" name="title" required="true" type="text"/><br/>
		<label for="input-2">Year</label>
		<input id="input-2" name="year" "true" type="text"/><br/>
		<label for="input-3">Season</label>
		<select name="season">
		<option value="Unknmown">Select...</option>
		<option value="Summer">SUMMER</option>
		<option value="Winter">WINTER</option>
		<option value="Autumn">Autumn</option>
		<option value="Spring">Spring</option>
		</select><br/>
		<input type="submit" value="Add League" id="button-1"/>
		<input type="reset" value="Reset" id="button-2"/>
	</form>
	
</body>
</html>