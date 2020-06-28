import java.util.ArrayList;
import java.util.Scanner;

public class PrefixSuffixPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            String s = sc.next();
            ArrayList<Character> al = new ArrayList<>();
            int last = s.length() - 1;
            for (int j = 0; j < s.length()/2 ; ) {
                if(s.charAt(j) == s.charAt(last)){
                    al.add(s.charAt(j));
                    al.add(s.charAt(last));
                    j++;
                }
                last--;
            }
            System.out.println(al);
        }
    }
}
