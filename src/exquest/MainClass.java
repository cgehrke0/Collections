package exquest;

import exquest.X.Z;

public class MainClass{
	public static void main(String[] args) {
		X.Z z = new X().new Z();
		System.out.println(z.x);
		System.out.println(z.y);
		System.out.println(z.z);
	}
}