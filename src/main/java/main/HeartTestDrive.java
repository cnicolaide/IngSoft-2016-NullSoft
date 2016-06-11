package main;

import controller.ControllerInterface;
import controller.HeartController;
import model.HeartModel;
import model.HeartModelInterface;

public class HeartTestDrive {

	public static void main(String[] args) {
		HeartModelInterface heartModel = HeartModel.getInstance();
		ControllerInterface heartController = new HeartController(heartModel);
	}
}
