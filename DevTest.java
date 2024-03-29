import java.util.Scanner;

public class DevTest
{
    public static Scanner testScan = new Scanner(System.in);
    public static void main(String[] args)
    {
        String firstName = "";
        firstName = getNonZeroLenString(testScan, "Enter your first name");
        System.out.println("Firstname is " + firstName);
        int age = getInt(testScan, "Enter your age");
        System.out.println("You said your age is: " + age);
        double salary = getDouble(testScan, "Enter your age");
        System.out.println("Salary: " + salary);
        int favnum = getRangedInt(testScan, "Enter your favorite number [1-10]", 1, 10);
        System.out.println("Number: ");
        String ssnRegEx = "\\d{3}-\\d{2}-\\d{4}$";
        String ssn = getRegExString(testScan, "Enter your SSN", ssnRegEx);
        System.out.println("Your ssn is: " + ssn);

    }
    /* returns a String input by the user that must be at least one character */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";
        do {
            System.out.println(prompt + ": ");
            response = pipe.nextLine();

            if(response.length() > 0)
                done = true;
            else
                System.out.println("\nYou must enter at least one character!\n");
        }while(!done);
        return response;
    }
    /**
     * gets an int val from the user with no constraints
     * @param pipe
     * @param prompt
     * @return any valid int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        int value = 0;
        do {
            System.out.println(prompt + ": ");
            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number!\n");
            }
        }while(!done);
        return value;
    }
    /**
     * gets a double
     * @param pipe
     * @param prompt
     * @return any double
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        double dvalue = 0;
        do {
            System.out.println(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                dvalue = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number!\n");
            }
        }while(!done);
        
        return dvalue;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        String trash = "";
        int value = 0;
        do {
            System.out.println(prompt + ": ");
            if(pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();
                if(value >= low && value <= high)
                {
                done = true;
                } else {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: " + value);
                }
            }
            else{
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number!\n");
            }
        }while(!done);
        return value;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        String trash = "";
        double dvalue = 0;
        do {
            System.out.println(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                dvalue = pipe.nextDouble();
                pipe.nextLine();
                if(dvalue >= low && value <= high)
                {
                done = true;
                } else {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: " + dvalue);
                }
            }
            else{
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number!\n");
            }
        }while(!done);
        
        return dvalue;
    }
    /**
     * Returns a True/False value for yes or no input
     * @param pipe
     * @param prompt
     * @return
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean done = false;
        boolean retVal = false;
        String response = "";
        do {
            System.out.println(prompt + ": ");
            response = pipe.nextLine();

            if(response.toUpperCase().matches("[YN]]"))
            {    done = true;
                if(response.equalsIgnoreCase("Y"))
                    retVal = true;
                else
                    retVal = false;

            }
            else
                System.out.println("\nYou must enter a [y/n]!\n");
        }while(!done);
        return response;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        boolean done = false;
        String response = "";
        do {
            System.out.println(prompt + " " + regEx + ": ");
            response = pipe.nextLine();

            if(response.matches(regEx))
                done = true;
            else
                System.out.println("\nYou must enter a string that matches the pattern:" + regEx);
        }while(!done);
        return response;
    }
}