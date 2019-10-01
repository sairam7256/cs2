Feature: Register to TestmeApp


 Background:
 Given TestmeApp is up
@Registration
Scenario: Signup in the TestmeApp
Given click on SignUp
And Enter username as "ram4568988"
And Enter Firstname as "kns"
And Enter Lastname as "ram"
And Enter password as "ram4567890"
And Confirm password as "ram4567890"
And select the gender as "male"
And Enter the email as "sainagekar@gmail.com"
And Enter mobile number as "7075202661"
And Select DOB as "12/20/1990"
And Enter the address "hyderabad"
And Select the security question as "what is birth place?"
And Enter the appropriate answer as "hyd"
When To SignUp to TestmeApp
Then Click on Register
@Login
Scenario Outline: Login to testmeApp
Given click on SignIn
And user credentials are <username> and <password>
When to login to testmeApp
Then Successfully logins to testmeApp
Examples:
|username| |password|
|"lalitha"| |"password123"|
 @Cart
 Scenario: Add to cart
 Given SignIn with the credentials as "lalitha" and "password123"
 And Search and select dor a product
 When user tries to click on cart
 Then the user cannot proceed
 
      
      