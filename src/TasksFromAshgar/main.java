package TasksFromAshgar;

public class main {

	public static void main(String[] args) {
		int[][] a = {
				{1, 2, 3, 4},
				{4, 5, 6, 7},
				{1, 3, 5, 7}
		};
	}

	static int[][] reduce10(int[][] arr) {
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print((j - 10) + " ");
			}
			System.out.println();
		}
		return arr;
	}
}
