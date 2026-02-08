import java.sql.SQLOutput;
import java.util.Scanner;

class Student {
    public static void main(String[] args) {
        // a basic code
//        String name="sufiyan";
//        int age = 21;
//        float height= 181;
//        boolean is_a_goodboy = true;
//        System.out.println("my name is" +name);
//        System.out.println("my age is" +age);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your name:");
//        String name = sc.nextLine();
//        System.out.println("your name is:" +name);
//
//        Scanner Scanner = new Scanner(System.in);
//        System.out.println("enter your age :");
//        int age = Scanner.nextInt();
//        System.out.println("your age is :\n" +age);
//     // take 2 variables a and b and print their sum.
//        Scanner Scanner = new Scanner(System.in);
//        System.out.println("enter a :");
//        int a = Scanner.nextInt();
//        System.out.println("enter b :");
//        int b = Scanner.nextInt();
//        int sum = a+b;
//        System.out.println(sum);
//        Scanner.close();
        //basic practice question
//        double age = 21.1;
//        System.out.println("your age :"+age);

        //  area and circumference of a circle
       Scanner Scanner = new Scanner(System.in);
        System.out.println("enter radius :");
        double radius = Scanner.nextDouble();
        double pi = 3.14;
        double circum = 2 * pi * radius ;
        double area = pi * radius * radius;
        System.out.println("the circumference of  circle is:" +circum );
        System.out.println("the area of circle is :" +area);

        // print a table of any  number
        System.out.println("enter a value : ");
        int n = Scanner.nextInt();
        int tab;
        for (int i=1; i<10; i++) {
            tab = n*i;
            System.out.println(tab);


        }
//
//        // check if the number is odd or even
        System.out.println("enter a num : ");
        int num = Scanner.nextInt();
        if(num % 2 == 0){
            System.out.println("this is an even number");
        }
        else{
            System.out.println("this a an odd number");
        }

        // use nested if-else condition and we can use else if statement too
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();

        if(a==b){
            System.out.println("a is equal to b");
        }
        else{
            if(a>b){
                System.out.println("a is greater than b");
            }
            else{
                System.out.println("a is less  than b");
            }
        }

        //use switch statements , condition: 4 buttons for greeting
        System.out.println("greet in your language");
        int button = Scanner.nextInt();
        switch(button){
            case 1:
                System.out.println(" hello");break;
                case 2:
                    System.out.println(" namaste");break;
                    case 3:
                        System.out.println("assalamu alykum");break;
            case 4:
                System.out.println("hola amigo");break;
                case 5:
                    System.out.println("warning!!! you  are an alien");
        }
Scanner Scanner2 = new Scanner(System.in);
        System.out.println("greet in your  language");
         String greet = Scanner.nextLine();
        switch (greet){
            case "yoo":
                System.out.println("arrest him he is black");
                break;
            case "salam":
                System.out.println("you a muslim ");
                break;
            case "namaste":
                System.out.println("you are a OG hindu");
                break;
            case "$$$$":
                System.out.println("you are an jooz");
            default:
                System.out.println(" ghost detected");
        }




        }
}
