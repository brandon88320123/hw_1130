
public class P24 {
	public static void main(String[] args) 
	{
		Car24 car1;
		car1 = new Car24();
		
		car1.setCar(1234,20.5);
		System.out.println(car1);
	}

}
class Car24
{
	protected int num;
	protected double gas;
	
	public Car24()
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
		System.out.println("������"+num+";�𨮶q"+gas);
	}
	
	public String toString()
	{
		String str = "����"+num+"�o�q"+gas;
		return str;
	}
}

