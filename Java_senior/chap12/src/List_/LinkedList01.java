package List_;

/**
 * @author zyr
 * @version 1.0
 */
public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("hsp");
        // 构造双向链表
        jack.next = tom;
        tom.pre = jack;

        tom.next = hsp;
        hsp.pre = tom;

        Node first = jack;
        Node last = hsp;

        while (true) {
            if(first == null) {
                break;
            }

            System.out.println(first);
            first = first.next;
        }

        // 添加元素
        Node smith = new Node("smith");
        smith.next = hsp;
        smith.pre = tom;
        hsp.pre = smith;
        tom.next = smith;
        first = jack;
        while (true) {
            if(first == null) {
                break;
            }

            System.out.println(first);
            first = first.next;
        }
    }
}

class Node {
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}
