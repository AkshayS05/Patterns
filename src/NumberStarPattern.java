import java.util.Scanner;

public class NumberStarPattern {
    public static void printNumStarPattern(int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(j==n-i-1){
                    System.out.print("*");
                }else{
                    System.out.print(n-j);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        printNumStarPattern(n);
    }


}
