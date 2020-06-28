import java.util.Scanner;

public class Maximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        int[] x = new int[n];
        x[0] = 0;
        int j = 1;
        String as = "";
        for (int i = 0; i < n ; i++) {
            b[i] = sc.nextInt();
            if(i < n-1){
                if (b[i] >= 0) {
                    x[j] = x[i] + b[i];
                } else {
                    x[j] = x[i];
                }
                j++;
            }
            as += (x[i] + b[i])+" ";
        }
        System.out.println(as);
    }
}
