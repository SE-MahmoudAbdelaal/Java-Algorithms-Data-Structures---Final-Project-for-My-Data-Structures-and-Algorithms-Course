package my.project;
 class Nodetree {
    int value;
    Nodetree leftchild;
    Nodetree rightchild;
Nodetree(int value) {
        this.value = value;
}
}
class TreeOp {
Nodetree root = null;
public void insert(int value) {
        Nodetree n = new Nodetree(value);
        if (root == null) {
            root = n;
        }
        else {
            Nodetree i = root;
            Nodetree parent;
            while (true) {
                parent = i;
                if (value < i.value) {
                    i = i.leftchild;
                    if (i == null) {
                        parent.leftchild = n;
                        return;
                    }
                }
                else {
                    i = i.rightchild;
                    if (i == null) {
                    parent.rightchild = n;
                    return;
                    }
                }
            }
        }
}
public void delete( int value) {        
        delete(root, value);
}    
public Nodetree delete(Nodetree root , int key){
        Nodetree i = root;
        Nodetree parent;
        while(true){
            parent = i;
            if(root==null){
                return  root;
            }
            if(key <i.value){
                i=i.leftchild;
            }
            else{
                i=i.rightchild;
            }
            if(key==i.value){
                if(i.leftchild==null){
                    i.rightchild=parent.leftchild;
                }
                else if(i.rightchild==null){
                    i.leftchild= parent.leftchild;
                }
            }
        }
}
public void search(int value) {
        Nodetree i =root;        
        while(value!=i.value){
            if(value < i.value){
                i=i.leftchild;
            }
            else{
                i=i.rightchild;
            }  
            if(i==null){
                System.out.println("NotFound");
                return;
            }  
        }
        System.out.println("Found");
} 
public int isSumTree(Nodetree node)
	{
		int ls,rs;
		if(node == null || (node.leftchild == null && node.rightchild == null))
		{
			return 1;
		}
		ls = sum(node.leftchild);
		rs = sum(node.rightchild);
		if((node.value == ls + rs) && isSumTree(node.leftchild) != 0 && isSumTree(node.rightchild) != 0)
		{
			return 1;
		}
		return 0;
	}
static int sum(Nodetree node)
	{
		if(node == null)
		{
			return 0;
		}
		return (sum(node.leftchild) + node.value+sum(node.rightchild));
	}
}
public class binearysearchtree {
    public static void main(String[] args) {
        TreeOp t = new TreeOp();
                t.root=new Nodetree(26);
		t.root.leftchild=new Nodetree(10);
		t.root.rightchild=new Nodetree(3);
		t.root.leftchild.leftchild=new Nodetree(4);
		t.root.leftchild.rightchild=new Nodetree(6);
		t.root.rightchild.rightchild=new Nodetree(3);
        Nodetree root = null;
 if(t.isSumTree(root)!= 0)
		{
			System.out.println("The given tree is a SumTree");
		}
		else
		{
			System.out.println("The given tree is not a SumTree");
		}
    t.search(90);
    }
}
