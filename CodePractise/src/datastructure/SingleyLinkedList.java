package datastructure;

public class SingleyLinkedList {

	Node head;

	static class Node {

		int data;
		Node next;

		Node() {

		}

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public boolean isEmpty(Node head) {
		if (head == null)
			return true;
		else
			return false;
	}

	public void insertFront(int data) {
		Node node;
		if (head == null)
			head = new Node(data);
		else {
			node = new Node(data);
			node.next = head;
			head = node;
		}
	}

	public void insertPosition(int pos, int data) {
		Node tempNode = head;
		Node prev = null;
		Node node = new Node(data);
		int flag = 1;
		while (flag <= pos) {
			if (flag == pos) {
				node.next = tempNode;
				prev.next = node;
			}
			flag++;
			prev = tempNode;
			tempNode = tempNode.next;
		}
	}

	public void deleteFront() {
		head = head.next;
	}

	public void deleteEnd() {
		Node tempNode = head;
		Node prev = null;
		while (tempNode.next != null) {
			prev = tempNode;
			tempNode = tempNode.next;
		}

		prev.next = null;
	}

	public void rotateList(int k) {
		Node tempNode = head;
		Node store = new Node();
		int flag = 0;
		while (flag <= k) {
			while (tempNode.next != null) {
				tempNode.next = head;
				store.data = tempNode.next.data;
				tempNode.next.data = tempNode.data;
				tempNode = tempNode.next;
				flag++;
			}
		}
	}

	public void printList() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}

	public static void main(String[] args) {
		SingleyLinkedList singleyLinkedList = new SingleyLinkedList();

		singleyLinkedList.insertFront(2);
		singleyLinkedList.insertFront(4);
		singleyLinkedList.insertPosition(2, 3);
		singleyLinkedList.insertFront(5);
		singleyLinkedList.insertFront(6);
		singleyLinkedList.rotateList(2);
		// singleyLinkedList.deleteFront();
		// singleyLinkedList.deleteEnd();
		singleyLinkedList.printList();

	}

}
