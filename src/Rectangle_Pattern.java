import java.util.Scanner;

public class Rectangle_Pattern {
    public static void SolidPattern(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int b= s.nextInt();
        SolidPattern(a,b);
    }
}
