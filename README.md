# Full-Stack SDET Portfolio

A comprehensive automation testing ecosystem showcasing expertise in UI automation, API testing, and performance testing.

> Quality Assurance Automation Universe - Demonstrating proficiency across multiple testing domains with enterprise-level frameworks and best practices.

---

## Table of Contents

- [Overview](#overview)
- [Repository Structure](#repository-structure)
- [Technologies & Tools](#technologies--tools)
- [Project Modules](#project-modules)
- [Getting Started](#getting-started)
- [Key Features](#key-features)
- [Usage Examples](#usage-examples)
- [Contributing](#contributing)
- [Contact & Resources](#contact--resources)

---

## Overview

This portfolio demonstrates a **full-stack automation testing approach** covering:
- **UI Automation** - Web application testing with multiple frameworks
- **API Testing** - RESTful API validation with advanced testing patterns
- **Performance Testing** - Load and stress testing capabilities
- **BDD Framework** - Gherkin syntax with Cucumber for behavior-driven development
- **Database Validation** - SQL integration for data-layer testing

Perfect for QA professionals, SDETs (Software Development Engineers in Test), and automation teams looking to establish robust testing infrastructure.

---

## Repository Structure
```text
 Full-Stack-SDET-Portfolio/
 ├── API-Testing/
 │   ├── .classpath
 │   ├── .project
 │   ├── .settings/
 │   ├── APITestingNotes.txt
 │   ├── LogFile.txt
 │   ├── bin/
 │   ├── pom.xml
 │   ├── src/
 │   │   ├── CucumberFramework/
 │   │   ├── Data/
 │   │   └── JavaRESTAssuredAPITesting/
 │   ├── target/
 │   └── test-output/
 ├── Load-Testing/
 │   ├── .DS_Store
 │   ├── LICENSE
 │   ├── NOTICE
 │   ├── README.md
 │   ├── [Test Plans & Scripts]
 │   ├── backups/
 │   ├── bin/
 │   │   ├── [JMeter executables]
 │   │   └── report-template/
 │   │       └── sbadmin2-1.0.7/
 │   ├── docs/
 │   ├── extras/
 │   ├── lib/
 │   ├── licenses/
 │   └── printable_docs/
 ├── UI-Automation/
 │   ├── Playwright-Python/
 │   │   ├── Features/
 │   │   ├── Playwright/
 │   │   ├── PlaywrightFramework/
 │   │   ├── Pytest/
 │   │   ├── Python_Basics.py
 │   │   ├── StepDefinitions/
 │   │   └── conftest.py
 │   ├── Selenium-Java/
 │   │   ├── .classpath
 │   │   ├── .metadata/
 │   │   ├── .project
 │   │   ├── .settings/
 │   │   ├── ExtentReports/
 │   │   ├── JavaSelenium/
 │   │   ├── JavaSeleniumDataDriven.xlsx
 │   │   └── JavaSeleniumFramework/
 │   ├── Selenium-Python/
 │   │   ├── Basic_Datatypes.py
 │   │   ├── Classes_Objects.py
 │   │   ├── Exception_Handling.py
 │   │   ├── Functions.py
 │   │   ├── Inheritance.py
 │   │   ├── Loops.py
 │   │   ├── PyTest/
 │   │   ├── Python Notes.txt
 │   │   ├── Selenium/
 │   │   ├── Selenium Notes
 │   │   ├── Selenium_Python_FW/
 │   │   ├── chromedriver-mac-x64/
 │   │   └── drivers/
 │   └── SQL-Gherkin/
 │       ├── Breaking.py
 │       ├── Calculator using class function.py
 │       ├── Class function.py
 │       ├── Dictionary practise.py
 │       ├── Gherkin/
 │       ├── Inheritance.py
 │       ├── List Comprehensions.py
 │       ├── SQL/
 │       ├── Selenium/
 │       ├── Tests/
 │       ├── log.html
 │       ├── map and lambda function.py
 │       ├── output.xml
 │       ├── pytest/
 │       └── report.html
 └── README.md
```


---

## Technologies & Tools

### **Languages**
- Java 21
- Python 3.x
- SQL

### **UI Automation Frameworks**
- **Selenium WebDriver** - Industry-standard web automation
- **Playwright** - Modern browser automation with multi-language support
- **PyTest** - Advanced Python testing framework

### **API Testing**
- **REST Assured** - Java DSL for REST API testing
- **Cucumber/Gherkin** - Behavior-Driven Development

### **Performance Testing**
- **Apache JMeter** - Load and stress testing tool

### **Supporting Tools**
- **Maven** - Build automation and dependency management
- **TestNG** - Java testing framework
- **Extent Reports** - Advanced HTML reporting
- **Jackson** - JSON serialization/deserialization
- **Apache POI** - Excel data handling
- **Hamcrest** - Test matchers
- **Jenkins** - CI/CD integration

### **IDEs & Development Environments**
- Eclipse IDE (Java)
- PyCharm (Python)

---

## Project Modules

### **1. UI Automation**

#### **Playwright-Python** 
Modern, fast browser automation with cross-browser support.
- **Features**: Multi-browser testing, mobile emulation, visual comparison
- **Best For**: Contemporary web applications requiring speed and reliability
- **Includes**: Framework patterns, pytest integration, feature-based testing

#### **Selenium-Java**
Enterprise-grade test automation with comprehensive framework patterns.
- **Features**: Cross-browser compatibility, advanced synchronization, data-driven testing
- **Best For**: Large-scale projects requiring robust, maintainable code
- **Includes**: ExtentReports integration, framework design patterns, Excel-based test data

#### **Selenium-Python**
Python-based web automation with full programming fundamentals coverage.
- **Features**: Multiple framework implementations, PyTest integration, detailed documentation
- **Best For**: Teams preferring Python for automation, rapid test development
- **Includes**: Core Python concepts, Selenium integration, Jenkins CI/CD setup

#### **SQL-Gherkin**
Comprehensive BDD approach combining UI testing with database validation.
- **Features**: Gherkin syntax, SQL query validation, test data management
- **Best For**: End-to-end testing with UI + database assertion requirements
- **Includes**: Feature files, step definitions, extensive Python examples

### **2. API Testing**

**REST Assured - Java Framework**
- **Core Capabilities**:
  - GET, POST, PUT, DELETE operations
  - Request/Response specification builders
  - JSON & XML payload handling
  - OAuth 2.0 authentication support
  - Session filter management
  - File upload (MultiPart) testing

- **Advanced Patterns**:
  - POJO deserialization for response validation
  - Serialization of request payloads
  - Spec builders for code reusability
  - Cucumber integration for BDD

- **Dependencies**: RestAssured 5.4.0, TestNG, Jackson, Cucumber 7.23.0

- **Documentation**: Comprehensive `APITestingNotes.txt` with concepts, patterns, and best practices

### **3. Performance Testing**

**Apache JMeter**
- **Capabilities**:
  - Multi-threaded load simulation
  - Protocol support: HTTP/S, FTP, JDBC, LDAP, JMS, SOAP/REST
  - Recording & playback from browsers
  - Real-time monitoring and reporting
  - Dashboard generation
  - 3rd-party database integration (InfluxDB, Graphite)

- **Features**:
  - Correlation through data extraction
  - Pluggable samplers and functions
  - Maven/Gradle/Jenkins integration
  - Headless (non-GUI) execution

---

## Getting Started

### **Prerequisites**

- **Java 8+** (Java 21 recommended)
- **Python 3.8+**
- **Maven 3.6+**
- **Git**
- **Browser drivers** (ChromeDriver, GeckoDriver, etc.)

### **Installation**

#### **1. Clone Repository**
```bash
git clone https://github.com/prachilkolhe/Full-Stack-SDET-Portfolio.git
cd Full-Stack-SDET-Portfolio
```

#### **2. Set Up Java Projects**
```bash
cd API-Testing
mvn clean install
# or for specific tests
mvn test
```

#### **3. Set Up Python Projects**
```bash
cd UI-Automation/Selenium-Python
# Create virtual environment
python -m venv myenv
source myenv/bin/activate  # On Windows: myenv\Scripts\activate

# Install dependencies
pip install selenium pytest playwright
```

#### **4. Set Up Playwright**
```bash
cd UI-Automation/Playwright-Python
pip install pytest-bdd playwright
playwright install
```


---

## Key Features

### **1. Multi-Framework Approach**
- Flexibility to choose the right tool for the job
- Side-by-side comparison of different frameworks
- Framework decision guidance based on use cases

### **2. Enterprise-Grade Patterns**
- Page Object Model (POM) implementation
- Data-Driven Testing (DDT)
- BDD/Gherkin integration
- Spec Builders for code reusability

### **3. Comprehensive Documentation**
- APITestingNotes.txt: 150+ lines of API testing concepts and patterns
- Python Notes.txt: Python fundamentals and Selenium integration
- Selenium Notes: Best practices and advanced techniques
- Code comments: Inline documentation and explanations

### **4. Real-World Scenarios**
- OAuth 2.0 authentication handling
- File upload/download testing
- Multi-part form data submission
- Session-based authentication
- SQL query validation

### **5. CI/CD Integration**
- Maven build automation
- Jenkins integration with parameterization
- Test report generation
- Continuous integration ready

### **6. Advanced Reporting**
- Extent Reports (ExtentReports folder)
- HTML dashboards
- XML execution logs
- JSON test results for Cucumber


---

## Usage Examples

### **Running Selenium-Java Tests**
```bash
cd UI-Automation/Selenium-Java
mvn clean test
```

### **Running Python Selenium Tests**
```bash
cd UI-Automation/Selenium-Python/Selenium_Python_FW
pytest -v
```

### **Running Playwright Tests**
```bash
cd UI-Automation/Playwright-Python
pytest --headed  # Add --headed to see browser
```

### **Running API Tests with REST Assured**
```bash
cd API-Testing
mvn clean test -Dtest=TestClassName
```

### **Running Cucumber BDD Tests**
```bash
mvn test -Dcucumber.filter.tags="@SmokeTest"
```

### **Running JMeter Load Tests**
```bash
cd Load-Testing/bin
./jmeter.sh -n -t /path/to/test.jmx -l results.jtl -j jmeter.log
```


---

## Learning Resources
### **Included Documentation**
- *API-Testing/APITestingNotes.txt* - API testing fundamentals and advanced patterns
- *UI-Automation/Selenium-Python/Python Notes.txt* - Python programming guide
- *UI-Automation/Selenium-Python/Selenium Notes* - Selenium best practices
- *UI-Automation/SQL-Gherkin/* - Complete Python examples with Gherkin

### **Key Concepts Covered**

#### **1. API Testing**
- REST architecture and HTTP methods
- Request/Response specification builders
- OAuth 2.0 and authentication patterns
- POJO serialization/deserialization
- Cucumber integration for API BDD
- Jenkins CI/CD setup

#### **2. UI Testing**
- Selenium WebDriver fundamentals
- Playwright modern automation
- Page Object Model implementation
- Data-driven testing strategies
- ExtentReports integration
- Cross-browser testing

#### **3. Database Testing**
- SQL query integration
- Data validation strategies
- Gherkin with database assertions

#### **Performance Testing**
- Load testing concepts
- Correlation and dynamic data handling
- Report generation and analysis


---

## Advanced Topics
### **POJO & Serialization**
The portfolio demonstrates complete POJO implementation for:
- Request payload serialization
- Response payload deserialization
- Jackson databinding
- Data transformation patterns

### **Spec Builders**
Code examples showing:
- RequestSpecBuilder for request configuration
- ResponseSpecBuilder for assertion templates
- Reusable specification patterns
- Cleaner test code organization

### **Cucumber Hooks**
- @Before and @After hooks
- Scenario-dependent setup/teardown
- Data dependency management
- Report integration

### **Authentication Patterns**
- SessionFilter usage for cookie-based auth
- OAuth 2.0 token handling
- Authorization code flow
- Client credentials grant type


---

## Test Reports
The repository includes examples of:
- **ExtentReports** - HTML dashboard with trends
- **Cucumber Reports** - Detailed BDD scenario reports
- **JMeter Dashboards** - Performance metrics and graphs
- **Pytest Reports** - Comprehensive test execution results

Reports are generated in:
- test-output/ directories
- .html files in respective module folders
- target/ Maven output directories


---

## Contributing
This is a personal portfolio project. However, feedback and improvement suggestions are welcome!

To contribute:
- Fork the repository
- Create a feature branch (git checkout -b feature/improvement)
- Commit your changes (git commit -am 'Add improvement')
- Push to the branch (git push origin feature/improvement)
- Open a Pull Request


---

## Best Practices Demonstrated
- **Code Organization** - Clear folder structure and naming conventions.
- **Documentation** - Comprehensive inline comments and external docs.
- **Framework Patterns** - POM, DDT, BDD implementations.
- **Reusability** - Spec builders, utility methods, shared fixtures.
- **Reporting** - Multiple reporting strategies.
- **CI/CD Ready** - Maven, Jenkins, and automated build scripts.
- **Multiple Languages** - Java and Python expertise.
- **Real-World Scenarios** - Authentication, file handling, database integration


---

## Skill Set Demonstrated

| Category    | Skills                                                               |
|-------------|----------------------------------------------------------------------|
| Languages   | Java, Python, SQL                                                    |
| Frameworks  | Selenium, Playwright, REST Assured, TestNG, PyTest, Cucumber         |
| Tools       |	Maven, Apache JMeter, Jenkins, ExtentReports                         |
| Patterns	   | POM, DDT, BDD, Spec Builders, Page Factory                           |
| Concepts	   | API testing, UI automation, Performance testing, Database validation |
| Integration	| CI/CD, OAuth 2.0, Multi-threading, Reporting                         |


---

## Contact & Resources
- **Portfolio Owner:** [prachilkolhe](https://github.com/prachilkolhe)
- **Repository:** [Full-Stack-SDET-Portfolio](https://github.com/prachilkolhe/Full-Stack-SDET-Portfolio)
- **Email:** [prachilkolhe0802@gmail.com](mailto:prachilkolhe0802@gmail.com)


---

## Useful Links
- [Selenium Documentation](https://www.selenium.dev/)
- [Playwright Docs](https://playwright.dev/)
- [REST Assured](https://rest-assured.io/)
- [Apache JMeter](https://jmeter.apache.org/)
- [Cucumber](https://cucumber.io/)
- [Maven](https://maven.apache.org/)


---

## License
This project is provided as-is for educational and portfolio purposes.


---

## Highlights
- 5+ Testing Frameworks across multiple programming languages
- 100+ Python scripts demonstrating core concepts and advanced patterns
- Enterprise-grade patterns with real-world applications
- Full-stack approach from UI to API to Performance testing
- Comprehensive documentation with inline comments and external guides
- Production-ready code following industry best practices


Made with ❤️ by an SDET passionate about quality automation testing
