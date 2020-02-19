package binarySearchTree;

public interface Tree<T> {
void add(T data);
void inorderShowAll();
void delete(T data);
T getMax();
T getMin();
void preorderShowAll();
void postorderShowAll();
}
