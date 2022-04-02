package lab.demand;
import java.util.*;


public class Tax {
    HashMap<String,Double> taxes=new HashMap<>();
    public double calculateTax(String country) {
        return taxes.getOrDefault(country,0.0);
    }
    public void addTax(String country,Double tax){
        taxes.put(country,tax);
    }
}
