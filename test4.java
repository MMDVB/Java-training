public class test4 {
    static int plusMethodInt (int x, int y) {
        return x + y;
}
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
        int myNum1 = plusMethodInt(10, 20);
        double myNum2 = plusMethodDouble(10.5, 25.3);
          System.out.println("int: " + myNum1);
             System.out.println("double: " + myNum2);
        }
    }