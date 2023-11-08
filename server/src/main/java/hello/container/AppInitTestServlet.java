package hello.container;

import hello.servlet.SangMinServlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;

public class AppInitTestServlet implements AppInit {

	@Override
	public void onStartup(ServletContext servletContext) {
		System.out.println("AppInitTestServlet.onStartup");

		// 순수 서블릿 코드 등록
		ServletRegistration.Dynamic sangMinServlet = servletContext.addServlet("sangMinServlet", new SangMinServlet());
		sangMinServlet.addMapping("/sangMin-servlet");
	}
}
