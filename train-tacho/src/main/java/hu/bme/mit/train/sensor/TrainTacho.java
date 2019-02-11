package hu.bme.mit.train.sensor;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainUser;

import java.util.Date;

public class TrainTacho{
	TrainController tc;
	TrainUser tu;

	private Table<Date, Integer, Integer> data = HashBasedTable.create();

	public void saveData(int position){
		data.put(new Date(), tc.getReferenceSpeed(), tu.getJoystickPosition());
			
	}

}