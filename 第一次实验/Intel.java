package go;

public class Intel extends CPU{
	static public String name = "Intel CPU";
	static public double price = 3999;
	static public String work = "Intel CPU work";
	static public String corenum="8H16T";
	
	Intel() {
		super(name,price,work,corenum);
	}
}
