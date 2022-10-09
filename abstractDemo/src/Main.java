public class Main {
    public static void main(String[] args){
        CustomerManager customerManager = new CustomerManager();
        //Şimdi design pattern'lardan strategy patternini kullanacağız. strateji belirleyeceğiz.
        customerManager.databaseManager = new MySqlDatabaseManager(); //Burada hangi veritabanını istiyorsak onu verebiliriz.
        customerManager.getCustomers();
    }
}
