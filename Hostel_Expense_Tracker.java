import java.util.*;
public class Hostel_Expense_Tracker {
    public static void addExpenses(int[] expense , Scanner sc){
        for(int i = 0; i < expense.length; i++){
            System.out.print("Enter Day " + (i+1) + " Expense: ");
            expense[i] = sc.nextInt();
        }
    }

    public static void displayExpenses(int[] expense){
        for(int i = 0; i < expense.length; i++){
            System.out.println("Day " + (i+1) + " Expense: " + expense[i]);
        }
    }

    public static int totalExpense(int[] expense){
        int total = 0;
        for(int i = 0; i < expense.length; i++){
            total = total + expense[i];
        }
        return total;
    }

    public static void highestExpense(int[] expense){
        int highest = expense[0];
        // Finding Highest Expense.
        for(int i = 0; i < expense.length; i++){
            if(expense[i] > highest){
                highest = expense[i];
             }
        }
        // Print all Highest Days.
        for(int i = 0; i < expense.length; i++){
            if(expense[i] == highest){
                System.out.println("Day " + (i + 1)  + " Expense is Highest: " + highest);
            }
        }
    }

    public static void lowestExpense(int[] expense){
        int lowest= expense[0];
        int day = 0;
        for(int i = 0; i < expense.length; i++){
            if(expense[i] < lowest){
                lowest = expense[i];
            }
        }
        for(int i = 0; i < expense.length; i++){
            if(expense[i] == lowest){
                System.out.println("Day " + (i + 1)  + " Expense is Highest: " + lowest);
            }
        }
     }

    public static void searchExpense(int[] expense, Scanner sc){
        System.out.print("Enter Expense to Search: ");
        int exp = sc.nextInt();
        boolean isFound = false;
        for(int i = 0; i < expense.length; i++){
            if(expense[i] == exp){
                isFound = true;
                System.out.println(exp + " is found at Day '" + (i + 1) + "'");
            }
        }
        if(!isFound){
            System.out.println("Expense is not found...");
        }
    }
     
    public static void averageExpense(int[] expense){
        int avg = totalExpense(expense) / expense.length;
        System.out.println("Your Average expense in " + expense.length + " days: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Hostel Expense Tracker =====");

        System.out.println("1.Add Expenses.\n2.Display Expenses.\n3.Total Expense.\n4.Highest Expense.\n5.Lowest Expense.\n6.Search Expense.\n7.Average Expense.\n8.EXIT");
        System.out.println();
        System.out.print("How many Days? : ");
        int n = sc.nextInt();
        System.out.println();

        int[] expense = new int[n];
        while(true){
            System.out.print("Enter Your Choice: ");
            int ch = sc.nextInt();
            System.out.println();

            switch(ch){
                case 1: System.out.println("Enter Your Daily Expenses: ");
                        addExpenses(expense , sc);
                        System.out.println("Your Expenses Added Successfully...");
                        System.out.println();
                        break;
                case 2: System.out.println("Your Expenses is: ");
                        displayExpenses(expense);
                        System.out.println();
                        break;
                case 3: System.out.println("Your Total expense is: " + totalExpense(expense));
                        System.out.println();
                        break;
                case 4: highestExpense(expense);
                        System.out.println();
                        break;
                case 5: lowestExpense(expense);
                        System.out.println();
                        break;
                case 6: searchExpense(expense,sc);
                        System.out.println();
                        break;
                case 7: averageExpense(expense);
                        System.out.println();
                        break;
                case 8: return;

                default: System.out.println("Invalid Choice...");
            }

        }

    }
}
