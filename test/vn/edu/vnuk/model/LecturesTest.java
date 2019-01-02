package vn.edu.vnuk.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import vn.edu.vnuk.define.Define;
import vn.edu.vnuk.model.Lectures.LecturesBuilder;
import vn.edu.vnuk.model.Lectures;

public class LecturesTest {
	
	private final double delta = 0.0001;
	
	@Before
	public void setUp() {
		LecturesBuilder builder = new LecturesBuilder(Define.latestId, Define.TYPE_OF_MASTER);
		
		builder
				.setYearOfBirth(1999)
				.setHomeTown("Da Nang")
				.setDepartment("C")
				.setSalaryRatio(2)
				.setAllowrance(Define.ALLOWRANCE_OF_MASTER)
				.setYearWorked(8)
				.setQualification(Define.QUALIFICATION_OF_MASTER)
				.setMinimumWage(Define.DEFAUT_MINIMUM_WAGE)
				.build();
	}
	
	
	Lectures l = new Lectures();
	
	@Test
	public void test_Lectures() {
		Lectures l = new Lectures();
		assertNotNull(l);
	}
	
	@Test
	public void test_set_getHomeTown() {
		l.setHomeTown("Da Nang");
		assertEquals(l.getHomeTown(),"Da Nang");
	}
	
	@Test
	public void test_set_getDepartment() {
		l.setDepartment("C");
		assertEquals(l.getDepartment(), "C");
	}

	@Test
	public void test_set_getPeriodInMonth() {
		l.setPeriodsInMonth(9);
		assertEquals(l.getPeriodsInMonth(), 9);
	}
	
	@Test
	public void test_set_YearOfBirth() {
		l.setYearOfBirth(1999);
		assertEquals(l.getYearOfBirth(), 1999);
	}
	
	@Test
	public void test_set_getMinimumWage() {
		l.setMinimumWage(Define.DEFAUT_MINIMUM_WAGE);
		assertEquals(l.getMinimumWage(),Define.DEFAUT_MINIMUM_WAGE,delta);
	}
	
	@Test
	public void test_set_getQualificationMaster() {
		l.setQualification (Define.QUALIFICATION_OF_MASTER);
		assertEquals(l.getQualification(), Define.QUALIFICATION_OF_MASTER);
	}
	@Test
	public void test_set_getQualificationBachelor() {
		l.setQualification (Define.QUALIFICATION_OF_BACHELOR);
		assertEquals(l.getQualification(), Define.QUALIFICATION_OF_BACHELOR);
	}
	
	@Test
	public void test_set_getQualificationDoctor() {
		l.setQualification (Define.QUALIFICATION_OF_DOCTOR);
		assertEquals(l.getQualification(), Define.QUALIFICATION_OF_DOCTOR);
	}
	
	@Test
	public void test_set_getAllowanceMaster() {
		l.setAllowance(Define.ALLOWRANCE_OF_MASTER);
		assertEquals(l.getAllowance(), Define.ALLOWRANCE_OF_MASTER);
	}
	
	@Test
	public void test_set_getAllowanceBachelor() {
		l.setAllowance(Define.ALLOWRANCE_OF_BACHELOR);
		assertEquals(l.getAllowance(), Define.ALLOWRANCE_OF_BACHELOR);
	}
	
	@Test
	public void test_set_getAllowanceDoctor() {
		l.setAllowance(Define.ALLOWRANCE_OF_DOCTOR);
		assertEquals(l.getAllowance(), Define.ALLOWRANCE_OF_DOCTOR);
	}
	
	@Test
	public void test_set_getYearWorked() {
		l.setYearWorked(8);
		assertEquals(l.getYearWorked(), 8);
	}
	
	@Test
	public void test_set_get_SalaryRatio() {
		l.setSalaryRatio(2);
		assertEquals(l.getSalaryRatio(), 2, delta);
	}
	
}
