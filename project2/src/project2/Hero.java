package project2;

public class Hero {
	String name;
	float hp;
	float armor;
	int movespeed;
	void keng(){
		System.out.println("©с╤сся!");	
	}
	float getArmor(){
		return armor;
	}
	void addSpeed(int speed){
		movespeed = movespeed + speed;
	}
	void legendary(){
		System.out.println("Legendary!");
	}
	float getHp(){
		return hp;
	}
	void recovery(float blood){
		hp = getHp() + blood;
	}
	

}
