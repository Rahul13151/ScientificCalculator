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
        return Math.sqrt(num);
    }
    public double power(double num1,double num2){
        return Math.pow(num1,num2);
    }
    public double sinFunction(double angleInDegrees){
        double angleInRadians = Math.toRadians(angleInDegrees);
        return Math.sin(angleInRadians);
    }
    public double tanFunction(double angleInDegrees){
        double angleInRadians = Math.toRadians(angleInDegrees);
        return Math.tan(angleInRadians);
    }

//    public double divide(double num1,double num2){
//        try {
//            double ans = num1/num2;
//            return ans;
//        }
//        catch (ArithmeticException ex) {
//            ex.printStackTrace();
//            System.out.println("ERROR: Divide by zero");
//            return 0 ;
//        }
//    }
    public double cosFunction(double angleInDegrees){
        double angleInRadians = Math.toRadians(angleInDegrees);
        return Math.cos(angleInRadians);
    }

}
