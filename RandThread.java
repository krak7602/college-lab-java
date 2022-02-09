import java.util.Random;

class Thread1 extends Thread {
    public static int num;
    public void run() {
        Random rand = new Random();
        num = rand.nextInt(100);
        System.out.println("Thread 1: " + num);
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t2.start();
        t3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread {
    public static int val = Thread1.num*Thread1.num;
    public void run() {
        System.out.println("Thread 2: " + val);
    }
}

class Thread3 extends Thread {
    public void run() {
        if(Thread2.val % 2 != 0) {
            System.out.println("Thread 3: " + Math.pow(Thread2.val, 3));
        }
    }
}


public class RandThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();

        while(true) {
            t1.start();
        }
    }
}
