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

	public void print(DataStructureIterator iterator) {
		// Print out values of even indices of the array
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");	
		}
		System.out.println();
	}
			/* This has to bi fixed*/	
			/* This has to bi fixed*/	
			/* This has to bi fixed*/	
			/* This has to bi fixed*/	
			/* This has to bi fixed*/	
			/* This has to bi fixed*/	
	public void print(java.util.function.Function<Integer, Boolean> iterator) {
		int next;
		while (iterator.hasNext()) {
			next = iterator.next();
			if (iterator.apply(next))
				System.out.print(next + " ");
		}
		System.out.println();
	}

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
		ds.print(ds.new EvenIterator());
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
		ds.print((n) -> n % 2 != 0);
	}
}
