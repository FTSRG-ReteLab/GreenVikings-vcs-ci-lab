package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

class TrainTachoTest {
    private TrainTacho trainTacho;
    @Test
    public void TestForEmpty() {
        Assert.assertTrue(trainTacho.getData().isEmpty());
    }
	

}