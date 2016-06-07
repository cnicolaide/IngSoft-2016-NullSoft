package model;

public interface BulletModelInterface {

	void initialize();

	void on();

	void off();

	void setBPM(int bpm);

	void registerObserver(BeatObserver o);

	void removeObserver(BeatObserver o);

	void registerObserver(BPMObserver o);

	void removeObserver(BPMObserver o);

	void registerObserver(BulletObserver o);

	void removeObserver(BulletObserver o);

	String getType();

	int getX();
}
