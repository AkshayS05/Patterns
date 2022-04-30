import java.util.Scanner;

public class ButteryflyPattern {
    public static void butterfly(int n){
        for(int i=0; i<n; i++){
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            for(int space=0; space<2*(n-i-1); space++){
                System.out.print(" ");

            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for( int i=n-1; i>0; i--){
            for(int j=0; j<=i; j++){
                System.out.print('*');
            }
            for(int space=0; space<2*(n-i-1); space++){
                System.out.print(" ");

            }
            for(int j=0; j<=i; j++){
                System.out.print('*');
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        butterfly(n);
    }
}
