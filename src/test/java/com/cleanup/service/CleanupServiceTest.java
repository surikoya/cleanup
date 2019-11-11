package com.cleanup.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class CleanupServiceTest {
	
	private CleanupService cleanupSvc;
	private final String INPUT = "hello world";
	private final String REPLACER = "ol";
	private final String EXPECTED_OUTPUT = "he wrd";

	
	@Before
	public void setup() {
		cleanupSvc = new CleanupServiceImpl();
	}
	
	@Test
	public void testCleanupWithNullGivenString() {
		assertNotNull(cleanupSvc);
		assertNull(cleanupSvc.cleanup(null, ""));
	}

	@Test
	public void testCleanupWithNullCharsToReplace() {
		assertNotNull(cleanupSvc);
		assertEquals(INPUT, cleanupSvc.cleanup(INPUT, null));
		assertEquals(INPUT, cleanupSvc.cleanup(INPUT, ""));
	}
	
	@Test
	public void testCleanupWithNonNullValues() {
		assertNotNull(cleanupSvc);
		assertEquals(EXPECTED_OUTPUT, cleanupSvc.cleanup(INPUT, REPLACER));
	}

}
