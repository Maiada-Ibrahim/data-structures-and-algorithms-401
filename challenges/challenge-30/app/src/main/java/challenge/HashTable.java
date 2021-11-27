package challenge;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class HashTable<K,V> {
    private ArrayList<HashNode<K, V>> bucketArray;
    private int numBuckets;
    private int size;

//  -------------------create hash table -------------------
    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 30;
        size = 0;

        for (int index = 0; index < numBuckets; index++) {
            bucketArray.add(null);
        }
    }
//-------------------hash code function-----------------------------------------------------------
    private int hashCode(K key) {
        return Objects.hashCode(key);
    }
    //----------------function to be in the range--------------------------------------------------------
    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % numBuckets;
        index = index < 0 ? index * -1 : index; // convert to possitive
        return index;
    }
    //-----------------------------------------------------------------------------------------------
    public void add(K key, V value) {

        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // all hash table is null at first so if not null that mean is present
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // insert the value in to the position
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);
        // if the load factor (number of hasnnodes) goes beyond the threshold
        // double the hashtble aka the bucket array
        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;

            for (int index = 0; index < numBuckets; index++) {
                bucketArray.add(null);
            }

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }


    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        // search the linnked list
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }

            head = head.next;
        }

        // key not found
        return null;
    }
//---------------------------------------------------------
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }
//-------------------------------------------------------------

    public boolean contain(K key) {
        int bucketIndex = hash(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return true;
            }
            head = head.next;
        }

        return false;
    }




    public int hash(K key) {
        return (Math.abs(key.hashCode())) % bucketArray.size();
    }


    static String repeatedWord( String data){
        String [] lineWordList= data.toLowerCase().replace(",", "").split(" ");
        HashTable<String,Integer> words= new HashTable<>();

        for (String item: lineWordList){
            if ( !words.contain(item.toLowerCase(Locale.ROOT))){
                words.add(item.toLowerCase(Locale.ROOT),1);
            }else{
                return item;
            }

        }
        return "no repeat word at the sentences";
    }







}
