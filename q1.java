public class q1{
    public static void main(String[] args) {
        System.out.println("Area of square: " + Square(8));
        System.out.println("Area of Triangle: " + Triangle(6, 4));
        System.out.println("Area of Rectangle: " + Rectangle(8, 9));
    }

    static int Square(int n) {
        int area = n * n;
        return area;
    }

    static double Triangle(int h, int b) {
        double area = 0.5 * h * b;
        return area;
    }

    static int Rectangle(int l, int b) {
        int area = l * b;
        return area;
    }
}