
public class P09 {
	public static void main(String[] args) 
	{
		RacingCar9 	rccar1;
		rccar1 = new RacingCar9();
		
		rccar1.newshow();

	}

}
class car9
{
	protected int num;
	protected double gas;
	
	public car9()
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

class RacingCar9 extends car9
{
	private int course;
	
	public RacingCar9()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	public void newshow()
	{
		System.out.println("�ɨ��������O"+num);
		System.out.println("��o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}