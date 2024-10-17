<%--
  Created by IntelliJ IDEA.
  User: Anemo
  Date: 24. 10. 16.
  Time: 오후 8:00
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
      height: 600px; /* 박스 높이 조정 */
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
<form action="/save" method="post">
  <fieldset>
    <legend>회원가입</legend>

    이메일 : <br>
    <input type="text" name="memberEmail" placeholder="이메일"><br><br>

    비밀번호 : <br>
    <input type="text" name="memberPassword" placeholder="비밀번호"><br><br>    <!--이거 타입을 password로 해야하는데 영상에서 이러니 참고바람/나중에 수정해볼 예정 일단 홀드-->

    이름 : <br>
    <input type="text" name="membername" placeholder="이름"><br><br>

    나이 : <br>
    <input type="text" name="memberName" placeholder="나이"><br><br>

    전화번호 : <br>
    <input type="text" name="memberMobile" placeholder="전화번호"><br><br>


    <div align="center">
      <input type="submit" value="회원가입">&nbsp;&nbsp;
      <input type="reset" value="다시작성">
    </div>
    <br><br>

    </div>
  </fieldset>
  <br><br><br><br>
</form>
</body>
</html>
