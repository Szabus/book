package szabina.demo.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    @RequestMapping("/books")
    public String getBooks(){

        return "books";
    }
}
