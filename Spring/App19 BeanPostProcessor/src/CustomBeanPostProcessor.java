import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object obj, String name) throws BeansException {
		System.out.println("After Initialization");
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String name) throws BeansException {
		System.out.println("Before Initialization");
		return obj;
	}
	
	

}
