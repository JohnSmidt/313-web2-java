<%-- 
    Document   : index
    Created on : Jul 19, 2016, 11:16:00 PM
    Author     : John
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Twitch Plays</title>
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
        <link rel="stylesheet" href="http://www.w3schools.com/lib/w3-theme-black.css">
        <link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <header class="w3-container w3-theme w3-padding" id="myHeader">
  
  <div class="w3-center">
  <h4>Welcome to the</h4>
  <h1 class="w3-xxxlarge w3-animate-bottom">Twitch Plays Application</h1>
    <div class="w3-padding-32">
      <h2> Please click <a href="http://twitchapps.com/tmi/" target="_blank">Here</a> to receive your stream key for the Twitch Plays App.</h2>
      <h4> After you have retrieved your key, please enter the key into the "Key" field as well as your username in the "Username" field.</h4>
    </div>
  </div>
</header>
        <form action="LoginServlet" method="POST">
            <div class="center">
                <br/> <br/>Username: <input type="text" name="username" /><br /><br/>
            Key: <input type="password" name="password" /><br /><br/>
            <br />
            <input type="submit" value="Run Twitch Plays" class="w3-btn w3-xlarge w3-dark-grey w3-hover-light-grey" />
            </div>
        </form>
        <br/><br/>
        <br/><br/>
        <!-- Footer -->
<footer class="w3-container w3-theme-dark w3-padding-16">
  
  <p>Powered by Chameleon</p>
  
  <br/>
</footer>
    </body>
</html>
