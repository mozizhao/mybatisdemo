package publicpackage.controller;

import publicpackage.dao.ExampleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xavimo on 2018/1/11.
 */
@RestController
public class DemoController {
    @Autowired
    ExampleDAO exampleDAO;

    @RequestMapping("/demo")
    @ResponseBody
    public String getName() {
        return exampleDAO.selectByPK(1).getName();
    }
}
