/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists)
{
	if (lists == null || lists.length == 0)
	{
		return null;
	}

	ListNode dummy = new ListNode(0);
	ListNode prev = dummy;
	ListNode current;
	ListNode next;
	
	PriorityQueue<ListNode> minHeap = new PriorityQueue<>(
		Comparator.comparingInt(head -> head.val)
	);
	
	for (ListNode node : lists)
	{
		if (node != null)
		{
			minHeap.add(node);
		}
	}

	while (!minHeap.isEmpty())
	{
		current = minHeap.poll();

		// if (current == null)
		// {
		// 	continue;
		// }

		next = current.next;
		// current.next = null;
		prev.next = current;
		prev = current;
		if (next != null)
		{
			minHeap.add(next);
		}
	}

	return dummy.next;
}
}