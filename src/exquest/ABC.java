package exquest;

public class ABC {
	class XYZ{
		String s = "Inner - XYZ";
	}

}

class XYZ extends ABC{
	String s = "Outer - XYZ";
	
	class ABC extends XYZ{
		
	}
}