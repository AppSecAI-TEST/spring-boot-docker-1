package sweet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author sweet
 * @description
 * @date 2017/8/10
 * @copyright www.xiaoniuapp.com Inc. All rights reserved.
 */
@RequestMapping("/")
@RestController
public class IndexController {

    @RequestMapping()
    public Date index() {
        return new Date();
    }

}
