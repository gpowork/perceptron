package gpo.neural.study;

public class TeacherData {
	public static double[][] DATA_OR = {
			{0, 0, 0},
			{0, 1, 1},
			{1, 0, 1},
			{1, 1, 1}
	};
	
	public static double[][] DATA_AND = {
			{0, 0, 0},
			{0, 1, 0},
			{1, 0, 0},
			{1, 1, 1}
	};
	
	public static double[][] DATA_NOT = {
			{1, 0, 1},
			{1, 1, 0},
	};
}
