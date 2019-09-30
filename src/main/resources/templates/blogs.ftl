<html>
<head></head>
<body>
<table>
<#list blogs as blog1>
<tr>
<td>${blog1.username}</td>
<td>${blog1.password}</td>
</tr>
</#list>
</table>
</body>
</html>