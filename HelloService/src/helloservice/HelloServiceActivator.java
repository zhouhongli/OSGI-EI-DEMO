package helloservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class HelloServiceActivator implements BundleActivator {

	ServiceRegistration<?> helloServiceRegistration;
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		 HelloService helloService = new HelloServiceImpl();  
	        helloServiceRegistration = context.registerService(HelloService.class  
	                .getName(), helloService, null);  
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		helloServiceRegistration.unregister();  
	}

}
