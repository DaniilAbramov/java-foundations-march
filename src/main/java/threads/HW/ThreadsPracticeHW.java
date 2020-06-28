package threads.HW;

public class ThreadsPracticeHW {
    public static void main(String[] args) {
        UseRunnable useRunnable = new UseRunnable();
        Thread tUseRunnable = new Thread(useRunnable);
        tUseRunnable.start();

        UseThread useThread = new UseThread();
        useThread.start();
    }
}
