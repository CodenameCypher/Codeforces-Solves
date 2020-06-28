import java.util.Arrays;
import java.util.Scanner;

public class Bogosort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int n = sc.nextInt();
            int[] num = new int[n];
            for (int j = 0; j < n ; j++) {
                num[j] = sc.nextInt();
            }
            Arrays.sort(num);
            int[] newArray = new int[n];
            int k = n-1;
            for (int j = 0; j < n ; j++) {
                newArray[j] = num[k--];
            }
            for (int j = 0; j < n ; j++) {
                System.out.print(newArray[j]+" ");
            }
            System.out.println();
        }
    }
}
