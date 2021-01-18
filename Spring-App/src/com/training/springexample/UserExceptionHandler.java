/*
 * package com.training.springexample;
 * 
 * import javax.servlet.http.HttpServletRequest;
 * 
 * import org.springframework.web.bind.annotation.ControllerAdvice; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod;
 * 
 * @ControllerAdvice public class UserExceptionHandler {
 * 
 * @ExceptionHandler(Exception.class) // @ResponseStatus(HttpStatus.NOT_FOUND)
 * public String handleAllExceptions(HttpServletRequest request, Exception ex) {
 * System.err.println("MAHESH---->"); // ModelAndView mav = new
 * ModelAndView("error"); //// request.setAttribute("msg", "TEST ERROR"); //
 * mav.addObject("msg", "TEST ERROR"); // return mav; return "redirect:/404"; }
 * 
 * @RequestMapping(value = {"/404"}, method = RequestMethod.GET) public String
 * NotFoudPage() { System.out.println("404 url"); return "404";
 * 
 * }
 * 
 * }
 */