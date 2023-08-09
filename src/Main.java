public class Main {
    public static void main(String[] args) {

        Factory f1 = new Factory(3456, "BitCode XYZ");
        Object obj = f1.createProduct();
        System.out.println(obj);

    }
}
