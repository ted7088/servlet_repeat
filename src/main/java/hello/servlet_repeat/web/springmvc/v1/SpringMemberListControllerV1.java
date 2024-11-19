package hello.servlet_repeat.web.springmvc.v1;

import hello.servlet_repeat.domain.member.Member;
import hello.servlet_repeat.domain.member.MemberRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class SpringMemberListControllerV1 {
    private MemberRepository memberRepository = MemberRepository.getInstance();
    @RequestMapping("/springmvc/v1/members")
    public ModelAndView process() {
        List<Member> members = memberRepository.findAll();
        ModelAndView mv = new ModelAndView("members");
        mv.addObject("members", members);
        return mv;
    }
}
