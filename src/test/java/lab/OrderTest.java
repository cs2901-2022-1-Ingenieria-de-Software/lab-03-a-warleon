package lab;

import lab.demand.Order;
import org.testng.annotations.Test;

@Test
public class OrderTest {
    public void test_Order(){
        Order order = new Order("",2L);
        order.setCountry("PE");
        order.setQuantity(5L);
    }
}
