import java.util.Random;
public class diceTwenty {
    Random rand = new Random ( );
    int rollOnce = rand.nextInt(20) + 1;
}
public class attackRoll{
    public static void main(Stringp[]args){
        diceTwenty rollOnce = new diceTwenty( );
int greataxeMod = 7;
    int strengthMod = 4;
    int attackRoll = rollOnce + greataxeMod + strengthMod;
    System.out.println("Kansif's attack roll was a " + attackRoll);
    }
}