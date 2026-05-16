*** Settings ***
Resource  ../resources/newtours_res.robot
*** Variables ***

&{mydist}   tripType=oneway  passcount=3  fromport=London  frommonth=10  fromday=10  toport=Paris  tomonth=12  today=10  servclass=Business  airline=Unified Airlines
@{mylist}   oneway  3  London  10  10  Paris  12  10  Business  Unified Airlines

*** Test Cases ***
using_resources
    open_google
    sleep  2
#    login_mercurytours
    sleep  2
#    fill_passanger_by_dict  &{mydist}
    fill_passanger_by_list  @{mylist}
    close