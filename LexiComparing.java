import java.util.*;
public class LexiComparing {
    static String swap(String s,int ps1,int ps2){
        char[] c = s.toCharArray();
        char ct = c[ps1];
        c[ps1] = c[ps2];
        c[ps2] = ct;
        String t = "";
        for (int i = 0; i < c.length; i++) {
            t += c[i];
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int l = 0; l < t ; l++) {
            String s = sc.next();
            Set<String> sv = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (j != i) {
                        String temp = swap(s,i,j);
                        System.out.println(temp);
                        sv.add(temp);
                    }
                }
            }

            System.out.println(sv);
        }
    }
}
