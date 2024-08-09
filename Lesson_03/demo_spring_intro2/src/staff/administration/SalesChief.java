package staff.administration;

import staff.prodaction.Merchandiser;
import staff.prodaction.SalesManager;

public class SalesChief {
    private SalesManager salesManager;
    private Merchandiser merchandiser;

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }

    public void setMerchandiser(Merchandiser merchandiser) {
        this.merchandiser = merchandiser;
    }

    public void giveOrders(){
        merchandiser.work();
        salesManager.work();
    }



}
