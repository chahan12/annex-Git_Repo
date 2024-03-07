<?php
// Check if the form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Retrieve form data
    $username = $_POST["username"];
    $password = $_POST["password"];

    // Your authentication logic goes here (e.g., check against a database)
    // For simplicity, a basic check is shown here (replace with your actual authentication logic)
    $validUsernames = ["user1", "user2"];
    $validPasswords = ["pass1", "pass2"];

    // Check if the provided username and password are valid
    if (in_array($username, $validUsernames) && in_array($password, $validPasswords)) {
        echo "Login successful. Welcome, $username!";
    } else {
        echo "Invalid username or password. Please try again.";
    }
}
?>
