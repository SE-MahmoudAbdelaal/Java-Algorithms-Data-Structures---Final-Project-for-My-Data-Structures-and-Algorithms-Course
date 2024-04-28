package my.project;
public class maxelement {
        private final int []a;
    private int nElemes=0;
    public maxelement(int cap){
    a=new int [cap];
            }
    public void insert(int newvalue){
        a[nElemes]=newvalue;
        nElemes++;
    }
    public void maxelement(){
        int max = a[0];
            for(int i=0;i<a.length;i++){
                        if(a[i] > max)  
               max = a[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }
       public void display (){
        for(int i=0 ; i<nElemes ; i++)
            System.out.print(a[i]+" \n");
}
       public static void main(String[] args){
     maxelement max;
                max=new maxelement(100);
                max.insert(77);
                max.insert(99);
                max.insert(44);
                max.insert(55);
                max.insert(22);
                max.insert(88);
                max.insert(11);
                max.insert(00);
                max.insert(66);
                max.insert(33);
                max.display();
                max.maxelement();

 }
    
}
