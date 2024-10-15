<%--
  Created by IntelliJ IDEA.
  User: Anemo
  Date: 24. 10. 16.
  Time: 오전 1:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>login</title>
  <style>
    body {
      display: grid;
      height: 100vh; /* 전체 화면 높이 */
      place-items: center; /* 중앙 정렬 */
      margin: 0; /* 기본 여백 제거 */
      background-color: #f0f0f0; /* 배경색 추가 */
    }
    fieldset {
      width: 500px; /* 박스 너비 조정 */
      height: 400px; /* 박스 높이 조정 */
      padding: 40px; /* 패딩 추가 */
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* 그림자 효과 */
      border-radius: 10px; /* 모서리 둥글게 */
      background-color: white; /* 배경색 흰색 */
      flex-direction: column; /* 세로 방향 정렬 */
      justify-content: center; /* 세로 중앙 정렬 */
      align-items: center; /* 가로 중앙 정렬 */
    }

    legend {
      font-size: 40px;
    }

    /* 아 이젠 정말 모르겠다...  */
    input[type="text"],
    input[type="password"],
    input[type="email"] {
      width: 90%; /* 입력 필드 너비 */
      margin: 10px 0; /* 여백 */
      padding: 10px; /* 패딩 */
    }
    input[type="submit"],
    input[type="reset"] {
      width: 45%; /* 버튼 너비 */
      padding: 10px; /* 패딩 */
    }
  </style>
</head>
<body>
<form action="signup_process.jsp" name="user_info" method="post">
  <fieldset>
    <legend>회원가입</legend>

    아이디 : <br>
    <input type="text" name="userID"><br><br>

    비밀번호 : <br>
    <input type="password" name="userPW"><br><br>

    이메일 : <br>
    <input type="email" name="userMEIL"><br><br>

    <div align="center">
      <input type="submit" value="가입하기">&nbsp;&nbsp;
      <input type="reset" value="다시작성">
    </div>
  </fieldset>
</form>
</body>
</html>
