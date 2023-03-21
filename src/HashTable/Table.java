package veriYapilariOdev4;

public class Table {
	Node arr[];
	int size;
	int topStep = 0;
	int topPerson = 0;

	public Table(int size) {
		this.size = size;
		arr = new Node[size];
		for (int i = 0; i < size; i++) {
			arr[i] = new Node(-1, "", "");
		}
	}

	int createIndex(int key) {
		int i = 0;
		int index;
		while (true) {
			index = Math.abs(((key * 3 + 2) + (i * (key * 7 + 2))) % size);
			Node temp = arr[index];
			if (temp.next != null) {
				i++;
			} else
				break;
		}
		return index;
	}

	int step(int key) {
		int i = 0;
		int index;
		while (true) {
			index = Math.abs(((key * 3 + 2) + (i * (key * 7 + 2))) % size);
			Node temp = arr[index];
			if (temp.next.key != key) {
				i++;
			} else
				break;
		}
		return i + 1;
	}

	void add(int key, String name, String surname) {
		if (topPerson == size) {
			System.out.println("Tablo dolu ekleme işlemi başarısız");
		} else {
			int index = createIndex(key);
			Node element = new Node(key, name, surname);
			Node temp = arr[index];
			temp.next = element;
			topStep += step(key);
			topPerson += 1;
			System.out.println("Ekleme işlemi Başarılı");
		}
	}

	void search(int no) {
		int ctrl = 0;
		for (int i = 0; i < size; i++) {
			Node temp = arr[i];
			if (temp != null) {
				while (temp.next != null) {
					temp = temp.next;
					if (temp.key == no) {
						ctrl = 1;
						System.out.println(temp.key + " " + temp.name + " " + temp.surname + " " + step(no)
								+ " adımda dizi[" + i + "] de bulundu.");
						break;
					}
				}
			}
		}
		
		if (ctrl == 0) {
			System.out.println("aranan eleman yoktur..");
		}
	}

	void print() {
		for (int i = 0; i < size; i++) {
			System.out.print("Dizi[" + i + "] ");
			Node temp = arr[i];
			while (temp.next != null) {
				System.out.print("-> " + temp.next.key + "-" + temp.next.name + " " + temp.next.surname);
				temp = temp.next;
			}
			System.out.println("");
		}
	}
}
