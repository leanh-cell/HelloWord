public class Product {
    String Name;
    Float Price;
    int ID;
    int Qty;

    public Product (String name,Float price,int id,int qty){
        Name =name ;
        Price=price;
        ID=id;
        Qty=qty;
    }
    public String getName()
    {
        return Name;
    }
    public Float getPrice()
    {
        return Price;
    }
    public int getID()
    {
        return ID;
    }
    public int getQty()
    {
        return Qty;
    }

    public static void main(String[] args) {
        Product s1 = new Product("ao", 100F,1,10);
        System.out.println("Name: " + s1.getName());
        System.out.println("Price: "+s1.getPrice());
        System.out.println("Id: " + s1.getID());
        System.out.println("Qty: " + s1.getQty());
    }
}
