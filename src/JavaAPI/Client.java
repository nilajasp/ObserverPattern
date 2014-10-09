package JavaAPI;

public class Client {
    public static void main(String[] args) {
        Product product = new Product();
        Person me = new Person("Nilaja");
        Person friend = new Person("friend");
        product.registerObserver(me);
        product.registerObserver(friend);
        product.setAvailability(false);
        product.setAvailability(true);
        product.setAvailability(false);
    }
}
