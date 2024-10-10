public class SmartDoor{
    private boolean locked;
    private int peopleInside;

    public SmartDoor(boolean b, int i){
        locked = b;
        peopleInside = i;
    }

    public boolean isSafeToEnter(){
        if (locked == false && peopleInside < 5){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        SmartDoor door1 = new SmartDoor(false, 4);
        SmartDoor door2 = new SmartDoor(true, 0);
        SmartDoor door3 = new SmartDoor(false, 6);

        System.out.println(door1.isSafeToEnter());
        System.out.println(door2.isSafeToEnter());
        System.out.println(door3.isSafeToEnter());
    }
}