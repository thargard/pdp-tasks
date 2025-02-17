package com.example.JavaAlgorithmicTasks.second;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum {
    public int target;
    public ArrayList<Integer> arr = new ArrayList<>();

    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert the target number: ");
        target = sc.nextInt();
        boolean indicator = true;
        int num;
        System.out.println("To stop adding numbers to array, write negative number");
        while(indicator){
            num = sc.nextInt();
            if (num < 0) {
                indicator = false;
            } else {
                arr.add(num);
            }
        }
    }

    public void findSolution(){
        init();
        String solution = "";
        boolean stopSign = true;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == target) {
                    solution = "[" + i + ","+ j + "]";
                    stopSign = false;
                    break;
                }
            }
            if (!stopSign) { break; }
        }
        System.out.println(solution);
    }
}
