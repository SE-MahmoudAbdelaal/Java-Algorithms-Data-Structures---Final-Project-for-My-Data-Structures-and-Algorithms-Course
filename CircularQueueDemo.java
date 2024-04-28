package my.project;
class Queue
{
    int rear =-1;
    int front=0;
    int []arr = new int[30];
public void Enqueue (int value){
        if (rear==30-1)
        {
            rear=-1;
        }
        arr[++rear]=value;
}
public int Dequeue (){
        if (front==30-1)
        {
            front=0;
        }
        return arr[front++];
}
public boolean Isfull(){
        return rear==30;
}
public boolean IsEmpty(){
        return rear==-1;
}
public int peek(){
        return arr[front];
}
public void display(){
        for(int i=front ; i<=rear ;i++)
            System.out.print(arr[i]+" \n");
}
}
public class circularquene {
     public static void main(String[] args) {
        Queue q = new  Queue();
        q.Enqueue(77);
        q.Enqueue(22);
        q.Enqueue(66);
        q.Enqueue(67);
        q.Enqueue(55);
        q.Enqueue(99);
        q.Enqueue(100);
        q.Enqueue(36);
        q.display();
        q.Dequeue();
        q.Dequeue();
        q.display();
    }
    
}
