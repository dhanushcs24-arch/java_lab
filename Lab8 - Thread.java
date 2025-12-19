class ThreadA extends Thread{
    public void run(){
        try{
            for(int i =1 ; i<=5 ; i++){
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class ThreadB implements Runnable{
    public void run(){
        try{
            for(int i =1; i<= 25 ; i++){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Lab8 {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        System.out.println("Starting Threads...");
        t1.start();
        t2.run();
    }
}
