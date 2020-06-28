import java.util.Scanner;

public class NewTheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            String[] array = new String[n];
            for (int j = 0; j < n ; j++) {
                array[j] = sc.nextLine();
            }
            if((2*x)<y){
                int dotCount = 0;
                for (int j = 0; j < n ; j++) {
                    for (int k = 0; k < m ; k++) {
                        if(array[j].charAt(k) == '.'){
                            dotCount++;
                        }
                    }
                }
                System.out.println((dotCount*x));
            }else{
                int totalCost = 0;
                for (int j = 0; j < n ; j++) {
                    for (int k = 0; k < m ; k++) {
                        if(array[j].charAt(k) == '.'){
                            int count = 1;
                            int l = k+1;
                            for (l = k+1; l < m ; l++) {
                                if(array[j].charAt(k) == array[j].charAt(l)){
                                    count++;
                                }else{
                                    break;
                                }
                            }
                            k = l;
                            //System.out.println("Count: "+count);
                            totalCost += (x*(count%2)) + (y*(count/2));
                        }
                    }
                }
                System.out.println(totalCost);
            }
        }
    }
}