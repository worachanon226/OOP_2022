package Pro3_64010755;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(8);
        
        for(int i=1;i<=20;i++){
            queue.enqueue(i);
        }
        
        while(!queue.empty()){
            System.out.println(queue.dequeue());
        }
    }
}
