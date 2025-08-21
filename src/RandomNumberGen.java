import java.util.Random;

public class RandomNumberGen {
    public static void main(String[] args){

        Random random = new Random();

        boolean isHEADS;


        isHEADS = random.nextBoolean();

        if(isHEADS){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
