import java.util.Scanner;

public class PalindromicNumberPyramid {
    public static void palindromicPyramid(int n){
        int num=1;
        for( int i=0; i<n;i++){
            for (int space= n-i-1; space >0 ; space--) {
                System.out.print(" ");
            }
            for(int j=0;j<i; j++){
                System.out.print(num+i-j);
            }

        for(int k=0;k<=i;k++){
            System.out.print(num+k);
        }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        palindromicPyramid(n);
    }
}
