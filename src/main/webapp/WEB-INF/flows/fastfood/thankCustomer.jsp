<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 07.02.2017
  Time: 20:49
  To change this template use File | Settings | File Templates.


  Фреймворк Spring Web Flow предоставляет переменную flowExecutionUrl,содержащую URL последовательности, для использования
    в представлении. Ссылка Finish (Конец) включает в URL параметр _eventId, обеспечивающий передачу события finished обратно в по-
    следовательность. Это событие переводит последовательность в конечное состояние.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fast Food</title>
</head>
<body>

    <h2>Спсибо за сделанный заказ!</h2>
    <!-- Возбуждает заключительное событие -->
    <![CDATA[<a href='${flowExecutionUrl}&_eventId=finished'>Finish</a>]]>
</body>
</html>
