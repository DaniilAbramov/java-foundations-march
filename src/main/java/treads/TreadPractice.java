package treads;

import java.io.PrintWriter;

public class TreadPractice {
    public static void main(String[] args) throws InterruptedException {
////        for (int i = 0; i < 10; i++) {
////            Thread.sleep(1000);
////            System.out.print("F ");
////        }
//
////        for (int i = 0; i <10 ; i++) {
////            Thread.sleep(2500);
////            System.out.print("S ");
////        }
//
//        System.out.println(Thread.currentThread().getName()+ " Start");
//        PrinterS printerSSecond = new PrinterS();
//        printerSSecond.start();
//
//        PrinterF printerF = new PrinterF();
//        Thread tPrinterF = new Thread(printerF);
////        System.out.println(tPrinterF.getName());
//        tPrinterF.start();
//
//        tPrinterF.join();
//        printerSSecond.join();
//        System.out.println(Thread.currentThread().getName()+ " End");
////        for (int i = 0; i < 10; i++) {
////            Thread.sleep(1000);
////            System.out.print("F ");
////        }

//        Thread.currentThread().join();              //DeadLock

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println(2);
            }
        };
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(3);
//            }
//        };
        Runnable runnable = () -> {
            System.out.println(3);
            System.out.println(3);
        };

        Thread thread2 = new Thread(runnable);

        thread.start();
        thread2.start();

        new Thread(() -> System.out.println(4)).start();

    }
}
