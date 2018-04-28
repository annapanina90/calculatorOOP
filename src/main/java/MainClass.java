//ДЗ 5 калькулятор в стиле ООП
//ДЗ 7 добавить обработку исключений
//ДЗ 8 Покрыть Unit тестами

import calculator.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void cls() {
        for (int i = 0; i <= 25; i++)
            System.out.println();
    }

    public static void main(String[] args) throws IOException {
        Calculator calc = new Calculator();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to calculator");
        String key="";
        do
        {
            // cls();
            System.out.print("\tChoose operation:");
            System.out.print("\tX - exit");
            System.out.print("\tH - help\n");

            try {
                key = r.readLine().trim().toLowerCase();
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }


            calc.setError(false);
            if ("x".equals( key )) {
                System.out.println( "Exit" );
                System.out.println( "Good bye!!!" );
                r.close();
                return;
            } else if ("h".equals( key )) {
                cls();
                System.out.println( "+\n-\n*\n/\n" );
            } else if ("+".equals( key )) {
                calc.setOperation( '+' );
                calc.setNumber1( getNumber() );
                calc.setNumber2( getNumber() );
                calc.sum();
            } else if ("-".equals( key )) {
                calc.setOperation( '-' );
                calc.setNumber1( getNumber() );
                calc.setNumber2( getNumber() );
                calc.minus();
            } else if ("*".equals( key )) {
                calc.setOperation( '*' );
                calc.setNumber1( getNumber() );
                calc.setNumber2( getNumber() );
                calc.multi();
            } else if ("/".equals( key )) {
                calc.setOperation( '/' );
                calc.setNumber1( getNumber() );
                calc.setNumber2( getNumber() );
                calc.div();


            } else if ("=".equals( key )) {
                switch (calc.getOperation()) {
                    case '+':
                        calc.sum();
                    case '-':
                        calc.minus();
                    case '*':
                        calc.multi();
                    case '/':
                        calc.div();
                }
            } else {
                calc.setError( true );
                System.out.println( "Неизвестная команда! Повторите ввод!" );
            }
            System.out.println( calc.isError() ? "Error" : "Result: " + calc.getNumber1() );

        } while (true);


    }

    public static double getNumber() throws IOException
    {
        System.out.println("Input number");
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double number = 0;

        try {
            number = Double.parseDouble(r.readLine().trim());

        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

                return number;
    }

    }

/* } else if ("/".equals( key )){
                calc.setOperation( '/' );
                calc.setNumber1( getNumber() );
                calc.setNumber2( 0 );
                try {calc.div();}
                catch (ArithmeticException e){
                    System.out.println("На ноль делить нельзя");
                }
*/