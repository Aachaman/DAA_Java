import java.util.Random;

public class Diceroller {
    
    Random random;
    int num =0;
    Diceroller(){
        random = new Random();
        roll();
    }

    void roll(){
        num = random.nextInt(6)+1;
        System.out.println(num);
    }
}
