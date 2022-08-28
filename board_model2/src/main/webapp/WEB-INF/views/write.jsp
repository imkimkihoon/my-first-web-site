<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="write_ok">
		<table width="600" align="center">
		<caption> <h2> 글 쓰 기 </h2></caption>
			<tr>
				<td> 제목 </td>
				<td> <input type="text" name="title" size="50"> </td>
			</tr>
			<tr>
				<td> 이름 </td>
				<td> <input type="text" name="userid"> </td>
			</tr>
			<tr>
				<td> 비밀번호 </td>
				<td> <input type="password" name="pwd"> </td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> <textarea cols="50" rows="7" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="4" align="center"> <input type="submit" value="저장"> </td>
			</tr>
		</table>
	</form>
</body>
</html>