

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/test")
public class DemoFilter implements Filter {

    public DemoFilter() {
    	System.out.println("Filter Constructor....");
    }

	public void destroy() {
		System.out.println("Filter Destroy.....");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Before filter request");
		chain.doFilter(request, response);
		System.out.println("After filter response");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter invoked...");
	}

}
