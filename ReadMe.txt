
BeforeTest ---> Creating DB Connection

@BeforeMethod --->Launching Browser
@Test ---->Do User Registration Test Case
onTestSuccess --->Passed Test -doUserRegistration
@AfterMethod --->Close Browser

@BeforeMethod --->Launching Browser
@Test ---->Executing Login Test Case
onTestSuccess --->Passed Test -doLogin
@AfterMethod --->Close Browser
@AfterTest --->Closing DB Connection


@Test--->Beginning
Validating Titles
Validating Image
Validating Text Boxes
Ending
onTestFailure Capturing Screenshot for the failed test--softAssertions

@Test--->Test Case 1:Do User Registration Test Case
onTestSuccess --->Passed Test -doUserRegistration
@Test--->Test Case 2:Executing Login Test Case
onTestSuccess --->Passed Test -doLogin
@Test--->Test Case 3:Forgot Password Page
onTestSuccess --->Passed Test -doForgotPassword
@Test--->Test Case 4:Forgot UserName Page
onTestSuccess --->Passed Test -doForgotUsername

@Test--->
Beginning
Validating Titles
onTestFailure Capturing Screenshot for the failed test--validateTitles


@Test--->Capture Screenshot
Capturing Screenshot for the failed test--doLogin