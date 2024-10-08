package hello.servlet_repeat.web.frontcontroller.v3.controller;

import hello.servlet_repeat.domain.member.Member;
import hello.servlet_repeat.domain.member.MemberRepository;
import hello.servlet_repeat.web.frontcontroller.ModelView;
import hello.servlet_repeat.web.frontcontroller.v3.ControllerV3;
import java.util.List;
import java.util.Map;
public class MemberListControllerV3 implements ControllerV3 {
    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);
        return mv;
    }
}