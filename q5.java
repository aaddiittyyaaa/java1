public class q5 {
    public static void main(String[] args) {
        int year = 2005;
        LeapYear(year);
    }

    static int LeapYear(int n) {
        if (n % 4 == 0)
            System.out.println(n + " is a leap year.");
        else
            System.out.println(n + " is not a leap year.");
        return 0;
    }
}