import java.util.Scanner;

public class FrogJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            String s = sc.next();
            int a = -1;
            for (int j = 0; j < s.length() ; j++) {
                if(s.charAt(j) == 'R'){
                    a = j;
                }
            }
            if(a != -1){
                System.out.println((s.length()) - a);
            }else{
                System.out.println(s.length()+1);
            }
        }
    }
}
