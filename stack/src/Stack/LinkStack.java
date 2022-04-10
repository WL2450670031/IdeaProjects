package Stack;

/**
 * 链表实现栈
 *
 * @param <T>
 */
class Mystack2<T> {
    //定义链表
    class Node<T> {
        private T t;
        private Node next;
    }

    private Node<T> head;

    //构造函数初始化头指针
    Mystack2() {
        head = null;
    }

    //入栈
    public void push(T t) {
        if (t == null) {
            throw new NullPointerException("参数不能为空");
        }
        if (head == null) {
            head = new Node<T>();
            head.t = t;
            head.next = null;
        } else {
            Node<T> temp = head;
            head = new Node<>();
            head.t = t;
            head.next = temp;
        }
    }

    //出栈
    public T pop() {
        T t = head.t;
        head = head.next;
        return t;
    }

    //栈顶元素
    public T peek() {
        T t = head.t;
        return t;
    }

    //栈空
    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;
    }
}

public class LinkStack {
    public static void main(String[] args) {
        Mystack2 stack = new Mystack2();
        System.out.println(stack.isEmpty());
        stack.push("Java");
        stack.push("is");
        stack.push("beautiful");
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}