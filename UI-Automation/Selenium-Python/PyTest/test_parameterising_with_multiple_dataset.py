# test_crossBrowser is the test method which is calling crossBrowser fixture method which has multiple params
# So with each parameter this test method will run
# You can give multiple parameter is single parameter also by making tuple
def test_crossBrowser(crossBrowser):
    print(crossBrowser)
    print(crossBrowser[1])      # by passing index, it will print the parameter which is at 1 index of each parameter