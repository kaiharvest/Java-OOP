package programmer.zama.now.application;

import programmer.zama.now.Util.MathUtil;
import programmer.zama.now.data.Application;
import programmer.zama.now.data.Constant;
import programmer.zama.now.data.Country;

public class StaticApp {
	public static void main(String[] args) {
		System.out.println(Constant.APPLICATION);
		System.out.println(Constant.VERSION);

		System.out.println(MathUtil.sum(1,1,1,1,1));

		Country.City city = new Country.City();
		city.setName("Subang");
		System.out.println(city.getName());

		System.out.println(Application.PROCESSORS);
	}
}
