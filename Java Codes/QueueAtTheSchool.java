import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sec = sc.nextInt();
        sc.nextLine();
        String queue = sc.nextLine();
        char[] array = queue.toCharArray();
        for (int i = 0; i < sec ; i++) {
            for (int j = 0; j < size - 1 ; j++) {
                if(array[j] == 'B' && array[j+1] == 'G'){
                    array[j] = 'G';
                    array[j+1] = 'B';
                    j = j+1;
                }
            }
        }
        String answer = "";
        for (int j = 0; j < size ; j++) {
            answer += array[j];
        }
        System.out.println(answer);
    }
}
