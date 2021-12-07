package challenge;

public class BinarySearchTree extends BinaryTree {

    public BinarySearchTree(Integer value) {

        super(value);
    }

//-----------------------------------------------------------------------------------
    private void traverse(Node<Integer> current, Integer value) throws NullPointerException{
        if (current.getValue()>value){

            if (current.getLeft() != null){
                current=current.getLeft();
                traverse(current,value);
            }else{
                current.setLeft(value);
            }
  //----------------------------------------------------------------------

        }else{


            if (current.getRight() !=null){
                current=current.getRight();
                traverse(current,value);
            }else{
                current.setRight(value);
            }



        }
    }
//-----------------------------------------------------------------------------------------
    public void Add(Integer value) throws NullPointerException{
        Node<Integer> newNode= new Node<Integer>(value);
        Node<Integer> current = this.getRoot();
        traverse(current,value);
    }
//------------------------------------------------------------------------------------------

    public boolean Contains(Integer value){
        String result=this.PostOrder(this.getRoot());
        return result.contains( value.toString());
    }
//---------------------------------------

    public int oddSum(){
        return inOrdeTraverser(this.getRoot());
    }
    private int inOrderTree=0;
    public int inOrdeTraverser(Node node){
        if (node !=null){
            if ((Integer)node.getValue() %2 !=0){
                inOrderTree =inOrderTree+ (Integer)node.getValue();
            }
            inOrdeTraverser(node.getLeft());
            inOrdeTraverser(node.getRight());
        }
        return inOrderTree;
    }

//--------------------------------------
public Node sortedArrayToBST(int[] nums) {
    return helper(nums, 0, nums.length - 1);
}

    public Node helper(int[] nums, int left, int right) {
        if(left > right) return null;

        int m = left + (right - left) / 2;
        Node root = new Node(nums[m]);
        root.left = helper(nums, left, m - 1);
        root.right = helper(nums, m + 1, right);
        return root;
    }

//--------------------------------
    private Integer maxValue(Node<Integer> node) {

        if(node.right != null) {
            return maxValue(node.right);
        }
        return node.value;
    }

    static int min1;
    static int min2;
    public static int findSecond(BinaryTree tree){
        min1 = (int) tree.getRoot().getValue();
        min2 = (int) tree.getRoot().getValue();
        dfs(tree.getRoot());
//        dfs2(tree.getRoot());
        return min2;
    }
    public static void dfs(Node root) {
        if (root != null) {
            if (min1 > (int) root.value) {
                min1 = (int) root.value;
            }
            dfs(root.getLeft());
            if(min2 > (int) root.value && (int) root.getValue() >min1 ) {
                min2 = (int) root.value;
            }
//            dfs(root.getRight());
//            if(min2 > (int) root.getValue() && (int) root.getValue() >min1 ) {
//                min2 = (int) root.getValue();
//            }
        }
    }
//-------------------------------------------------------
boolean isBST(Node<Integer> node)
{
    if (node == null)
        return true;

    if (node.left != null && node.left.value > node.value)
        return false;

    if (node.right != null && node.right.value < node.value)
        return false;
    return     (isBST(node.left) && isBST(node.right) );
}





}
