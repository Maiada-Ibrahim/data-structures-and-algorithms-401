package challenge;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    private Node<T> root;
    private String preOrderTree="";
    private String inOrderTree="";
    private String PostOrderTree="";
//    public Integer maxValue;


    public BinaryTree(T value) {
        Node<T> root= new Node<T>(value);
        this.root = root;

    }

    public BinaryTree() {
        Node<T> root= new Node<T>(null);
        this.root = root;
    }
    public String preOrder(Node node){
        if (node != null){
//            System.out.println(node.getValue());
            preOrderTree +="-->"+node.getValue();
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
        return preOrderTree;
    }


//---------------------------------------------------
public String inOrder(Node node){
    if (node != null){
        inOrder(node.getLeft());
        inOrderTree +="-->"+node.getValue();
        inOrder(node.getRight());
    }
    return inOrderTree;
}
//-------------------------------------------------

    public String PostOrder(Node node){
        if (node !=null){
            PostOrder(node.getLeft());
            PostOrder(node.getRight());
            PostOrderTree +="-->"+node.getValue();
            System.out.println(node.getValue());
        }
        return PostOrderTree;

    }
//---------------------------------cc-16-------------------------

    public int max(){
        return Max((Node<Integer>) root);
    }
public int Max(Node<Integer> current) throws NullPointerException{
    int maxValue= (Integer) root.getValue();

        if (current.getLeft() != null){
            if (current.getLeft().getValue()>maxValue){
                maxValue=current.getLeft().getValue();
            }else{
                current=current.getLeft();
                Max(current);
            }
        }
        if (current.getRight() !=null){
            if (current.getRight().getValue()>maxValue){
                maxValue=current.getRight().getValue();
            }
            else {
            current=current.getRight();
            Max(current);
        }
        }
    return maxValue;
}
//-------------------------------------------------------------------------

    public String breadthFirst(){
        Node node = this.root;
        List<Integer> breathFirstValues= new ArrayList<>();
        breathFirstValues.add((Integer) node.getValue());
        return breadthFirstTraverse(node,breathFirstValues);
    }

    private String breadthFirstTraverse(Node node, List<Integer> breathFirstValues ){
        if (node != null){
            if (node.getLeft() !=null){
                breathFirstValues.add((Integer) node.getLeft().getValue());
            }
            if (node.getRight() !=null){

                breathFirstValues.add((Integer) node.getRight().getValue());
            }
            breadthFirstTraverse(node.getLeft(),breathFirstValues);
            breadthFirstTraverse(node.getRight(),breathFirstValues);
        }
        return breathFirstValues.toString();
    }


//-----------------
public int getLeafCount(Node node) {
    if (node == null) {
        return 0;
    }
    if (node.getLeft() == null && node.getRight() == null) {
        return 1;
    }
    else {
        return getLeafCount(node.getLeft()) + getLeafCount(node.getRight());
    }
}
    public boolean compareTwoTreesLeaves(BinaryTree binaryTree1, BinaryTree binaryTree2){
        int leavesNumTree1 = binaryTree1.getLeafCount(binaryTree1.getRoot());
        int leavesNumTree2 = binaryTree1.getLeafCount(binaryTree2.getRoot());

        return leavesNumTree1 == leavesNumTree2;
    }



//------------------------------------------



    public Node<T> getRoot() {

        return root;
    }

    public void setRoot( T value) {
        Node<T> root=new Node<>(value);
        this.root = root;
    }

    public String getPreOrderTree() {
        return preOrderTree;
    }

    public void setPreOrderTree(String preOrderTree) {
        this.preOrderTree = preOrderTree;
    }

    public String getInOrderTree() {
        return inOrderTree;
    }

    public void setInOrderTree(String inOrderTree) {
        this.inOrderTree = inOrderTree;
    }

    public String getPostOrderTree() {
        return PostOrderTree;
    }

    public void setPostOrderTree(String postOrderTree) {
        PostOrderTree = postOrderTree;
    }
//-----------------------------------------
public static boolean mirror(BinaryTree tree1,BinaryTree tree2){
 return helper(tree1.getRoot(),tree2.getRoot());
}
    private static boolean helper (Node a,Node b){
        if (a == null && b == null)
            return true;

        if (a != null && b != null)
        {
            return
                    (
                            a.getValue() == b.getValue() &&
                                    helper(a.getLeft(), b.getRight()) &&
                                    helper(a.getRight(), b.getLeft())
                    );
        }

        return false;

    }
    public static int  maxDepth2(Node root){
        return root == null? 0:Math.max(maxDepth2(root.getLeft()), maxDepth2(root.getRight())) + 1;
    }

}

