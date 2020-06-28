import java.util.Scanner;
public class EvenSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int s = sc.nextInt();
            int sum = 0;
            int[] num = new int[s];
            for (int j = 0; j < s ; j++) {
                num[j] = sc.nextInt();
                sum += num[j];
            }
           // System.out.println(sum); //delete

            if(sum % 2 == 0){
                System.out.println(s);
                for (int j = 0; j < s; j++) {
                    System.out.print((j+1)+" ");
                }
                System.out.println();
            }
            else{
                int lastOdd = -1;
                for (int j = 0; j < s ; j++) {
                    if(num[j] % 2 != 0){
                        lastOdd = j;
                    }
                }
                if(lastOdd != -1 && s != 1){
                    System.out.println(s-1);
                    for (int j = 0; j < s ; j++) {
                        if(j != lastOdd){
                            System.out.print((j+1) + " ");
                        }
                    }
                    System.out.println();
                }else{
                    System.out.println("-1");
                }
            }
        }
    }
}
