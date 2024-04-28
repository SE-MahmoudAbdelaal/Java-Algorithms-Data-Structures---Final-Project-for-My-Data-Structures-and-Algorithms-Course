package my.project;
public class bubblesort {
    private int nElemes;
        private final int []a;
		 public bubblesort(int cap){
    a=new int[cap];
            }
			public void insert(int value){
				a[nElemes]=value;
				nElemes++;
			}
			public void bublesort(){
			for(int i=nElemes-1;i>1;i--){
                        for(int j=0;j<i;j++){
                        if(a[j]>a[j+1]){
                        int temp=a[j];
                           a[j]=a[j+1];
                           a[j+1]=temp;}
                         }
                         }
                         }
			public void display(){
				for(int i=0;i<nElemes;i++){
					System.out.print(a[i]+"\n");
                                }
                        }
   public static void main(String[] args){
     bubblesort bu;
    bu=new bubblesort(100);
    bu.insert(77);
    bu.insert(99);
    bu.insert(44);
    bu.insert(55);
    bu.insert(22);
    bu.insert(88);
    bu.insert(11);
    bu.insert(00);
    bu.insert(66);
    bu.insert(33);
    bu.display();
     System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"+"\n");
     bu.bublesort();
     bu.display();

 }
}
