import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int current = 0;
        for (int i = 0; i < n ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            current-=a;
            current+=b;
            if(current > max){
                max = current;
            }
        }
        System.out.println(max);
    }
}
