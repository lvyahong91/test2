import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入一串字符串");

        String line=in.nextLine();
        char[] array=line.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char temp;
            if(array[i]>=97 && array[i]<122){
                array[i]=(char)(array[i]-32);
            }
        }

        for (char a:array) {
            System.out.print(a);
        }
    }
}
