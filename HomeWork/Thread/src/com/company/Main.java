package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    static int[] BasicArray;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n, k;
        System.out.println("Введите размер массива");
        n = scanner.nextInt();
        System.out.println("Введите количество потоков");
        k = scanner.nextInt();

        BasicArray = new int[n];



        Summator summator = new Summator();
        for(int i = 0; i < n; i++){
            BasicArray[i] = random.nextInt(101);
            System.out.println(BasicArray[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < k; i++){
            if(i != k - 1){
                Threads threads = new Threads(i, n, k, BasicArray, summator);
                threads.start();
                try {
                    threads.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(summator.getSum());
                summator.setSum(0);
            }
            else {
                int start = (k - 1) * (n / k);
                int end = n;
                Threads threads = new Threads(start, end, BasicArray, summator);
                threads.start();
                try {
                    threads.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(summator.getSum());
                //summator.setSum(0);
            }
            }
        }

    }

