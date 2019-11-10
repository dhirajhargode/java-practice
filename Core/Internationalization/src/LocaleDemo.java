import java.util.Arrays;
import java.util.Locale;

public class LocaleDemo {
	public static void main(String[] args) {
		Locale l1=Locale.getDefault();
		System.out.println(l1.getCountry()+"......."+l1.getLanguage());
		System.out.println(l1.getDisplayCountry()+"......."+l1.getDisplayLanguage());
		
		/*Locale l2=new Locale("pa","ID");
		Locale.setDefault (l2);
		System.out.println(l1.getCountry()+"......."+l1.getLanguage());
		System.out.println(l1.getDisplayCountry()+"......."+l1.getDisplayLanguage());
		*/
		/*Locale[] s=Locale.getAvailableLocales();
		for(Locale s1:s) {
			System.out.println(s1.getDisplayCountry()+"......."+s1.getDisplayLanguage());
				
		}*/
	}

}
