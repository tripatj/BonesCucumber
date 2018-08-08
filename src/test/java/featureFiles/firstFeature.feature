Feature: validate 

Scenario Outline: Sceanario1
Given Launch application "<URL>"
When Enter userName "<userName>"
Then Enter pwdName "<password>"

Examples:
|userName|password|URL|
|admin|admin123|https://orangehrm-demo-6x.orangehrmlive.com/auth/login|
