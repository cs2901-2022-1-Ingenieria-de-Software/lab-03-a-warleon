package lab;

import org.testng.annotations.Test;

@Test
public class MainTest {

    public void test_Main(){
        Main main = new Main();
        String args[]={};
        Main.main(args);
    }
}
