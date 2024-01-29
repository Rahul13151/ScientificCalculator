package ScientificCalculator;

import java.sql.SQLOutput;

public class ScientificCalculator {
    public double add(Object num1, Object num2){

        try {
            double n1;
            double n2;
            n1 = Double.parseDouble(String.valueOf(num1));
            n2 = Double.parseDouble(String.valueOf(num2));

            double result = n1+n2;

            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Result is infinity");
            } else if (Double.isNaN(result)) {
                throw new ArithmeticException("Result is NaN (Not a Number)");
            }

            return result;
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal Argument Exception: " + e.getMessage());
            return Double.NaN;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
            return Double.NaN;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return Double.NaN;
        }
    }
    public double subtract(Object num1,Object num2){
        try {
            double n1;
            double n2;
            n1 = Double.parseDouble(String.valueOf(num1));
            n2 = Double.parseDouble(String.valueOf(num2));

            double result = n1-n2;

            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Result is infinity");
            } else if (Double.isNaN(result)) {
                throw new ArithmeticException("Result is NaN (Not a Number)");
            }
            return result;
        } catch (IllegalArgumentException e) {
            // Handle the specific illegal argument exception
            System.err.println("Illegal Argument Exception: " + e.getMessage());
            // You might log the exception or perform additional error handling here
            return Double.NaN;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
            return Double.NaN;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return Double.NaN;
        }
    }
    public double multiply(Object num1,Object num2){
        try {
            double n1;
            double n2;
            n1 = Double.parseDouble(String.valueOf(num1));
            n2 = Double.parseDouble(String.valueOf(num2));

            double result = n1*n2;

            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Result is infinity");
            } else if (Double.isNaN(result)) {
                throw new ArithmeticException("Result is NaN (Not a Number)");
            }

            return result;
        } catch (IllegalArgumentException e) {
            // Handle the specific illegal argument exception
            System.err.println("Illegal Argument Exception: " + e.getMessage());
            // You might log the exception or perform additional error handling here
            return Double.NaN;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
            return Double.NaN;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return Double.NaN;
        }
    }
    public double divide(Object dividend,Object divisor){
        try {
            double n1;
            double n2;
            n1 = Double.parseDouble(String.valueOf(dividend));
            n2 = Double.parseDouble(String.valueOf(divisor));
            if (n2 == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            double result = n1/n2;

            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Result is infinity");
            } else if (Double.isNaN(result)) {
                throw new ArithmeticException("Result is NaN (Not a Number)");
            }

            return result;
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal Argument Exception: " + e.getMessage());
            return Double.NaN;
        } catch (ArithmeticException e) {

            System.err.println("Arithmetic Exception: " + e.getMessage());

            return Double.NaN;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return Double.NaN;
        }
    }
    public double squareRoot(Object num){
        try {
            double n1;
            n1 = Double.parseDouble(String.valueOf(num));

            if (Double.isInfinite(n1)|| n1<0) {
                throw new IllegalArgumentException("Invalid input: Cannot calculate square root of a negative number.");
            }
            double result = Math.sqrt(n1);

            if (Double.isNaN(result)) {
                throw new ArithmeticException("Result is NaN (Not a Number)");
            }

            return result;
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal Argument Exception: " + e.getMessage());
            return Double.NaN;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
            return Double.NaN;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return Double.NaN;
        }
    }
    public double power(Object num1, Object num2) {
        try {
            double base;
            double exponent;
            base = Double.parseDouble(String.valueOf(num1));
            exponent = Double.parseDouble(String.valueOf(num2));

            double result = Math.pow(base, exponent);

            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Result is infinity");
            } else if (Double.isNaN(result)) {
                throw new ArithmeticException("Result is NaN (Not a Number)");
            }

            return result;
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal Argument Exception: " + e.getMessage());
            return Double.NaN;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
            return Double.NaN;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return Double.NaN;
        }
    }
    public double sin(Object angleInDegrees) {
        try {

            double angleInDegrees2 ;
            angleInDegrees2 = Double.parseDouble(String.valueOf(angleInDegrees));

            double angleInRadians = Math.toRadians(angleInDegrees2);
            double result = Math.sin(angleInRadians);

            if (Double.isNaN(result)) {
                throw new ArithmeticException("Result is NaN (Not a Number)");
            }

            return result;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
            return Double.NaN;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return Double.NaN; // or handle in a way appropriate for your application
        }
    }

    public double cos(Object angleInDegrees) {
        try {
            double angleInDegrees2 ;
            angleInDegrees2 = Double.parseDouble(String.valueOf(angleInDegrees));

            double angleInRadians = Math.toRadians(angleInDegrees2);
            double result = Math.cos(angleInRadians);

            if (Double.isNaN(result)) {
                throw new ArithmeticException("Result is NaN (Not a Number)");
            }

            return result;
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic Exception: " + e.getMessage());
            return Double.NaN;
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            return Double.NaN;
        }
    }

    public double tan(Object angleInDegrees) {
        try {
            double angleInDegrees2 ;
            angleInDegrees2 = Double.parseDouble(String.valueOf(angleInDegrees));

            double angleInRadians = Math.toRadians(angleInDegrees2);
            double result = Math.tan(angleInRadians);

            if (Double.isNaN(result)) {
                throw new ArithmeticException("Result is NaN (Not a Number)");
            }

            return result;
        } catch (ArithmeticException e) {
            // Handle the specific arithmetic exception
            System.err.println("Arithmetic Exception: " + e.getMessage());
            // You might log the exception or perform additional error handling here
            return Double.NaN; // or handle in a way appropriate for your application
        } catch (Exception e) {
            // Handle other generic exceptions
            System.err.println("Exception: " + e.getMessage());
            return Double.NaN; // or handle in a way appropriate for your application
        }
    }
}
