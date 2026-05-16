*** Settings ***
Resource  ../resources/newtours_res.robot

*** Variables ***
#&{details}  trip=oneway  passcount=3
@{list}  oneway  3
*** Test Cases ***
Testcase Name
    Newtours Login
    Sleep  2
    Open Booking
    Sleep  2
    Bylist  @{list}
    Sleep  2
    Close

let's use template
    [Tags]  Medidata_Brand     #to execute using tag => command:-  robot --include tagname tests/testname.robot
    [Template]    Temp_google_search
    Dassault    Ramesh
    Pizza    akash
    Chopda    Prachil
#    Comment    the mentioned template will execute for each row