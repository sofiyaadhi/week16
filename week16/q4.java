package week16;

public class q4
{
    public static void main(String [] args)
    {
        String name ="sOFIYA aDHIKARI";
        System.out.println("UpperCase:"+ name. toUpperCase()) ;
        System.out.println("LowerCase: "+ name. toLowerCase()) ;
        String trimmedName=name.trim() ;
        String[] words=trimmedName.split("||s+");
        StringBuilder sb= new StringBuilder ();
        
            for (int i = 0; i < words.length; i++) {
            String first = words[i].substring(0, 1).toUpperCase(); // S
            String rest = words[i].substring(1).toLowerCase(); // ofiya
            sb.append(first).append(rest).append(" "); // Sofiya Adhikari
        }

        System.out.println(sb.toString().trim());
    
        }        
    }
