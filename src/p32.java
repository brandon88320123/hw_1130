
public class p32 {

	public static void main(String[] args) {
		vehicle[] vc;
		vc = new vehicle[2];
		
		vc[0] = new car2(1234,20.5);
		vc[1] = new Plane(123);
		
		for(int i=0; i<vc.length; i++) {
			if(vc[i] instanceof car2) {
				System.out.println("��" + (i+1) + "�Ӫ���OCar���O");
			}else {
				System.out.println("��" + (i+1) + "�Ӫ��󤣬OCar���O");
			}
		}

	}

}
