<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Flight</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Custom Styles */
        body {
            background-color: #f8f9fa; /* Light Gray */
            color: #343a40; /* Dark Gray */
            padding: 20px;
        }
        h2 {
            color: #007bff; /* Primary Blue */
        }
        form {
            max-width: 400px;
            margin: 0 auto;
            background-color: #fff; /* White */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        label {
            margin-bottom: 5px;
        }
        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ced4da; /* Grayish */
            border-radius: 5px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff; /* Primary Blue */
            color: #fff; /* White */
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3; /* Dark Blue */
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Add Flight</h2>
    <form action="reservation/saveFlight" method="post">
        <label for="departureCity">Departure City:</label>
        <input type="text" id="departureCity" name="departureCity" required>

        <label for="arrivalCity">Arrival City:</label>
        <input type="text" id="arrivalCity" name="arrivalCity" required>

        <label for="dateOfDeparture">Date of Departure:</label>
        <input type="text" id="dateOfDeparture" name="dateOfDeparture" required>

        <label for="estimatedDepartureTime">Estimated Departure Time:</label>
        <input type="text" id="estimatedDepartureTime" name="estimatedDepartureTime" required>

        <label for="flightNumber">Flight Number:</label>
        <input type="text" id="flightNumber" name="flightNumber" required>

        <label for="operatingAirlines">Operating Airlines:</label>
        <input type="text" id="operatingAirlines" name="operatingAirlines" required>

        <input type="submit" value="Save">
    </form>
</div>
<!-- Bootstrap JS (Optional if you need JS functionality) -->
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
