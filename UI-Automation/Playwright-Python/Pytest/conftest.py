import pytest


@pytest.fixture(scope="module")
def conftest_fixture1():
    print("Executing the conftest module fixture from the conftest file only")


@pytest.fixture(scope="function")
def conftest_fixture2():
    print("Executing the conftest function fixture from the conftest file only")


@pytest.fixture(scope="session")
def conftest_fixture3():
    print("Executing the conftest session fixture from the conftest file only")


# @pytest.fixture(scope="function") -> run for every function
# @pytest.fixture(scope="module") -> run for single time for single file/suite
# @pytest.fixture(scope="session") -> run for single time for entire execution, so when we run multiple file then this will run single time only