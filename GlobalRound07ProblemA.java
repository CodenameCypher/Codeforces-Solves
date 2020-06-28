import java.util.Random;
import java.util.Scanner;
public class GlobalRound07ProblemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int s = sc.nextInt();
            if(s == 1){
                System.out.println("-1");
            }else{
                String as = "";
                for (int j = 0; j < s - 1 ; j++) {
                    as += "9";
                }
                as+= "8";
                System.out.println(as);
            }
        }
    }
}
