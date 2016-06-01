package main;

import controller.BulletController;
import controller.ControllerInterface;
import model.BulletModel;

public class BulletTestDrive {

	public static void main(String[] args) {
		BulletModel model = new BulletModel();
		ControllerInterface controller = new BulletController(model);
	}
}
