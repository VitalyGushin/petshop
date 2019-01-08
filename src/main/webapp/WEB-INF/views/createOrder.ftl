<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create order</title>
</head>
<body>
    <h1>Create new order</h1>
    <form name="order" action="/petshop_war/addOrder" method="post">
        <p>Deliver</p>
        <input title="Deliver" type="datetime-local" name="deliver">
        <p>Customer</p>
        <input title="Customer" type="text" name="customer">
        <p>Address</p>
        <input title="Address" type="text" name="address">
        <p>Product</p>
        <input title="Product" type="text" name="product">
        <p>Phone</p>
        <input title="Phone" type="text" name="phone">
        <input type="submit" value="OK">
    </form>
    <br>
    <a href="/petshop_war/callcenter">Cancel</a>
</body>
</html>