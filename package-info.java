package gpa;
public class GPA {
	public static double CGPACalc(double[] marks, int n)
    {
     double grade[] = new double[n];
        double CGPA, sum = 0;
        for (int i = 0; i < n; i++) {
            grade[i] = (marks[i] / 10);
        }
        for (int i = 0; i < n; i++) {
            sum += grade[i];
        }

        CGPA = sum / n;
 
        return CGPA;
    }
	public static void main(String[] args) {
		 int n = 5;
	        double[] marks
	            = { 90, 80, 70, 80, 90 };
	 
	        double CGPA = CGPAcalc(marks, n);
	 
	        System.out.println(
	            "CGPA = " + CGPA);
	        System.out.println(
	            "CGPA Percentage = "
	            + String.format("%.2f", CGPA * 9.5));
	}

}
