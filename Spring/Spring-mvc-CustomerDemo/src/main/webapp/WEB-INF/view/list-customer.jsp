<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	
	

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Add Customer"
				   onclick="window.location.href='create'; return false;"
				   class="add-button"
			/>
		
			
		
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				
				
				<c:forEach var="tempCustomer" items="${customer}">
				
					<tr>
						<td> ${tempCustomer.fname} </td>
						<td> ${tempCustomer.lname} </td>
						<td> ${tempCustomer.email} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>