package JdbcPractice;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SampleDao {
	// ①JdbcTemplateの変数宣言
    private JdbcTemplate jdbcTemplate;
    
    // ②JdbcTemplateのsetter
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    // ③検索処理
    public List<String> select(){
        List<String> ret = jdbcTemplate.queryForList("select serial_code from product_storage_infos", String.class);
        return ret;
    }
}
