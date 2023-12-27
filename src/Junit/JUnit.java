package Junit;

import Java.Call;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class JUnit {

    @Test
    public void Test(){
        //fail("test");
        Call Auto = new Call(1,2,3);
        System.out.println("test");
        Assert.assertEquals(0,Auto.Benzin());


    }

}
