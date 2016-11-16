package com.jbehave.test.steps;

import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;
import model.BulletModel;
import model.BulletModelInterface;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import controller.BulletController;
import controller.ControllerInterface;

public class BulletMoveSteps {
	BulletModelInterface bulletModel = new BulletModel();
	ControllerInterface bulletController = new BulletController(bulletModel);
	private CountDownLatch lock = new CountDownLatch(1);

	int position_x;
	int position_y;
	int position_x2;
	int position_y2;
	public BulletMoveSteps() {
		bulletController.start();
	}

	@Given("The bullet direction is $direction")
	public void setBullet(int direction) {
		bulletController.setBPM(300);
		bulletModel.setDir(direction);
		bulletModel.setX(50);
		bulletModel.setY(50);
		System.out.println("The bullet direction is: " + bulletModel.getDir());
		position_x=bulletModel.getX();
		position_y=bulletModel.getY();
	}

	@When("the bullet moves")
	public void moveBullet() {
		try {
			lock.await(500, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		position_x2 = bulletModel.getX();
		position_y2 = bulletModel.getY();
	}

	@Then("the bullet should move in direction $direction")
	public void assertMove(int direction) {
		int dir = 0;
		switch (direction){
		case 1:
		/*	
		  	System.out.println("The bullet x position is: " + position_x);
			System.out.println("The bullet x2 position is: " + position_x2);
			System.out.println("The bullet y position is: " + position_y);
			System.out.println("The bullet y2 position is: " + position_y2);
		*/
			Assert.assertTrue(position_x > position_x2);
			Assert.assertTrue(position_y > position_y2);
			dir = 1;
			break;
		case 2:
		/*
			System.out.println("The bullet x position is: " + position_x);
			System.out.println("The bullet x2 position is: " + position_x2);
			System.out.println("The bullet y position is: " + position_y);
			System.out.println("The bullet y2 position is: " + position_y2);
		*/
			Assert.assertTrue(position_x < position_x2);
			Assert.assertTrue(position_y > position_y2);
			dir = 2;
			break;
		case 3:
		/*
			System.out.println("The bullet x position is: " + position_x);
			System.out.println("The bullet x2 position is: " + position_x2);
			System.out.println("The bullet y position is: " + position_y);
			System.out.println("The bullet y2 position is: " + position_y2);
		*/
			Assert.assertTrue(position_x < position_x2);
			Assert.assertTrue(position_y < position_y2);
			dir = 3;
			break;
		case 4:
		/*
			System.out.println("The bullet x position is: " + position_x);
			System.out.println("The bullet x2 position is: " + position_x2);
			System.out.println("The bullet y position is: " + position_y);
			System.out.println("The bullet y2 position is: " + position_y2);
		*/
			Assert.assertTrue(position_x > position_x2);
			Assert.assertTrue(position_y < position_y2);
			dir = 4;
			break;
		}
		//System.out.println("direction: " + direction + " dir: " + dir);
		Assert.assertTrue(direction == dir);
	}

}