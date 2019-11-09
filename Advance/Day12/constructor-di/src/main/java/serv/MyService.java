package serv;

public class MyService {

	private int serviceId;
	private String serviceName;
	public MyService() {
		
	}
	
	public MyService(int serviceId, String serviceName) {
		System.out.println("param constructor");
		this.serviceId = serviceId;
		this.serviceName = serviceName;
	}


	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
}
