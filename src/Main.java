public class Main
{
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    public static int factorial(int num)
    {
        int answer = 1;
        for (int i = num; i > 0; i--)
        {
            answer *= i;
        }
        return answer;
    }
}
