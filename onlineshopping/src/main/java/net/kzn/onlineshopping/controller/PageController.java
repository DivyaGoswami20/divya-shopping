package net.kzn.onlineshopping.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class PageController {

@RequestMapping(value={"/","/home","index"})
public ModelAndView index(){
	ModelAndView vb=new ModelAndView("page");
	vb.addObject("greeting","welcome to spring web mvc");
	return vb;
}

@RequestMapping(value={"/test"})
public ModelAndView test(@RequestParam(value="greeting" ,required=false )String greeting ){
	ModelAndView vb=new ModelAndView("page");
	if(greeting==null)
		vb.addObject("greeting","Hello Divya Goswami");
	else vb.addObject("greeting",greeting);
	return vb;
}
/*
@RequestMapping(value="/divya/{name}")
public ModelAndView divya(@PathVariable("name")String name ){
	ModelAndView vb=new ModelAndView("page");
	if(name==null)
		name="Hello Divya Goswami";
	 vb.addObject("greeting",name);
	return vb;
}
*/
}
