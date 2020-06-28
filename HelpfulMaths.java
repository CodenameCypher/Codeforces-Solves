import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        String[] array = in.split("[+]");
        Arrays.sort(array);
        String ans = "";
        for (int i = 0; i < array.length ; i++) {
            if(i == array.length - 1){
                ans += array[i];
            }else{
                ans += array[i] + '+';
            }
        }
        System.out.println(ans);
    }
}
