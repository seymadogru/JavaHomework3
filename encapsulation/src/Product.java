public class Product {
    public Product(){
        System.out.println("Yapıcı constructor çalıştı");
    }
    public Product(int id, String name, String description, double price, int stockAmount){
        System.out.println("Parametreli constructor ile ürün kaydı yapıldı.");
        this.id = id;
        this.price = price;
        this.name = name;
        this.description = description;
        this.stockAmount = stockAmount;
    }
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;    //read only

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
       return this.name.substring(0,1)+this.id;
    }

}
