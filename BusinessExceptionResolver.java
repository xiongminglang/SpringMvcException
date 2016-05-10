package com.minglangx.springmvc.exception;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 

　　* @ClassName: BusinessExceptionResolver

　　* @Description: (异常处理器)

　　* @author minglangx

　　* @date 2016年5月10日 下午5:31:58

　　*


　　
 */
public class BusinessExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest req,
			HttpServletResponse resp, Object arg2, Exception ex) {

		// 判断异常类型
		BusinessException be = null;
		// 如果是自定义异常，则把异常信息获取
		if (ex instanceof BusinessException) {
			be = (BusinessException) ex;
		} else {
			// 如果不是自定义异常，封装异常信息为“未知错误”
			be = new BusinessException("未知错误");
		}
		String msg = be.getMessage();
		// 将错误信息显示到错误页面
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", msg);
		// 指定错误页面
		mv.setViewName("error");

		return mv;
	}

}
