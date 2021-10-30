package challenge;

public class BinaryTree<T> {
    private Node<T> root;
    private String preOrderTree="";
    private String inOrderTree="";
    private String PostOrderTree="";

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
//----------------------------------------------------------

















    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
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
