package lab;

import org.testng.Assert;
import org.testng.annotations.Test;
import lab.demand.Tax;

@Test
public class TaxTest {
    Tax taxes = new Tax();
    // Add Tests !
    public void testAddCalcTax(){
        taxes.addTax("hola",0.5);
        Assert.assertEquals(taxes.calculateTax("hola"), 0.5);
        Assert.assertEquals(taxes.calculateTax(""), 0.0);
        Assert.assertEquals(taxes.calculateTax("asd"), 0.0);
    }
}
