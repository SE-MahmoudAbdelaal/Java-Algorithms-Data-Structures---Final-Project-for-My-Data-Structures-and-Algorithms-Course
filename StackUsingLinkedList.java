package my.project;
 class link{
    public int dDATA;
    public link next;
    public link (int dd){
        dDATA=dd;
    }
    public void display(){
        System.out.print(dDATA+"\n");
    }
 }
    class linklist{
        private link first;
    public linklist(){
        first=null;
    }
    public boolean isempty(){
        return(first==null);
    }
    public void insertfirst(int dd){
        link newlink=new link(dd);
        newlink.next=first;
        first=newlink;
    }
    public int deletefirst(){
        link temp=first;
        first=first.next;
     return temp.dDATA;
    }
    public void displaylist(){
        link current=first;
        while (current!=null){
            current.display();
            current=current.next;
        }
        System.out.print("");
    }
}
    class linkstack{
        private linklist thelist;
        public linkstack(){
            thelist=new linklist();
        }
        public void push(int j){
            thelist.insertfirst(j);
        }
        public int pop(){
            return thelist.deletefirst();
        }
        public boolean isempty(){
            return(thelist.isempty());
        }
        public void displystack(){
            System.out.print("stack(top-->bottom):");
            thelist.displaylist();
        }
    }
public class stackusinglnkedlist{
        public static void main(String[]args){
            linkstack thestack=new linkstack();
              thestack.push(20);
              thestack.push(40);
              thestack.displystack();
              thestack.push(60);
              thestack.push(80);
              thestack.displystack();
              thestack.pop();
              thestack.pop();
              thestack.displystack();
              
        }
    }
