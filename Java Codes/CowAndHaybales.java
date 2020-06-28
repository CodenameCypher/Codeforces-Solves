import java.util.Scanner;
public class CowAndHaybales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test ; i++) {
            int pile = sc.nextInt();
            int days = sc.nextInt();
            int[] haybales = new int[pile];
            for (int j = 0; j < haybales.length ; j++) {
                haybales[j] = sc.nextInt();
            }
            int dayCount = 0;
            for (int j = 1; j < haybales.length ;) {
                if(haybales[j] > 0){
                    dayCount += j;
                    if(dayCount > days){
                        break;
                    }else{
                        haybales[j]--;
                        haybales[0]++;
                    }
                }else{
                    j++;
                }
            }
            System.out.println(haybales[0]);
        }
    }
}
