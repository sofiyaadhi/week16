package week16;


public class q7
{

     public static boolean isValidPhone(String phone) {
        return phone.matches("^(97|98)[0-9]{8}$");
    }

    public static void main(String[] args) {

        String[] testNumbers = {"9846584903",   "9854545454",   "9841598484",     "98-412-34599"};

        for (String number : testNumbers) {
            System.out.println(number + " → " + isValidPhone(number));
        }
    }
}