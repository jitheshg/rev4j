package com.jg.rev4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jg.rev4j.core.JRev;
import com.jg.rev4j.core.JRevType;
import com.jg.rev4j.core.json.JSONHelper;
import com.jg.rev4j.vo.Department;
import com.jg.rev4j.vo.Employee;

import junit.framework.TestCase;

public class RevisionHelperTest extends TestCase {
	
	private static Logger log = LoggerFactory.getLogger(RevisionHelperTest.class);
	
	private static JRev jRev;
	private static JSONHelper jsonHelper;

	public RevisionHelperTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		jRev = RevisionHelper.getInstance().withType(JRevType.JREV_JSON).build();
		jsonHelper = new JSONHelper();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testJSON() {
		Employee employee = new Employee();
		employee.setFirstName("Jithesh");
		employee.setLastName("G");
		employee.setEmpId("i81999");
		employee.getDepartments().add(new Department("DEP_1", "ID_1"));
		employee.getDepartments().add(new Department("DEP_2", "ID_2"));
		employee.getDepartments().add(new Department("DEP_3", "ID_3"));
		log.info("{}", jsonHelper.toJSON(employee));
	}
}
