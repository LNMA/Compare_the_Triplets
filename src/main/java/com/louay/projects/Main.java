package com.louay.projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please input number of mark");
        int length = input.nextInt();

        Integer [] aliceMark = new Integer[length];
        Integer [] bobMark = new Integer[length];

        System.out.println("please input alice mark");
        for (int i = 0; i < aliceMark.length ; i++) {
            aliceMark[i] = input.nextInt();
        }

        System.out.println("please input bob mark");
        for (int i = 0; i < bobMark.length ; i++) {
            bobMark[i] = input.nextInt();
        }

        compareMark(aliceMark , bobMark);
    }

    public static void compareMark(Integer [] aliceMarkArray, Integer [] bobMarkArray){
        int alicePoint = 0;
        int bobPoint = 0;

        int compareResult;

        for (int i = 0; i < aliceMarkArray.length ; i++) {
            compareResult = aliceMarkArray[i].compareTo(bobMarkArray[i]);
            if (compareResult >0){
                alicePoint ++;
            }else {
                if (compareResult < 0){
                    bobPoint ++;
                }
            }
        }
        
        System.out.println("Alice mark is : "+alicePoint+", bob mark is : "+bobPoint);
    }
}
