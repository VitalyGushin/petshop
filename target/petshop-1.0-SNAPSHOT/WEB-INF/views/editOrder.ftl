<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Edit order</title>
</head>
<body>
    <h1>Set new delivery date</h1>
    <form name="order" action="/petshop_war/updateOrder" method="post">
        <p>ID</p>
        <input title="ID" type="text" name="id" value="${order.id}">
        <p>New delivery date</p>
        <input title="Deliver" type="datetime-local" name="deliver" value="${order.deliver}">
        <input type="submit" value="OK">
    </form>
    <br>
<a href="/petshop_war/callcenter">Cancel</a>
</body>
</html>