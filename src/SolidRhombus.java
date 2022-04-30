import java.util. *;
public class SolidRhombus {
    public static void rhombus(int n){
        for(int i=0; i<n; i++){
            for( int space=n-i; space>0; space--){
                System.out.print(" ");
            }
            for (int j = 0; j <n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        int n= s.nextInt();
        rhombus(n);
    }
}
