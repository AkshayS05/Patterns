import java.util.Scanner;

public class HollowButteryfly {
    public static void verticalStars(int i){
        for (int j = 0; j <= i; j++) {
            if (j == 0) {
                System.out.print("*");
            }else{
                break;
            }
        }
    }
    public static void midStars(int i){
        for (int k = 0; k <=i; k++) {
            if (k == i-1 ) {
                System.out.print("*");

            } else {
                System.out.print(" ");
            }
        }

    }
    public static void spaces(int n, int i){
        for (int space = 0; space < (n - i-1); space++) {
            System.out.print(" ");
        }
    }
    public static void hollowButterfly(int n) {
        for (int i = 0; i < n; i++) {
            verticalStars(i);
            for (int j = 1; j <= i; j++) {
                if ( i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            spaces(n,i);
            spaces(n,i);

           verticalStars(i);
           midStars(i);


            System.out.println();
        }
//        lower one
        for (int i = n-1; i >=0; i--) {
            verticalStars(i);
            for (int j = 0; j < i; j++) {
                if (j==i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            spaces(n,i);
            spaces(n,i);
            verticalStars(i);
            midStars(i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        hollowButterfly(n);
    }
}
