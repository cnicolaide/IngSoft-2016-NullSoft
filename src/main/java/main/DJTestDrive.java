package main;

import controller.BeatController;
import controller.ControllerInterface;
import model.BeatModel;
import model.BeatModelInterface;

public class DJTestDrive {

	public static void main(String[] args) {
		BeatModelInterface beatModel = new BeatModel();
		ControllerInterface beatController = new BeatController(beatModel);
	}
}
