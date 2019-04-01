package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.*;

import hu.bme.mit.*;
import hu.bme.mit.train.user.TrainUserImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class TrainSensorTest {

    TrainController controller;
    TrainUser user;

    private int testval = 5;
    @Test
    public void SelfTest() {
	Assert.assertEquals(5, testval);
    }

    @Test
    public void setAlarmManualTest(){
        user = mock(TrainUserImpl.class);
        Assert.assertFalse(user.getAlarmState());
    }

    @Test
    public void lessThan0SpeedLimitTest(){
        user = mock(TrainUserImpl.class);
        controller = mock(TrainController.class);
        TrainSensorImpl ts = new TrainSensorImpl(controller, user);
        ts.overrideSpeedLimit(-1);
        verify(user, times(1)).setAlarmState(true);
    }

    @Test
    public void moreThan500SpeedLimitTest(){
        user = mock(TrainUserImpl.class);
        controller = mock(TrainController.class);
        TrainSensorImpl ts = new TrainSensorImpl(controller, user);
        ts.overrideSpeedLimit(501);
        verify(user, times(1)).setAlarmState(true);
    }

    @Test
    public void lessThanhalfSpeedLimitTest(){
        user = mock(TrainUserImpl.class);
        controller = mock(TrainController.class);
        TrainSensorImpl ts = new TrainSensorImpl(controller, user);
        when(controller.getReferenceSpeed()).thenReturn(100);
        ts.overrideSpeedLimit(49);
        verify(controller, times(1)).getReferenceSpeed();
        verify(user, times(1)).setAlarmState(true);
    }
}

