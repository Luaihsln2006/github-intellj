package Lab_2;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        //int [] numbers={5,6,7,8};
        //System.out.println(Arrays.toString(numbers));



        Scanner scanner= new Scanner(System.in);
        Arrayss arr = new Arrayss();
        int []numbers = new int[5];
        System.out.println("Please Enter 5 Numbers :");
        for (int i = 0; i < numbers.length; i++)
            numbers[i]=scanner.nextInt();

        arr.Traversal(numbers);

        arr.ReversTraversal(numbers);
    }
}