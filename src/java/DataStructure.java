// Exercise 2 from Classes and Objects/Nested Classes

public class DataStructure {
	
// Create an array
	private final static int SIZE = 15;
	private int[] arrayOfInts = new int[SIZE];

	public DataStructure() {
		// Fill the array with ascending integer values
		for (int i = 0; i < SIZE; i++) {
			arrayOfInts[i] = i;
		}
	}

	public static int getSize() { return SIZE; }
	public int[] getArray() { return arrayOfInts; }

	public void printEven() {
		// Print out values of even indices of the array
		DataStructureIterator iterator = this.new EvenIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

	// Exercise 2.a.
	public void print(DataStructureIterator iterator) {
		// Print out values of even indices of the array
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");	
		}
		System.out.println();
	}

	// Exercise 2.c.
	public void print(java.util.function.Function<Integer, Boolean> iterator) {
		// Iterating over the elements of the array
		for (int e : arrayOfInts)
			if (iterator.apply(e))
				System.out.print(e + " ");
		System.out.println();
	}

	// Exercise 2.d.
	public static boolean isEvenIndex(int n) { return n % 2 == 0; }
	public static boolean isOddIndex(int n) { return n % 2 != 0; }


	interface DataStructureIterator extends java.util.Iterator<Integer> { }

	// Inner class implements the DataStructureIterator interface,
	// which extends the Iterator<Integer> interface

	private class EvenIterator implements DataStructureIterator {
		
		// Start stepping through the array from the beginning
		private int nextIndex = 0;

		public boolean hasNext() {
			
			// Check if the current element is the last in the array
			return (nextIndex <= SIZE - 1);
		}

		public Integer next() {
			// Record a value of an even index of the array
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

			// Get the next even element
			nextIndex += 2;
			return retValue;
		}
	}

	public static void main(String args[]) {
		// Fill the array with integer values and print out only
		// values of even indices
		DataStructure ds = new DataStructure();
		ds.printEven();
		
		// Exercise 2.a.
		System.out.print("Exercise 2.a.: ");
		ds.print(ds.new EvenIterator());

		// Exercise 2.b.
		System.out.print("Exercise 2.b.: ");
		ds.print(new DataStructure.DataStructureIterator() {
			private int nextIndex = 1;
			private static final int SIZE = DataStructure.getSize();
			private int[] arrayOfInts = ds.getArray(); 

			public boolean hasNext() {
				return (nextIndex <= SIZE - 1);
			}

			public Integer next() {
				Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
				nextIndex += 2;
				return retValue;
			}
		});

		// Exercise 2.c.
		System.out.print("Exercise 2.c.: ");
		ds.print((n) -> n % 2 == 0);
		System.out.print("\t       ");
		ds.print((n) -> n % 2 != 0);
		
		// Exercise 2.d.
		System.out.print("Exercise 2.d.: ");
		ds.print(DataStructure::isEvenIndex);
		System.out.print("\t       ");
		ds.print(DataStructure::isOddIndex);
	}
}
