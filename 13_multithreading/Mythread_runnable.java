//Creating thread using runnable interface
class Mythread_runnable implements Runnable{

        public void run(){
                for(int i=1;i<=10;i++){
                        System.out.println("First Thread: "+i);
                        try{
                                Thread.sleep(1000);
                        }catch(Exception e){
                                System.out.println(e);
                        }
                }
        }

        public static void main(String[] args) {
                Mythread_runnable t1 = new Mythread_runnable();
                Thread thr = new Thread(t1);

                Mythread_thread t2 = new Mythread_thread();
                
                thr.start();

                t2.start();

        }
}