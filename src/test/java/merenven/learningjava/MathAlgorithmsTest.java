package merenven.learningjava;

import org.junit.Assert;
import org.junit.Test;

public class MathAlgorithmsTest {
	
	@Test
	public void souldReturn4WhenPass2() {
		MathAlgorithms match = new MathAlgorithms();
		
		int result = match.square(2);
		
		Assert.assertEquals(4, result);
	}

}
