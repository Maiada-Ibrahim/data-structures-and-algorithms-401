/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Library {
    public static void main(String[] args) {

        BinarySearchTree tree1 = new BinarySearchTree(200);
        tree1.Add(100);
        tree1.Add(250);

        BinarySearchTree tree2 = new BinarySearchTree(200);
        tree2.Add(100);
        tree2.Add(300);
//        System.out.println(HashTable.intersection(tree1, tree2));

        //--------------------------33
        HashMap<String,String> map1= new HashMap<>();
        map1.put("fond","enammored");
        map1.put("wrath","anger");
        map1.put("diligent","employed");
        map1.put("outift","garb");
        map1.put("guide","usher");

        HashMap<String,String> map2= new HashMap<>();
        map2.put("fond","averse");
        map2.put("wrath","delight");
        map2.put("diligent","idel");
        map1.put("guide","follow");
        map1.put("flow","jam");


        System.out.println(leftJoins(map1,map2));
        System.out.println(HashTable.mostCommon("the bee love bee"));
    }
    public static ArrayList<ArrayList<String>> leftJoins(HashMap<String,String> map1, HashMap<String,String> map2){
        ArrayList<ArrayList<String>> bigContainer= new ArrayList<>();

        ArrayList<String> smallContainer;

        for (Map.Entry item: map1.entrySet()){
            smallContainer= new ArrayList<>();
            smallContainer.add((String) item.getKey());
            smallContainer.add((String) item.getValue());

            if (map2.containsKey(((String) item.getKey()))){
                smallContainer.add(map2.get(item.getKey()));
            }else{
                smallContainer.add("Null");
            }

            bigContainer.add(smallContainer);
        }

        return bigContainer;
    }

}
