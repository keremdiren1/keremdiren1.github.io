public class Planet{

    private String name;
    private double sunKm;
    private int diameter;
    private int moonNum;

    public Planet(String n, double sK, int d, int mN){
        name = n;
        sunKm = sK;
        diameter = d;
        moonNum = mN;
    }

    public void TravelTime(String p, double a){
        System.out.println("Travel time from " + name + " to " + p + ": " + Math.abs(a-sunKm)/0.05);
    }

    public void PInfo(){
        System.out.println("Planet: " + name);
        System.out.println("Distance from the Sun: " + sunKm + " million kilometers");
        System.out.println("Diameter: " + diameter + " km");
        System.out.println("Number of Moons: " + moonNum);
    }


    public static void main(String[] args){
        Planet earth = new Planet("Earth",149.6,12742,1);
        Planet mars = new Planet("Mars",227.9,6779,2);
        Planet jupiter = new Planet("Jupiter",778.5,139820,79);

        earth.PInfo();
        System.out.println();
        earth.TravelTime(jupiter.name,jupiter.sunKm);
        System.out.println();

        mars.PInfo();
        System.out.println();
        mars.TravelTime(earth.name,earth.sunKm);
        System.out.println();

        jupiter.PInfo();
        System.out.println();
        jupiter.TravelTime(mars.name,mars.sunKm);
    }
}