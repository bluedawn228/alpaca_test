<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
	<title>MVC 게시판</title>
	<script type="text/javascript">
	function modifyboard(){
		modifyform.submit();
	}
	</script>
	<style type="text/css">
   #registForm{
      width: 500px;
      height: 600px;
      border : 1px solid red; 
      margin:auto; 
   }   
   h2{
      text-align: center;
   }
   table{
      margin:auto;
      width: 450px;
      }
   .td_left{
      width: 150px;
      background:orange;
   }
   .td_right{
      width: 300px;
      background:skyblue;
   }
   #commandCell{
      text-align: center;
      
   }
</style>
</head>
<body>
<!-- 게시판 등록 -->

<section id = "writeForm">

	    <h3>.</h3>
        <h3>.</h3>
<h2>게시판글수정</h2>
<form action="boardmodify" method="post" name = "modifyform">
<input type = "hidden" name = "BOARD_NUM" value = "${article.BOARD_NUM}"/>
<table>
	<tr>
		<td class="td_left">
			<label for = "BOARD_NAME">글쓴이</label>
		</td>
		<td class="td_right">
			<input type = "text" name="BOARD_NAME" id = "BOARD_NAME" value = "${article.BOARD_NAME}"/>
		</td>
	</tr>
	<tr>
		<td class="td_left">
			<label for = "BOARD_PASS">비밀번호</label>
		</td>
		<td class="td_right">
			<input name="BOARD_PASS" type="password" id = "BOARD_PASS"/>
		</td>
	</tr>
	<tr>
		<td class="td_left">
			<label for = "BOARD_SUBJECT">제 목</label>
		</td>
		<td class="td_right">
			<input name="BOARD_SUBJECT" type="text" id = "BOARD_SUBJECT" value = "${article.BOARD_SUBJECT}"/>
		</td>
	</tr>
	
	
		<tr>
		<td class="td_left">
			<label for = "BOARD_SUBJECT">평 가</label>
		</td>
		<td class="td_right">
			<div>
                <label for="BOARD_GRADE"> 
                <input type="radio" name="BOARD_GRADE" value="1" id="1">1점(불만족)
                <input type="radio" name="BOARD_GRADE" value="2" id="2"> 2점
                <input type="radio" name="BOARD_GRADE" value="3" id="3"> 3점
                <input type="radio" name="BOARD_GRADE" value="4" id="4"> 4점
                <input type="radio" name="BOARD_GRADE" value="5" id="5" checked> 5점(매우만족)
            </div>
		</td>
		</tr>
		
		<tr>
                <td class="td_left"><label for="BOARD_POINT">포인트</label></td>
                <td class="td_right">
                    <select name="BOARD_POINT" id="BOARD_POINT">
                        <option value="알찬 커리큘럼">알찬 커리큘럼</option>
                        <option value="전문적 유익함">전문적 유익함</option>
                        <option value="재미와 몰입">재미와 몰입</option>
                        <option value="친절과 정성">친절과 정성</option>
                        <option value="높은 영상퀄리티">높은 영상퀄리티</option>
                    </select>
                </td>
            </tr>
		
		
		
	<tr>
		<td class="td_left">
			<label for = "BOARD_CONTENT">내 용</label>
		</td>
		<td>
			<textarea id = "BOARD_CONTENT" name="BOARD_CONTENT" cols="40" rows="15">${article.BOARD_CONTENT}</textarea>
		</td>
	</tr>
</table>
	<section id = "commandCell">
			<a href="javascript:modifyboard()">[수정]</a>&nbsp;&nbsp;
			<a href="javascript:history.go(-1)">[뒤로]</a>
	</section>
</form>
</section>
</body>
</html>