class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree{
    int idx = -1;
    public Node buildTree(int nodes[]){
        idx++;
    }
}
public class Tree {
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node nd = bt.buildTree();

    }
}
