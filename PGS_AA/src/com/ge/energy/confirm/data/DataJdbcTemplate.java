package com.ge.energy.confirm.data;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataJdbcTemplate extends JdbcTemplate{
	
	DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
}
