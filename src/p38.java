public class p38 {

	public static void main(String[] args) {
		ivehicle[] ivc;
		ivc = new ivehicle[2];
		
		ivc[0] = new car38(1234,20.5);
		ivc[1] = new plane38(123);
		
		for(int i = 0; i<ivc.length ; i++) {
			ivc[i].show();
		}

	}

}

interface ivehicle{
	int weight = 1000;
	void show();
}

class car38 implements ivehicle{
	  private int num;
	  private double gas;
	  public car38(int n, double g){
	    num = n;
	    gas = g;
	    System.out.println("�Ͳ��F������"+num+"�A��o�q��"+gas+"�����l");
	  }
	  public void show(){
			System.out.println("�����O"+num);
			System.out.println("��o�q�O"+gas);
	    
	  }
	}

class plane38 implements ivehicle{
	  private int flight;
	  public plane38(int f){
	    flight = f;
	    System.out.println("�Ͳ��F" + flight + "�Z��������");
	  }
	  public void show(){
		    System.out.println("�������Z���O"+ flight);
	    
	  }
	}