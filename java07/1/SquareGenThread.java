package com.raja.oopslab.threading;

public class SquareGenThread extends Thread {

    int number;
    int squre;

    public SquareGenThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            this.sleep(3000);
        } catch (InterruptedException e) {
        }
        this.squre = this.number * this.number;
        System.out.println("SquareGenThread--> Square of " + number + " is " + squre);
    }
}
