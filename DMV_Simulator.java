package DMV_Simulator;

public class DMV_Simulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV");
        
        //Random number generated for the DMV
        double ran =  Math.random();
        double randInt = ran * 100;
        int randNum = (int)randInt + 1;
        int trigger = randNum + 1;

        while(trigger != randNum){
            System.out.println("Number " + trigger + "!" );
            trigger++;
            if(trigger > 100 ){
                trigger = 1;
            }
        }

        System.out.println("Sorry. You don't have the required paperwork. GET LOST!!!! SCRAM!!!");




    }
}
