    import java.util.Arrays;
    import java.util.Scanner;

    public class TetrisProblem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t ; i++) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int j = 0; j < n ; j++) {
                    a[j] = sc.nextInt();
                }
                Arrays.sort(a);
                boolean flag = false;
                for (int j = 0; j < n - 1 ; j++) {
                    int d = a[n-1] - a[j];
                    if(d % 2 != 0){
                        flag = true;
                    }
                }
                if(flag){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }
    }
