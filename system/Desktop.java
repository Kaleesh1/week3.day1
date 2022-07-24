package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("Size is 13 inches ");
		
	}
	public static void main(String[] args) {
		Computer com = new Computer();
		com.computerModel();
		Desktop d = new Desktop();
		d.desktopSize();
	}	
}
