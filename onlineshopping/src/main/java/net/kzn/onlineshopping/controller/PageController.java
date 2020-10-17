package net.kzn.onlineshopping.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class PageController {

	//Adding request mapping for home
@RequestMapping(value={"/","/home","index"})
public ModelAndView index(){
	ModelAndView vb=new ModelAndView("page");
	vb.addObject("title","Home");
	vb.addObject("userClickHome",true);
	
	return vb;
}
//Adding request mapping for about
@RequestMapping(value={"/about"})
public ModelAndView about( ){
	ModelAndView vb=new ModelAndView("page");
	vb.addObject("title","About Us");
	vb.addObject("userClickabout",true);
	return vb;
}

//Adding request mapping for contact
@RequestMapping(value={"/contact"})
public ModelAndView contact( ){
	ModelAndView vb=new ModelAndView("page");
	vb.addObject("title","Contact Us");
	vb.addObject("userClickcontact",true);
	
	return vb;
}
/*
@RequestMapping(value="/test/{greeting}")
public ModelAndView divya(@PathVariable("greeting")String greeting ){
	ModelAndView vb=new ModelAndView("page");
	if(greeting==null)
		greeting="Hello Divya Goswami";
	 vb.addObject("greeting",greeting);
	 vb.addObject("title","Home");
	 vb.addObject("userClickHome",true);
		
	return vb;
}
*/

/*
@RequestMapping(value={"/test/{greeting"})
public ModelAndView test(@RequestParam(value="greeting" ,required=false )String greeting ){
	ModelAndView vb=new ModelAndView("page");
	if(greeting==null)
		vb.addObject("greeting","Hello Divya Goswami");
	else vb.addObject("greeting",greeting);
	vb.addObject("title","Home");
	vb.addObject("userClickHome","true");
	
	return vb;
}
*/

}
