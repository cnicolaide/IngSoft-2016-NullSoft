package main;

import controller.ControllerInterface;
import controller.HeartController;
import model.HeartModel;

public class HeartTestDrive {

	public static void main(String[] args) {
		HeartModel heartModel = HeartModel.getInstance();
		ControllerInterface heartController = new HeartController(heartModel);
	}
}
