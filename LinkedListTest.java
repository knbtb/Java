package Java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LinkedListTest {

    @Test
    public void TestLinkedListEmpty() throws Exception
    {
        LinkedList ll = new LinkedList();
        assertEquals(ll.getSize(), 0);
    }

    @Test
    public void TestLinkedListRootNodeNotNull() throws Exception
    {
        LinkedList ll = new LinkedList();
        assertNotEquals(ll.Node, null);
    }
    
    @Test
    public void TestLinkedListAddItems() throws Exception
    {
        LinkedList ll = new LinkedList();
        ll.add(17);
		ll.add(5);
		ll.add(10);
        assertEquals(ll.getSize(), 3);
    }

    @Test
    public void TestLinkedListRedundancy() throws Exception
    {
        LinkedList ll = new LinkedList();
        ll.add(23);
		ll.add(143);
		ll.add(12);
        ll.setSize(2);
        assertEquals(ll.find(12), null);
    }

    @Test
    public void TestLinkedListNodeTraversal() throws Exception
    {
        LinkedList ll = new LinkedList();
        ll.add(1);
		ll.add(2);
		ll.add(3);
        ll.add(4);
		ll.add(5);
        assertEquals(ll.root.getNextNode().getNextNode().getNextNode(), 4);
    }

    @Test
    public void TestLinkedListRootRemovalAndTraversal() throws Exception
    {
        LinkedList ll = new LinkedList();
        ll.add(1);
		ll.add(2);
		ll.add(3);
        ll.remove(1);
        assertEquals(ll.root.getNextNode(), 3);
    }
}
