import java.util.Scanner;

public class HollowRhombus {
    public static void hollowRhombus(int n){
for(int i=0; i<n; i++){
    for(int spaces=0; spaces<n-i; spaces++){
        System.out.print(" ");
    }
    for(int j=0; j<n;j++) {
        if (i == 0 || i == n-1) {
            System.out.print("*");
        }else if(j==0||j==n-1){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
    System.out.println();
}
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        hollowRhombus(n);
    }
}
