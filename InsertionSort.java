package my.project;

public class inseartionsort {
 private int nElemes;
private final int []a;
public inseartionsort(int cap){
    nElemes=0;
    a=new int [100];
}
public void insert(int value){
    a[nElemes]=value;
    nElemes++;
}
public void insertion(){
    for(int i=1;i<nElemes;i++){
        int temp=a[i];
        int j=i-1;
        while(j>=0&& a[j]>temp){
        a[j+1]=a[j];
        j--;
    }
        a[j+1]=temp;
    }
}
public void display(){
    for(int i=0;i<nElemes;i++){
       System.out.print(a[i]+"\n");
    }
}
   public static void main(String[] args){
     inseartionsort in;
                in=new inseartionsort(100);
                in.insert(77);
                in.insert(99);
                in.insert(44);
                in.insert(55);
                in.insert(22);
                in.insert(88);
                in.insert(11);
                in.insert(00);
                in.insert(66);
                in.insert(33);
                in.display();
                System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"+"\n");
                 in.insertion();
                in.display();

 }
}
