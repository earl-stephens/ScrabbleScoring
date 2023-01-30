package test;
import application.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ScoringTest {

	@Test
	void testForScoringObject() {
		Scoring scoring = new Scoring();
		
		Assert.assertNotNull(scoring);
	}

}
