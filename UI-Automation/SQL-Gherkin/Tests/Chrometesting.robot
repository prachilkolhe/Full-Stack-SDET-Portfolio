*** Settings ***
Library           SeleniumLibrary

*** Test Cases ***
setup and teardown
    [Setup]    Open Browser    http://www.google.com    chrome
    Sleep    2
    Go To    https://demo.guru99.com/test/newtours/
    Log    Hello World
    [Teardown]    Close Browser
