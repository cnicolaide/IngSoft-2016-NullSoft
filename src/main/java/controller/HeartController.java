package controller;

import model.HeartAdapter;
import model.HeartModel;
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
		HeartModel.getInstance();
		view.updateBPM();
	}

	public void decreaseBPM() {
	}

	@Override
	public void setBPM(int bpm) {
	}

	@Override
	public void newView() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getBPM() {
		return 0;
	}

}
