package main;

import controller.BulletController;
import controller.ControllerInterface;
import model.BulletModel;
import model.BulletModelInterface;

public class BulletTestDrive {

	public static void main(String[] args) {
		BulletModelInterface bulletModel = new BulletModel();
		ControllerInterface bulletController = new BulletController(bulletModel);
	}
}
