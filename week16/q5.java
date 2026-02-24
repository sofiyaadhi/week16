package week16;


public class q5
{
    public static void main(String[] args) {

        String initial = "Hello ";
                                           // --> initial string
        StringBuilder sb = new StringBuilder();
        sb.append(initial); 

        String second = "World";                          // --> second string
        sb.append(second);                                // "Hello World"

        int number = 42;                                  // --> integer
        sb.append(number);                                // "Hello World42"

        sb.append("!");                                   // --> special character "Hello World42!"

        System.out.println(sb.toString().trim());         // Hello World42!
    }
}
