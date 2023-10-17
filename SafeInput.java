 import java.util.Scanner;
 
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