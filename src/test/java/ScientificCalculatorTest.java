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

    public void testAddition(String func,double num1,double num2,double expectedResult){

     calculator = new ScientificCalculator();
     if(func.equals("add")) {
      double actualResult = calculator.add(num1, num2);
      Assert.assertEquals(actualResult, expectedResult);
     }else {
      // Skip the test if the condition is not met
      System.out.println("Skipping test for "   + " with data: " );
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"basicOperations"},dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testSubtraction(String func,double num1,double num2,double expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("subtract")) {
      double actualResult = calculator.subtract(num1, num2);
      Assert.assertEquals(actualResult, expectedResult);
     }else {
      // Skip the test if the condition is not met
      System.out.println("Skipping test for "   + " with data: " );
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"basicOperations"},dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testMultiplication(String func,double num1,double num2,double expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("multiply")) {
      double actualResult = calculator.multiply(num1, num2);
      Assert.assertEquals(actualResult, expectedResult);
     }else {
      // Skip the test if the condition is not met
      System.out.println("Skipping test for "   + " with data: " );
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"basicOperations"},dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testDivision(String func,double num1,double num2,double expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("divide")) {
      double actualResult = calculator.divide(num1, num2);
      Assert.assertEquals(actualResult, expectedResult);
     }else {
      // Skip the test if the condition is not met
      System.out.println("Skipping test for "   + " with data: " );
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"advancedOperations"},dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testPower(String func,double num1,double num2,double expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("power")) {
      double actualResult = calculator.power(num1,num2);
      Assert.assertEquals(actualResult, expectedResult);
     }else {
      // Skip the test if the condition is not met
      System.out.println("Skipping test for "   + " with data: " );
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = "advancedOperations",dataProvider = "singleParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testSquareRoot(String func,double num1,double expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("squareRoot")) {
      double actualResult = calculator.squareRoot(num1);
      Assert.assertEquals(actualResult, expectedResult);
     }else {
      // Skip the test if the condition is not met
      System.out.println("Skipping test for "   + " with data: " );
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }

    @Test(groups = {"advancedOperations"},dataProvider = "singleParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testSinFunction(String func,double angle,double expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("sin")) {
      double actualResult = calculator.sin(angle);
      Assert.assertEquals(actualResult, expectedResult);
     }else {
      // Skip the test if the condition is not met
      System.out.println("Skipping test for "   + " with data: " );
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"advancedOperations"},dataProvider = "singleParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testCosFunction(String func,double angle,double expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("cos")) {
      double actualResult = calculator.cos(angle);
      Assert.assertEquals(actualResult, expectedResult);
     }else {
      // Skip the test if the condition is not met
      System.out.println("Skipping test for "   + " with data: " );
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test(groups = {"advancedOperations"},dataProvider = "singleParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void testTanFunction(String func,double angle,double expectedResult){
     calculator = new ScientificCalculator();
     if(func.equals("tan")) {
      double actualResult = calculator.tan(angle);
      System.out.println("  ____"+actualResult);
      Assert.assertEquals(actualResult, expectedResult);
     }else {
      // Skip the test if the condition is not met
      System.out.println("Skipping test for "   + " with data: " );
      throw new org.testng.SkipException("Test skipped as data does not match the condition");
     }
    }
    @Test
    public void testInvalidAddition(){
     calculator = new ScientificCalculator();
//     calculator.add("abf","ade");

    }
    @Test
    public void testInvalidDivision(){
     calculator = new ScientificCalculator();
      calculator.divide(5,0);
     }


    @AfterMethod
    public void tearDown(){
    }

}

