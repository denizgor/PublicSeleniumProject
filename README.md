# Public Selenium Project

A template project for Selenium WebDriver using Java, TestNG, and Maven.

## Prerequisites

- Java JDK 11 or higher
- Maven 3.6 or higher
- Git

## Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/PublicSeleniumProject.git
   ```

2. Navigate to the project directory:
   ```bash
   cd PublicSeleniumProject
   ```

3. Install dependencies:
   ```bash
   mvn clean install
   ```

4. Run tests:
   ```bash
   mvn test
   ```

## Project Structure

```
PublicSeleniumProject/
├── src/
│   ├── main/java/com/selenium/project/
│   │   ├── base/
│   │   │   └── BaseTest.java
│   │   └── pages/
│   └── test/java/com/selenium/project/
│       └── tests/
│           └── SampleTest.java
├── pom.xml
├── testng.xml
└── README.md
```

## Features

- Selenium WebDriver 4.16.1
- TestNG 7.8.0
- WebDriverManager for automatic driver management
- Maven for dependency management and build automation
- Chrome browser support
- Base test class with common setup and teardown methods

## Notes

- The project uses WebDriverManager to automatically manage ChromeDriver, so no manual driver installation is required.
- Tests can be run using either Maven commands or through your IDE's TestNG plugin.
