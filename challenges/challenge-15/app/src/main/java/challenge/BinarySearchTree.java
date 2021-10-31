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











}
