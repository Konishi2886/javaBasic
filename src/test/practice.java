package test;

public class practice {

	public static void main(String[] args) {
	int[] scoreArray = {70,85,80,95,90,120};
	for (int score:scoreArray) {
		System.out.println(score + "点だと成績は" + getGrade(score));
	}
}
public static char getGrade(final int score) {
	char grade = 'C';
	
	if((score < 0) || (100 < score)) {
		return '-';
	}
	
	if(90 <= score) {
		grade = 'A';
	}
	else if (80 <= score) {
		grade = 'B';
	}
	
	return grade;
}

}
