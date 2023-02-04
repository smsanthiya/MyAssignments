package week1.day1;

public class Student {
	String studentname="Sankar";
	int rollno=2345;
	String collegeName="MKCE";
	int markScored;
	int eng=80;
	int tam=83;
	int mat=90;
	int sci=88;
	int soc=85;
	int cgpa=eng+tam+mat+sci+soc;
	
	public static void main(String[] args) {
	Student st=new Student();
	System.out.println("Student Name:"+st.studentname);
	System.out.println("Roll No."+st.rollno);
	System.out.println("College Name:"+st.collegeName);
	System.out.println("The marks are:");
	System.out.println("Eng:"+st.eng);
	System.out.println("Tam:"+st.tam);
	System.out.println("Mat:"+st.mat);
	System.out.println("Sci:"+st.sci);
	System.out.println("Soc:"+st.soc);
	System.out.println("The CGPA is :"+st.cgpa);

	}
}
