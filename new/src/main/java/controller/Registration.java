package controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.urwardrobe.dao.UserDao;
import com.urwardrobe.model.UserForm;

@Controller
public class Registration {
	
	
	private UserDao userbean;
	
	public Registration(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.urwardrobe.confiig");
		context.refresh();
		 userbean = (UserDao)context.getBean("userbean");
	}
	
	@ModelAttribute("user")
	public UserForm createModel(){
		return new  UserForm();
	}
	
	@RequestMapping("/")
	public String openHome()
	{
		return "indexpage";
	}
		
	 @RequestMapping("/register")
	   public String reg() {
	      return "Regform";
	    		  }
	 
	 @RequestMapping(value = "addregister", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("value=user")UserForm user,ModelMap model) {
		 System.out.println("inside addstudeent");
		/* model.addAttribute("firstname", user.getFirstname());
	      model.addAttribute("lastname", user.getLastname());
	      model.addAttribute("password", user.getPassword());
	      model.addAttribute("email", user.getEmail());
	      model.addAttribute("confirm_password", user.getConfirm_password());
	    */  
	      userbean.save(user);
	      return "Regform";
	   }
	   
	 
}


/*   package controller;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;


import model.Register;

@Controller
@RequestMapping
public class RegisterController {

    
    public String viewRegistration(Map<String, Object> model) {
    	Register regForm = new Register();    
        model.put("regForm", regForm);
         
        List<String> genderList = new ArrayList();
        genderList.add("Male");
        genderList.add("Female");
        
        model.put("genderList", genderList);
         
        return "signuo";
    }
     

    public String processRegistration(@ModelAttribute("regForm") Register r1,
            Map<String, Object> model) {
         
        // implement your own registration logic here...
         
        // for testing purpose:
        System.out.println("firstname: " + r1.getFirstname());
        System.out.println("lastname: " + r1.getLastname());
        System.out.println("password: " + r1.getPassword());
        System.out.println("email: " + r1.getEmail());
        System.out.println("birthDay: " + r1.getConfirm_password());
         
        return "index";
    }
}

 */










