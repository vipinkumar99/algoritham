package queue;

public interface Queue<T> {
boolean isEmpty();
int size();
void enqueue(T data);
T dequeue();
T element();
}
