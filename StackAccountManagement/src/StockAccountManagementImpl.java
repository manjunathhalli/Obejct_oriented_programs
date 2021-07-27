public class StockAccountManagementImpl {
import java.util.LinkedList;

    implements StockAccountManagement{

        LinkedList<Stocks> sharesList = new LinkedList<Stocks>();

        //method to Add Stocks
        @Override
        public void addStocks(Stocks share) {
            if (sharesList.contains(share)) {
                System.err.println("Inventory Item Exists");
            }
            else {
                sharesList.add(share);
            }
}
