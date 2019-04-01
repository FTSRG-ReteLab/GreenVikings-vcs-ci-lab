package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TrainSensorTest {
    private int testval = 5;
    @Test
    public void SelfTest() {
	Assert.assertEquals(5, testval);
    }

    /*private TrainTacho trainTacho = new TrainTacho();
    @Test
    public void TestForEmpty() {
        Assert.assertTrue(trainTacho.getData().isEmpty());
    }
    */
}

