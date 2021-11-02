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
            System.out.println(node.getValue());
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
        System.out.println(node.getValue());
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
    System.out.println(current.getLeft());
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
}
