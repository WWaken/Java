/**
 * @ClassName: $0725
 * @Description: 删除链表中所有值为val的节点
 * @Author: Ma Yuanyuan
 */

class LinkedNode{
    public int data;
    public LinkedNode next = null;

    public LinkedNode(int data) {
        this.data = data;
    }
}
public class $072501 {

    public  static void removeAll(LinkedNode head, int toRemove){
        if(head == null){
            return;
        }
        LinkedNode prev = head;
        LinkedNode cur = prev.next;
        while(cur.next != null){
            if(cur.data == toRemove){
               prev.next = cur.next;
               cur = prev.next;
            }
            prev = cur;
            cur = cur.next;
        }
        if(head.data == toRemove){
            head = head.next;
        }
        return;
    }
    public static void Print(LinkedNode head){
        for(LinkedNode cur = head; cur != null; cur = cur.next){
            System.out.println(cur.data);
        }
    }
    public static void main(String[] args) {
        LinkedNode linkedNode1 = new LinkedNode(1);
        LinkedNode linkedNode2 = new LinkedNode(3);
        LinkedNode linkedNode3 = new LinkedNode(5);
        LinkedNode linkedNode4 = new LinkedNode(9);
        linkedNode1.next = linkedNode2;
        linkedNode2.next = linkedNode3;
        linkedNode3.next = linkedNode4;
        linkedNode4.next = null;
        removeAll(linkedNode1,3);
        Print(linkedNode1);

    }
}
