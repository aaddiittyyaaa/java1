public class q2 {
    public static void main(String[] args) {
        CheckNumber(22);
    }

    static void CheckNumber(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}