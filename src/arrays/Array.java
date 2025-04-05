package arrays;

import java.util.Scanner;

abstract public class Array {
    Scanner sc = new Scanner(System.in);
    public  int[] createArray() {
        System.out.println("Enter the No of Elements : ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i <size; i++) {
            System.out.println("Enter Element " + ( i + 1 ));
            array[i] = sc.nextInt();
        }

        return array;
    }
    void closeScanner(Scanner sc){
        sc.close();
    }
    public int takeNum(){
        System.out.println("Enter a num ");
         int n=sc.nextInt();
         closeScanner(sc);
         return n;
    }

    public  void display(int[] array) {
        for (int j : array) {
            System.out.print(j+ " | ");
        }
        System.out.println();
    }

}