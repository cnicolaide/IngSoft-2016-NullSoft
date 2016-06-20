package unitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import controller.BeatController;
import controller.ControllerInterface;
import model.BeatModel;
import model.BeatModelInterface;

public class TestBeat {

	BeatModelInterface beatModel = new BeatModel();
	ControllerInterface beatController = new BeatController(beatModel);

	private long start;

	@Before
	public void start() {
		start = System.currentTimeMillis();
	}

	@Test
	public void testDecremento() {
		int bpmInicial = beatController.getBPM();
		beatController.decreaseBPM();
		int bpmFinal = beatController.getBPM();
		assertEquals(bpmFinal, bpmInicial - 1);
	}

	@Test
	public void testIncremento() {
		int bpmInicial = beatController.getBPM();
		beatController.increaseBPM();
		int bpmFinal = beatController.getBPM();
		assertEquals(bpmFinal, bpmInicial + 1);
	}

	@Test
	public void testRespuesta() {
		assertTrue(System.currentTimeMillis() - start < 20);
	}

}
