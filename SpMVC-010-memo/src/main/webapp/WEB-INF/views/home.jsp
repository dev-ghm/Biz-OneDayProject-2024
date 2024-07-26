<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <h2>오늘은 내 인생의 가장 젊은날</h2>
  <section class="memo input">
	<form method="POST">
		
		
		<div>
	
			<input type="text" placeholder="제목을 입력하세요"  name="m_title" value="${m_title}">
		</div>
	   	<div>
    		<input type="text" placeholder="내용을 입력하세요" name="m_memo" value="${m_memo}">
    	</div>
    	
    	<div><label></label><button type="button" class="save">저장</button></div>
    
	</form>
</section>
    <table>
    <tbody>
				    
    </tbody>
    </table>
  </body>
</html>
