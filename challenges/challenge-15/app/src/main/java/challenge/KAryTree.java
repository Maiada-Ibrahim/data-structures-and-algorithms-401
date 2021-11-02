package challenge;

public class KAryTree {
    private KNode root;
    private String preOrderTree;

    public KAryTree(int k, String rootValue) {
        this.root = new KNode(k, rootValue);
    }
    public KNode getRoot() {
        return root;
    }
    public String preOrder(KNode node){

        if (node !=null){
            System.out.println(node.getValue());
            preOrderTree +="<<"+node.getValue();
            for (int i=0;i< node.getDegree();i++){
                preOrder(node.getNodesListItem(i));
            }
        }
        return preOrderTree;
    }

    public void preOrderTraverse(KNode node){

        if (node !=null){
            System.out.println("from checker"+node.getValue());
            preOrderTree +="<<"+node.getValue();
            if(node.getValue().equals("3") && node.getValue().equals("5")){
                node.setValue("FizzBuzz");
            }
            else if (node.getValue().equals("3")){
                node.setValue("Fizz");
            }else if(node.getValue().equals("5")){
                node.setValue("Buzz");
            }else{
                node.setValue("Buzz");
            }
            for (int i=0;i< node.getDegree();i++){
                preOrderTraverse(node.getNodesListItem(i));
            }
        }
    }

    public void checker(){
        preOrderTraverse(this.root);

    }
}
