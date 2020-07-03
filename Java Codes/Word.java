import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int bg = 0;
        int sg = 0;
        for (int i = 0; i < n.length() ; i++) {
            if((int)n.charAt(i) >= 65 && (int)n.charAt(i) <= 90){
                bg++;
            }else if((int)n.charAt(i) >= 97 && (int)n.charAt(i) <= 122){
                sg++;
            }
        }
        if(bg > sg){
            n = n.toUpperCase();
        }else{
            n = n.toLowerCase();
        }
        System.out.println(n);
    }
}
