import java.util.Scanner;
public class CountSubrectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[][] c = new int[n][m];
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m ; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                c[i][j] = a[i] * b[j];
            }
        }

        int count = 0;
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j <= (m - k) ; j++) {
//                int sum = 0;
//                int p = j;
//                for (int l = 0; l < k ; l++) {
//                    sum += c[i][p++];
//                }
//                if(sum == k){
//                    count++;
//                }
//            }
//        }
//        for (int i = 0; i < (n - (k/2)) ; i++) {
//            for (int j = 0; j < (m - (k/2)) ; j++) {
//
//            }
//        }

        System.out.println(count);
    }
}
