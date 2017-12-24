package myweb.web1.controller;

import java.io.IOException;
import java.util.List;

import myweb.web1.dao.IMyDAO;
import myweb.web1.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    IMyDAO myDao;

    @RequestMapping(value = "/")
    public ModelAndView test() throws IOException {
        List<Book> books = null;
        books = myDao.selectList("selectBooks", 2);
        ModelAndView mav = new ModelAndView("home");
        mav.addObject("books", books);
        return mav;
    }
}
