package DMV_Simulator;
import java.util.Random;

public class DMV_Simulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV");
        
        //Random number generated for the DMV
        Random ran = new Random();
        int randInt = ran.nextInt(200)+1;
        int trigger = randInt + 1;

        while(trigger != randInt){
            System.out.println("Number " + trigger + "!" );
            trigger++;
            if(trigger > 200 ){
                trigger = 1;
            }
        }

        System.out.println("Sorry. You don't have the required paperwork. GET LOST!!!! SCRAM!!! MMMMWWWWAHAHAHAHHAHAHAHAHA!!!!!!!");




    }
}
