public class File {
	public int[] elements;
	public int start;
	public int end;

	public int MAX;

	public File() {
		super();
		this.MAX = 100;
		this.elements = new int[MAX];
		this.start = this.end = -1;
	}

	public boolean isEmpty() {
		return this.start == -1 && this.end == -1;
	}

	public boolean isFull() {
		return (this.end + 1) % MAX == this.start;
	}

	public void push(int element) {
		if (isFull()) {
			System.out.println("File is full");
			return;
		} else if (isEmpty()) {
			this.start = this.end = 0;
		} else {
			this.end = (this.end + 1) % MAX;
		}
		this.elements[this.end] = element;

	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("File is empty");
			return -1;
		} else if (this.start == this.end) {
			int item = this.elements[this.start];
			this.start = this.end = -1;
			return item;
		} else {
			int item = this.elements[this.start];
			this.start = (this.start + 1) % MAX;
			return item;
		}
	}

	public int length() {
		if (isEmpty()) {
			return 0;
		} else if (this.start <= this.end) {
			return this.end - this.start + 1;
		} else {
			return MAX - this.start + this.end + 1;
		}
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("File is empty");
		} else {
			int i = this.start;
			System.out.print("(" + this.elements[i]);
			i = (i + 1) % MAX;
			while (i != (this.end + 1) % MAX) {
				System.out.print(", " + this.elements[i]);
				i = (i + 1) % MAX;
			}
			System.out.println(")");
		}
	}

	public boolean search(int value) {
		if (isEmpty()) {
			return false;
		} else {
			int i = this.start;
			while (i != (this.end + 1) % MAX) {
				if (this.elements[i] == value) {
					return true;
				}
				i = (i + 1) % MAX;
			}
			return false;
		}
	}

	public void remove(int value) {

		if (isEmpty()) {
			System.out.println("File is empty");
			return;
		} else {
			int i = this.start;
			while (i != (this.end + 1) % MAX) {
				if (this.elements[i] == value) {
					break;
				}
				i = (i + 1) % MAX;
			}
			if (i == (this.end + 1) % MAX) {
				System.out.println("Value not found in file");
				return;
			} else {
				while (i != this.end) {
					this.elements[i] = this.elements[(i + 1) % MAX];
					i = (i + 1) % MAX;
				}
				this.end = (this.end - 1 + MAX) % MAX;
			}
		}
		return;
	}
}
