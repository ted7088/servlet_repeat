package hello.servlet_repeat.web.frontcontroller.v3;

import hello.servlet_repeat.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);


}
