package go;

public class ComputerMarket {
	public static void main(String[]args) {
		//���Բ�������һ������Ӣ�ض�cpu+�����ڴ�+ϣ��Ӳ��+�����������
		Computer computer1 = new Computer("Computer1","Intel","Samsung","Seagate","Gigabyte");
		computer1.description();
        computer1.price();
        computer1.work();
        
        System.out.println();
        
       //���Բ���������������AMDcpu+��ʿ���ڴ�+����Ӳ��+��˶�������
        Computer computer2 = new Computer("Computer2","AMD","Kingston","WestDigitals","Asus");
		computer2.description();
        computer2.price();
        computer2.work();
        
        System.out.println();
        
      //���Բ���������������Ӣ�ض�cpu+��ʿ���ڴ�+����Ӳ��+�����������
        Computer computer3 = new Computer("Computer3","Intel","Kingston","WestDigitals","Gigabyte");
		computer3.description();
        computer3.price();
        computer3.work();
        
      //�����߿ɸ�����Ҫѡȡ��Ӧ�����
	}
}
