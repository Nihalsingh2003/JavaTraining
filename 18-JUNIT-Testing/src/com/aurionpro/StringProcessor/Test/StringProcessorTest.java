package com.aurionpro.StringProcessor.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.aurionpro.StringProcessor.model.StringProcessor;

public class StringProcessorTest {
	private StringProcessor processor = new StringProcessor();

	@Test
	@Tag("fast")
	public void testPalindromeTrue() {
		assertTrue(processor.isPalindrome("madam"));
	}

	@Nested
	class ReverseTests {
		@Test
		void testReverseBasic() {
			assertEquals("cba", processor.reverse("abc"));
		}

		@Test
		@Disabled("Under development")
		void testReverseWithSpecialCharacters() {
			assertEquals("@!a", processor.reverse("a!@"));
		}

		@RepeatedTest(3)
		void testRepeatedReverse() {
			assertEquals("321", processor.reverse("123"));
		}
	}
}
