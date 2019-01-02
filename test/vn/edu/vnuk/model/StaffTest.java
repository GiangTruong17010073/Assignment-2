package vn.edu.vnuk.model;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import vn.edu.vnuk.define.Define;
import vn.edu.vnuk.model.Staff.StaffBuilder;
import vn.edu.vnuk.model.Staff;


public class StaffTest {
	private final double delta = 0.00001;
	
	Staff s = new Staff();
	
	@Before
	public void setUp() {
		StaffBuilder builder = new StaffBuilder(Define.latestId, Define.TYPE_OF_STAFF);
		
		builder
				.setName("Giang")
				.setYearOfBirth(1999)
				.setHomeTown("Da Nang")
				.setDepartment("C")
				.setSalaryRatio(52)
				.setAllowrance(Define.ALLOWRANCE_OF_CHIEF)
				.setPosition(Define.POSITION_OF_CHIEF)
				.setDayWorked(10)
				.setYearWorked(10)
				.setMinimumWage(Define.DEFAUT_MINIMUM_WAGE)
				.build();
	}
	
	@Test
	public void test_Staff() {
		Staff s = new Staff();
		assertNotNull(s);
	}
	
	@Test
	public void test_set_getHomeTown() {
		s.setHomeTown("Da Nang");
		assertEquals(s.getHomeTown(),"Da Nang");
	}
	
	@Test
	public void test_set_getDepartment() {
		s.setDepartment("C");
		assertEquals( s.getDepartment(),"C");
	}
	
	@Test
	public void test_set_getSalaryRatio() {
		s.setSalaryRatio(52);
		assertEquals(s.getSalaryRatio(), 52,delta);
	}
	
	@Test
	public void test_set_getAllowanceChief() {
		s.setAllowance(Define.ALLOWRANCE_OF_CHIEF);
		assertEquals(s.getAllowance(), Define.ALLOWRANCE_OF_CHIEF,delta);
	}
	
	@Test
	public void test_set_getAllowanceDeputy() {
		s.setAllowance(Define.ALLOWRANCE_OF_DEPUTY);
		assertEquals(s.getAllowance(), Define.ALLOWRANCE_OF_DEPUTY,delta);
	}
	
	@Test
	public void test_set_getAllowanceEmployee() {
		s.setAllowance(Define.ALLOWRANCE_OF_EMPLOYEE);
		assertEquals(s.getAllowance(), Define.ALLOWRANCE_OF_EMPLOYEE,delta);
	}
	
	@Test
	public void test_set_getRegencyChief() {
		s.setRegency (Define.POSITION_OF_CHIEF);
		assertEquals(s.getRegency(), Define.POSITION_OF_CHIEF);
	}
	
	@Test
	public void test_set_getRegencyDeputy() {
		s.setRegency (Define.POSITION_OF_DEPUTY);
		assertEquals(s.getRegency(), Define.POSITION_OF_DEPUTY);
	}
	
	@Test
	public void test_set_getRegencyEmployee() {
		s.setRegency (Define.POSITION_OF_EMPLOYEE);
		assertEquals(s.getRegency(), Define.POSITION_OF_EMPLOYEE);
	} 
	
	@Test
	public void test_set_getDayWorked() {
		s.setDayWorked(10);
		assertEquals(s.getDayWorked(),10);
	}
	
	@Test
	public void test_set_getYearWorked() {
		s.setYearWorked(10);
		assertEquals(s.getYearWorked(),10);
	}
	
	@Test
	public void test_set_getMinimumWage() {
		s.setMinimumWage(Define.DEFAUT_MINIMUM_WAGE);
		assertEquals(s.getMinimumWage(),Define.DEFAUT_MINIMUM_WAGE,delta);
	}
}