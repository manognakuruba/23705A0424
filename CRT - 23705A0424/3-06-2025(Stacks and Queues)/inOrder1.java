public class Main {
    public static void main(String[] args) {
        Tree t = new Tree(new int[] {1, 2, -1, -1, 3, -1, -1});
        t.inOrder();
    }
}

class Tree {
    Node root;
    int index = -1;

    Tree(int[] nodes) {
        this.root = buildTreeUsingArray(nodes);
    }

    private Node buildTreeUsingArray(int[] nodes) {
        index++;
        if (index >= nodes.length || nodes[index] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTreeUsingArray(nodes);
        newNode.right = buildTreeUsingArray(nodes);
        return newNode;
    }

    public void inOrder() {
        inOrderHelper(root);
    }

    private void inOrderHelper(Node temp) {
        if (temp == null) return;
        inOrderHelper(temp.left);
        System.out.print(temp.data + " ");
        inOrderHelper(temp.right);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
