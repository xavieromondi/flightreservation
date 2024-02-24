<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2>Add flight</h2>

<form action="reservation/saveFlight" method="post">

    <pre>
    <label for="departureCity">Departure City:</label><br>
    <input type="text" id="departureCity" name="departureCity"><br>

    <label for="arrivalCity">Arrival City:</label><br>
    <input type="text" id="arrivalCity" name="arrivalCity"><br>

    <label for="dateOfDeparture">Date of Departure:</label><br>
    <input type="text" id="dateOfDeparture" name="dateOfDeparture"><br>


    <label for="estimatedDepartureTime">Estimated Departure Time:</label><br>
    <input type="text" id="estimatedDepartureTime" name="estimatedDepartureTime"><br><br>

    <label for="flightNumber">Flight Number:</label><br>
    <input type="text" id="flightNumber" name="flightNumber"><br>

    <label for="operatingAirlines">Operating Airlines:</label><br>
    <input type="text" id="operatingAirlines" name="operatingAirlines"><br>

    <input type="submit" value="Save">
    </pre>
</form>

</body>
</html>