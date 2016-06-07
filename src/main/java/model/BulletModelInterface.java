package model;

public interface BulletModelInterface {

	void initialize();

	void on();

	void off();

	void setBPM(int bpm);

	int getBPM();

	void registerObserver(BeatObserver o);

	void registerObserver(BPMObserver o);

	void registerObserver(BulletObserver o);

	void removeObserver(BeatObserver o);

	void removeObserver(BPMObserver o);

	void removeObserver(BulletObserver o);

	int getX();

	int getY();

	int getDIR();
}
