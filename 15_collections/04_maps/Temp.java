public class Temp {
    public String toString(){
        return "Temp...";
    }

    public void finalize(){
        System.out.println("Finalize method called...");
    }
}
