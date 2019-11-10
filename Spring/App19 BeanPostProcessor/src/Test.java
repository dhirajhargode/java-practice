import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("appliacation-Context.xml"));

		CustomBeanPostProcessor cbf = factory.getBean("cbpp", CustomBeanPostProcessor.class);

		ConfigurableListableBeanFactory cfactory = (ConfigurableListableBeanFactory) factory;

		cfactory.addBeanPostProcessor(cbf);

		A a = factory.getBean("a", A.class);
		System.out.println(a);
	}

}
