public class CharSequenceDemo implements CharSequence {
	private String s;

	CharSequenceDemo(String s) {
		this.s = s;
	}

	public int fromEnd(int i) {
		return s.length() - i - 1;
	}

	public char charAt(int i) {
		return 'a';
	}

	public CharSequence subSequence(int start, int end) {
		if(start < 0)
			throw new IndexOutOfBoundsException(start);
		if(end > s.length())
			throw new IndexOutOfBoundsException(end);
		if(start > end)
			throw new IndexOutOfBoundsException(start - end);
		StringBuilder sub = new StringBuilder(s.subSequence(fromEnd(end) +1, fromEnd(start)+1));
		return sub.reverse();
	}

	public int length() {
		return s.length();
	}

	public String toString() {
		StringBuilder s = new StringBuilder(this.s);
		return s.reverse().toString();
	}

	public static void main(String[] args) {
		CharSequenceDemo sequence = new CharSequenceDemo("Hello World");
		CharSequence s = sequence.subSequence(0, 11);

		System.out.println(s);
	}
}
