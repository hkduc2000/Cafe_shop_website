/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.ProductDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author HKDUC
 */
@Controller
@RequestMapping("/products")
public class productProcess {
    @RequestMapping("/list/{categoryid}")
    public ModelAndView List(HttpServletRequest request, HttpServletResponse response,
            @PathVariable int categoryid){
        ModelAndView mv = new ModelAndView("/jsp/product/product_list.jsp");
        mv.addObject("products", new ProductDAO().getProductsByCategoryID(categoryid));
        return mv;
    }
    
    @RequestMapping(value = "/add", method=GET)
    public ModelAndView AddForm(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("/jsp/product/product_add.jsp");
        mv.addObject("sizes", new ProductDAO().getSizeList());
        return mv;
    }
    
    @RequestMapping(value = "/add", method=POST)
    public ModelAndView Add(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView("/jsp/product/product_add.jsp");
        mv.addObject("sizes", new ProductDAO().getSizeList());
        return new ModelAndView("/jsp/product/abc.jsp");
    }
}
