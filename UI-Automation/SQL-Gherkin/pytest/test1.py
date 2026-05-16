import pytest
def test_compare():
    a=5
    b=6
    print("Reporting before assert")
    assert a==b
    assert a>b
    print("Reporting after assert")

def test_lessthan():
    a=4
    b=5
    assert a<b
    print("Reprting from test lessthan")

