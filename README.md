1.Given task converted into Hybrid Framework best industry practice using POM(Page Object Model)
   This Framework helps 
    1.1.Code readability
    1.2.Easy to maintain
    1.3.Easy to understand
    1.4.Code reusability

2.Refactored the code using abstractions and methods for repetitive tasks.

3.Added many additionality functionalities like 
  3.1. When TestCase fails it will take screenshot
  3.2.Browser specific and environment specific code behavior.

Hybrid Framework

Combination of data-driven and method-driven framework 
we can take input from an external file(Excel File)

sample XML code 

<suite name="Suite">
  <test name="Test">
  <parameter name="browser" value="chrome" />
    <classes>
      <class name="prod_Script.SignInTest"/>
    </classes>
  </test> 
</suite> 

In this file, I'm passing browser name based on this it will choose which browser to open 
