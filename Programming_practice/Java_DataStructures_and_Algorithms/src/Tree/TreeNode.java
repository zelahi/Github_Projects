package Tree;

/**
 * Created by elahiz on 4/8/2015.
 */
public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private boolean isDeleted = false;

    public TreeNode(Integer data){
        this.data = data;
    }

    //find a Node with a certain value in a tree
    public TreeNode find(Integer data){
        if(this.data == data && !isDeleted){
            return this;
        }

        //recursively call the left child to find the data there
        if(data < this.data && leftChild != null){
            return leftChild.find(data);
        }

        //check the right side of the tree if the data is greater than the root
        if(data > this.data && rightChild != null){
            return rightChild.find(data);
        }

        return null;
    }

    //insert data into the node of a tree
    public void insert(Integer data){
        TreeNode newNode = new TreeNode(data);
        if(data >= this.data) {
            if (this.rightChild == null) {
                this.rightChild = newNode;
            } else {
                this.rightChild.insert(data);
            }
        }else {
            if(this.leftChild == null) {
                this.leftChild = newNode;
            }else {
                this.leftChild.insert(data);
            }
        }
    }

    //set a flag to true if the value was removed from the tree
    public void delete(){
        this.isDeleted = true;
    }

    //check if the value was deleted
    public boolean isDeleted() {
        return isDeleted;
    }

    //find the smallest value in the tree
    public Integer smallest() {
        if(this.leftChild == null){
            return this.data;
        }
        return this.leftChild.smallest();
    }

    //find the largest value in the tree
    public Integer largest() {
        if(this.rightChild == null){
            return this.data;
        }
        return this.rightChild.largest();
    }


    public void setData(Integer data) {
        this.data = data;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public Integer getData(){
        return this.data;
    }

    public TreeNode getLeftChild(){
        return this.leftChild;
    }

    public TreeNode getRightChild(){
        return this.rightChild;
    }
}
