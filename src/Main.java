import java.util.Scanner;

public class Main // changed for this problem -- comment out last problem
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many initial bacteria? ");
        int initial = input.nextInt();
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(hours, initial);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(int hour, int initialAmount)
    {
        if(hour == 0)
        {
            return initialAmount;
        }
        return numBacteriaAlive(hour - 1, initialAmount) * 3;
    }
}


