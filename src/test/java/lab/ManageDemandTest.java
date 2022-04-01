package lab;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lab.demand.ManageDemand;
import lab.demand.Tax;
import lab.util.TestUtil;
import lab.demand.Order;

import java.util.List;

@Test
public class ManageDemandTest {

    private Tax tax;

    private ManageDemand demand;

    @BeforeClass
    public void setup() {
        tax = new Tax();
        tax.addTax("PE",0.18);
        tax.addTax("CO",0.1);
        demand =  new ManageDemand(tax);
    }
    
    public void test_AllOrdersFromPeru() {
        List<Order> ordersFromPeru = TestUtil.buildOrdersPeru();
        double result = demand.calculateTotal(ordersFromPeru);
        Assert.assertEquals(Math.round(result), 7.0);
    }

    // Add Tests !!
    public void test_AllOrdersFromColombia() {
        double result = demand.calculateTotal(TestUtil.buildOrdersColombia());
        Assert.assertEquals(Math.round(result), 4.0);
    }
    public void test_AllOrdersFromOtherCountries() {
        double result = demand.calculateTotal(TestUtil.buildOrdersOtherCountries());
        Assert.assertEquals(Math.round(result), 0.0);}
}
