public class Main {
    public static void main(String[] args){
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setPrice(15205);
        product.setDescription("Asus");
        product.setStockAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println("Ürünün kodu; "+product.getKod());

        Product product1 = new Product(1,"laptop", "asus", 154854,8);

    }
}
