package hackerrank.days30ofCode;

public class d22_BST {
    public static int getHeight(Node root){
        //Write your code here
        if (root == null) {return 0;}
        else if ((root.left == null) & (root.right == null)){
            return 0;
        }
        else return 1+ Math.max(getHeight(root.left), getHeight(root.right));

    }
}

