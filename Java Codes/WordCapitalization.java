import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        //System.out.println(c[0]);
        if((int)c[0] >= 97)
            c[0] = (char)((int)c[0] - 32);

        //System.out.println(c[0]);
        String s1 = "";
        for (int i = 0; i < c.length ; i++) {
            s1 += c[i];
        }
        System.out.println(s1);
    }
}
