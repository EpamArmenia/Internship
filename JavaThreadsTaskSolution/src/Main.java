import threads.ThreadA;
import threads.ThreadB;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        Thread threadA = new ThreadA();

        Thread threadB = new ThreadB((ThreadA)threadA);

        threadA.start();
        threadB.start();

        try {
            System.out.println("type any key to terminate:");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}