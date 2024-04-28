package my.project;
public class arrayorderarray{
    private final double[]a;
    private int nElemes=0;
    public arrayorderarray(int cap){
    a=new double[cap];
            }
    public void insert(int newvalue){
 int j;
        for( j=0;j<nElemes;j++){
            if(a[j]>newvalue){
            break;
        }}
        for(int k=nElemes;k>j;k--){
            a[k]=a[k-1];}
            a[j]=newvalue;
            nElemes++;
    }
    int binarysearch(int searchkey){
    int lowerbound=0;
    int upperbound=nElemes-1;
    int mid;
    while(true){
        mid=(lowerbound+upperbound)/2;
        if(a[mid]==searchkey){
            return mid;
        }
        else if(lowerbound>upperbound){
            return nElemes;
        }
        else{
            if(a[mid]<searchkey){
                lowerbound=mid+1;
            }
            else{
                upperbound=mid-1;
            }
        }
    }
            }
        public boolean delete(int deletevalue){
       int j=binarysearch(deletevalue);
       if(j==nElemes){
           return false;
       }
       else{
           for(int i=j;i<nElemes;i++){
               a[i]=a[i+1];
               nElemes--;
           }
           return true;
       }
    }
    public void display (){
        for(int i=0 ; i<nElemes ; i++)
            System.out.print(a[i]+" \n");
}
    int  getsize(){
        return nElemes;
    }
 public static void main(String[] args){
     arrayorderarray or;
                or=new arrayorderarray(100);
                or.insert(77);
                or.insert(99);
                or.insert(44);
                or.insert(55);
                or.insert(22);
                or.insert(88);
                or.insert(11);
                or.insert(00);
                or.insert(66);
                or.insert(33);
                or.display();
              if(  or.binarysearch(66)!=or.getsize()){
                  System.out.print("Found\n");
              }
              else{
                      System.out.print("Not Found\n");
              }

 }

}

