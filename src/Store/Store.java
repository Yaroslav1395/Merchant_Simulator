package Store;


import Products.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
    private List<Product> products = new ArrayList<>();
    private int loadCapacity = 2000;

    public Store() {
        fillStoreByProducts();
    }

    //------------------������ � ������-------------------------------------


    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    //----------------���������� �������� �������----------------------------
    private  List<Product> makeProductArray(){
        Products productsList = new Products();
        return productsList.getProducts();
    }

    private Product returnOneProduct(){
        List<Product> productList = makeProductArray();
        Random random = new Random();
        Product randomProduct = productList.get(random.nextInt(5));
        return  new Product(
                randomProduct.getName(),
                randomProduct.getWeight(),
                randomProduct.getQuality(),
                randomProduct.getPrice());
    }
    private void fillStoreByProducts(){
        int addCount = -1;
        boolean isFull = false;
        while (!isFull){
            addCount += 1;
            this.products.add(returnOneProduct());
            if((this.loadCapacity - this.products.get(addCount).getWeight()) <= 0){
                this.products.remove(addCount);
                isFull = true;
            }
            else {
                this.loadCapacity -= this.products.get(addCount).getWeight();
            }
        }
    }
    //----------------������ ������ ��������� --------------------------------
    public void printProductInStore(){
        int moneyInProduct = 0;
        for (Product product: this.products) {
            System.out.println(product);
            moneyInProduct += product.getPrice();
        }
        System.out.println("����� � ������: " + moneyInProduct);
        System.out.println("��������� ����� �� ������: " + this.loadCapacity);
    }
    //------------------�������� �������� �� ������----------------------------
    public void removeProduct(Product product){
        this.products.remove(product);
    }
}
