
public class p26 {

	public static void main(String[] args) {
		car26[] cars;
		cars = new car26[2];
		cars[0] = new car26();
		cars[1] = new RacingCar26();
		
		for(int i = 0;i<cars.length;i++) {
			Class cl = cars[i].getClass();
			System.out.println("��" + (i+1) + "�Ӫ������O�O" + cl);
		}

	}

}
class car26{
	protected int num;
	protected double gas;
	
	public car26() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
}

class RacingCar26 extends car26{
	public RacingCar26() {
		System.out.println("�Ͳ��F�ɨ�");
	}
}