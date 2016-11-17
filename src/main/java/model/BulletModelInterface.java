package model;

public interface BulletModelInterface {

	void initialize();

	void on();

	void off();

	void setBPM(int bpm);

	int getBPM();

	int getDir();

	void registerObserver(BeatObserver o);

	void registerObserver(BPMObserver o);

	void registerObserver(BulletObserver o);

	void removeObserver(BeatObserver o);

	void removeObserver(BPMObserver o);

	void removeObserver(BulletObserver o);

	int getX();

	int getY();

	int getFormSize();

	int getBulletSize();

	void setDir(int dir);

	void setX(int x);

	void setY(int y);

	int getRectHeightLimit();

	int getRectWidthLimit();
}
