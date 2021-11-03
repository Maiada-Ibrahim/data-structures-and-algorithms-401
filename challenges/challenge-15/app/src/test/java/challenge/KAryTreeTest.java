package challenge;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class kAryTest {

    @Test
    public void kAryTreeFour(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(30);
        KAryTree<Integer> kAryTree = new KAryTree<>(list, 4);
        assertEquals("1","" + kAryTree.getRoot().getKey() , "");
        assertEquals("2","" + kAryTree.getRoot().getChild(0).getKey() ,"" );
        assertEquals("3","" + kAryTree.getRoot().getChild(1).getKey() ,"" );

    }

    @Test
    public void kAryBuzz(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(30);
        KAryTree<Integer> kAryTree = new KAryTree<>(list, 4);
        assertEquals("1","" + kAryTree.getRoot().getKey() , "");
        assertEquals("2","" + kAryTree.getRoot().getChild(0).getKey() ,"" );
        assertEquals("3","" + kAryTree.getRoot().getChild(1).getKey() ,"" );

    }
}
