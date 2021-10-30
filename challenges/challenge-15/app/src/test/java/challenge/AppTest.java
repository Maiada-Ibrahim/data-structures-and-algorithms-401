/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void emptyTree() {
        BinaryTree<Integer> pre = new BinaryTree<Integer>();
        Integer correct =pre.getRoot().getValue();
        assertEquals(null, correct);


    }
    @Test void singleRootTree() {
        BinaryTree<Integer> pre = new BinaryTree<Integer>(5);
        Integer correct =pre.getRoot().getValue();
        assertEquals(5, correct);

    }
    @Test void singleRootTreeWithRightAndLeft() {
        BinaryTree<Integer> pre = new BinaryTree<Integer>(5);
        pre.getRoot().setLeft(3);
        pre.getRoot().setRight(2);
        Integer correctLeft =pre.getRoot().getLeft().getValue();
        Integer correctRigth =pre.getRoot().getRight().getValue();
        assertEquals(2, correctRigth);
        assertEquals(3, correctLeft);

    }
    @Test void CollectionFromPreorder() {
        BinarySearchTree binarySearchTree= new BinarySearchTree(5);
        binarySearchTree.Add(2);
        binarySearchTree.Add(7);
        binarySearchTree.Add(8);
        String correct=binarySearchTree.preOrder(binarySearchTree.getRoot());
        String expect="-->5-->2-->7-->8";
        assertEquals(expect, correct);
    }
    @Test void CollectionFromInOrder() {
        BinarySearchTree binarySearchTree= new BinarySearchTree(5);
        binarySearchTree.Add(2);
        binarySearchTree.Add(7);
        binarySearchTree.Add(8);
        String correct=binarySearchTree.inOrder(binarySearchTree.getRoot());
        String expect="-->2-->5-->7-->8";
        assertEquals(expect, correct);
    }
    @Test void CollectionFromPostOrder() {
        BinarySearchTree binarySearchTree= new BinarySearchTree(5);
        binarySearchTree.Add(2);
        binarySearchTree.Add(7);
        binarySearchTree.Add(8);
        String correct=binarySearchTree.PostOrder(binarySearchTree.getRoot());
        String expect="-->2-->8-->7-->5";
        assertEquals(expect, correct);
    }
    @Test void Contain() {
        BinarySearchTree binarySearchTree= new BinarySearchTree(5);
        binarySearchTree.Add(2);
        binarySearchTree.Add(7);
        binarySearchTree.Add(8);
        boolean correct=binarySearchTree.Contains(7);
        boolean expect=true;
        assertEquals(expect, correct);
        boolean correct2=binarySearchTree.Contains(99);
        boolean expect2=false;
        assertEquals(expect2, correct2);
    }

}