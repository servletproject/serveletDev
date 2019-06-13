<%@page import="java.util.ArrayList"%>
<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/index.js"></script>
<meta charset="UTF-8">
<title>Servletによる勉強</title>
</head>
<body>

  <div class="topScreen">
    <form method="post" action="./ResponseServlet">
      何か入力してください: <input type="text" name="name">
      <button type="submit">送信</button>
      <button type="reset">リセット</button>
    </form>
		<div class="thisTerm">
			<h1>今期の目標</h1>
			<ol>
				<li>Java Silver取得予定</li>
				<li>Oracle Bronze 12c取得予定</li>
			</ol>
		</div>
	</div>
</body>
</html>