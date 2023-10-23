import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String regEx = "\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(in, "Enter your SSN", regEx);
        regEx = "^(M|m)\\\\d{5}$";
        String mNumber = SafeInput.getRegExString(in, "Enter your M number", regEx);
        regEx = "[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(in, "Enter your M number", regEx);
        System.out.println("Your ssn is: " + ssn);
        System.out.println("Your M number is: " + mNumber);
        System.out.println("Your choice was: " + menuChoice);
        }
}