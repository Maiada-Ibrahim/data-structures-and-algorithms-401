package challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KNodeTest {

    KAryTree ktree;
    @BeforeEach
    void pickUp(){
        ktree= new KAryTree(3,"3");
        ktree.getRoot().setNodesListItem(0,"3");
        ktree.getRoot().setNodesListItem(1,"2");
        ktree.getRoot().setNodesListItem(2,"5");
    }
    @Test
    void checkValue(){
        assertEquals("3",ktree.getRoot().getNodesListItem(0).getValue());
    }
    @Test
    void checkedTest(){
        ktree.checker();
        assertEquals("Fizz",ktree.getRoot().getNodesListItem(0).getValue());
    }
    @Test
    void checkedTest2(){
        ktree.checker();
        assertEquals("Buzz",ktree.getRoot().getNodesListItem(2).getValue());
    }
}