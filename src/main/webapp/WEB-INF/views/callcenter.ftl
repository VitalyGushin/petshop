<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Call-center</title>

    <style>
        table, th, td {
            border: 1px solid black;
            padding: 1px;
        }
    </style>

</head>
<body>
    <h1>Postponed orders</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Added</th>
            <th>Deliver</th>
            <th>Customer</th>
            <th>Address</th>
            <th>Product</th>
            <th>Phone</th>
            <th>Update</th>
        </tr>
        <#list postponedorders as order>
            <tr>
                <td>${order.id}</td>
                <td>${order.added}</td>
                <td>${order.deliver}</td>
                <td>${order.customer}</td>
                <td>${order.address}</td>
                <td>${order.product}</td>
                <td>${order.phone}</td>
                <td><a href="/petshop_war/update/${order.id}">Update</a></td>
            </tr>
        </#list>
    </table>
    <h3><a href="/petshop_war/addOrder">Create new order</a></h3>
    <h3><a href="/petshop_war">Change user</a></h3>
    <br><br>
    <h1>All orders list</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Added</th>
            <th>Deliver</th>
            <th>Customer</th>
            <th>Address</th>
            <th>Product</th>
            <th>Phone</th>
            <th>Status</th>
            <th>Delete</th>
        </tr>
        <#list allorders as order>
            <tr>
                <td>${order.id}</td>
                <td>${order.added}</td>
                <td>${order.deliver}</td>
                <td>${order.customer}</td>
                <td>${order.address}</td>
                <td>${order.product}</td>
                <td>${order.phone}</td>
                <td>${order.status}</td>
                <td><a href="/petshop_war/delete/${order.id}">Delete</a></td>
            </tr>
        </#list>
    </table>
</body>
</html>