
public class p41 {

	public static void main(String[] args) {
		car41 car1 = new car41(1234,20.5);
		car1.vshow();
		car1.mshow();

	}

}
interface ivehical41{
	void vshow();
}
interface imaterial{
	void mshow();
}
class car41 implements ivehical41,imaterial{
	private int num;
	private double gas;
	
	public car41(int n, double g) {
		num = n;
		gas = g;
	    System.out.println("�Ͳ��F������"+num+"�A��o�q��"+gas+"�����l");
	  }
	  public void vshow(){
			System.out.println("�����O"+num);
			System.out.println("��o�q�O"+gas);  
	}
	  public void mshow(){
		    System.out.println("���l������O�K");
		    	  
		}
}