package week3Day1Assignments;

public class Automation extends MultipleLanguage implements TestTool,Language {
	public static void main(String[] args) {
		
	Automation obj=new Automation();
	obj.python();
	obj.Java();
	obj.Selenium();
	obj.ruby();
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java Language is used");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium supports java");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby is also used");
	}

	
}
