class p29 {
  public static void main(String[] args) {
    vehicle[] vc  = new vehicle[2];
    vc[0] = new car2(1234,20.5);
    vc[0].setSpeed(60);
    vc[1] = new Plane(123);
    vc[1].setSpeed(500);

    for(int i = 0; i<vc.length ; i++){
      vc[i].show();
    }
  }
}
abstract class vehicle{
  protected int speed;
  public void setSpeed(int s){
    speed = s;
    System.out.println("�N�t�׳]��" + speed + "�F");
  }
  abstract void show();
}
class car2 extends vehicle{
  private int num;
  private double gas;
  public car2(int n, double g){
    num = n;
    gas = g;
    System.out.println("�Ͳ��F������"+num+"�A��o�q��"+gas+"�����l");
  }
  public void show(){
    System.out.println("�����O" + num);
    System.out.println("�T�o�q�O" + gas);
    System.out.println("�t�׬O" + speed);
  }
}

class Plane extends vehicle{
  private int flight;
  public Plane(int f){
    flight = f;
    System.out.println("�Ͳ��F" + flight + "�Z��������");
  }
  public void show(){
    System.out.println("�������Z���O"+ flight);
    System.out.println("�t�׬O" + speed);
  }
}