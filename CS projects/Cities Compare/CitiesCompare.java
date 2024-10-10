public class CitiesCompare{
    public void CompareCities(String n, String m){   //I made the type void and made the first C upper case.
        if (n.compareTo(m) < 0){
            System.out.println(n + " comes before " + m + " alphabetically");
        }
        else if (n.compareTo(m) > 0){
            System.out.println(n + " comes after " + m + " alphabetically");
        }
        else{
            System.out.println("The cities are the same");
        }
    }

    public static void main(String[] args){
        CitiesCompare city = new CitiesCompare();
        String city1 = "San Francisco";
        String city2 = "Seattle";

        city.CompareCities(city1,city2);
    }
}