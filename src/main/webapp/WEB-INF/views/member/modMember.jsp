<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<% request.setCharacterEncoding("utf-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정창</title>
<style>
  .cls1{
  	font-size:40px;
  	text-align:center;
  }
</style>
</head>
<body>
<h1 class="cls1">회원 정보 수정창</h1>
  <form method="post" action="${contextPath}/member/updateMember.do">
    <table align="center">
      <tr>
        <td width="200"><p align="right">아이디</p></td>
        <td width="400"><input type="text" name="id" value="${member.id}" readonly ></td>
      </tr>
      <tr>
        <td width="200"><p align="right">비밀번호</p></td>
        <td width="400"><input type="password" name="pwd" value="${member.pwd}"></td>
      </tr>
      <tr>
        <td width="200"><p align="right">이름</p></td>
        <td width="400"><p><input type="text" name="name" value="${member.name}"></p></td>
      </tr>
      <tr>
        <td width="200"><p align="right">이메일</p></td>
        <td width="400"><p><input type="text" name="email" value="${member.email}"></p></td>
      </tr>
      <tr>
        <td width="200"><p align="right">가입일</p></td>
        <td width="400"><p><input type="text" name="joinDate" value="${member.joinDate}" readonly ></p></td>
      </tr>
      <tr align="center">
        <td colspan="2" width="400"><input type="submit" value="수정하기">
        	<input type="reset" value="다시입력"></td>
      </tr>
    </table>
  </form>
</body>
</html>