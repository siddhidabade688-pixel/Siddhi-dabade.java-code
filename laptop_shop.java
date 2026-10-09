
class shop{
    String component;
    double price;
}
public class laptop_shop {
    public static void main(String[] args) {
        shop p1=new shop();
        p1.component="Laptop";
        p1.price=60000;
        shop p2=p1;
        p2.price=45000;
        System.out.println("1st laptop price: "+p1.price);
        System.out.println("2nd laptop price: "+p2.price);
    }
    
}