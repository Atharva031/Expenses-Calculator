import java.util.*;
import java.util.Scanner;

class Milk_Bill
{
    
    public static int inputMilkBill()
    {
        Scanner sc = new Scanner(System.in);
        int ratePerLiter = 70;
        System.out.print("Enter the name of the month: ");
        String nameOfMonth = sc.next();
        System.out.print("Enter the number of liters bought: ");
        int numberOfLiters = sc.nextInt();
        System.out.print("Enter the number of days missed: ");
        int numberOfDaysMissed = sc.nextInt();
        int finalValue = 0;
        
        HashMap <String,Integer> DaysInAMonth = new HashMap<>();

        DaysInAMonth.put("January", 31);
        DaysInAMonth.put("February", 28);
        DaysInAMonth.put("March", 31);
        DaysInAMonth.put("April", 30);
        DaysInAMonth.put("May", 31);
        DaysInAMonth.put("June", 30);
        DaysInAMonth.put("July", 31);
        DaysInAMonth.put("August", 31);
        DaysInAMonth.put("September", 30);
        DaysInAMonth.put("October", 31);
        DaysInAMonth.put("November", 30);
        DaysInAMonth.put("December", 31);

        if(nameOfMonth=="January" || nameOfMonth=="March" || nameOfMonth=="May" || nameOfMonth=="July" || nameOfMonth=="August" || nameOfMonth=="October" || nameOfMonth=="December")
        {
            finalValue = ((DaysInAMonth.get("January")*numberOfLiters*ratePerLiter) - (numberOfDaysMissed*numberOfLiters*ratePerLiter));
            System.out.print("Your monthly milk bill is: " );
            return finalValue;
        }
        else if(nameOfMonth=="April" || nameOfMonth=="June" || nameOfMonth=="September" || nameOfMonth=="November")
        {
            finalValue = ((DaysInAMonth.get("April")*numberOfLiters*ratePerLiter) - (numberOfDaysMissed*numberOfLiters*ratePerLiter));
            System.out.print("Your monthly milk bill is: " );
            return finalValue;
        }
        else
        {
            finalValue = ((DaysInAMonth.get("February")*numberOfLiters*ratePerLiter) - (numberOfDaysMissed*numberOfLiters*ratePerLiter));
            System.out.print("Your monthly milk bill is: " );
            return finalValue;
        }
        
    }
    
}

class Newspaper_Bill
{

}



public class Daily_Expenses_Calculator
{
    public static void main(String[] args)
    {
        int milkBill = Milk_Bill.inputMilkBill();
        System.out.println("Total Milk Bill Returned: ₹" + milkBill);

    }
}
