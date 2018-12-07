import calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TestCalc {
    @Test
    public void testMinus() {
        Calculator calc = new Calculator();
        calc.setNumber1( 5 );
        calc.setNumber2( 2 );
        calc.minus();
        Assert.assertEquals(3,calc.getNumber1(),0);
        System.out.println("Result minus: " + calc.getNumber1());
    }
    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        calc.setNumber1( 8 );
        calc.setNumber2( 2 );
        calc.sum();
        Assert.assertEquals( 10,calc.getNumber1(),0 );
        System.out.println("Result sum: " + calc.getNumber1());
        }

    @Test
    public void testMulti() {
        Calculator calc = new Calculator();
        calc.setNumber1( 3 );
        calc.setNumber2( 2 );
        calc.multi();
        Assert.assertEquals( 6,calc.getNumber1(),0 );
        System.out.println("Result multi: " + calc.getNumber1());
    }
    @Test
    public void testDiv() {
        Calculator calc = new Calculator();
        calc.setNumber1( 4 );
        calc.setNumber2( 2 );
        calc.div();
        Assert.assertEquals( 2,calc.getNumber1(),0);
        System.out.println("Result div: " + calc.getNumber1());
    }
    @Test
    public void testPerc() {
        Calculator calc = new Calculator();
        calc.setNumber1(10);
        calc.setNumber2(30);
        calc.perc();
        Assert.assertEquals(3, calc.getNumber1(), 0);
        System.out.println("Result perc: " + calc.getNumber1());
    }

    @Test(expected = ArithmeticException.class)
    public void testDivWillThrowExceptionWhenDivOnZero() {
        Calculator calc = new Calculator();
        calc.setNumber1( 2 );
        calc.setNumber2( 0 );
        calc.div();
            }

    }

