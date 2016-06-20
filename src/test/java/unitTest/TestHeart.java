package unitTest;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import controller.ControllerInterface;
import controller.HeartController;
import model.HeartModel;
import model.HeartModelInterface;

public class TestHeart {
	HeartModelInterface heartModel = HeartModel.getInstance();
	ControllerInterface heartController = new HeartController(heartModel);

	private long start;

	@Before
	public void start() {
		start = System.currentTimeMillis();
	}

	@Test
	public void testRespuesta() {
		assertTrue(System.currentTimeMillis() - start < 20);
	}
}
