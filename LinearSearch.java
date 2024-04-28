package my.project;
public class linearsearch {
     private final double[]a;
    private int nElemes=0;
    public linearsearch(int cap){
    a=new double[cap];
            }

    public void insert(int newvalue){
        a[nElemes]=newvalue;
        nElemes++;
    }
    public void linearsearchfunction(int searchkey){
        int i;
        for( i=0;i<nElemes;i++){
            if(a[i]==searchkey){
           break;
            }
        }
            if(i==nElemes){
                 System.out.print("not found\n");
        }
            else{
                System.out.print("found\n");
            }} 
      public void display (){
        for(int i=0 ; i<nElemes ; i++)
            System.out.print(a[i]+" \n");
}
       public static void main(String[] args){
     linearsearch li;
    li=new linearsearch(100);
    li.insert(77);
    li.insert(99);
    li.insert(44);
    li.insert(55);
    li.insert(22);
    li.insert(88);
    li.insert(11);
    li.insert(00);
    li.insert(66);
    li.insert(33);
    li.display();
     System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"+"\n");
     li.linearsearchfunction(22);
     li.linearsearchfunction(52);

 }
}
