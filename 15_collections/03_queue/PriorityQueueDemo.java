public class PriorityQueueDemo{
    public static void main(String[] args){
        PriorityQueue pq1 = new PriorityQueue();
        PriorityQueue pq2 = new PriorityQueue(20);
        //PriorityQueue pq3 = new PriorityQueue(int cap,Comparator c);
        SortedSet s = new TreeSet();
        PriorityQueue pq4 = new PriorityQueue(s);
        //PriorityQueue pq5 = new PriorityQueue(Collection c);
    }
}