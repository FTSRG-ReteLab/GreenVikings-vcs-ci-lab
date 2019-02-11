package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    @Before
    public void before() {
        // TODO Add initializations
    }

    @Test
    public void TestForOverrideSpeedlimit() {
        public TrainController trainController;
	public TrainUser trainUser;
	public TrainSensor trainSensor = new TrainSensor(trainController, trainUser);

	trainsSensor.overrideSpeedLimit(10);

	assertTrue(trainSensor.getSpeedLimit()==10);
    }
	


}
