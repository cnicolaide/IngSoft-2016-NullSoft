package main;

import controller.BulletController;
import controller.ControllerInterface;
import model.BulletModel;

public class BulletTestDrive {

	public static void main(String[] args) {
		BulletModel bulletModel = new BulletModel();
		ControllerInterface model = new BulletController(bulletModel);
	}
}
