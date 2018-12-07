
package calculator;

public class Calculator {
    private double number1 = 0;
    private double number2 = 0;
    private char operation;
    private boolean error = false;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {

        return number2;
    }

    public void setNumber2(double number2) {

        this.number2 = number2;
    }

    public void sum() {
        this.setNumber1( this.getNumber1() + this.getNumber2() );
        }


    public void minus() {
        this.setNumber1( this.getNumber1() - this.getNumber2() );
    }

    public void multi() {
        this.setNumber1( this.getNumber1() * this.getNumber2() );
    }

    public void div() throws ArithmeticException {

        this.setNumber1( this.getNumber1() / this.getNumber2() );
        if (number2==0) { throw  new ArithmeticException("На ноль делить нельзя!");
        }

    }
    public void perc() {this.setNumber1(this.getNumber1()* getNumber2() / 100);}
}

