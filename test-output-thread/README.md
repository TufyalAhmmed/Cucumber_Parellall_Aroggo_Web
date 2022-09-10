
# Cucumber_Parellall_Aroggo_Web

This repository contains Cucumber-Java project to perform test automation on https://www.Arogga.com. I have used TestNg for performing assertions and Allure for generating reports.





## Tested Website 
Arogga





## Pre-requisites (Installations):
JDK 18.0.2

apache-maven-3.8.6

IntelliJ IDE

Allure-2.19.0




## Dependencies:
cucumber-java 7.2.3

cucumber-testng 7.2.3

cucumber-junit 7.2.3

selenium-java 4.1.3

allure-cucumber7-jvm 2.17.3

cucumber-compiler-plugin 3.10.1

maven-surefire-plugin 3.0.0.M6




## Running the Tests:
Open project in IntelliJ IDE.

Run TestNg.xml file.


## Reports:
Allure reports are generated in xml, html and json formats which are saved in allure-reports folder.

After running the tests, open "Terminal" in IntelliJ IDE and write command 'allure serve' allure-report to generate allure report using allure server.

allure serve allure-report




