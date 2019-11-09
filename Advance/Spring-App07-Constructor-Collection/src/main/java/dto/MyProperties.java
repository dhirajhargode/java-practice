package dto;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class MyProperties {

	private List<String> list;
	private Map<String, Object> map;
	private Properties properties;

	public MyProperties() {
		System.out.println("0 argument :param constructor");
	}

	public MyProperties(List<String> list, Map<String, Object> map, Properties properties) {
		System.out.println("with argument :param constructor");
		this.list = list;
		this.map = map;
		this.properties = properties;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

}
