package gpo.neural.study;

public class Perceptron {
	
	double[] enters;
	double outer;
	double[] weights;
	
	double[][] patterns;
	
	public Perceptron(double[][] patterns) {
		this.patterns = patterns;
		enters = new double[2];
		weights = new double[enters.length];
		for (int i = 0; i < enters.length; i++) {
			weights[i] = Math.random() * 0.2 + 0.1;
		}
	}
	
	public void countOuter() {
		outer = 0;
		for (int i = 0; i < enters.length; i++) {
			outer += enters[i] * weights[i];
		}
		if (outer > 0.5)
			outer = 1;
		else
			outer = 0;
	}
	
	public int study() {
		double gError = 0;
		int counter = 0;
		do {
			counter++;
			gError = 0;
			for (int p = 0; p < patterns.length; p++) {
				enters = java.util.Arrays.copyOf(patterns[p], patterns[p].length - 1);
				countOuter();
				double error = patterns[p][2] - outer;
				gError += Math.abs(error);
				for (int i = 0; i < enters.length; i++) {
					weights[i] += 0.1 * error * enters[i];
				}
			}
			System.out.println("Global error: " + gError);
		} while (gError != 0);
		return counter;
	}
	
	public void test() {
		System.out.println("Study steps: " + study());
		for (int p = 0; p < patterns.length; p++) {
			enters = java.util.Arrays.copyOf(patterns[p], patterns[p].length - 1);
			countOuter();
			System.out.println("[" + patterns[p][0] + ", " + patterns[p][1] + "] => " + outer);
		}
	}
}
