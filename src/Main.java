import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int size = keyboard.nextInt();
        int[] anArray = new int[size];
        System.out.println("Enter a telephone number as a String");
        String phoneNumber = keyboard.next();
        for(int i = 0; i<phoneNumber.length(); i++)
        {
            anArray[i] = Integer.parseInt(String.valueOf(phoneNumber.charAt(i)));
            System.out.println(anArray[i]);

        }



    }
}
