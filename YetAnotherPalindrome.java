import java.util.Scanner;

public class YetAnotherPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n ; j++) {
                a[j] = sc.nextInt();
            }
            boolean flag = false;
            for (int j = 0; j < n-2 ; j++) {
                for (int k = j+2; k < n ; k++) {
                    if(a[j] == a[k]){
                        flag = true;
                        break;
                    }
                }
                if(flag) {
                    break;
                }
            }

            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
