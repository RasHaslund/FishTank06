import java.time.LocalDateTime;
import java.util.Scanner;
public class FishTank06 {

    // TODO: Akvariet skal have
    //Sådan. Det virker. Go gruppe 06
    private String lastWaterChange;
    private String waterQuality;

    public FishTank06(String lastWaterChange, String waterQuality){
        this.lastWaterChange = lastWaterChange;
        this.waterQuality = waterQuality;
    }
    public enum waterQuality{
        perfekt, godt, okay, dårlig
    }

    public void changeWater(Scanner scanner){
        lastWaterChange = LocalDateTime.now().toString();
        System.out.println(lastWaterChange + "enter comment:");
        String comment = scanner.nextLine();
    }


    //TODO: en veil fisk h

}


