
public class P17 {
	public static void main(String[] args) 
	{
		Car17 car1[];
		car1 = new Car17[2];
		
		car1[0] = new Car17();
		car1[0].setCar(1234,20.5);
		
		
		car1[1] = new RacingCar17();
		car1[1].setCar(4567, 30.5);
		for(int i=0;i<car1.length;i++)
		{
			car1[i].show();
		}
	}

}
class Car17
{
	protected int num;
	protected double gas;
	
	public Car17()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
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

class RacingCar17 extends Car17
{
	private int course;
	
	public RacingCar17()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}

	public void setCourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]�w��"+course);
	}
	public void show()
	{
		System.out.println("�ɨ��������O"+num);
		System.out.println("��o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}