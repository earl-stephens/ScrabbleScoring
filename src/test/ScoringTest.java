package test;
import application.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ScoringTest {
	Scoring scoring = new Scoring();
	@Test
	void testForScoringObject() {
		
		Assert.assertNotNull(scoring);
	}
	
	@Test
	void testForScoresFromAnArray() {
		String word = "hello";
		
		Assert.assertEquals(8, scoring.scores(word));
	}

}
