package com.company;


public class Threads extends Thread {

    private int start, end, i, n, k;
    private int[] a;
    Summator summator;

    public Threads(int i, int n, int k, int[] a, Summator summator) {
        this.start = i * (n / k);
        this.end = start + (n / k);
        this.a = a;
        this.summator = summator;
    }

    public Threads(int start, int end, int[] a, Summator summator) {
        this.start = start;
        this.end = end;
        this.a = a;
        this.summator = summator;
    }

    public void run(){
        for(int i = start; i < end; i++){
            synchronized (summator){
                summator.setSum(summator.getSum() + a[i]);
            }

        }
         // System.out.println(summator.getSum());
    }
}
