
public class P06 {
	public static void main(String[] args) 
	{
		RacingCar6 	rccar1 = new RacingCar6(1234,20.5,5);

	}

}
class car6
{
	private int num;
	private double gas;
	
	public car6()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public car6(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������"+num+"�A��o�q��"+gas+"�����l");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A��o�q�]��"+gas);
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("��o�q�O"+gas);
	}
}

class RacingCar6 extends car6
{
	private int course;
	
	public RacingCar6()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar6(int n,double g,int c)
	{
		super(n,g);
		course = c;
		System.out.println("�Ͳ��F�s����"+course + "���ɨ�");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]�w��"+course);
	}
}