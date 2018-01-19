package com.ge.energy.confirm.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import static com.ge.energy.confirm.common.utility.ConstantUtils.CHECK_USER_SQL;



/**
 * @author NGTAPXS
 *
 */
public class UserManager extends JdbcDaoSupport  {
	
	
	

		public String  checkUserRole(String userid)  {

			return (String) getJdbcTemplate().query(CHECK_USER_SQL,
					new Object[] { userid }, (ResultSetExtractor) new UsersResultSetExtractor());
		}

		private static class UsersResultSetExtractor implements ResultSetExtractor {
			public Object extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				String adminName = null;
				while (rs.next()) {
					adminName = rs.getString("lookup_desc");
				}
				return adminName;
			
			}

			
		}
	
	


}
