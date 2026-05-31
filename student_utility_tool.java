import java.util.Scanner;
public class student_utility_tool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Student Utility Tool====");
        while (true) { 
            System.out.println("1.Even/Odd Checker");
            System.out.println("2.Reverse Number");
            System.out.println("3.Count Digit");
            System.out.println("4.Sum of Digit");
            System.out.println("5.Factorial");
            System.out.println("6.Multiplication Table");
            System.out.println("7.Calculator");
            System.out.println("8.Largest of 3 numbers");
            System.out.println("9. Leap Year ");
            System.out.println("10.Grade CAlculator ");
            System.out.println("11.Exit");
            System.out.println("");

            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();
            System.out.println("");

            switch(ch){
                // For checking Number is Even or Odd 
                case 1 : System.out.print("Enter Your Number : ");
                         int n = sc.nextInt();
                         if (n % 2 == 0) {
                            System.out.println(n + " is an Even Number.");
                         } else {
                            System.out.println(n + " is an Odd Number.");
                         }
                         break;
                // For finding Reverse of the Number 
                case 2 : System.out.print("Enter number : ");
                         int x = sc.nextInt();
                         int d;
                         int rev = 0;
                         while(x > 0){
                            d = x % 10; // find last digit
                            rev = (rev*10) + d; // add in reverse order 
                            x = x / 10;  //for decrement 
                        }
                        System.out.println("Reverse Number : " + rev );
                        break;
                // For counting Digits of any number
                case 3 : System.out.print("Enter Number : ");
                         int a = sc.nextInt();
                         int count = 0 ;
                         while(a > 0){
                         count += 1;
                         a = a / 10; 
                         }
                        System.out.println("Digits : " + count);
                        break;
                //For finding Sum of Digits of a number 
                case 4 : System.out.print("Enter number : ");
                         int b = sc.nextInt();
                         int sum = 0;
                         int digit;
                         while(b > 0){
                            digit = b % 10;
                            sum = sum + digit;
                            b = b / 10;
                        }
                        System.out.println("Sum of Digits : "+ sum);
                        break;
                //For finding Factorial of a number 
                case 5 : System.out.print("Enter number : ");
                         int c = sc.nextInt();
                         int fact = 1;        
                        
                         for(int i = 1;i <= c; i++){
                             fact = fact * i;
                         }
                         System.out.println("The factorial is : "+ fact);
                         break;
                //getting Table of a number 
                case 6 : System.out.print("Enter number : ");
                         int num = sc.nextInt();
                         for(int i = 1; i <= 10; i++){
                                 System.out.println(num + " * " + i + " = " + num * i);
                         } 
                         break;
                //Calculator...
                case 7 : System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
                         System.out.print("Enter your operation : ");
                         int op = sc.nextInt();
            
                                      
                         switch(op){
                             case 1 : //for add operation
                                    System.out.print("Enter your First number : ");
                                    int n1 = sc.nextInt();
                                    System.out.print("Enter your Second number : ");
                                    int n2 = sc.nextInt();
                                    System.out.println("Sum = " + (n1 + n2));
                                    break;
                             case 2 : //for Subtraction operatin 
                                     System.out.print("Enter your First number : ");
                                     int n3 = sc.nextInt();
                                     System.out.print("Enter your Second number : ");
                                     int n4 = sc.nextInt();
                                     System.out.println("Difference = " + (n3 - n4));
                                     break;
                             case 3 : //for Multiplication operation
                                     System.out.print("Enter your First number : ");
                                     int n5 = sc.nextInt();
                                     System.out.print("Enter your Second number : ");
                                     int n6 = sc.nextInt();   
                                     System.out.println("Multiplication = " + (n5 * n6));
                                     break;
                             case 4 : //for Division operation
                                     System.out.print("Enter your First number : ");
                                     float n7 = sc.nextInt();
                                     System.out.print("Enter your Second number : ");
                                     float n8 = sc.nextInt();              
                                     System.out.println("Division = " + (n7 / n8));
                                     break;
                            default : System.out.println("Invalid Opration...");
                            
                         }
                        break;
                case 8 : //find biggest number in 3 numbers 
                        System.out.print("Enter First Number : ");
                        int n1 = sc.nextInt();
                                    
                        System.out.print("Enter Second Number : ");
                        int n2 = sc.nextInt();
                                    
                        System.out.print("Enter Third Number : ");
                        int n3 = sc.nextInt();

                        if(n1 >= n2 && n1 >= n3){
                           System.out.println("Largest Number = " + n1);
                        }
                        else if(n2 >= n1 && n2 >= n3){
                           System.out.println("Largest Number = " + n2);
                        }
                          else{
                              System.out.println("Largest Number = " + n3);
                        }
                        break;
                case 9 :  //check Year is Leap year or not 
                        System.out.print("Enter Year : ");
                        int year = sc.nextInt();

                        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                            System.out.println(year + " is a Leap Year.");
                        }
                        else{
                            System.out.println(year + " is not a Leap Year.");
                        }
                        break;
                case 10 : //for Assigning grades to a student 
                        System.out.print("Enter Marks : ");
                        int marks = sc.nextInt();

                        if(marks >= 90){
                            System.out.println("Grade A");
                            }                           
                        else if(marks >= 75){
                            System.out.println("Grade B");
                        }
                        else if(marks >= 60){
                            System.out.println("Grade C");
                        }
                        else if(marks >= 40){
                            System.out.println("Grade D");
                    }
                        else{
                            System.out.println("Fail");
                        }

                        break;
                case 11 : System.out.println("Thank You For Using Student Utility Tool!");
                         return;
                default : System.out.println("Invalid Choice...");
           }
           System.out.println("");
        }
    }
}
