package deneme;

import java.util.Scanner;

public class PoligonAlani {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double alan = 0;
		System.out.println("Kac kordinat girecekseniz yazin");
		int korsay = sc.nextInt();
		double[] x = new double[korsay];
		double[] y = new double[korsay];
		for (int i = 0; i < korsay; i++) {
			System.out.print("x" + (i + 1) + "= ");
			x[i] = sc.nextDouble();
			System.out.print("y" + (i + 1) + "= ");
			y[i] = sc.nextDouble();
		}

		int i = 0;
		while (i < korsay - 1) {
			alan = alan + (x[i] * y[i + 1] - x[i + 1] * y[i]) / 2;

			i++;
		}
		alan = alan + (x[korsay - 1] * y[0] - x[0] * y[korsay - 1]) / 2;
		System.out.println("Alan= " + Math.abs(alan));

	}
}
