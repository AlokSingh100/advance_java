package newprj.pro;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmpDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		System.out.println("Im in in set jdbc templet");
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveEmployee(employee e) {
		String query="insert into employee values('"+e.getId()+"','"+e.getFirst_name()+"','"+e.getLast_name()+"','"+e.getSalary()+"')";
		return jdbcTemplate.update(query);
	}
	/*
	 * public List<employee> getallEmployees() { return
	 * jdbcTemplate.query("select * from employee", new
	 * ResultSetExtractor<List<employee>>() }
	 */
	
	
}


