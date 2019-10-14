/**
 * 
 */
package wenTongYU;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import sun.applet.Main;

/**
 * @author YU_IT
 *
 */
class MainTest {

	/**
	 * Test method for {@link Main#Solve(java.lang.String)}.
	 */
	@Test
	void testSolve() {
		String sum = wenTongYU.Main.Solve("11+22");
		Assert.assertEquals("11+22=33", sum);
	}
	

}
