import java.util.Scanner;

public class HollowRect {
    public static void hollowRectangle(int m, int n){
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <=n ; j++) {
                if( i==0|| j==0|| i==m||j==n){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int m=s.nextInt();
        int n=  s.nextInt();
        hollowRectangle(m,n);
    }
}
