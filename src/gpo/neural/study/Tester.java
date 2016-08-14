package gpo.neural.study;

public class Tester {

	public static void main(String[] args) {
		Perceptron pOR = new Perceptron(TeacherData.DATA_OR);
		Perceptron pAND = new Perceptron(TeacherData.DATA_AND);
		Perceptron pNOT = new Perceptron(TeacherData.DATA_NOT);
		System.out.println("Perceptron OR");
		pOR.test();
		System.out.println("Perceptron AND");
		pAND.test();
		System.out.println("Perceptron NOT");
		pNOT.test();
	}

}
