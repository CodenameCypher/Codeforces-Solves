import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        String numS = ""+num;
        for (int i = 0; i < k ; i++) {
            if(numS.charAt(numS.length()-1) == '0'){
                num /= 10;
                numS = null;
                numS = "" + num;
            }else{
                num -= 1;
                numS = null;
                numS = "" + num;
            }
        }
        System.out.println(numS);
    }
}
