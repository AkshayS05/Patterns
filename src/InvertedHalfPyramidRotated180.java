import java.util.Scanner;

public class InvertedHalfPyramidRotated180 {
    public static void invertedRotatedPyramid(int m){
        for ( int i=0; i<m; i++){
            for( int space=0; space<m-i; space++){
                System.out.print(" ");
            }
            for( int j=0; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        invertedRotatedPyramid(m);
    }
}
