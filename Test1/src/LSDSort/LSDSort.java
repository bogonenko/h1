package LSDSort;

import java.util.Arrays;
import java.util.Random;

public class LSDSort {

	private static final int MAX = 1000000;

	public static void main(String[] args) {

		int[] data = generate();

		long start = System.currentTimeMillis();
		Arrays.sort(data);
		long stop = System.currentTimeMillis();
		int time = (int) (stop - start);

		start = System.currentTimeMillis();
		lsdSort(data);
		stop = System.currentTimeMillis();
		int time2 = (int) (stop - start);

		System.out.println("Time of LSD sort is " + time2
				+ ", time of quick sort is " + time);
	}

	private static int[] generate() {
		int[] data = new int[MAX];

		Random random = new Random();

		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(MAX); // 0 - 999999
		}

		return data;
	}

	private static void lsdSort(int[] data) {

		int number = 4; // 32bits / 8bits; 1 000 000 words, each one contains 4
						// letters
		int R = 256; // 0 - 255

		int[] newArray = new int[MAX];

		for (int d = 0; d < number; d++) {

			int[] count = new int[R + 1];
			for (int i = 0; i < MAX; i++) {
				int c = (data[i] >> 8 * d) & 255;
				count[c + 1]++;
			}

			for (int r = 0; r < R; r++)
				count[r + 1] += count[r];

			if (d == number - 1) {
				int shift = count[R] - count[R / 2];
				int shift2 = count[R / 2];
				for (int r = 0; r < R / 2; r++)
					count[r] += shift;
				for (int r = R / 2; r < R; r++)
					count[r] -= shift2;
			}

			for (int i = 0; i < MAX; i++) {
				int c = (data[i] >> 8 * d) & 255;
				newArray[count[c]++] = data[i];
			}

			for (int i = 0; i < MAX; i++)
				data[i] = newArray[i];
		}

	}

}
