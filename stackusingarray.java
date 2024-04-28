package my.project;
class Stack {
    private final int maxsize ;
    private final int[] stackAraay;
    private int top;
    public Stack(int s){
    maxsize=s;
    stackAraay=new int[maxsize];
    top=-1;   
}
public void push(int value) {
        stackAraay[++top] = value;
}
public int pop() {
        return stackAraay[top--];
}
public boolean Isfull() {
        return (top == maxsize-1);
}
public boolean IsEmpty() {
        return (top == -1);
}
public int peek() {
        return stackAraay[top];
}
public void display(){
        for(int i =0 ; i<=top; i++)
        {
            System.out.print(stackAraay[i]+"\n");
        }
}
}
 public class stackusingarray {
    public static void main(String[] args) {
        Stack st = new Stack(100);
        System.out.println(st.IsEmpty());
        st.push(77);
        st.push(99);
        st.push(44);
        st.push(55);
        st.push(22);
        st.push(88);
        st.push(11);
        st.push(00);
        st.push(66);
        st.push(33);
        st.display();
        System.out.println(st.IsEmpty());
        System.out.println();
        st.pop();
        System.out.println(st.peek());
        st.display();
    }
}

