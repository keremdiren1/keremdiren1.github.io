public class Araba{
    private String color;
    private int speed;
    private String model;
    public Araba(String a, int b, String c){
        color = a;
        speed = b;
        model = c;
    }
    public void colorSpeedModel(){
        System.out.println("Color: " + color + " | Speed: " + speed + " | Model: " + model);
    }
    public static void main(String[] args){
        Araba car = new Araba("siyah",115,"Şahin");
        car.colorSpeedModel();
        System.out.println("Color = " + car.color + " | Speed = " + car.speed + " | Model = " + car.model);
    }
}