package week16;
import java.util.Scanner;

public class q3
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        
        System.out.print("Enter character to find: ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("First occurrence at index: " + text.indexOf(ch));
        
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        System.out.println("Character at index: " + text.charAt(index));
        sc.nextLine();
        
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        if (text.contains(word)) 
        {
            System.out.println("Word found at index: " + text.indexOf(word));
        } 
        else 
        {
            System.out.println("Word not found");
        }
    }
}

