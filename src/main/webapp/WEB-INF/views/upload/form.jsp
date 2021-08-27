<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>CoderBy</title>
</head>
<body>

<form action="/upload/new" method="post" class="write" enctype="multipart/form-data" name="write_profile">

	<input type="file" name="file"> <!-- enctype="multipart/form-data" & 컨트롤러에선 multipartFile -->
	<input type="submit" value="SAVE">
	<input type="reset" value="CANCEL">
</form>
</body>
</html>