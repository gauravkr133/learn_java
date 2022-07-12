public class Mythread_thread extends Thread{
           public void run(){
                   for(int i=10;i>=1;i--){
                           System.out.println("Second thread:"+i);
                           try{
                                   Thread.sleep(2000);
                           }catch(Exception e){
                                   System.out.println(e);
                           }
                   }
           }     
}
