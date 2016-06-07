package model;

public interface HeartModelInterface {
	int getHeartRate();

	void registerObserver(BeatObserver o);

	void removeObserver(BeatObserver o);

	void registerObserver(BPMObserver o);

	void removeObserver(BPMObserver o);

	void registerObserver(BulletObserver o);

	void removeObserver(BulletObserver o);

	int getAttemps();
}
