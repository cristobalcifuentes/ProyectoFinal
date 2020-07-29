package com.involucionados.cotroladores;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorControllers  implements ErrorController{
	
	
	 private static final Logger logger = LoggerFactory.getLogger(ErrorControllers.class);
	 
	    @RequestMapping("/error")
	    public String handleError(HttpServletRequest request) {
	        logger.info("executing custom error controller");
	        if (HttpStatus.NOT_FOUND
	                .value() == (int) request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE)) {
	            return "/error/404";
	        }
	        return "error";
	    }
	    
		@Override
		public String getErrorPath() {
			 return "/error";
		}
		
}
