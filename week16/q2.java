package week16;


public class q2
{
    public static void main(String [] args)
    {
        String text ="hello world";
        String trimmedString = text.trim();
        System.out.println(trimmedString);
        
        //substring-->trimmedstring
        String firstTen= trimmedString.substring(0,10);
        System.out.println("first ten Characters:" + firstTen);
        
        String[] words = text.split(",");
        for (String word: words )
        {
            System.out.println(word);
        }
        
        
    }
}