/**
 * 
 */
package org.migue.javabrains.dao;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

/**
 * @author migue this class shows us how to extend the built-in JDBC DAO's of
 *         Spring framework to create our own DAO's by writing even lesser code
 *         by just extending one of Spring's JdbcDaoSupport classes.
 *         PS: in this
 *         case, we use the simpleJDBCTemplate, there are classes for
 *         NamedParameterJDBCTemplate and JDBCTemplate too 
 *         
 *         PS2: viewand see that dataSource is injected into the jdbctemplate. 
 */
@SuppressWarnings("deprecation")
public class SimpleJdbcDaoImpl extends SimpleJdbcDaoSupport {

	public int getCircleCount() {
		String sql = "select count(*) from circle";

		return this.getJdbcTemplate().queryForInt(sql);
	}

}
