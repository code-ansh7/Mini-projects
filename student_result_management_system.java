import java.util.*;
import javax.sound.sampled.SourceDataLine;
public class student_result_management_system {
    public static void addMarks(int[] marks){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < marks.length; i++){
            marks[i] = sc.nextInt();
        }
    }

    public static void displayMarks(int[] marks){
        for(int i = 0; i < marks.length; i++){
            System.out.println("Student'" + (i+1) + "' = " + marks[i]);
        }
        System.out.println();
    }

    public static void highestMarks(int[] marks){
        int max = marks[0];
        
        int i;
        for(i = 0; i < marks.length; i++){
            if(marks[i] > max){
                max = marks[i];
             }
        }
        for(i = 0; i < marks.length; i++){
            if(marks[i] == max){
                 System.out.println("Student'" + (i+1) + "' gets Highest Marks,That is '" + max + "'");
            }  
        }
    }

    public static void lowestMarks(int[] marks){
        int min = marks[0];
         int i;
        for(i = 0; i < marks.length; i++){
            if(marks[i] < min){
                min = marks[i];
             }
        }
        for(i = 0; i < marks.length; i++){
            if(marks[i] == min){
                 System.out.println("Student'" + (i+1) + "' gets Lowest Marks,That is '" + min + "'");
            }  
        }
     }   

    public static void averageMarks(int[] marks){
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        int avg = (sum / marks.length);
        System.out.println("Average Student Marks: " + avg);
    }

    public static void searchMarks(int[] marks, Scanner sc){
        System.out.print("Enter marks to search: ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < marks.length; i++){
            if(marks[i] == target){
                System.out.println(target + " found at Student " + (i + 1));
                found = true;
            }
        }

    if(!found){
        System.out.println("Marks not found.");
    }
  }

  public static void passFailCount(int[] marks){
    int passCount = 0;
    int failCount = 0;
    for(int i = 0; i < marks.length; i++){
        if(marks[i] >= 40){
            passCount++;
        }
        else{
            failCount++;
        }
    }
    System.out.println("Pass Students = " + passCount);
    System.out.println("Fail Students = " + failCount);
  }

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Student Result Management========");
        System.out.println("1.Add Marks.\n2.Display Marks.\n3.Highest Marks.\n4.Lowest Marks.\n5.Average Marks.\n6.Search Marks.\n7.Pass-Fail Count\n8.Exit");
        System.out.println();
        System.out.print("Enter Student Numbers: ");
        int n = sc.nextInt();
        System.out.println();
        int[] marks = new int[n];

        while (true) {
            System.out.print("Enter your Choice: "); 
            int ch = sc.nextInt();
            System.out.println("");
            switch(ch){
                case 1 : // for taking marks from user.
                         System.out.println("Enter Marks: ");                     
                         addMarks(marks);
                         System.out.println("Your marks Added Successfully...");
                         System.out.println("");
                         break;
                case 2 : System.out.println("Your Marks is: ");
                         displayMarks(marks);
                         System.out.println("");
                         break;
                case 3 :  
                         highestMarks(marks);
                         System.out.println("");
                         break;
                case 4 : 
                         lowestMarks(marks);
                         System.out.println("");
                         break;
                case 5 : 
                         averageMarks(marks);
                         System.out.println("");
                         break;
                case 6 : 
                         searchMarks(marks, sc);// sc is object of scanner 
                         System.out.println("");
                         break;
                case 7 : 
                         passFailCount(marks);
                         System.out.println("");
                         break;
                case 8 : return;
                
                default : System.out.println("Invalid Choice...");        
            }
        }
    }
}
