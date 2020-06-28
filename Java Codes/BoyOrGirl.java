import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < name.length() ; i++) {
            if(!chars.contains(name.charAt(i))){
                chars.add(name.charAt(i));
            }
        }
        if(chars.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
