package challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Math.abs;

public class BinaryTree<T> {


    Node<T> root;
    private String preOrderTree = "";
    private String inOrderTree = "";
    private String PostOrderTree = "";
//    public Integer maxValue;


    public BinaryTree(T value) {
        Node<T> root = new Node<T>(value);
        this.root = root;

    }

    public BinaryTree() {
        Node<T> root = new Node<T>(null);
        this.root = root;
    }

    public String preOrder(Node node) {
        if (node != null) {
//            System.out.println(node.getValue());
            preOrderTree += "-->" + node.getValue();
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
        return preOrderTree;
    }


    //---------------------------------------------------
    public String inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            inOrderTree += "-->" + node.getValue();
            inOrder(node.getRight());
        }
        return inOrderTree;
    }
//-------------------------------------------------

    public String PostOrder(Node node) {
        if (node != null) {
            PostOrder(node.getLeft());
            PostOrder(node.getRight());
            PostOrderTree += "-->" + node.getValue();
        }
        return PostOrderTree;

    }
//---------------------------------cc-16-------------------------

//    public int max() {
//        return Max((Node<Integer>) root);
//    }
//
//    public int Max(Node<Integer> current) throws NullPointerException {
//        int maxValue = (Integer) root.getValue();
//
//        if (current.getLeft() != null) {
//            if (current.getLeft().getValue() > maxValue) {
//                maxValue = current.getLeft().getValue();
//            } else {
//                current = current.getLeft();
//                Max(current);
//            }
//        }
//        if (current.getRight() != null) {
//            if (current.getRight().getValue() > maxValue) {
//                maxValue = current.getRight().getValue();
//            } else {
//                current = current.getRight();
//                Max(current);
//            }
//        }
//        return maxValue;
//    }
//-------------------------------------------------------------------------

    public String breadthFirst() {
        Node node = this.root;
        List<Integer> breathFirstValues = new ArrayList<>();
        breathFirstValues.add((Integer) node.getValue());
        return breadthFirstTraverse(node, breathFirstValues);
    }

    private String breadthFirstTraverse(Node node, List<Integer> breathFirstValues) {
        if (node != null) {
            if (node.getLeft() != null) {
                breathFirstValues.add((Integer) node.getLeft().getValue());
            }
            if (node.getRight() != null) {

                breathFirstValues.add((Integer) node.getRight().getValue());
            }
            breadthFirstTraverse(node.getLeft(), breathFirstValues);
            breadthFirstTraverse(node.getRight(), breathFirstValues);
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
        } else {
            return getLeafCount(node.getLeft()) + getLeafCount(node.getRight());
        }
    }

    public boolean compareTwoTreesLeaves(BinaryTree binaryTree1, BinaryTree binaryTree2) {

        int leavesNumTree1 = binaryTree1.getLeafCount(binaryTree1.getRoot());
        int leavesNumTree2 = binaryTree1.getLeafCount(binaryTree2.getRoot());

        return leavesNumTree1 == leavesNumTree2;
    }


//-------------------       ````````-----------------------


    public Node<T> getRoot() {

        return root;
    }

    public void setRoot(T value) {
        Node<T> root = new Node<>(value);
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
    public static boolean mirror(BinaryTree tree1, BinaryTree tree2) {
        return helper(tree1.getRoot(), tree2.getRoot());
    }

    private static boolean helper(Node a, Node b) {
        if (a == null && b == null)
            return true;

        if (a != null && b != null) {
            return
                    (
                            a.getValue() == b.getValue() &&
                                    helper(a.getLeft(), b.getRight()) &&
                                    helper(a.getRight(), b.getLeft())
                    );
        }

        return false;

    }



    //----------------------------------------------------------------
    public static void reverse(BinaryTree tree1) {
        helperReverse(tree1.getRoot());
    }

    private static Node helperReverse(Node root) {

        if (root == null)
            return root;

        /* do the subtrees */
        Node right = helperReverse(root.getRight());
        Node left = helperReverse(root.getLeft());
        /* swap the left and right pointers */
//        System.out.println(G.getValue());
        root.setRight(left);
        root.setLeft(right);

        return root;
    }

    //----------------------------------------
    public static boolean balanceTree(BinaryTree tree1) {

        int result = helperBalance(tree1.getRoot());
        return result == 1;
    }

    private static int helperBalance(Node root) {

        if (root == null)
            return 0;


        int left = helperBalance(root.getRight()) + 1;
        int right = helperBalance(root.getLeft()) + 1;

        if (right == left) {
            return 1;
        }
        return 0;
    }

    //--------------------------------

//    static class v {
//        int tilt = 0;
//    }
//
//    private static int traverse(Node root, v t) {
//
//        if (root == null)
//            return 0;
//
//        // Compute tilts of left and right subtrees
//        // and find sums of left and right subtrees
//        int left = traverse(root.getLeft(), t);
//        int right = traverse(root.getRight(), t);
//
//        // Add current tilt to overall
//        t.tilt += Math.abs(left - right);
//
//        // Returns sum of nodes under current tree
//        return left + right + (int) root.getValue();
//    }
//
//    /* Driver function to print Tilt of whole tree */
//    static int Tilt(Node root) {
//        v t = new v();
//        traverse(root, t);
//        return t.tilt;
//    }

    //---------------------------------------------------------
//    public static Node pruneTree(Node root) {
//        return containsOne(root) ? root : null;
//    }
//
//    private static boolean containsOne(Node root) {
//        if (root == null) {
//            return false;
//        }
//
//        boolean lRes = containsOne(root.getLeft());
//        boolean rRes = containsOne(root.getRight());
//        if (lRes == false) root.setLeft(null);    // pruning
//        if (rRes == false) root.setRight(null);
//
//        return ((int) root.getValue() == 1) || lRes || rRes; // if one of them contains 1, the tree should not be pruned.
//    }

    //--------------------------------------------------------------------------
    static boolean isUnivalTree(Node root) {

        // If tree is an empty tree
        if (root == null) {
            return true;
        }

        // If all the nodes on the left subtree
        // have not value equal to root node
        if (root.getLeft() != null
                && root.getValue() != root.getLeft().getValue())
            return false;

        // If all the nodes on the left subtree
        // have not value equal to root node
        if (root.getRight() != null
                && root.getValue() != root.getRight().getValue())
            return false;

        // Recurse on left and right subtree
        return isUnivalTree(root.getLeft())
                && isUnivalTree(root.getRight());
    }

    //-----------------------------------------------------
    static int getLevel(Node root, Node node, int level) {
        // base cases
        if (root == null)
            return 0;
        if (root == node)
            return level;

        // If node is present in left subtree
        int downlevel = getLevel(root.getLeft(), node, level + 1);
        if (downlevel != 0)
            return downlevel;

        // If node is not present in left subtree
        return getLevel(root.getRight(), node, level + 1);
    }

    static void printGivenLevel(Node root, Node node, int level) {
        if (root == null || level < 2)
            return;

        if (level == 2) {
//            if (root.getLeft() == node || root.getRight() == node)
//                return;
            if (root.getLeft() != null)
                System.out.print(root.getLeft().getValue() + " ");
            if (root.getRight() != null)
                System.out.print(root.getRight().getValue() + " ");
        }
        else if (level > 2) {
            printGivenLevel(root.getLeft(), node, level - 1);
            printGivenLevel(root.getRight(), node, level - 1);
        }
    }

    static void printCousins(Node root, Node node) {
        // Get level of given node
        int level = getLevel(root, node, 1);

        // Print nodes of given level.
        printGivenLevel(root, node, level);
    }

    //---------------------------------------------------------------------------------
    static Node MergeTrees(Node<Integer> t1, Node<Integer> t2) {
        if (t1 == null ){
            return t2;
            }
        if (t2 == null) {
            return t1;
        }
            t1.value= t1.value +  t2.value;

            t1.left=MergeTrees(t1.left, t2.left);
            t1.right =MergeTrees(t1.right, t2.right);

        return t1;
    }
    //-----------------------------------------------------------------------------
    static int countNodes(Node root) {
        if (root == null)
            return (0);
        return (1 + countNodes(root.getLeft()) + countNodes(root.getRight()));
    }

//    /* This function checks if the binary tree is complete or not */
//    static boolean isComplete(Node root, int index, int number_nodes) {
//        // An empty tree is complete
//        if (root == null)
//            return true;
//
//        // If index assigned to current node is more than
//        // number of nodes in tree, then tree is not complete
//        if (index >= number_nodes)
//            return false;
//
//        // Recur for left and right subtrees
//        return (isComplete(root.getLeft(), 2 * index + 1, number_nodes)
//                && isComplete(root.getRight(), 2 * index + 2, number_nodes));
//
//    }

    //--------------------------
    static int sum;

    public static int sumSubTree(Node root,int firstroot) {

        if (root == null) {
            return 0;
        }
        sum = sum + (int) root.getValue();

        sumSubTree(root.getLeft(),firstroot);
        if ((int)root.getValue()!=firstroot){
            sumSubTree(root.getRight(),firstroot);
        }

        return sum;

    }
    //-----------------------------------
    static int sumall;

    public static int sumAllFunc(Node root) {

        if (root == null) {
            return 0;
        }
        sumall = sumall + (int) root.getValue();

        sumAllFunc(root.getLeft());
        sumAllFunc(root.getRight());


        return sumall;

    }
//---------------------------------------------
    static int addBT(Node root) {
        if (root == null)
            return 0;

        return ((int) root.getValue() + addBT(root.getLeft()) +
                addBT(root.getRight()));
    }
//-----------------------------------
static int sumleaf;

    // utility function which calculates
    // sum of all leaf nodes
    static void leafSum(Node root){
        if (root == null)
            return;
        if (root.getLeft() == null && root.getRight() == null)
            sumleaf += (int)root.getValue();

        leafSum(root.getLeft());
        leafSum(root.getRight());
    }

    //---------------------------------------------
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
            if(min2 > (int) root.getValue() && (int) root.getValue() >min1 ) {
                min2 = (int) root.getValue();
            }
            dfs(root.getRight());
            if(min2 > (int) root.getValue() && (int) root.getValue() >min1 ) {
                min2 = (int) root.getValue();
            }
        }
    }
//    public static void dfs2(Node root) {
//
//        if (root != null) {
//            if(min2 > (int) root.getValue() && (int) root.getValue() >min1 ) {
//                min2 = (int) root.getValue();
//            }
//            dfs2(root.getLeft());
//            dfs2(root.getRight());
//        }
//
//    }

//------------------------------------------------------------------------------------
//        int maxDepth(Node node)
//        {
//            if (node == null)
//                return -1;
//            else
//            {
//                /* compute the depth of each subtree */
//                int lDepth = maxDepth(node.getLeft());
//                int rDepth = maxDepth(node.getRight());
//
//                /* use the larger one */
//                if (lDepth > rDepth)
//                    return (lDepth + 1);
//                else
//                    return (rDepth + 1);
//            }
//        }
//
//    int minimumDepth() {
//    return minimumDepth(root, 0);
//}


    int minimumDepth(Node root, int level)
    {

        if (root == null)
            return level;

        level++;

        return Math.min(minimumDepth(root.left, level),
                minimumDepth(root.right, level));
    }
//    public static int maxDepth2(Node root) {
//        return root == null ? 0 : Math.max(maxDepth2(root.left), maxDepth2(root.right)) + 1;
//    }
    //----------------------------
//    public boolean Contains(Node value){
//        String result=this.PostOrder(this.getRoot());
//        return result.contains( value.value.toString());
//    }

//------------------------------------------
static int  count=0;
public static int  countDuplicates(Node root, Node prev)
{
    if(root==null)
        return 0;

    if (root.value==prev.value)
        count++;
    if(root.getRight() != null && root.getLeft() !=null){
        if (root.getRight().value==root.getLeft().value){
            count++;
        }
    }

     countDuplicates(root.getLeft(),root);
     countDuplicates(root.getRight(),root);


return count;

}
    public boolean hasPathSum(Node root, int targetSum) {
        if (root== null)return false;
        targetSum-=(int)root.value;
        if (root.left==null && root.right==null){
            return 0==targetSum;
        }
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum) ;
    }
}