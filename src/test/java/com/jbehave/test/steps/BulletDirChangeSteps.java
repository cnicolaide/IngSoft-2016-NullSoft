package com.jbehave.test.steps;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import controller.BulletController;
import controller.ControllerInterface;
import model.BulletModel;
import model.BulletModelInterface;

public class BulletDirChangeSteps {
	BulletModelInterface bulletModel = new BulletModel();
	ControllerInterface bulletController = new BulletController(bulletModel);
	private CountDownLatch lock = new CountDownLatch(1);

	int position_x;
	int position_y;
	int position_x2;
	int position_y2;
	int previous_direction = 0;
	int new_direction = 0;

	public BulletDirChangeSteps() {
		bulletController.start();
	}

	@Given("The direction of the bullet $direction")
	public void setBullet(int direction) {
		bulletController.setBPM(300);
		bulletModel.setDir(direction);
		previous_direction = direction;
		// position_x=bulletModel.getX();
		// position_y=bulletModel.getY();
	}

	@When("the bullet strikes $side")
	public void moveBullet(String side) {
		switch (side) {
		case "left":
			bulletModel.setX(1);
			bulletModel.setY(50);
			// System.out.println("The bullet x position is: " +
			// bulletModel.getX());
			// System.out.println("The bullet x2 position is: " +
			// bulletModel.getY());
			if (previous_direction == 1)
				new_direction = 2;
			else
				new_direction = 3;
			break;
		case "bottom":
			bulletModel.setX(50);
			bulletModel.setY(1);
			// System.out.println("The bullet x position is: " +
			// bulletModel.getX());
			// System.out.println("The bullet x2 position is: " +
			// bulletModel.getY());
			if (previous_direction == 1)
				new_direction = 4;
			else
				new_direction = 3;
			break;

		case "right":
			bulletModel.setX(bulletModel.getRectWidthLimit() - 1);
			bulletModel.setY(50);
			// System.out.println("The bullet x position is: " +
			// bulletModel.getX());
			// System.out.println("The bullet x2 position is: " +
			// bulletModel.getY());
			if (previous_direction == 2)
				new_direction = 1;
			else
				new_direction = 4;
			break;
		case "top":
			bulletModel.setX(50);
			bulletModel.setY(bulletModel.getRectHeightLimit() - 1);
			// System.out.println("The bullet x position is: " +
			// bulletModel.getX());
			// System.out.println("The bullet x2 position is: " +
			// bulletModel.getY());
			if (previous_direction == 3)
				new_direction = 2;
			else
				new_direction = 1;
			break;
		}

		try {
			lock.await(500, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println("The bullet new direction is: " +
		// bulletModel.getDir());
	}

	@Then("the direction should change to $newdirection")
	public void assertMove(int newdirection) {
		// System.out.println("The bullet previous direction is: " +
		// previous_direction);
		// System.out.println("The bullet new direction is: " + new_direction);
		Assert.assertTrue(newdirection == new_direction);
	}

}