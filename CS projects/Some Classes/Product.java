public class Product{
    private String name;
    private double basePrice;
    private int quantity;

    public Product(String s, double bP, int q){
        name = n;
        basePrice = bP;
        quantity = q;
    }


    public void discount(int amount){
        if (amount >= quantity){
            basePrice *= 0.9
        }
    }
}