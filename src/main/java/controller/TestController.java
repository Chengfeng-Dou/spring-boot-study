package controller;

import domain.bussiness.Activity;
import service.ActivityAndSignUpService;
import domain.bussiness.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/test")
public class TestController {
    private final ActivityAndSignUpService activityAndSignUpService;
    private static final AtomicLong mobileNumber = new AtomicLong();


    @Autowired
    public TestController(ActivityAndSignUpService activityAndSignUpService) {
        this.activityAndSignUpService = activityAndSignUpService;
    }

    @RequestMapping("/show")
    @ResponseBody
    public Activity getActivityInfo(){
        return activityAndSignUpService.findActivityByName("测试活动");
    }

    @RequestMapping("/saveAndShow")
    @ResponseBody
    public List<Participant> saveAndShow(){

        Participant participant = new Participant();
        participant.setActivityName("测试活动");
        participant.setInstitution("北京大学");
        participant.setMobileNumber(mobileNumber.toString());
        participant.setOccupation("学生");
        participant.setParticipantName("测试员");
        participant.setReferee("推荐人一号");

        mobileNumber.addAndGet(1);

        activityAndSignUpService.saveParticipant(participant);

        return activityAndSignUpService.getAllParticipantsByActivityName("测试活动");
    }
}
