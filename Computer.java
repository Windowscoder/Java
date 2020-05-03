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
		System.out.println("����������");
		System.out.println( "��������"+this.computer);
		System.out.println( "cpu����"+cpu.getName()+" "+"������"+cpu.getFeature());
		System.out.println( "�ڴ�����"+memory.getName()+" "+"�ڴ�������"+memory.getFeature());
		System.out.println( "Ӳ������"+disk.getName()+" "+"Ӳ��������"+disk.getFeature());
		System.out.println( "��������"+board.getName()+" "+"�����ٶȣ�"+board.getFeature());
	}
	
	public void price() {
		System.out.println();
		double sum=cpu.getPrice()+memory.getPrice()+disk.getPrice()+board.getPrice();
		System.out.println("����� "+this.computer+" �ܼ�Ϊ��"+sum+"Ԫ");
	}
	public void work() {
		System.out.println();
		System.out.println("�����Թ���");
		System.out.println( "��������"+this.computer);
		System.out.println( "cpu������"+cpu.getWork());
		System.out.println( "�ڴ湤����"+memory.getWork());
		System.out.println( "Ӳ�̹�����"+disk.getWork());
		System.out.println( "���幤����"+board.getWork());
	}
}
