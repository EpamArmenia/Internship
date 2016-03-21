package threads;

public class ThreadB extends Thread {

    private static final String HELLO_ANSWER_TEXT = "I say goodbye";
    private static final String GOOD_MORNING_ANSWER_TEXT = "I say good night";
    private static final String UNDEFINED_TEXT = "I can't answer you";

    private ThreadA partner;

    public ThreadB(ThreadA partner) {
        this.partner = partner;
    }

    @Override
    public void run() {
        super.run();
        try {
            while (!isInterrupted()) {
                String answer = partner.getText();
                printAnswer(answer);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void printAnswer(String text) throws InterruptedException {
        switch (text) {
            case ThreadA.HELLO_TEXT:
                printText(HELLO_ANSWER_TEXT);
                break;

            case ThreadA.GOOD_MORNING_TEXT:
                printText(GOOD_MORNING_ANSWER_TEXT);
                break;

            default:
                printText(UNDEFINED_TEXT);
        }
    }

    private void printText(String text) throws InterruptedException {
        System.out.println(text);
        System.out.println("------------------------------");
        sleep(1000);
    }
}