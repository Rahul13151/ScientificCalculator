import ScientificCalculator.ScientificCalculator;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.testng.Assert;
import org.apache.commons.csv.*;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ScientificCalculatorTest extends ScientificCalculator {
   public ScientificCalculator calculator;
    @BeforeMethod
    public void setup(){
     calculator = new ScientificCalculator();
    }

    @Test(groups = {"basicOperations"},dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)

    public void testAddition(String func,Object num1,Object num2,Object expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("add")) {
      double actualResult = calculator.add(num1, num2);
      double expectedResult1 = Double.parseDouble((String)expectedResult);
      Assert.assertEquals(actualResult, expectedResult1);
     }else {
      // Skip the test if the condition is not met
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"basicOperations"},dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testSubtraction(String func,Object num1,Object num2,Object expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("subtract")) {
      double actualResult = calculator.subtract(num1, num2);
      double expectedResult1 = Double.parseDouble((String)expectedResult);
      Assert.assertEquals(actualResult, expectedResult1);
     }else {
      // Skip the test if the condition is not met
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"basicOperations"},dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testMultiplication(String func,Object num1,Object num2,Object expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("multiply")) {
      double actualResult = calculator.multiply(num1, num2);
      double expectedResult1 = Double.parseDouble((String)expectedResult);
      Assert.assertEquals(actualResult, expectedResult1);
     }else {
      // Skip the test if the condition is not met
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"basicOperations"},dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testDivision(String func,Object num1,Object num2,Object expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("divide")) {
      double actualResult = calculator.divide(num1, num2);
      double expectedResult1 = Double.parseDouble((String)expectedResult);
      Assert.assertEquals(actualResult, expectedResult1);
     }else {
      // Skip the test if the condition is not met
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"advancedOperations"},dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testPower(String func,Object num1,Object num2,Object expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("power")) {
      double actualResult = calculator.power(num1,num2);
      double expectedResult1 = Double.parseDouble((String)expectedResult);
      Assert.assertEquals(actualResult, expectedResult1);
     }else {
      // Skip the test if the condition is not met
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = "advancedOperations",dataProvider = "singleParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testSquareRoot(String func,Object num1,Object expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("squareRoot")) {
      double actualResult = calculator.squareRoot(num1);
      double expectedResult1 = Double.parseDouble((String)expectedResult);
      Assert.assertEquals(actualResult, expectedResult1);
     }else {
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }

    @Test(groups = {"advancedOperations"},dataProvider = "singleParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testSinFunction(String func,Object angle,Object expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("sin")) {
      double actualResult = calculator.sin(angle);
      double expectedResult1 = Double.parseDouble((String)expectedResult);
      Assert.assertEquals(actualResult, expectedResult1);
     }else {
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"advancedOperations"},dataProvider = "singleParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testCosFunction(String func,Object angle,Object expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("cos")) {
      double actualResult = calculator.cos(angle);
      double expectedResult1 = Double.parseDouble((String)expectedResult);
      Assert.assertEquals(actualResult, expectedResult1);
     }else {
      // Skip the test if the condition is not met
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"advancedOperations"},dataProvider = "singleParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testTanFunction(String func,Object angle,Object expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("tan")) {
      double actualResult = calculator.tan(angle);
      double expectedResult1 = Double.parseDouble((String)expectedResult);
      Assert.assertEquals(actualResult, expectedResult1);
     }else {
      // Skip the test if the condition is not met
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testInvalidAddition(String func,Object num1,Object num2,Object expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("InvalidAddition")) {
      double expectedResult1 = Double.parseDouble((String)expectedResult);
      double actualResult = calculator.add(num1, num2);
      Assert.assertEquals(actualResult,expectedResult1);
     }else {
      // Skip the test if the condition is not met
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testInvalidDivision(String func,Object num1,Object num2,Object expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("InvalidDivision")) {
      double expectedResult1 = Double.parseDouble((String)expectedResult);
      double actualResult = calculator.divide(num1, num2);
      Assert.assertEquals(actualResult,expectedResult1);
     }else {
      // Skip the test if the condition is not met
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
     }


    @AfterMethod
    public void tearDown(){

    }

}

