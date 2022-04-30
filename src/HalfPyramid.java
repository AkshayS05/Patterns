import java.util.Scanner;
public class HalfPyramid {
    public static void halfPyramid(int m, int n){
        for( int i=0; i<m; i++){
            for (int j=0; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m= s.nextInt();
        int n= s.nextInt();
        halfPyramid(m, n);
    }
}
