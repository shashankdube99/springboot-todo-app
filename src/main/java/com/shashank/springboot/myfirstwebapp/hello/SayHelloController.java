package com.shashank.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! what can i do for you?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>");
		sb.append("My First Web App");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First Html page with body");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	// src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	// src/main/resources/META-INF/resources/WEB-INF/jsp/welcome.jsp
	// src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
	// src/main/resources/META-INF/resources/WEB-INF/jsp/todos.jsp
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}

}
