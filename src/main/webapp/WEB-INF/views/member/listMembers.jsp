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
<title>회원 정보 출력창</title>
</head>
<body>
<table align="center" border="1" width="80%">
  <tr align="center" bgcolor="lightgreen">
    <td width="7%"><b>아이디</b></td>
    <td width="7%"><b>비밀번호</b></td>
    <td width="7%"><b>이름</b></td>
    <td width="7%"><b>이메일</b></td>
    <td width="7%"><b>가입일</b></td>
    <td width="7%"><b>수정</b></td>
    <td width="7%"><b>삭제</b></td>
  </tr>
 
  <c:forEach var="member" items="${membersList}">
     <tr align="center">
       <td>${member.id}</td>
       <td>${member.pwd}</td>
       <td>${member.name}</td>
       <td>${member.email}</td>
       <td>${member.joinDate}</td>
       <td><a href="${contextPath}/member/modMember.do?id=${member.id}">수정</a></td>
       <td><a href="${contextPath}/member/removeMember.do?id=${member.id}">삭제</a></td>
     </tr>
   </c:forEach>
</table>
<a href="${contextPath}/member/memberForm.do"><h3 style="text-align:center">회원 가입하기</h3></a>
</body>
</html>