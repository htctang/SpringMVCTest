package com.tang.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {
	/***
	 * ��ҳ ������/page/home.jspҳ��
	 * @return
	 */
	@RequestMapping("index")
	public ModelAndView index(){
		//����ģ�͸���ͼ��������Ⱦҳ�档����ָ��Ҫ���ص�ҳ��Ϊhomeҳ��
		ModelAndView mav = new ModelAndView("hello");
		mav.addObject("test", "this is hello test");
		
		return mav;
	}
}
