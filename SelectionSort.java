package my.project;
public class selectionsort {
    	private int nelemes;
	private final int a[];
	public selectionsort(int cap){
	a=new int [cap];
		}	
	public void insert(int value){
	a[nelemes]=value;
	nelemes++;
		}
public void selection (){
     for(int i=0;i<nelemes;i++){
             int min=i;
                  for(int j=0;j<nelemes;j++){
               if(a[min]<a[j]){
                    min=j;
                              }
              if(min!=i){
                  int temp=a[i];
                  a[i]=a[min];
                  a[min]=temp;
 	                         }
	                                 }
	}
	}
	public void display(){
		for(int i=0;i<nelemes;i++){
		System.out.print(a[i]+"\n");
		}
		}  
 public static void main(String[] args){
     selectionsort se;
                se=new selectionsort(100);
                se.insert(77);
                se.insert(99);
                se.insert(44);
                se.insert(55);
                se.insert(22);
                se.insert(88);
                se.insert(11);
                se.insert(00);
                se.insert(66);
                se.insert(33);
                se.display();
                System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"+"\n");
                 se.selection();
                se.display();
}
}