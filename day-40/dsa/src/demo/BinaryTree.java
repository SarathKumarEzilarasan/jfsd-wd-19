package demo;

import java.util.LinkedList;
import java.util.Queue;

class _Node {
    int data;
    _Node left, right;

    _Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    _Node root;

    void preOrder(_Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " -> ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(_Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " -> ");
        inOrder(node.right);
    }

    void postOrder(_Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " -> ");
    }

    int height(_Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }


    void levelOrder(_Node root) {
        if (root == null) {
            return;
        }

        Queue<_Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            _Node tempNode = queue.poll();
            System.out.print(tempNode.data + " -> ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new _Node(1);
        tree.root.left = new _Node(2);
        tree.root.right = new _Node(3);
        tree.root.left.left = new _Node(4);
        tree.root.left.right = new _Node(5);
        tree.root.right.right = new _Node(6);


//        tree.postOrder(tree.root);
//        System.out.println(tree.height(tree.root));

        tree.levelOrder(tree.root);
    }

}
