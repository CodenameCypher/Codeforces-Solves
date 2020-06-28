import java.util.Scanner;

public class TernaryXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int l = sc.nextInt();
            sc.nextLine();
            String n = sc.nextLine();
            char[] na = n.toCharArray();
            String n1 = "1";
            String n2 = "1";
            for (int j = 1; j < l ; j++) {
                if(na[i] == '0'){
                    n1 += '0';
                    n2 += '0';
                }else if(na[i] == '1'){
                    if(Integer.parseInt(n1) > Integer.parseInt(n2)){
                        n1 += '0';
                        n2 += '1';
                    }else{
                        n1 += '1';
                        n2 += '0';
                    }
                }else if(na[i] == '2'){
                    if(Integer.parseInt(n1) > Integer.parseInt(n2)){
                        n1 += '0';
                        n2 += '2';
                    }else{
                        n1 += '2';
                        n2 += '0';
                    }
                }
            }
            System.out.println(n1);
            System.out.println(n2);
        }
    }
}
