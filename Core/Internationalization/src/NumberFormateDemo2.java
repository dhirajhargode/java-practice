import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormateDemo2 {
	public static void main(String[] args) {
		
		double d=123456.789;
		
		Locale india=new Locale("pa","IN");
		NumberFormat nf=NumberFormat.getCurrencyInstance(india);
		System.out.println("India number form "+nf.format(d));
		
		NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US number form "+nf1.format(d));
		
		NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK number form "+nf2.format(d));
		
	}

}
