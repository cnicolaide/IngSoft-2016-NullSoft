package unitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import controller.BulletController;
import controller.ControllerInterface;
import model.BulletModel;
import model.BulletModelInterface;

public class TestsBullet {

	BulletModelInterface bulletModel = new BulletModel();
	ControllerInterface bulletController = new BulletController(bulletModel);

	private long start;

	@Before
	public void start() {
		start = System.currentTimeMillis();
	}

	@Test
	public void testDecremento() {
		int bpmInicial = bulletController.getBPM();
		bulletController.decreaseBPM();
		int bpmFinal = bulletController.getBPM();
		assertEquals(bpmFinal, bpmInicial + 10);
	}

	@Test
	public void testIncremento() {
		int bpmInicial = bulletController.getBPM();
		bulletController.increaseBPM();
		int bpmFinal = bulletController.getBPM();
		assertEquals(bpmFinal, bpmInicial - 10);
	}

	@Test
	public void testRespuesta() {
		assertTrue(System.currentTimeMillis() - start < 20);
	}

}
