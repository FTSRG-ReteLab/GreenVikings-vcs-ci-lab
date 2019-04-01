package hu.bme.mit.train.user;

import hu.bme.mit.train.interfaces.*;

public class TrainUserImpl implements TrainUser {

	private boolean alarmState;
	private TrainController controller;
	private int joystickPosition;

	public TrainUserImpl(TrainController controller) {
		this.controller = controller;
		alarmState = false;
	}

	@Override
	public boolean getAlarmState(){
		return alarmState;
	}

	@Override
	public void setAlarmState(boolean aS){
		alarmState = aS;
	}

	@Override
	public boolean getAlarmFlag() {
		return false;
	}

	@Override
	public int getJoystickPosition() {
		return joystickPosition;
	}

	@Override
	public void overrideJoystickPosition(int joystickPosition) {
		this.joystickPosition = joystickPosition;
		controller.setJoystickPosition(joystickPosition);

	}

}
