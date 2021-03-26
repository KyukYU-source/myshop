<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link 	href="resources/css/project.css"
		type="text/css"
		rel="stylesheet"
>

</head>
<body>
<div id="total">
	<div id="top2">장바구니 들어갈 공간</div>
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include>
	</div>
	<div id="content">
		<form action="member">
			<table>
				<tr>
					<td height="50" width="100" bgcolor="yellow" align="center">이름</td>
					<td bgcolor="blue" width="200">
						<input type="text" name="member_name" size="30">						
					</td>	
				</tr>
				<tr>
					<td height="50" width="100" bgcolor="yellow" align="center">주민등록번호</td>
					<td bgcolor="blue" width="200">
						<input type="text" name="member_rnum" size="30">						
					</td>	
				</tr>
				<tr>
					<td height="50" width="100" bgcolor="yellow" align="center">아이디</td>
					<td bgcolor="blue" width="200">
						<input type="text" name="member_id" size="30">						
					</td>	
				</tr>
				<tr>
					<td height="50" width="100" bgcolor="yellow" align="center">비밀번호</td>
					<td bgcolor="blue" width="200">
						<input type="password" name="member_pw" size="30">						
					</td>	
				</tr>
				<tr>
					<td height="50" width="100" bgcolor="yellow" align="center">주소</td>
					<td bgcolor="blue" width="200">
						<input type="text" name="member_addr" size="30">						
					</td>	
				</tr>
				<tr>
					<td height="50" width="100" bgcolor="yellow" align="center">핸드폰번호</td>
					<td bgcolor="blue" width="200">
						<input type="text" name="member_tel" size="30">						
					</td>	
				</tr>
				<tr>
					<td bgcolor="blue" width="200" colspan="2" align="center">
						<input type="submit" value="회원 가입 완료">						
					</td>	
				</tr>
			</table>		
		</form>	
	</div>
</div>
</body>
</html>

