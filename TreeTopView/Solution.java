
/**
 * Program to print top view of a tree.
 *
 * @author Rekhansh Panchal
 */

public class Solution {

public static void main(String[] args) {
    

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        Tree t = new Tree(root);
        System.out.println("Following are nodes in top view of Binary Tree");
        t.topView(root);
    
  }

}



class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class Tree {

    private Node root;

    public Tree() {
        this.root = null;
    }

    Tree(Node root) {

        this.root = root;
    }


    /**
     * Function to print top view of a tree.
     *
     * @param root input node to check for
     */
    void topView(Node root) {

        if (root == null) return;

        //Keep a track of horizontal distances, which nodes is visible first.
        HashSet<Integer> distances = new HashSet<Integer>();

        Queue<QueueItem> queue = new LinkedList<>();
        queue.add(new QueueItem(root, 0));

        while (!queue.isEmpty()) {

            QueueItem item = queue.remove();

            Node itemNode = item.getNode();
            int distance = item.getDistance();

            //Show only top child. Once added with a particular distance, no one else can be added.
            if (!distances.contains(distance)) {

                distances.add(distance);
                System.out.print(itemNode.data + " ");
            }

            //Check left
            if (itemNode.left != null)
                queue.add(new QueueItem(itemNode.left, distance - 1));

            //Check right
            if (itemNode.right != null)
                queue.add(new QueueItem(itemNode.right, distance + 1));
        }
    }
}

class QueueItem {

    private int horizontalDistance;
    private Node node;

    //Constructor
    QueueItem(Node node, int horizontalDistance) {
        this.node = node;
        this.horizontalDistance = horizontalDistance;
    }

    Node getNode() {

        return node;
    }

    int getDistance() {
        return horizontalDistance;
    }
}
