# CI/CD + Coverage Demo

## Run locally
mvn clean test

## JaCoCo report
Open:
target/site/jacoco/index.html

## GitHub Actions
Push this project to GitHub. The workflow under `.github/workflows/ci.yml` runs automatically on push and pull request.

## Homework
- Assignment 3: use the Actions tab to capture a successful run, then intentionally break a test and capture a failed run.
- Assignment 7: use the JaCoCo report to show Statement/Branch coverage.
