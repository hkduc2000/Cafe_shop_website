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
}
