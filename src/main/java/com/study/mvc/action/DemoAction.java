package com.study.mvc.action;

import com.study.mvc.annotation.Autowired;
import com.study.mvc.annotation.Controller;
import com.study.mvc.annotation.RequestMapping;
import com.study.mvc.annotation.RequestParam;
import com.study.mvc.service.DemoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Mtime
 * @date 2018/8/17.
 */
@Controller
@RequestMapping("/demo")
public class DemoAction {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/query.json")
    public void query(HttpServletRequest request, HttpServletResponse response,
                      @RequestParam("name") String name) {
        String result = demoService.get(name);
        try {
            response.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
