public class Dog{
    private int age;
    
    public Dog(int a){
        setAge(a);
    }


    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "Age: " + getAge();
    }

    public boolean equals(Dog a){
        if (a.toString().compareTo(toString()) == 0){
            return true;
        }
        else{
            return false;
        }
    }
}