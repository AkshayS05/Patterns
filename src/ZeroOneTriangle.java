import java.util.Scanner;

public class ZeroOneTriangle {
    public static void zeroOneTriangle(int n){
        for(int i=0; i<n; i++){
            for (int j = 0; j <=i ; j++) {
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        zeroOneTriangle(n);
    }
}
