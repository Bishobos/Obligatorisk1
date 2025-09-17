package library;



public class LoanItemsTest {
    public static void main(String[] args){
        mainWrapper();
    }

    public static void mainWrapper(){
        InventoryHelper helper = new InventoryHelper();
        LoanItems[] items = helper.makeInventory();
        helper.showInventory(items);
    }
}
