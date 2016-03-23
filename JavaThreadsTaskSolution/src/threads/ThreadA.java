package threads;

import util.Math;

public class ThreadA extends Thread {

    public static final String HELLO_TEXT = "You say hello";
    public static final String GOOD_MORNING_TEXT = "You say good morning";

    private String text;

    @Override
    public void run() {
        super.run();
        try {
            while (!interrupted()) {
                printRandomText();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void printRandomText() throws InterruptedException {
        wait();
        if (0 == Math.RandomRange(0, 2)) {
            printText(HELLO_TEXT);
        } else {
            printText(GOOD_MORNING_TEXT);
        }
        notify();
    }

    public synchronized String getText() throws InterruptedException {
        notify();
        wait();
        return text;
    }

    private void printText(String text) throws InterruptedException {
        this.text = text;
        System.out.println(text);
        sleep(1000);
    }
}

