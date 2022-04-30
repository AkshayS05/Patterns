import java.util.Scanner;

public class HalfPyramidWithNumbers {
    public static void halfPyramidNumber(int m){
        for(int i=0; i<m; i++){
            for (int j=0; j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        halfPyramidNumber(m);
    }
}
