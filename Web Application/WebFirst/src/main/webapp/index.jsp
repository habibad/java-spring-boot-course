<%@page language = "java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Two Number Form</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

    <form class="calculator-form" action="add" method="GET">

        <h2>Sum Calculator</h2>

        <div class="form-group">
            <label for="number1">First Number</label>
            <input
                type="number"
                id="number1"
                name="number1"
                placeholder="Enter first number"
                required
            >
        </div>

        <div class="form-group">
            <label for="number2">Second Number</label>
            <input
                type="number"
                id="number2"
                name="number2"
                placeholder="Enter second number"
                required
            >
        </div>

        <button type="submit" class="submit-btn">
            Calculate Sum
        </button>

    </form>

</body>
</html>