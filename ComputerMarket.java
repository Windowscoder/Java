package go;

public class ComputerMarket {
	public static void main(String[]args) {
		//电脑测试用例一，购买英特尔cpu+三星内存+希捷硬盘+技嘉主板组合
		Computer computer1 = new Computer("Computer1","Intel","Samsung","Seagate","Gigabyte");
		computer1.description();
        computer1.price();
        computer1.work();
        
        System.out.println();
        
       //电脑测试用例二，购买AMDcpu+金士顿内存+西数硬盘+华硕主板组合
        Computer computer2 = new Computer("Computer2","AMD","Kingston","WestDigitals","Asus");
		computer2.description();
        computer2.price();
        computer2.work();
        
        System.out.println();
        
      //电脑测试用例三，购买英特尔cpu+金士顿内存+西数硬盘+技嘉主板组合
        Computer computer3 = new Computer("Computer3","Intel","Kingston","WestDigitals","Gigabyte");
		computer3.description();
        computer3.price();
        computer3.work();
        
      //测试者可根据需要选取相应的组件
	}
}
