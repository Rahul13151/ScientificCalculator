package ScientificCalculator;

public class ScientificCalculator {
    public double add(double num1, double num2){

        try {
            if (Double.isInfinite(num1) || Double.isInfinite(num2) || Double.isNaN(num2) || Double.isNaN(num2)) {
                throw new IllegalArgumentException("Invalid input: Arguments must be finite numbers.");
            }
            double result = num1 + num2 ;

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
    public double subtract(double num1,double num2){
        try {
            if (Double.isInfinite(num1) || Double.isInfinite(num2) || Double.isNaN(num2) || Double.isNaN(num2)) {
                throw new IllegalArgumentException("Invalid input: Arguments must be finite numbers.");
            }
            double result = num1 - num2 ;

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
    public double multiply(double num1,double num2){
        try {
            if (Double.isInfinite(num1) || Double.isInfinite(num2) || Double.isNaN(num2) || Double.isNaN(num2)) {
                throw new IllegalArgumentException("Invalid input: Arguments must be finite numbers.");
            }
            double result = num1 * num2 ;

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
    public double divide(double dividend,double divisor){
        try {
            if (Double.isInfinite(dividend) || Double.isInfinite(divisor) || Double.isNaN(dividend) || Double.isNaN(divisor)) {
                throw new IllegalArgumentException("Invalid input: Arguments must be finite numbers.");
            }

            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            double result = dividend / divisor;

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
    public double squareRoot(double num){
        try {
            // Check for valid input before performing square root
            if (Double.isInfinite(num) || Double.isNaN(num) || num<0) {
                throw new IllegalArgumentException("Invalid input: Cannot calculate square root of a negative number.");
            }
            double result = Math.sqrt(num);

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
    public double power(double base, double exponent) {
        try {
            if (base < 0 && exponent % 1 != 0) {
                throw new IllegalArgumentException("Invalid input: Cannot calculate fractional root of a negative number.");
            }

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
    public double sin(double angleInDegrees) {
        try {
            double angleInRadians = Math.toRadians(angleInDegrees);
            double result = Math.sin(angleInRadians);

            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Result is infinity");
            } else if (Double.isNaN(result)) {
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

    public double cos(double angleInDegrees) {
        try {
            double angleInRadians = Math.toRadians(angleInDegrees);
            double result = Math.cos(angleInRadians);
            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Result is infinity");
            } else if (Double.isNaN(result)) {
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

    public double tan(double angleInDegrees) {
        try {
            double angleInRadians = Math.toRadians(angleInDegrees);
            double result = Math.tan(angleInRadians);

            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Result is infinity");
            } else if (Double.isNaN(result)) {
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
