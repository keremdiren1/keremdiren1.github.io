import java.util.*;
public class UnderwaterExploration{

    int hitPoint = 30;
    int treasureNumber = 0;
    int zoneNum = 0;

    public void SunlitZone(){
        zoneNum = 1;
        String name = "Sunlit Zone";
        int depthMin = 0;
        int depthMax = 200;
        double heat = 24.0;
        String species1 = "Coral Reefs";
        String species2 = "Fish";
        int whichSpecies = (int) (Math.random() * 20);

        System.out.println("You are now entering the " + name + " (" + depthMin + "-" + depthMax + " meters).");
        System.out.println("Temperature: " + (int) heat + "°C");
        System.out.println("Main Marine Life: " + species1 + ", " + species2);

        if (whichSpecies < 1){
            System.out.println("Oh no! A Coral Reef just bit you (somehow)!! You lost 9 HP :(");
            hitPoint -= 9;
        }
        else if (whichSpecies >= 17){
            System.out.println("A Fish just gulped your finger... You lost 2 HP");
            hitPoint -= 2;
        }
        else{
            System.out.println("You found some treasure. Good for you.");
            treasureNumber += 3;
        }

        if (hitPoint < 0){
            hitPoint = 0;
        }
        System.out.println("Current Hit Points: " + hitPoint);
        System.out.println("Current Treasures Collected: " + treasureNumber);
        System.out.println();
    }

    public void TwilightZone(){
        zoneNum = 2;
        String name = "Twilight Zone";
        int depthMin = 200;
        int depthMax = 1000;
        double heat = 10.0;
        String species1 = "Jelly Fish";
        String species2 = "Squid";
        int whichSpecies = (int) (Math.random() * 20);

        System.out.println("You are now entering the " + name + " (" + depthMin + "-" + depthMax + " meters).");
        System.out.println("Temperature: " + (int) heat + "°C");
        System.out.println("Main Marine Life: " + species1 + ", " + species2);

        if (whichSpecies < 4){
            System.out.println("A Jelly Fish just poisoned you and sucked some of your flesh. You lost 8 HP");
            hitPoint -= 8;
        }
        else if (whichSpecies >= 12){
            System.out.println("A Squid just headbutted you. You lost 6 HP");
            hitPoint -= 6;
        }
        else{
            System.out.println("You found some trasure. So many of it...");
            treasureNumber += 5;
        }

        if (hitPoint < 0){
            hitPoint = 0;
        }
        System.out.println("Current Hit Points: " + hitPoint);
        System.out.println("Current Treasures Collected: " + treasureNumber);
        System.out.println();
    }

    public void MidnightZone(){
        zoneNum = 3;
        String name = "Midnight Zone";
        int depthMin = 1000;
        int depthMax = 4000;
        double heat = 4.0;
        String species1 = "Giant Squid";
        String species2 = "Angler Fish";
        int whichSpecies = (int) (Math.random() * 20);

        System.out.println("You are now entering the " + name + " (" + depthMin + "-" + depthMax + " meters).");
        System.out.println("Temperature: " + (int) heat + "°C");
        System.out.println("Main Marine Life: " + species1 + ", " + species2);

        if (whichSpecies >= 14){
            System.out.println("A Giant Squid attempted to swallow you whole. It successfully devoured some of your flesh. You lost 9 HP");
            hitPoint -= 9;
        }
        else if (whichSpecies < 2){
            System.out.println("An Angler Fish bit your left foot off. You lost 11 HP");
            hitPoint -= 11;
        }
        else{
            System.out.println("Stop stealing the sea's treasure. :(");
            treasureNumber += 8;
        }

        if (hitPoint < 0){
            hitPoint = 0;
        }
        System.out.println("Current Hit Points: " + hitPoint);
        System.out.println("Current Treasures Collected: " + treasureNumber);
        System.out.println();
    }

    public static void main(String[] args){
        boolean next = true;
        Scanner in = new Scanner(System.in);
        UnderwaterExploration zone = new UnderwaterExploration();
        int hitPoint = 30;
        int treasureNumber = 0;
        int zoneNum = 0;
        int beatNum = 0;
        System.out.println("Welcome to the Underwater Exploration.");
        System.out.println();
        System.out.println("You are currently int the Sunlit Zone (0-200 meters).");
        System.out.println("Temperature: 24°C");
        System.out.println("Main Marine Life: Coral Reefs, Fish");
        System.out.println();
        System.out.println("Do you want to move to the next zone? (yes/no):");
        if ((in.nextLine()).equals("no")){
            next = false;
        }
        System.out.println();
        
        while (zoneNum < 3 && next && hitPoint > 0){
            if (zoneNum == 0){
                zone.SunlitZone();
                treasureNumber = zone.treasureNumber;
                hitPoint = zone.hitPoint;
                if (treasureNumber < 30 * (beatNum + 1) && hitPoint > 0){
                    System.out.println("Do you want to move to the next zone? (yes/no):");
                    if ((in.nextLine()).equals("no")){
                        next = false;
                    }
                }
            }
            else if (zoneNum == 1){
                zone.TwilightZone();
                treasureNumber = zone.treasureNumber;
                hitPoint = zone.hitPoint;
                if (treasureNumber < 30 * (beatNum + 1) && hitPoint > 0){
                    System.out.println("Do you want to move to the next zone? (yes/no):");
                    if ((in.nextLine()).equals("no")){
                        next = false;
                    }
                }
            }
            else if (zoneNum == 2){
                zone.MidnightZone();
                treasureNumber = zone.treasureNumber;
                hitPoint = zone.hitPoint;
                if (treasureNumber < 30 * (beatNum + 1) && hitPoint > 0){
                    System.out.println("Do you want to continue exploring? (yes/no):");
                    if ((in.nextLine()).equals("yes")){
                        zone.zoneNum = 0;
                    }
                }
            }

            zoneNum = zone.zoneNum;
            if (treasureNumber >= 30 * (beatNum + 1)){
                System.out.println("You have enough trasure; you successfully beat the sea and got your revenge. Do you want to continue? (yes/no):");
                beatNum += 1;
                if ((in.nextLine()).equals("yes")){
                    if(zoneNum == 3){
                        zone.zoneNum = 0;
                        zoneNum = 0;
                    }
                }
                else{
                    next = false;
                }
            }
            System.out.println();
        }
        System.out.println("Final Hit Points: " + hitPoint);
        System.out.println("Total Treasure Collected: " + treasureNumber);
        if (beatNum > 0){
            System.out.println("You have beaten the sea a total of " + beatNum + " time(s)!");
        }
    }
}
