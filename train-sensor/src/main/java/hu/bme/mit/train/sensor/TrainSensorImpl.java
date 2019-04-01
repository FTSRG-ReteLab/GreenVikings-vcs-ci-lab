package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.*;
import hu.bme.mit.train.user.TrainUserImpl;

public class TrainSensorImpl implements TrainSensor {

	private TrainController controller;
	private TrainUser user;
	private int speedLimit = 5;

	public TrainSensorImpl(TrainController controller, TrainUser user) {
		this.controller = controller;
		this.user = user;
	}

	@Override
	public int getSpeedLimit() {
		return speedLimit;
	}

	public TrainUser getUser(){
		return user;
	}

	@Override
	public void overrideSpeedLimit(int speedLimit) {
		if(speedLimit > 500 || speedLimit < 0 || speedLimit < controller.getReferenceSpeed()*0.5){
			user.setAlarmState(true);
		}

		this.speedLimit = speedLimit;
	}
	//Komment merge konflikthoz
	//Comment
}
