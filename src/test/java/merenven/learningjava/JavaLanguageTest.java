package merenven.learningjava;

import org.junit.Assert;
import org.junit.Test;

public class JavaLanguageTest {
	
	@Test
	public void shouldAdTwoIntegers() {
		int jeden = 1;
		Assert.assertEquals(2, jeden + jeden);
	}
	
	@Test
	public void shouldExecuteEachForLoopStepOnce() {
		int suma = 0;
		for(int i = 1; i <= 4; i = i + 1) {
			suma = suma + 1;
		}
		Assert.assertEquals(4, suma);
	}

}
