package com.raja.oopslab.threading;

public class CubeGenThread extends Thread {

    int number;
    int squre;

    public CubeGenThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            this.sleep(2000);
        } catch (InterruptedException e) {
        }
        this.squre = this.number * this.number * this.number;
        System.out.println("CubeGenThread--> Square of " + number + " is " + squre);
    }
}
