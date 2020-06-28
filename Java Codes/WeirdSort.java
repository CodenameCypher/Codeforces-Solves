import java.util.Scanner;
public class WeirdSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] p = new int[m];
            for (int j = 0; j < n ; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < m ; j++) {
                int at  = sc.nextInt();
                p[j] = at - 1;
            }
            for (int j = 0; j < m ; j++) {
                for (int k = 0; k < m ; k++) {
                    if(a[p[k]] > a[p[k]+1]){
                        int temp = a[p[k]];
                        a[p[k]] = a[p[k]+1];
                        a[p[k]+1] = temp;
                    }
                }
            }
            if(arraySorted(a)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    static boolean arraySorted(int[] a){
        for (int i = 0; i < a.length - 1 ; i++) {
            if( a[i] > a[i+1] ){
                return false;
            }
        }
        return true;
    }
}
