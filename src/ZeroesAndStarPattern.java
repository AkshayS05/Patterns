import java.util.Scanner;

public class ZeroesAndStarPattern {
    public static void zerosAndStars(int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(j==i){
                    System.out.print("*");
                }else{
                    System.out.print(0);
                }

            }
            for (int k = 0; k <=n ; k++) {
    if(k==0||k==n-i){
        System.out.print("*");
    }else{
        System.out.print(0);
    }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        for n=4
//       *000*000*
//       0*00*00*0
//       00*0*0*00
//       000***000

        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        zerosAndStars(n);
    }


}
