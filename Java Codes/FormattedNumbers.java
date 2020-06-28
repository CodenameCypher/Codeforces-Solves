import java.util.ArrayList;
import java.util.Scanner;

public class FormattedNumbers {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        ArrayList<Character> al = new ArrayList<>();
        int count = 0;
        for (int i = arr.length - 1; i >= 0 ; ) {
            if(count == 3){
                count = 0;
                al.add(',');
            }else{
                al.add(arr[i]);
                count++;
                i--;
            }
        }
        for (int i = al.size() - 1; i >= 0 ; i--) {
            System.out.print(al.get(i));
        }
        System.out.println();
    }
}
