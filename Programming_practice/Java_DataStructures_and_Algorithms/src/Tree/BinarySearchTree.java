package Tree;

/**
 * Created by elahiz on 4/8/2015.
 */
public class BinarySearchTree {
    private TreeNode root;

    //insert data into Binary Tree
    public void insert(Integer data) {
        TreeNode newNode = new TreeNode(data);

        if (root == null) {
            this.root = newNode;
        } else root.insert(data);
    }

    //find data in a Tree
    public TreeNode find(Integer data) {
        if (root != null) {
            return root.find(data);
        }
        return null;
    }

    //delete items from a tree
    public void delete(Integer data) {
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;

        //break if we have an empty tree
        if (current == null) {
            return;
        }

        //find the data in a tree
        while (current != null && current.getData() != data) {
            parent = current;

            //check if data is less than the root
            if (data < current.getData()) {
                current = current.getLeftChild();
                isLeftChild = true;
            } else {
                current = current.getRightChild();
                isLeftChild = false;
            }
        }

        //exit out if the data could not be found
        if (current == null) {
            return;
        }

        //Case 1: Node is a leaf
        if (current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.setLeftChild(null);
                } else {
                    parent.setRightChild(null);
                }
            }
            //Case 2: Node has a single child
        } else if (current.getRightChild() == null) {
            //Only left child is present
            if (current == root) {
                root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
        } else if (current.getLeftChild() == null) {
            //Only right child is present
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }

        }
    }

    //Delete items from a Tree
    public void softDete(Integer data) {
        TreeNode toDel = find(data);
        toDel.delete();
    }

    //find the smallest value in the tree
    public Integer smallest() {
        if(this.root != null){
            return root.smallest();
        }
        return null;
    }

    //find the largest value in the tree
    public Integer largest() {
        if(this.root != null) {
            return root.largest();
        }
        return null;
    }



}
