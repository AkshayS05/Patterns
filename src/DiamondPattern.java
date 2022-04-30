import java.util.Scanner;

public class DiamondPattern {
    public static void diamond(int n){
        for(int i=0; i<n; i++){
            for(int spaces=0; spaces<(n-i-1);spaces++){
                System.out.print(" ");
            }
            for (int j = 0; j <(2*i)+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>0; i--){
            for(int spaces=0; spaces<(n-i);spaces++){
                System.out.print(" ");
            }
            for (int j = 0; j <(2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        diamond(n);
    }
}
