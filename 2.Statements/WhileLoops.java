// Increment number from 1 to 10 with a while loop.

public class WhileLoopTest {

	public static void main(String[] args) {
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
	// Do-while loop, runs the program first, then checks the condition after.
	// So it runs the program at least once.
		count = 1;
		do {
			System.out.println("Count is: " + count);
		} while (count == 0);
	}
}
