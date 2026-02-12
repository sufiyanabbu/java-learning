import java.util.Scanner;


class Prac1{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter n: ");
    int n= sc.nextInt();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            int sum=i+j;
            if(sum % 2 == 0){
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }

        }
        System.out.println();
    }
}}

//    int n = 5;
//    int i = 1;
//    int m = 5;
//    for (i = 1; i <= n; i++) {
//        for (int j = 1; j <= i; j++) {
//            System.out.print("*");
//        }
//        System.out.println();
//
//    }
//}}

//    int n=5;
//   for(int i=1;i<=n;i++){
//       for (int j = 1;j<=n-i;j++){
//           System.out.print(" ");
//       }
//       for (int j=1;j<=i;j++){
//           System.out.print("*");
//       }
//       System.out.println();

//}

//    int n = 4;
//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//        System.out.println();
//    }




//    int n = 4;
//    int m = 5;
//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=m;j++){
//            if(i==1 || j==1 || i==n || j==m ){
//                System.out.print("*");
//            } else {
//                System.out.print(" ");
//            }
//        }
//        System.out.println();
//    }




//    Scanner scanner = new Scanner(System.in);
//for(int i=1;i<=4;i++) {
//    for (int j = 1; j <=5; j++) {
//        System.out.print("*");
//    }
//    System.out.println("*");
//}



// // print if a number is prime or not 

// Scanner scanner = new Scanner(System.in);

// System.out.print("enter a number: ");
// int num= scanner.nextInt();
// int count=0;
// // num = 10
// for(int i = 1;i<=num;i++){
//     if(num%i==0){
//         count++;
//     }
// }
//     if(count==2){
//     System.out.println("prime");}
// else {
//         System.out.println("not prime");
//     }
// }
// }


// //driven prog
//     System.out.println("enter 1 to start the program");
//     System.out.println("enter 0 to end the program");
//     System.out.print("==> ");
//     int n = Scanner.nextInt();

//     if (n == 1) {
//         System.out.println(" thank you ! please enter your marks ");
//         for (int marks = 1; marks <= 100; marks++) {
//             System.out.print("marks: ");
//              marks = Scanner.nextInt();
//             if (marks > 85) {
//                 System.out.println("A+ grade");
//                 System.out.println("pass");
//             } else if (marks < 90 && marks > 69) {
//                 System.out.println("B+ grade");
//                 System.out.println("pass");
//             } else if (marks < 70 && marks >= 30) {
//                 System.out.println("C grade");
//                 System.out.println("pass");
//             } else if (marks < 30 && marks >= 1) {
//                 System.out.println("D 1grade");
//                 System.out.println("fail");
//                 System.out.println("better luck next time");
//             } else {
//                 System.out.println("invalid  information");
//             }
//         }

//     }
//     else if(n == 0){
//         System.out.println("invalid information");
//         System.out.println("try again");
//     }

// }}





//    int n = Scanner.nextInt();
//
//    for(int i=1;i<=n;i++){
//        if(i%2==0){
//            System.out.println(i);
//            //System.out.println("apna college");
//        }
//    }


//table of n number
//int i = 1;
//
//    System.out.print("enter a number: ");
//    int n= Scanner.nextInt();
//    for(i=1;i<=10;i++){
//
//        System.out.println(n*i);
//    }




//int i;
//int sum=0;
//System.out.print("enter a number: ");
//int n=scanner.nextInt();
//for(i=1;i<=n;i++){
//
//
//    sum=sum+i;
//}
//    System.out.println(sum);


//for(int i=1;i<=3;i++) {
//    System.out.println("hello Sufiyan");
//}
//
//
//int n = 1;
//while(n<=10){
//    System.out.println(n);
//     n++;
//}
//int i=1;
//do {
//    System.out.println(i);
//    i++;
//}while (i<6);

  // print the sum of n natural number

