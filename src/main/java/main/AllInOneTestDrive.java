package main;

import controller.BeatController;
import controller.BulletController;
import controller.ControllerInterface;
import controller.HeartController;
import model.BeatModel;
import model.BeatModelInterface;
import model.BulletModel;
import model.HeartModel;

public class AllInOneTestDrive {

	public static void main(String[] args) {
		BulletModel bulletModel = new BulletModel();
		ControllerInterface bulletController = new BulletController(bulletModel);

		BeatModelInterface beatModel = new BeatModel();
		ControllerInterface beatController = new BeatController(beatModel);

		HeartModel heartModel = HeartModel.getInstance();
		ControllerInterface heartController = new HeartController(heartModel);
	}
}
