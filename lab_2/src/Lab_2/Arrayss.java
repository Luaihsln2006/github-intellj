package Lab_2;

import java.util.Scanner;

public class Arrayss {
    Scanner scaaner = new Scanner(System.in);
    public void Traversal(int[] numbers){
        System.out.println("this is the element:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The index of ["+i+"] = " + numbers[i]);
        }
        System.out.println("=================================");
        System.out.println("=================================");

    }

    public void ReversTraversal(int []numbers){
        System.out.println("this is the revers element");
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println("the index of ["+i+"] = " + numbers[i]);
        }

    }





}
