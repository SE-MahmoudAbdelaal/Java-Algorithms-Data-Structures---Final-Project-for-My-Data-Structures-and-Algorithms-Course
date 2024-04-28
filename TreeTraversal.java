package my.project;
class NODE 
{ 
    int key; 
    NODE left, right; 
  
    public NODE(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 
  
class BinaryTree 
{ 
    NODE root; 
  
    BinaryTree() 
    { 
        root = null; 
    } 
    void printPostorder(NODE node) 
    { 
        if (node == null) 
            return; 
  
        printPostorder(node.left); 
  
        printPostorder(node.right); 

        System.out.print(node.key + " "); 
    } 
  
    void printInorder(NODE node) 
    { 
        if (node == null) 
            return; 
        printInorder(node.left); 
  
        System.out.print(node.key + " "); 
        printInorder(node.right); 
    } 
  
    void printPreorder(NODE node) 
    { 
        if (node == null) 
            return; 
        System.out.print(node.key + " ");
        printPreorder(node.left); 
        printPreorder(node.right); 
    } 
    void printPostorder()  {    
        printPostorder(root);  } 
    void printInorder()    {    
        printInorder(root);   } 
    void printPreorder()   {   
        printPreorder(root);  } 
}
public class treetraversal {
    public static void main(String[] args) {
       BinaryTree tree = new BinaryTree(); 
        tree.root = new NODE(1); 
        tree.root.left = new NODE(2); 
        tree.root.right = new NODE(3); 
        tree.root.left.left = new NODE(4); 
        tree.root.left.right = new NODE(5); 
  
        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreorder(); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(); 
    } 
}

  
