package threads.HW;

public class UseRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("Run ");
        }
    }
}
