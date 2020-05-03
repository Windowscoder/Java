package go;

public class Computer {
	String computer;
	CPU cpu;
	Memory memory;
	Disk disk;
	Board board;
	Computer(String computer,String com_cpu,String com_memory,String com_disk,String com_board){
		this.computer=computer;
		
		switch(com_cpu) 
		{
		case "Intel":
	    Intel intel=new Intel();
	    cpu=(Intel)intel;
	    break;
		case "AMD":
	    AMD amd=new AMD();
		cpu=(AMD)amd;
		break;
		}
		
		switch(com_memory)
		{
		case "Samsung":
		Samsung samsung=new Samsung();
		memory=(Samsung)samsung;
		break;
	    case "Kingston":
		Kingston kingston=new Kingston();
	    memory=(Kingston)kingston;
	    break;
		}
		
		switch(com_disk)
		{
		case "Seagate":
		Seagate seagate=new Seagate();
		disk=(Seagate)seagate;
		break;
	    case "WestDigitals":
	    	WestDigitals westDigitals=new WestDigitals();
	    disk=(WestDigitals)westDigitals;
	    break;
		}
		
		switch(com_board)
		{
		case "Gigabyte":
		Gigabyte gigabyte=new Gigabyte();
		board=(Gigabyte)gigabyte;
		break;
	    case "Asus":
	    Asus asus=new Asus();
	    board=(Asus)asus;
	    break;
		}
	}
	
	public void description() {
		System.out.println("本电脑描述");
		System.out.println( "电脑名："+this.computer);
		System.out.println( "cpu名："+cpu.getName()+" "+"核数："+cpu.getFeature());
		System.out.println( "内存名："+memory.getName()+" "+"内存容量："+memory.getFeature());
		System.out.println( "硬盘名："+disk.getName()+" "+"硬盘容量："+disk.getFeature());
		System.out.println( "主板名："+board.getName()+" "+"主板速度："+board.getFeature());
	}
	
	public void price() {
		System.out.println();
		double sum=cpu.getPrice()+memory.getPrice()+disk.getPrice()+board.getPrice();
		System.out.println("计算机 "+this.computer+" 总价为："+sum+"元");
	}
	public void work() {
		System.out.println();
		System.out.println("本电脑工作");
		System.out.println( "电脑名："+this.computer);
		System.out.println( "cpu工作："+cpu.getWork());
		System.out.println( "内存工作："+memory.getWork());
		System.out.println( "硬盘工作："+disk.getWork());
		System.out.println( "主板工作："+board.getWork());
	}
}
