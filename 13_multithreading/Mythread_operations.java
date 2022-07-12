class UserThread extends Thread{
        public void run(){
                System.out.println("This is user defined thread.");
        }
}

public class Mythread_operations{
        public static void main(String[] args) {
                System.out.println("Program Started");
                Thread t = Thread.currentThread();
                String tname = t.getName();
                System.out.println("Current running thread is: "+tname);
                t.setName("My main");
                System.out.println("Current running thread is: "+t.getName());
                try{
                        Thread.sleep(1000);
                }catch(Exception e){}
                System.out.println("Thread id is: "+t.getId());
                
                UserThread thread = new UserThread();
                thread.start();
                System.out.println("Program Ended");
        }
}