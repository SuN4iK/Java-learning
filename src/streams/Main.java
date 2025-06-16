public class Main {
    public static void main(String[] args) {
        /*MyThread myThread1 = new MyThread("Пылесосить");
        MyThread myThread2 = new MyThread("Мыть посуду");
        MyThread myThread3 = new MyThread("Готовить кушать");
        myThread1.start();
        myThread2.start();
        myThread3.start();*/
        /*MyRunnable myRunnable2 = new MyRunnable("Мыть посуду");
        MyRunnable myRunnable3 = new MyRunnable("Готовить кушать");
        Thread thread1 = new Thread(new MyRunnable("Пылесосить"));
        Thread thread2 = new Thread(myRunnable2);
        Thread thread3 = new Thread(myRunnable3);
        thread1.start();
        thread2.start();
        thread3.start();*/
        /*Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("Пылесосить - "+i+"%");
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("Мыть посуду - "+i+"%");
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("Готовить кушать - "+i+"%");
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();*/
        Thread thread1 = new Thread(()->{
            for (int i = 1; i <= 100; i++) {
                System.out.println("Пылесосить - "+i+"%");
            }
        });
        Thread thread2 = new Thread(()->{
            for (int i = 1; i <= 100; i++) {
                System.out.println("Готовить кушать - "+i+"%");
            }
        });
        Thread thread3 = new Thread(()->{
            for (int i = 1; i <= 100; i++) {
                System.out.println("Мыть посуду - "+i+"%");
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyRunnable implements Runnable{
    String task = "";
    public MyRunnable(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(task+" - "+i+"%");
        }
    }
}

class MyThread extends Thread{
    String task = "";
    public MyThread(String task){
        this.task = task;
    }
    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 100; i++) {
            System.out.println(task+" - "+i+"%");
        }
    }
}