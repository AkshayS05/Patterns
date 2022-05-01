import java.util.Scanner;

public class HalfNumPyramid {
    public static void halfNumPyramid(int n){
        for(int i=0;i<n;i++){
            for(int spaces=0; spaces<n-i;spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        halfNumPyramid(n);
    }
}
