package org.example.task_1;

public class Algorithm {

    public static void calculate(int m) {
        int k = 0;
        double result = 0;
        if (m <= 0) {
            System.out.println("4 в любой степени будет больше 0");
        } else {
            while (true) {
                result = Math.pow(4, k);
                if (result >= m) {
                    k--;
                    break;
                }
                k++;
            }
            System.out.println(k);
        }
    }
}
