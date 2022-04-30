import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers {
    public static void invertedHalfPyramidNum(int m){
        for(int i=m; i>=0; i--){
            for( int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        int m= s.nextInt();
        invertedHalfPyramidNum(m);
    }
}
