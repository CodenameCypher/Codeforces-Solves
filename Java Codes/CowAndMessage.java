import java.util.Scanner;
public class CowAndMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            int mul = 1;
            for (int j = 0; j < arr.length ;) {
                int c = 1;
                for (int k = j + 1; k < arr.length ; k++) {
                    if(arr[j] == arr[k]){
                        c++;
                        arr[k] = (char)((int)arr[k] + 32);
                    }
                }
                mul *= c;
                j += c;
            }
            System.out.println(mul);
    }
}
