public class Cities{
    private String name;
    private int population;

    public Cities(String n, int p){
        name = n;
        population = p;
    }

    public int compareToByPopulation(int p){
        return population - p;
    }

    public String compareToByName(String n){
        if (name.compareTo(n) < 0){
            return "before";
        }
        else if (name.compareTo(n) > 0){
            return "after";
        }
        else{
            return "same";
        }
    }

    public static void main(String[] args){
        Cities city1 = new Cities("New York", 8419000);
        Cities city2 = new Cities("Los Angeles", 3980000);
        Cities city3 = new Cities("Chicago", 2716000);

        System.out.println("Comparing by name:");
        if (city1.compareToByName(city2.name).equals("same")){
            System.out.println(city1.name + " is at the same place as " + city2.name);
        }
        else{
            System.out.println(city1.name + " comes " + city1.compareToByName(city2.name) + " " + city2.name);
        }
        System.out.println("Comparing by population:");
        if (city1.compareToByPopulation(city2.population) > 0){
            System.out.println(city1.name + " has " + city1.compareToByPopulation(city2.population) + " more population than " + city2.name);
        }
        else if (city1.compareToByPopulation(city2.population) < 0){
            System.out.println(city1.name + " has " + Math.abs(city1.compareToByPopulation(city2.population)) + " less population than " + city2.name);
        }
        else{
            System.out.println(city1.name + " has the same amount of population as " + city2.name);
        }
        System.out.println();

        System.out.println("Comparing by name:");
        if (city1.compareToByName(city3.name).equals("same")){
            System.out.println(city1.name + " is at the same place as " + city3.name);
        }
        else{
            System.out.println(city1.name + " comes " + city1.compareToByName(city3.name) + " " + city3.name);
        }
        System.out.println("Comparing by population:");
        if (city1.compareToByPopulation(city3.population) > 0){
            System.out.println(city1.name + " has " + city1.compareToByPopulation(city3.population) + " more population than " + city3.name);
        }
        else if (city1.compareToByPopulation(city3.population) < 0){
            System.out.println(city1.name + " has " + Math.abs(city1.compareToByPopulation(city3.population)) + " less population than " + city3.name);
        }
        else{
            System.out.println(city1.name + " has the same amount of population as " + city3.name);
        }
        System.out.println();

        System.out.println("Comparing by name:");
        if (city3.compareToByName(city2.name).equals("same")){
            System.out.println(city3.name + " is at the same place as " + city2.name);
        }
        else{
            System.out.println(city3.name + " comes " + city3.compareToByName(city2.name) + " " + city2.name);
        }
        System.out.println("Comparing by population:");
        if (city3.compareToByPopulation(city2.population) > 0){
            System.out.println(city3.name + " has " + city3.compareToByPopulation(city2.population) + " more population than " + city2.name);
        }
        else if (city3.compareToByPopulation(city2.population) < 0){
            System.out.println(city3.name + " has " + Math.abs(city3.compareToByPopulation(city2.population)) + " less population than " + city2.name);
        }
        else{
            System.out.println(city3.name + " has the same amount of population as " + city2.name);
        }
    }
}