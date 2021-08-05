package testing;

public class Main {
	//@BeforeClass
		static {
			System.out.println("Before class Main");
		}

		public static void main(String[] a) {
			testsquare();// manual unit testing
			testcube();
		}

		static int square(int x) {
			return x * x;
		}

		static int cube(int x) {
			return x * x * x;
		}
	//@test
		static void testsquare() { // unit test functions: test cases
			beforeTests();
			int aa = 10;
			if (square(aa) == 110) {
				System.out.println("Test succedded");
			} else
				System.out.println("Test failed");
			afterTests();
		}

	//@test
		static void testcube() {
	//unit test functions: test cases
			beforeTests();
			int aa = 10;
			if (cube(aa) == 1000) {
				System.out.println("Test succedded");
			} else
				System.out.println("Test failed");
			afterTests();
		}
	//@Before
		static void beforeTests() {
			System.out.println("before Test cases ");
		}

	//@after
		static void afterTests() {
			System.out.println("After Test cases ");
		}
	}
