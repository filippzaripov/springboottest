package app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.RandomStringUtils;

@RestController
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(){


        return "Hello from Spring boot! \n Here is the randoms String from apache-common-lang3:\t"+RandomStringUtils.random(23);

    }

    @RequestMapping(value = "/shalom", method = RequestMethod.GET)
    public String shalom(){
        return "Shalom from spring";
    }

}
