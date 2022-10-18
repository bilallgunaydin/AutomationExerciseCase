
# AutomationExercise Test Cases

https://www.automationexercise.com/test_cases I made 26 Test Cases on the website.
![N11-logo-768x699 (1)]<img width="132" alt="logo" src="https://user-images.githubusercontent.com/21973124/196520852-fd63b8cf-ce3e-4095-a194-01922beb798a.png">


    
## Used technologies


**Java**: The programming language in which the project is written

**TestNG**: Test Authoring Tool used for writing Test Cases and controlling outputs.

**Selenium**: Test Automation Tool used to test Website

**Page Object Model**: It is the architectural structure used in the project.

**Maven**: Automation and build tool that is usually used during the compilation of commands on the Java platform.

**Cucumber**:(Cucumber is a test automation approach supported by BDD (Behavior Driven Developmet))

**Gherkin**: Gherkin is a plain-text language. Designed to be learned by non-programmers

## Case Aşamaları




  Scenario: Test Case 1_Register User

    And Click on Signup Login button
    Then Verify New User Signup is visible
    And Enter name and email address
    And Click Signup button
    Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Click Create Button
    Then Verify that "ACCOUNT CREATED!" message
    And Click Continue button
    Then Verify that "Logged in as" text
    And Click Delete Account button
    Then Verify that "ACCOUNT DELETED" is visible and click Continue button

  Scenario: Test Case 2_Login User with correct email and password

    And Click on Signup Login button
    Then Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    Then Verify that "Logged in as" text
    And Click Delete Account button
    Then Verify that "ACCOUNT DELETED" is visible and click Continue button

  Scenario: Test Case 3_Login User with incorrect email and password

    And Click on Signup Login button
    Then Verify Login to your account is visible
    And  Enter incorrect email address and password
    And Click login button
    Then Verify error 'Your email or password is incorrect!' is visible

  Scenario: Test Case 4_Logout User

    And Click on Signup Login button
    Then Verify New User Signup is visible
    And Enter name and email address
    And Click Signup button
    Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Click Create Button
    Then Verify that "ACCOUNT CREATED!" message
    And Click Continue button
    Then Verify that "Logged in as" text
    And Click Logout Button
    Then Verify that user is navigated to login page

  Scenario: Test Case 5_Register User with existing email

    And Click on Signup Login button
    Then Verify New User Signup is visible
    And Enter name and already registered email address
    And Click Signup button
    Then Verify errorr 'Email Address already exist!' is visible

  Scenario: Test Case 6_Contact Us Form

    And Click on Contact Us button
    Then Verify 'GET IN TOUCH' is visible
    And Enter name, email, subject and message
    And Upload file
    And Click Submit button
    And Click OK button
    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click Home button and verify that landed to home page successfully

  Scenario: Case 7_Verify Test Cases Page

    And Click on Test Cases button
    Then Verify user is navigated to test cases page successfully

  Scenario: Test Case 8_Verify All Products and product detail page

    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on View Product of first product
    And User is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand

  Scenario: Test Case 9_Search Product

    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name "Summer White Top" in search input and click search button
    Then Verifyy 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible

  Scenario:  Test Case 10_Verify Subscription in home page

    And Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    And Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visiblee

  Scenario: Test Case 11_Verify Subscription in Cart page

    And  Click Cart button
    And Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    And Enter email address in input and click arrow button
    Then Verify success message 'You have been successfully subscribed!' is visiblee

  Scenario: Test Case 12_Add Products in Cart

    And Click on Products button
    And Hover over first product and click Add to cart
    When Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    Then Verify both products are added to Cart
    Then Verify their prices, quantity and total price

  Scenario: Test Case 13_Verify Product quantity in Cart

    And Click View Product for any product on home page
    And User is landed to product detail page
    And Increase quantity to 4
    And Click Add to cart button
    And Click View Cart button
    Then Verify that product is displayed in cart page with exact quantity

  Scenario: Test Case 14_Place Order: Register while Checkout

    And Click on Products button
    And Hover over first product and click Add to cart
    When Click Continue Shopping button
    And Click Cart button
    And Click Proceed To Checkout button
    And Click Register Login button
    And Fill all details in Signup and create account
    Then Verify that "ACCOUNT CREATED!" message
    And Click Continue button
    Then Verify that "Logged in as" text
    And Click Cart button
    And Click Proceed To Checkout button
    Then Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then Verify success message "Your order has been placed successfully!"
    And Click Delete Account button
    Then Verify that "ACCOUNT DELETED" is visible and click Continue button

  Scenario: Test Case 15_Place Order: Register before Checkout

    And Click on Signup Login button
    And Fill all details in Signup and create account
    Then Verify that "ACCOUNT CREATED!" message
    And Click Continue button
    Then Verify that "Logged in as" text
    And Hover over first product and click Add to cart
    When Click Continue Shopping button
    And Click Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout button
    Then Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then Verify success message "Your order has been placed successfully!"
    And Click Delete Account button
    Then Verify that "ACCOUNT DELETED" is visible and click Continue button

  Scenario: Test Case 16_Place Order: Login before Checkout

    And Click on Signup Login button
    Then Verify New User Signup is visible
    And Enter name and email address
    And Click Signup button
    Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Click Create Button
    Then Verify that "ACCOUNT CREATED!" message
    And Click Continue button
    Then Verify that "Logged in as" text
    And Hover over first product and click Add to cart
    When Click Continue Shopping button
    And Click Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout button
    Then Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then Verify success message "Your order has been placed successfully!"
    And Click Delete Account button
    Then Verify that "ACCOUNT DELETED" is visible and click Continue button

  Scenario: Test Case 17_Remove Products From Cart

    And Hover over first product and click Add to cart
    When Click Continue Shopping button
    And Click Cart button
    Then Verify that cart page is displayed
    And Click X button corresponding to particular product
    Then Verify that product is removed from the cart

  Scenario: Test Case 18: View Category Products

    Then Verify that categories are visible on left side bar
    And Click on Women category
    And Click on Dress category
    Then Verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'
    And On left side bar, click on any sub-category link of Men category
    Then Verify that user is navigated to that category page

  Scenario: Test Case 19_View & Cart Brand Products

    And Click on Products button
    Then Verify that Brands are visible on left side bar
    And Click on any brand name
    Then Verify that user is navigated to brand page and brand products are displayed
    And On left side bar, click on any other brand link
    Then Verify that user is navigated to that brand page and can see products

  Scenario: Test Case 20_Search Products and Verify Cart After Login

    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name "Top" in search input and click search button
    Then Verifyy 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible
    And Hover over first product and click Add to cart
    When Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    Then Verify both products are added to Cart
    And Click on Signup Login button
    And Enter correct email address and password
    And Click Cart button
    Then Verify both products are added to Cart

  Scenario: Test Case 21_Add review on product

    And Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Click on View Product of first product
    Then Verifyyyy 'WRITE YOUR REVIEW' is visible
    And Enter name, email and review
    And Click Submitt button
    Then Verifyyyyy success message 'Thank you for your review.'

  Scenario: Test Case 22_Add to cart from Recommended items

    And Scroll to bottom of page
    Then Verify RECOMMENDED ITEMS are visible
    And Click on Add To Cart on Recommended product
    And Click View Cart button
    Then Verify that product is displayed in cart page

  Scenario: Test Case 23_Verify address details in checkout page

    And Click on Signup Login button
    And Fill all details in Signup and create account
    Then Verify that "ACCOUNT CREATED!" message
    And Click Continue button
    Then Verify that "Logged in as" text
    And Hover over first product and click Add to cart
    When Click Continue Shopping button
    And Click Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout button
    Then Verify that the delivery address is same address filled at the time registration of account
    Then Verify that the billing address is same address filled at the time registration of account
    And Click Delete Account button
    Then Verify that "ACCOUNT DELETED" is visible and click Continue button

  Scenario: Test Case 24_Download Invoice after purchase order

    And Click on Products button
    And Hover over first product and click Add to cart
    When Click Continue Shopping button
    And Click Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout button
    And Click Register Login button
    And Fill all details in Signup and create account
    Then Verify that "ACCOUNT CREATED!" message
    And Click Continue button
    Then Verify that "Logged in as" text
    And Click Cart button
    And Click Proceed To Checkout button
    Then Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then Verify success message "Your order has been placed successfully!"
    And Click Download Invoice button and verify invoice is downloaded successfully.
    And Click Continueee button
    And Click Delete Account button
    Then Verify that "ACCOUNT DELETED" is visible and click Continue button

  Scenario: Test Case 25_Verify Scroll Up using 'Arrow' button and Scroll Down functionality

    And Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    And Click on arrow at bottom right side to move upward
    Then Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

  Scenario: Test Case 26_Verify Scroll Up without 'Arrow' button and Scroll Down functionality
  
    And Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    And Scroll up page to top
    Then Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen



















  
## Demo

https://www.youtube.com/watch?v=W7OwaHWGK_o&ab_channel=BilalG%C3%BCnayd%C4%B1n

  
## Screenshots
![egzersiz fotoğraf](https://user-images.githubusercontent.com/21973124/196520968-4f988b04-d8f9-4338-856e-0db4e0f60189.jpg)

![Uygulama Ekran Görüntüsü]

  
## Lessons Learned

Here are the scenario types I tried for the first time. I will write them in headings. There were test cases that were very instructive.

*Downloading files with Selenium
*Checking downloaded file with Selenium
*Using the Faker class that generates new data every time
*Hover over a product and add to cart
*Checking the shopping cart
*Paying with Credit Card





  
## Feedback

If you have any feedback on the project, please contact me at bilallgunaydin@gmail.com.

  
