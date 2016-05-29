package controller;

import model.HeartAdapter;
import model.HeartModelInterface;
import view.DJView;

public class HeartController implements ControllerInterface {
	HeartModelInterface model;
	DJView view;

	public HeartController(HeartModelInterface model) {
		this.model = model;
		view = new DJView(this, new HeartAdapter(model));
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}

	public void start() {
	}

	public void stop() {
	}

	public void increaseBPM() {
		System.out.println("HOLAAA" + model.getAttemps());
	}

	public void decreaseBPM() {
	}

	public void setBPM(int bpm) {
	}
}
