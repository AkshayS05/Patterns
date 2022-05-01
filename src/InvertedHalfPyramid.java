

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void invertedHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int spaces=0; spaces<=i; spaces++){
                System.out.print(" ");
            }
            for(int j=n-i+1;j>0;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        invertedHalfPyramid(n);
    }
}
