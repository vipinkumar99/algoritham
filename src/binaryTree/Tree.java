package binaryTree;

public interface Tree {
void add(int data);
void delete(int data);
void inorder();
void preorder();
void postorder();
void levelOrder();
boolean equal(Node t1,Node t2);
int sum();
int evenOddDifference();
int totalNode();
int totalLeaf();
}
