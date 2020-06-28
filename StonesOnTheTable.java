import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String stones = sc.nextLine();
        char[] c = stones.toCharArray();
        int steps = 0;
        for (int i = 0; i < c.length ;i++) {
            if(c[i] == 'X') continue;
            for (int j = i + 1; j < c.length ; j++) {
                if (c[i] == c[j]){
                    c[j] = 'X';
                }else{
                    break;
                }
            }
        }
        for (int i = 0; i < c.length ; i++) {
            if(c[i] == 'X'){
                steps++;
            }
            //System.out.println();
        }
        System.out.println(steps);
    }
}
