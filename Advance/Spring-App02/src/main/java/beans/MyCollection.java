package beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class MyCollection {

	private int no;
	private String name;
	private List<String> list;
	private Map<String, Object> map;
	private Properties prop;

	public MyCollection() {
	}

	public MyCollection(int no, String name, List<String> list, Map<String, Object> map, Properties prop) {
		this.no = no;
		this.name = name;
		this.list = list;
		this.map = map;
		this.prop = prop;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

}
