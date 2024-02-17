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
<h2> Complete Reservation</h2>
Airline: ${flight.operatingAirlines}<br/>
Departure City: ${flight.departureCity}<br/>
Arrival City: ${flight.arrivalCity}<br/>
<form action="completeReservation" method="post">
    <pre>

<h2>Passenger Details</h2>
first Name:<input type="text" name="passengerFirstName"/>
last Name: <input type="text" name="passengerLastName"/>
Email:     <input type="text" name="passengerEmail"/>
Phone:     <input type="text" name="passengerPhone"/>

<h2>Card Details</h2>
Name on the card:<input type="text" name="nameOnTheCard"/>
Card No:         <input type="text" name="cardNumber"/>
Expiry Date:     <input type="text" name="expirationDate"/>
Three Digit Sec Code:<input type="text" name="securityCode"/>

<input type="hidden" name="flightId" value="${flight.id}"/>
<input type="submit" value="confirm"/>
    </pre>
</form>

</body>
</html>
