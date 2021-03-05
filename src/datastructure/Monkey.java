package datastructure;

// 链表结构
public class Monkey {
    public int id;
    public String name;
    public Monkey next;

    public Monkey(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", id, name);
    }
}

class TestMonkey {
    public static void main(String[] args) {
        // 初始化链表节点
        Monkey head = new Monkey(0, "zero");
        Monkey m1 = new Monkey(1, "albert");
        Monkey m2 = new Monkey(2, "berry");
        Monkey m3 = new Monkey(3, "carmen");
        Monkey m4 = new Monkey(4, "david");

        // 指定链表尾部
        head.next = m1;
        m1.next = m2;
        m2.next = m3;
        m3.next = m4;
        m4.next = null;

        // 显示链表
        Monkey node = head.next;
        while (node != null) {
            System.out.println("node: " + node.id + "." + node.name);
            node = node.next;
        }

        // 找到尾节点
        Monkey tail = m1;
        while (tail.next != null) {
            tail = tail.next;
        }

        // 添加到尾部
        Monkey m5 = new Monkey(5, "ella");
        tail.next = m5;
        System.out.println(m5);

        // 插入到头部
        Monkey m6 = new Monkey(6, "fang");
        m6.next = head.next;
        head.next = m6;
        System.out.println(head.next);
        System.out.println(head.next.next);

        // 插入到其它位置
        Monkey m7 = new Monkey(7, "Green");
        Monkey node1 = head.next;
        while (node1 != null) {  // 遍历每个节点
            if (node1.id == 3) {// 找到目标节点
                m7.next = node1.next;
                node.next = m7;
                break;
            }
            node = node1.next;
        }

        // 删除其中节点
        Monkey node2 = head.next;
        while (node2 != null) {
            if (node2.id == 4) {
                node2.next = node2.next.next;
                break;
            }
            node = node.next;
        }
    }
}