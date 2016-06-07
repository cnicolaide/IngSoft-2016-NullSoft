package controller;

import model.BulletAdapter;
import model.BulletModelInterface;
import view.BulletView2;
import view.DJView;

public class BulletController implements ControllerInterface {

	BulletModelInterface model;
	BulletView2 view;

	public BulletController(BulletModelInterface model) {
		this.model = model;
		view = new BulletView2(this, new BulletAdapter(model));
		view.createView();
//		view.createControls();
//		view.disableStopMenuItem();
//		view.disableStartMenuItem();
		model.initialize();
	}

	public void start() {
		model.on();
//		view.disableStartMenuItem();
//		view.enableStopMenuItem();
	}

	public void stop() {
		model.off();
//		view.disableStopMenuItem();
//		view.enableStartMenuItem();
	}

	public void increaseBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm - 10);
	}

	public void decreaseBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm + 10);
	}

	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}

}
