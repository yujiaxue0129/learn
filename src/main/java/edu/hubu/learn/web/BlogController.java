package edu.hubu.learn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hubu.learn.entity.Blog;
import edu.hubu.learn.service.BlogService;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/{id}")
    public ModelAndView getBlog(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        Blog blog = blogService.getBlog(id);
        mav.addObject("blog", blog);
        mav.setViewName("blog");
        return mav;
    }

    @RequestMapping("/list")
    public ModelAndView blogs() {
        ModelAndView mav = new ModelAndView();
        List<Blog> blogs = blogService.getBlogs();
        mav.addObject("blogs", blogs);
        mav.setViewName("blogs");
        return mav;
    }
}