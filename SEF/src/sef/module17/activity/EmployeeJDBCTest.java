package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.util.ArrayList;

import junit.framework.TestCase;

public class EmployeeJDBCTest extends TestCase {

	EmployeeJDBC emp;
	
	protected void setUp() throws Exception {
	//setUp() is used to initialize member data which would be used by all/most of its methods
		emp = new EmployeeJDBC();
	}

	public void testCreateConnection() {
		Connection con = emp.createConnection();
		assertNotNull(con);
		
	}

	public void testFindEmployeeById_MatchFound() {
		//complete the code here
		Employee e = emp.findEmployeeById("1");
		assertEquals("Shane", e.getFirstName());
		assertEquals("Shanez", e.getLastName());
		assertEquals(666, e.getSalary());
	}

	public void testFindEmployeeById_NoMatchFound() {
		//complete the code here
		Employee e1 = emp.findEmployeeById("999");
		assertNull(e1);
	}
	
	
	public void testFindEmployeeByName_MatchFound() {
		//complete the code here
		ArrayList<Employee> list = emp.findEmployeesByName("zShane");
		assertEquals(0, list.size());
	}
	
	public void testFindEmployeeByName_NoMatchFound() {
		//complete the code here
		ArrayList<Employee> list = emp.findEmployeesByName("Bob");
		assertEquals(0, list.size());
	}

	public void testFindEmployeeBySalary_MatchFound() {
		//complete the code here
		ArrayList<Employee> list = emp.findEmployeesBySalary(666);
		assertEquals(0, list.size());
		
	}

	public void testFindEmployeeBySalary_NoMatchFound() {
		//complete the code here
	}
	
	public void testInsertEmployee(){
		//complete the code here
		
	}
}
