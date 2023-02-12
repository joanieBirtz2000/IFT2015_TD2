public class Node {
	private int value;
	private Node next = null;

	public Node(int value) {
		this.value = value;
	}

	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	public void addValue(int value) {
		if (this.next == null) {
			this.next = new Node(value);
		} else {
			this.next.addValue(value);
		}
	}

	public void addNode(Node next) {
		if (this.next == null) {
			this.next = next;
		} else {
			this.next.addNode(next);
		}
	}

	public void removeLast() {
		// gere s'il y a un seule element
		if (this.next == null) {
			return;
		}
		if (this.next.next == null) {
			this.next = null;
		} else {
			this.next.removeLast();
		}
	}

	public void removeValue(int value) {
		if (this.next == null) {
			return;
		}
		if (this.next.value == value) {
			this.next = this.next.next;
			removeValue(value);
		} else {
			this.next.removeValue(value);
		}
	}

	public int length_iteratif() {
		int length = 0;
		Node current = this;
		while (current != null) {
			length++;
			current = current.next;
		}
		return length;
	}

	public int length_recurssion() {
		if (this.next == null) {
			return 1;
		}
		return 1 + this.next.length_recurssion();
	}

	public int returnNlast(int nLast) throws Exception {
		Node current = this;
		int length = length_iteratif();

		if (nLast == 0 || nLast > length) {
			throw new Exception("Invalid index - fist value is " + current.value);

		}

		for (int i = 0; i < length - nLast; i++) {
			current = current.next;
		}

		return current.value;
	}

	public void addValue_ordered(int value) {
		// TODO
	}

	public void insertSort() {
		// TODO
	}

	// Ma fonction print()
	public void print() {
		int count = 0;
		Node current = this;
		while (current.next != null) {
			count++;
			System.out.println("Node #" + count + " valeur: " + current.value);
			current = current.next;

		}
		count++;
		System.out.println("Node #" + count + " valeur: " + current.value);
	}
}
