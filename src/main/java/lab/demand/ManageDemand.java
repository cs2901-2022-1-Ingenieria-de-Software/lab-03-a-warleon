package lab.demand;

import java.util.List;

public class ManageDemand {

    private Tax tax;

    public ManageDemand(Tax tax) {
        this.tax = tax;
    }

    public double calculateTotal(List<Order> orders){
        return calculateTotalForWithAdditionalByCountry(orders, tax);
    }

    public double calculateTotalForWithAdditionalByCountry(List<Order> orders, Tax additionalTaxes){
        double taxes = 0.0;
        double amount = 0.0;
        for (Order order : orders) {
            taxes += additionalTaxes.calculateTax(order.getCountry());
            amount +=order.getQuantity();
        }
        return amount*taxes;
    }

}
