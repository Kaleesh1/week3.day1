package org.college;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation at = new Automation();
		at.Java();
		at.python();
		at.ruby();
		at.Selenium();
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
	}
}
