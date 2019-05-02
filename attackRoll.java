

public class attackRoll{
    public static void main(String[]args){
        int rollOnce = (int) (Math.random() * 20) + 1;
int greataxeMod = 7;
    int strengthMod = 4;
    int attackRoll = rollOnce + greataxeMod + strengthMod;
    System.out.println("Kansif's attack roll was a " + attackRoll);
    }
}