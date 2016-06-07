package controller;

import model.BulletAdapter;
import model.BulletModelInterface;
import view.DJView;

public class BulletController implements ControllerInterface {
	
	BulletModelInterface model;
	DJView view;

	public BulletController(BulletModelInterface model) {
		this.model = model;
		view = new DJView(this, new BulletAdapter(model));
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.enableStartMenuItem();
		model.initialize();
	}


	@Override
	public void start() {
		// TODO Auto-generated method stub
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}

	@Override
	public void increaseBPM() {
		view.updateBPM();
	}

	@Override
	public void decreaseBPM() {
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
	}

}
