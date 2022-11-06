import java.util.Random;

//using Thread Class
public class Exp4 {
    static int randomInteger;

    public static void main(String[] args) {
        System.out.println("For 10 Random numbers");
        MyThread1 thread1 = new MyThread1();

        thread1.start();// start thread1
    }
}

// Thread1
class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        try {
            while (i < 10) {
                Random random = new Random();
                Exp4.randomInteger = random.nextInt(10);
                System.out.println(i + " Random integer is " + Exp4.randomInteger);
                new MyThread2().start();// start thread2
                new MyThread3().start();// start thread3
                Thread.sleep(1000 * 1);// delay for synchronization
                System.out.println("\n\n");
                i++;
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}

// Thread2
class MyThread2 extends Thread {
    public void run() {
        System.out.println("Square of " + Exp4.randomInteger + " is " +
                Exp4.randomInteger * Exp4.randomInteger);
    }
}

// Thread3
class MyThread3 extends Thread {

    public void run() {
        System.out.println("Cube of " + Exp4.randomInteger + " is " + Exp4.randomInteger *
                Exp4.randomInteger * Exp4.randomInteger);
    }
}