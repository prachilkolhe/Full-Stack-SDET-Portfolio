*** Settings ***


Library  SeleniumLibrary
Resource  ../resources/pageobjects/Keyworddefinationfiles/loginpage.robot
#Resource  ../resources/pageobjects/Keyworddefinationfiles/flightspage.robot
#Resource  ../eesources/pageobjects/Keyworddefinationfiles/common.robot

*** Variables ***
${site_url}  http://www.demo.guru99.com/selenium/newtours
${browser}  chrome

*** Test Cases ***
Verify Successful Login to newtours
    Open Browser  ${site_url}  ${browser}
    Input Username
    Input Password
    Click Login