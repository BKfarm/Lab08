import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        int birthDay = 1;
        if ((birthMonth == 1) || (birthMonth == 3) || (birthMonth == 5) || (birthMonth == 7) || (birthMonth == 8) || (birthMonth == 10) || (birthMonth == 12))
        { 
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
        } else if (birthMonth == 2){
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
        } else {
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
            }
        int birthHour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        int birthMinute = SafeInput.getRangedInt(in, "Enter your birth second", 1, 60);
    }
}