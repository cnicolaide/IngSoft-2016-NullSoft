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

	public void registerObserver(BulletObserver o) {
		heart.registerObserver(o);
	}

	public void removeObserver(BulletObserver o) {
		heart.removeObserver(o);
	}

	public int getPosX() {
		return 0;
	}

	public int getPosY() {
		return 0;
	}

	public int getFormSize() {
		return 0;
	}

	public int getBulletSize() {
		return 0;
	}
}
