*** Settings ***
Library  SeleniumLibrary

*** Variables ***

*** Test Cases ***
myTest1
    Open Browser  https://www.google.com  chrome
    Sleep  5
    Close Browser