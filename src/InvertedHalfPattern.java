import java.util.Scanner;

public class InvertedHalfPattern {
    public static void invertedHalfPattern(int m, int n){
        for (int i=0; i<m; i++){
            for( int j=n-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m= s.nextInt();
        int n= s.nextInt();
        invertedHalfPattern(m,n);
    }
}
