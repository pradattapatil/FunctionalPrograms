package FunctionalPrograms;

import java.util.Scanner;

public class TwoDArray {
   // public class Array2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Cols");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        TwoDArray obj = new TwoDArray(); //Create object to call method
        obj.create(rows, cols); //Call method to print 2D array
    }

    private void create(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                arr[i][j] = 0;
                System.out.print(arr[i][j] + " " + " ");
            }
            System.out.println();
        }
    }
}