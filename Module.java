package go;

public abstract class Module {
	private String name;
	private double price;
	private String work;
	private String other;
	
	Module(String name, double price, String work,String other){
		this.name=name;
		this.work=work;
		this.price=price;
		this.other=other;
	}
	
	public String getName() {
		return this.name;
	}
	public String getWork() {
		return this.work;
	}
	public double getPrice() {
		return this.price;
	}
	public String getFeature() {
		return this.other;
	}
	
}
