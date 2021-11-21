/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private HashTable<String,String> hashTable;


    @BeforeEach
    void pickup(){
        hashTable= new HashTable<>();
        hashTable.add("Name","MAIADA");
    }
    // test add
    @Test
    void addTest(){
        assertTrue(hashTable.contain("Name"));
    }
    // test get
    @Test
    void getTest(){
        assertEquals("MAIADA",hashTable.get("Name"));
    }
    // test getnull
    @Test
    void getNullTest(){
        assertEquals(null,hashTable.get("age"));

    }
    @Test
    public void collisionTest() {

        HashTable table = new HashTable();

        // 10 and  100 have the  same hash value of 0
        table.add(10, 99);
        table.add(100, 88);
        assertEquals(99, table.get(10) );
        assertEquals(88, table.get(100) );
    }
    @Test
    public void hashTest() {

        HashTable table = new HashTable();
        int hashValue = table.hash(50);
        assertTrue(hashValue < 30);
    }

}
