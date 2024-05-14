class Fighter{
    String name;
    int HealthPower, AttackPower;
    Fighter(String name,int HealthPower,int AttackPower){
        this.name=name;
        this.HealthPower=HealthPower;
        this.AttackPower=AttackPower;
    }
    public void attack(Fighter Opponent2){

        int randnum=0;
        while (true){

            System.out.println(randnum);
            if (Opponent2.HealthPower>0 && HealthPower>0){
                if (randnum==0){
                    System.out.println(Opponent2.name+" Health Power: "+Opponent2.HealthPower);
                    Opponent2.HealthPower-=30;
                    randnum=1;
                }else{
                    System.out.println(this.name+" Health Power: "+this.HealthPower);
                    this.HealthPower-=20;
                    randnum=0;
                }
            }else {
                break;
            }
        }
    }
    public boolean isAlive(){
        return this.HealthPower > 0;
    }
}
public class Fgame {
    public static void main(String[] args) {
        Fighter Opponent1=new Fighter("Rehman",100,30);
        Fighter Opponent2=new Fighter("Ali",100,20);
        Opponent1.attack(Opponent2);
        if (Opponent1.isAlive()){
            System.out.println(Opponent1.name+" Won!!!!!");
        }else {
            System.out.println(Opponent2.name+" Won!!!!!");
        }
    }
}