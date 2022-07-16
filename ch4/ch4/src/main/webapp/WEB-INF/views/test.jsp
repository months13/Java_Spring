<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-1.11.3.js"></script>
</head>
<body>
<h2>commentTest</h2>
<button id="sendBtn" type="button">SEND</button>
<h2>Data From Server :</h2>
<div id="commentList"></div>
<script>

    let showList = function(bno){
        $.ajax({
            type:'GET',       // 요청 메서드
            url: '/ch4/comments?bno='+bno,  // 요청 URI
            success : function(result){
                person2 = (result);    // 서버로부터 응답이 도착하면 호출될 함수
                alert("received="+result);       // result는 서버가 전송한 데이터
                $("#data").html("name="+person2.name+", age="+person2.age);
            },
            error   : function(){ alert("error") } // 에러가 발생했을 때, 호출될 함수
        }); // $.ajax()

        alert("the request is sent")
    }
    $(document).ready(function(){
        let person = {name:"abc", age:10};
        let person2 = {};

        $("#sendBtn").click(function(){
            showList(bno);
        });
    });
</script>
</body>
</html>