package week16;
import java.util.Scanner;


public class q6
{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();


        StringBuilder sb = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) 
        {
            sb.append(text.charAt(i));          
        }

        String reversed = sb.toString();              
        System.out.println("Original: " + text);      
        System.out.println("Reversed: " + reversed);  

        
        if (text.equals(reversed))
        {
            System.out.println("The string is a palindrome");
        }
        else
        {
            System.out.println("The string is not a palindrome");
        }
    }
}

