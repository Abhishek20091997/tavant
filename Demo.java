package day3;

class Fan{
	int speed=0;
	boolean isOn =  true;
	 void changeSpeed(int newSpeed) {
		 if(newSpeed>=1&&newSpeed<=5) {
		 speed = newSpeed;
		 System.out.println("The speed of fan after changing is:"+speed);
		 }
		 else
			 System.out.print("Speed out of range");
	 }
	 void SwitchOn() {
		 if(isOn==false) {
			 isOn=true;
			 System.out.println("Fan was turned on");

		 }
		 else
			 System.out.println("the fan is already switched on");
	 }
	 void SwitchOff() {
		 if(isOn==true) {
			 isOn=false;
			 System.out.println("Fan was turned off");

		 }
		 else
			 System.out.println("the fan is already switched off");
	 }
}


class IronBox{
	int temp = 0;
	boolean steamOut=true;
	boolean power=false;
	
	void powerOn() {
		if(power==false) {
			power=true;
			System.out.println("Iron is connected to power supply");
		}
		else
			System.out.println("Power supply is already connected");
	}
	
	void setTemp(int newTemp) {
		if(newTemp>=0&&newTemp<=45) {
			temp=newTemp;
			System.out.println("Temperature successfully changed to:"+temp);
	}
		else
			System.out.println("Temperature cannot be considered");
		}
	
	void steam() {
		if(steamOut!=true) {
			steamOut=true;
			System.out.println("Steam has been emitted out");
		}
		else
			System.out.println("Steam is already our now");
	}
}
 class Demo{
	 public static void main(String s[])
	 {
	 Fan f1 =new Fan();
	 Fan f2=new Fan();
	 f1.changeSpeed(4);
	 f1.SwitchOn();
	 f1.SwitchOff();
	 f2.changeSpeed(3);
	 f2.isOn=false;
	 f2.SwitchOff();
	 f2.SwitchOn();
	 
	 IronBox i1=new IronBox();
	 IronBox i2=new IronBox();
	 System.out.println("For first ironbox");
	 i1.powerOn();
	 i1.setTemp(44);
	 i1.steam();
	 System.out.println("For second ironbox");
     i2.power=false;
     i2.powerOn();
     i2.setTemp(100);
     i2.steamOut=false;
     i2.steam();
	 }
 }
