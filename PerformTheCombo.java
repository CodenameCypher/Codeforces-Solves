import java.util.Hashtable;
import java.util.Scanner;
public class PerformTheCombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            sc.nextInt();
            int m = sc.nextInt();
            String a = sc.next();
            String[] sa = new String[m+1];
            for (int j = 0; j < m ; j++) {
                int ta = sc.nextInt();
                sa[j] = a.substring(0,ta);
            }
            Hashtable<Character,Integer> n = new Hashtable<Character,Integer>();
            sa[m] = a;
            for (int j = 0; j < sa.length ; j++) {
                for (int k = 0; k < sa[j].length() ; k++) {
                    if(n.get(sa[j].charAt(k)) == null){
                        n.put(sa[j].charAt(k) , 1);
                    }else{
                        n.put(sa[j].charAt(k),n.get(sa[j].charAt(k))+1);
                    }
                }
            }
            for (int j = 97; j < 123 ; j++) {
                if(n.get((char)j) == null){
                    System.out.print("0 ");
                }else{
                    System.out.print(n.get((char)j)+" ");
                }
            }
            System.out.println();
        }
    }
}
