/*
 * package com.training.springexample.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.multipart.commons.CommonsMultipartFile; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import com.training.springexample.service.SaveUserService;
 * 
 * @Controller public class FileUploadController {
 * 
 * @Autowired private SaveUserService serviceImpl;
 * 
 * @RequestMapping(value = "/savefile", method = RequestMethod.POST) public
 * ModelAndView upload(@RequestParam CommonsMultipartFile file) {
 * serviceImpl.upload(file); ModelAndView mav = new ModelAndView("home"); return
 * mav; } }
 */