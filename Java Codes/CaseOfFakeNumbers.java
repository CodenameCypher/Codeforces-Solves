import java.util.Scanner;

public class CaseOfFakeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length ; i++) {
            a[i] = sc.nextInt();
        }
        while (a[0] != 0){
            for (int i = 0; i < a.length ; i++) {
                if(i % 2 == 0){
                    a[i] = (a[i] + 1) % a.length;
                }else{
                    a[i]--;
                    if(a[i] < 0){
                        a[i] = a.length - 1;
                    }
                }
            }
        }
        for (int i = 0; i < a.length ; i++) {
            if(a[i] != i){
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}
