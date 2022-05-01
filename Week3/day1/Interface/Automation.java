package week3.day1;
public  class Automation implements Language,TestTool{
	final int a = 10;
	int b;
	public void thismethod() {
		this.b = 100;
		System.out.println(b);
	}

	public void Java() {
		System.out.println("Inside method java of interface Language");		
	}
	public void Selinium() {
		int a =2;
		System.out.println(a);
		System.out.println(b);
		System.out.println("Inside method Selenium of interface TestTool");		
	}
	public static void main (String[] args) {
		Automation autom = new Automation();
		autom.Java();
		autom.Selinium();
		autom.thismethod();
	}
}

