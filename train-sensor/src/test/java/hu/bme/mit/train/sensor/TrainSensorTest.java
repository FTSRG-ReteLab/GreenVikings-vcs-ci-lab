package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TrainSensorTest {

    TrainUser user;
    private int testval = 5;
    @Test
    public void SelfTest() {
	Assert.assertEquals(5, testval);
    }

    @Test
    public void setAlarmManualTest(){
        user = mock(TrainUserImpl.class);
        user.setAlarmState(true);
        Assert.AssertTrue(user.getAlarmState);
    }
}

