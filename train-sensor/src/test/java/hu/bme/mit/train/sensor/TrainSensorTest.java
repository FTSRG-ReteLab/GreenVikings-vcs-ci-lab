package hu.bme.mit.train.sensor;

import hu.bme.mit.train.controller.TrainControllerImpl;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.user.TrainUserImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class TrainSensorTest {

    TrainController controller = new TrainControllerImpl();

    @Mock
    private TrainUserImpl user = new TrainUserImpl(controller);

    private int testval = 5;
    @Test
    public void SelfTest() {
	Assert.assertEquals(5, testval);
    }

    @Test
    public void setAlarmManualTest(){
        user = mock(TrainUserImpl.class);
        user.setAlarmState(true);
        Assert.assertTrue(user.getAlarmState());
    }
}

