import java.util.Scanner;
public class AddEvenOrSubstract {
    public static void main(String[] args) {
        System.out.println(2<<4);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int step = 0;
            if(a == b){
                System.out.println("0");
            }else if(a < b){
                int d = b - a;
                if(d % 2 != 0){
                    System.out.println("1");
                }else{
                    System.out.println("2");
                }
            }else{
                int d = a - b;
                if(d % 2 == 0){
                    System.out.println("1");
                }else{
                    System.out.println("2");
                }
            }
        }
    }
}
