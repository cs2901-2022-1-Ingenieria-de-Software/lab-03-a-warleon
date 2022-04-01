package lab.demand;
import java.util.*;


public class Tax {
    HashMap<String,Double> taxes=new HashMap<>();
    public double calculateTax(String country) {
        Double tax= taxes.get(country);
        if(tax==null)return 0.0;
        return tax;
    }
    public void addTax(String country,Double tax){
        taxes.put(country,tax);
    }
}
