import java.util.Scanner;

public class ExercisingWalk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            boolean flag = true;
            while(flag){
                if(a == 0 && d == 0 && c == 0 && b == 0) break;
                else{
                    if(x >= x1){
                        x--;
                        a--;
                    }else if(x <= x2){
                        x++;
                        b--;
                    }else if(y >= y1){
                        y--;
                        c--;
                    }else if(y <= y2){
                        y++;
                        d--;
                    }else{
                        flag = false;
                    }
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
