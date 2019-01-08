<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Delivery boy</title>

    <style>
        table, th, td {
            border: 1px solid black;
            padding: 1px;
        }
    </style>

</head>
<body>
<h1>Undelivered orders</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Added</th>
        <th>Deliver</th>
        <th>Customer</th>
        <th>Address</th>
        <th>Product</th>
        <th>Phone</th>
        <th>Postpone</th>
        <th>Delivere</th>
    </tr>
    <#list undeliveredorders as order>
        <tr>
            <td>${order.id}</td>
            <td>${order.added}</td>
            <td>${order.deliver}</td>
            <td>${order.customer}</td>
            <td>${order.address}</td>
            <td>${order.product}</td>
            <td>${order.phone}</td>
            <td><a href="/petshop_war/postpone/${order.id}">Postpone</a></td>
            <td><a href="/petshop_war/delivere/${order.id}">Delivere</a></td>
        </tr>
    </#list>
</table>
<h3><a href="/petshop_war">Change user</a></h3>
</body>
</html>