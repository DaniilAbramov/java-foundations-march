package сollections.my_lists.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Node {
    private Object element;
    private Node next;
//    private Node previous;
    public Node(Object element){
        this.element = element;
    }
}
