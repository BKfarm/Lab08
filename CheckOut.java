import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean done = false;
        do{
        totalCost += SafeInput.getRangedDouble(in, "Enter the price of your item", .50, 10);
        done = SafeInput.getYNConfirm(in, "Continue? [Y/N]");
        }while(done);
        System.out.println("Total cost: " + totalCost);
    }
}