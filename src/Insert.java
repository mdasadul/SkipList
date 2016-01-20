import java.util.*;
import java.util.stream.*;

public class Insert {

	static LinkedList<Integer> firstList = new LinkedList<Integer>();

	private void insert(int item) {

		firstList.add(item);

	}

	private void traverse() {
		firstList.forEach(System.out::println);

		Iterator<Integer> x = firstList.descendingIterator();
		while (x.hasNext()) {
			System.out.print(x.next() + " ");
		}

	}

	public static void main(String args[]) {

		Insert insertObject = new Insert();
		IntStream.range(1, 10).forEach(item -> {
			insertObject.insert(item);
		});
		insertObject.traverse();
	}

}
