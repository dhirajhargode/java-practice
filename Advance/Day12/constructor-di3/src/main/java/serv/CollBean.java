package serv;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollBean {

	private List<String> mappingResources;
	private Properties hbmProperties;
	private Map<String, Object> jdbcInfo;
	
	
	
	
	public CollBean() {
		super();
	}
	
	
	
	
	public CollBean(List<String> mappingResources, Properties hbmProperties, Map<String, Object> jdbcInfo) {
		super();
		this.mappingResources = mappingResources;
		this.hbmProperties = hbmProperties;
		this.jdbcInfo = jdbcInfo;
	}




	public List<String> getMappingResources() {
		return mappingResources;
	}
	public void setMappingResources(List<String> mappingResources) {
		this.mappingResources = mappingResources;
	}
	public Properties getHbmProperties() {
		return hbmProperties;
	}
	public void setHbmProperties(Properties hbmProperties) {
		this.hbmProperties = hbmProperties;
	}
	public Map<String, Object> getJdbcInfo() {
		return jdbcInfo;
	}
	public void setJdbcInfo(Map<String, Object> jdbcInfo) {
		this.jdbcInfo = jdbcInfo;
	}
	
	
	
}
