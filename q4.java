public class q4 {
    public static void main(String[] args) {
        System.out.println("The smallest number among 88, 555, and 87 is: " + smallest(88, 555, 87));
    }

    static int smallest(int a, int b, int c) {
        int check;
        if (a < b) {
            if (c < a) {
                check = c;
            } else {
                check = a;
            }
        } else {
            if (b < c) {
                check = b;
            } else {
                check = c;
            }
        }
        return check;
    }

}