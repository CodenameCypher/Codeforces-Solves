import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n ; j++) {
                a[j] = sc.nextInt();
            }
            Set<Integer> set = new HashSet<>();
            boolean flag=false;
            for(int j : a){
                if(set.contains(j)){
                }else{
                    set.add(j);
                }
            }
           System.out.println(set.size());
        }
    }
}
