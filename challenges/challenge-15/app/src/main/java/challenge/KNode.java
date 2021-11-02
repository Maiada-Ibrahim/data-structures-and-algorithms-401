package challenge;

public class KNode {
    private KNode nodeX;
    private String value;
    private KNode[] nodesList;
    private int degree;

    public KNode(int k, String value) {
        this.nodesList =  new KNode[k];
        this.value=value;
        this.degree=k;
    }

    public KNode getNodesListItem(int i) {
        System.out.println(nodesList[i]);
        return  nodesList[i];
    }

//    public void setNodesListItem(int i,T value) {
//        KNode<T> targetNode= getNodesListItem(i);
//        targetNode= new KNode<T>(degree,value);
//        System.out.println();
//    }

    public void setNodesListItem(int order, String value) {
        KNode newNode = new KNode (this.degree,value);
        nodesList[order]= newNode;
    }

    public String getValue() {
        return value;
    }

    public int getDegree() {
        return degree;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
