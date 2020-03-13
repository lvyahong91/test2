public class Test2 {
    private static int x=100;

    public static void main(String[] args) {
        Test2 test2_1=new Test2();
        test2_1.x++;
        Test2 test2_2=new Test2();
        test2_2.x++;
        test2_1.x++;
        Test2.x--;
        System.out.println("x="+x);
    }

}
