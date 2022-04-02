package lab;

import lab.demand.ManageDemand;
import lab.demand.Tax;
import lab.demand.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger( Main.class.getName() );
    public static void main (String [ ] args) {
        logger.info("===INICIO====");
        Tax tax = new Tax();
        tax.addTax("PE",0.18);
        tax.addTax("BR",0.12);
        
        ManageDemand mg = new ManageDemand(tax);

        List<Order> testOrders = buildSampleOrders();
        
        double resultFirst = mg.calculateTotal(testOrders);
        logger.log(Level.INFO,"RESULTADO TOTAL 1 => {0}",resultFirst);

        Tax additional = new Tax();
        additional.addTax("CO",0.1);
        additional.addTax("PE",0.2);
        additional.addTax("BR",0.3);

        double resultSecond = mg.calculateTotalForWithAdditionalByCountry(testOrders, additional);
        logger.log(Level.INFO,"RESULTADO TOTAL 2 => {0}",resultSecond);
    }

    private static List<Order> buildSampleOrders() {
        List<Order> testOrders = new ArrayList<>();
        testOrders.add(new Order("PE", 10L));
        testOrders.add(new Order("PE", 20L));
        testOrders.add(new Order("CO", 10L));
        testOrders.add(new Order("BR", 10L));
        return testOrders;
    }

}
