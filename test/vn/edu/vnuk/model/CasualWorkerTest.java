package vn.edu.vnuk.model;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import vn.edu.vnuk.define.Define;
import vn.edu.vnuk.model.CasualWorkers.CasualWorkersBuilder;
import vn.edu.vnuk.model.CasualWorkers;


public class CasualWorkerTest {
	private final double delta = 0.00001;
	
	CasualWorkers C = new CasualWorkers();
	
	@Before
	public void setUp() {
		CasualWorkersBuilder builder = new CasualWorkersBuilder(Define.latestId, Define.TYPE_OF_CASUALWORKER);
		
		builder
				.setName("Giang")
				.setYearOfBirth(1999)
				.setEarningPerDay(10)
				.setDayWorked(10)
				.build();
	}
	
	@Test
	public void test_CasualWorker() {
		CasualWorkers C = new CasualWorkers();
		assertNotNull(C);
	}
	
	@Test
	public void test_set_getName() {
		C.setName("Giang");
		assertEquals(C.getName(),"Giang");
	}
	
	@Test
	public void test_set_getYearOfBirth() {
		C.setYearOfBirth(1999);
		assertEquals(C.getYearOfBirth(), 1999);
	}
	
	@Test
	public void test_set_getEarningPerDay() {
		C.setEarningPerDay(10);
		assertEquals(C.getEarningPerDay(),10,delta);
	}
	
	@Test
	public void test_set_getDayWorked() {
		C.setDayWorked(10);
		assertEquals(C.getDayWorked(),10,delta);
	}
}