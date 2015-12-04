<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Spring  MVC  - Contact Manager</title>
</head>
<body>
<h2>Contact Manager</h2>

<form:form method="post" action="addContact.html">
<table>
<tr>
		<td colspan="2">
			<input type="submit" value="Add Contact"/>
		</td>
	</tr>
</table>	
	
</form:form>
</body>
</html>