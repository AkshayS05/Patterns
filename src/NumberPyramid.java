import java.util.Scanner;

public class NumberPyramid {
    public static void numberPyramid(int n){
        int num=1;
        for(int i=0; i<n; i++){
            for(int space=n-i; space>0;space--){
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print(num+ " ");
            }

            num++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        numberPyramid(n);
    }
}
