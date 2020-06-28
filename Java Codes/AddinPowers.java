import java.util.Scanner;

public class AddinPowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];
            for (int j = 0; j < n ; j++) {
                a[j] = sc.nextLong();
            }
            boolean flag = true;
            for (int j = 0; j < n ; j++) {
                if(a[j] % Math.pow(k,j) != 0){
                    flag = false;
                }
//                if(!flag){
//                    break;
//                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
