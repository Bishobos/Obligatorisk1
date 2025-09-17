package library;



public class LoanItemsTest {
    public static void main(String[] args){
        InventoryHelper helper = new InventoryHelper();
        LoanItems[] items = helper.makeInventory();
        helper.showInventory(items);
    }
}
