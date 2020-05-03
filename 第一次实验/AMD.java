package go;

public class AMD extends CPU{
	static public String name = "AMD CPU";
	static public double price = 2549;
	static public String work = "AMD CPU work";
	static public String corenum="8H16T";
	
	AMD() {
		super(name,price,work,corenum);
	}
}
