package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("Class Desktop-desktopsize");
	}
	public static void main(String[] args){
		Computer computerobject = new Computer();
		computerobject.computerModel();
		Desktop Desktopobject = new Desktop();
		Desktopobject.computerModel();
		Desktopobject.desktopSize();
	}
}