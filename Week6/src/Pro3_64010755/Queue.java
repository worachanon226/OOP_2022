package Pro3_64010755;

public class Queue {
    private int[] elements;
    private int size;
    private int current_idx = 0;

    public Queue(){
        size = 8;
        elements = new int[8];
    }

    public Queue(int size){
        this.size = size;
        elements = new int[this.size];
    }

    public void enqueue(int v){
        if(current_idx+1 > this.size){
            int[] temp = new int[this.size*=2];
            System.arraycopy(elements, 0, temp, 0, current_idx);
            elements = new int[this.size];
            elements = temp;
            elements[current_idx] = v;
            current_idx++;
        }
        else{
            elements[current_idx] = v;
            current_idx++;
        }
    }

    public int dequeue(){
        int temp = elements[0];
        System.arraycopy(elements, 1, elements, 0, current_idx-1);
        current_idx--;
        return temp;
    }

    public boolean empty(){
        if(current_idx==0) return true;
        else return false;
    }

    public int getSize(){
        return size;
    }
}
