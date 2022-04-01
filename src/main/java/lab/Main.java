package lab;

import lab.demand.ManageDemand;
import lab.demand.Tax;
import lab.demand.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String [ ] args) {
        System.out.println("===INICIO====");
        Tax tax = new Tax();
        tax.addTax("PE",0.18);
        tax.addTax("BR",0.12);
        
        ManageDemand mg = new ManageDemand(tax);

        List<Order> testOrders = buildSampleOrders();
        
        double resultFirst = mg.calculateTotal(testOrders);
        System.out.println(String.format("RESULTADO TOTAL 1 => %s", resultFirst));

        Tax additional = new Tax();
        additional.addTax("CO",0.1);
        additional.addTax("PE",0.2);
        additional.addTax("BR",0.3);

        double resultSecond = mg.calculateTotalForWithAdditionalByCountry(testOrders, additional);
        System.out.println(String.format("RESULTADO TOTAL 2 => %s", resultSecond));
    }

    private static List<Order> buildSampleOrders() {
        List<Order> testOrders = new ArrayList<Order>();
        testOrders.add(new Order("PE", 10L));
        testOrders.add(new Order("PE", 20L));
        testOrders.add(new Order("CO", 10L));
        testOrders.add(new Order("BR", 10L));
        return testOrders;
    }

}
