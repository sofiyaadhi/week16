package week16;
import java.util.Scanner;

public class q1
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first string ");
        String st1=scan.nextLine();
        
        System.out.println("enter the second string");
        String st2=scan.nextLine();
        
        String st3=st1.concat(st2);
        System.out.println("Combined string: " + st3);

        
        System.out.println("enter the fourth string ");
        String st4 = scan.nextLine();
        
        if (st3.equals(st4)) {
            System.out.println("The strings are equal!");
        } else {
            System.out.println("The strings are NOT equal.");
        }

        
    }

        
    }
