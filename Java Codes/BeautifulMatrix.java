import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int locationRow = 0;
        int locationColumn = 0;
        for (int row = 0; row < 5 ; row++) {
            for (int column = 0; column < 5 ; column++) {
                matrix[row][column] = sc.nextInt();
                if(matrix[row][column] == 1){
                    locationRow = row;
                    locationColumn = column;
                }
            }
        }
        locationColumn++;
        locationRow++;
        int stepsCount = 0;
        stepsCount += Math.abs(locationRow-3) + Math.abs(locationColumn-3);
        System.out.println(stepsCount);
    }
}
