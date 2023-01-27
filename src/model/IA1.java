package model;
import java.util.Random;

public class IA1 {
    private int iaPlay;
    public int ia1(int iaPlay) {
        Random random = new Random();
        this.iaPlay =  random.nextInt(7) + 1;
    }

    }
    public int getIa1(){
        return iaPlay;
    }
}
