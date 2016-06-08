package model;

public class HeartAdapter implements BeatModelInterface {
	HeartModelInterface heart;

	public HeartAdapter(HeartModelInterface heart) {
		this.heart = heart;
	}

	public void initialize() {
	}

	public void on() {
	}

	public void off() {
	}

	// public int getBPM() {
	// return heart.getHeartRate();
	// }

	public int getBPM() {
		return heart.getAttemps();
	}

	public void setBPM(int bpm) {
	}

	public void registerObserver(BeatObserver o) {
		heart.registerObserver(o);
	}

	public void removeObserver(BeatObserver o) {
		heart.removeObserver(o);
	}

	public void registerObserver(BPMObserver o) {
		heart.registerObserver(o);
	}

	public void removeObserver(BPMObserver o) {
		heart.removeObserver(o);
	}

	@Override
	public void registerObserver(BulletObserver o) {
		heart.registerObserver(o);
	}

	@Override
	public void removeObserver(BulletObserver o) {
		heart.removeObserver(o);
	}

	@Override
	public int getPosX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPosY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFormSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBulletSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}
