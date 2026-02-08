import java.sql.SQLOutput;
import java.util.Scanner;

class Calculator{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        double num1 ;
        double num2 ;
        char operator;
        double results = 0;

        System.out.print("enter the num1 :");
        num1 = Scanner.nextDouble();

        System.out.print("enter a operator ('+','-','/','*','^'): ");
        operator = Scanner.next().charAt(0);

        System.out.print("enter the num2 :");
        num2 = Scanner.nextDouble();



        switch (operator){
            case '+':results = num1 + num2;break;
            case '-':results = num1 - num2;break;
            case '*':results = num1 * num2;break;
            case '/':results = num1 / num2;
            break;
            case '^':results = Math.pow(num1, num2);break;
            default:
                System.out.println("invalid operator");
        }
        System.out.println(results);
        Scanner.close();
    }}