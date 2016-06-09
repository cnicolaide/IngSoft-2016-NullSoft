package model;

public interface BeatModelInterface {
	void initialize();

	void on();

	void off();

	void setBPM(int bpm);

	int getBPM();

	void registerObserver(BeatObserver o);

	void removeObserver(BeatObserver o);

	void registerObserver(BPMObserver o);

	void removeObserver(BPMObserver o);

	void registerObserver(BulletObserver o);

	void removeObserver(BulletObserver o);

	int getPosX();

	int getPosY();

	int getFormSize();

	int getBulletSize();
}
