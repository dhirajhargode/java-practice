package p01;

import dao.MDao;
import temp.MTemplate;
import temp.MTemplate1;

public class Main {

	public static void main(String[] args) {
		MDao d = new MDao();
		MTemplate mtemp = new MTemplate1();
		d.setMtemp(mtemp);
		d.add();
	}

}
