import java.util.Random;

public class Factory {
    private int reg;
    private String name;

    public Factory(int reg, String name) {
        this.reg = reg;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "reg=" + reg +
                ", name='" + name + '\'' +
                '}';
    }

    public Object createProduct() {

        final int code = 9090;

        class Product {
            public int srNo;
            public String title;

            public void display() {
                System.out.println("srno = " + srNo + " title = " + title + " code = " + code);
            }

            @Override
            public String toString() {
                return "Product{" +
                        "srNo=" + srNo +
                        ", title='" + title + '\'' +
                        '}';
            }
        }

        Product newProduct = new Product();
        newProduct.srNo = Math.abs( new Random().nextInt() );
        newProduct.title = "XYZ Product";

        newProduct.display();
        System.out.println("---------------------------------");

        return newProduct;
    }



}

