package impl;

import dao.ActivityRepository;
import dao.SignUpRepository;
import service.ActivityAndSignUpService;
import domain.bussiness.Activity;
import domain.bussiness.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityAndSignUpServiceImpl implements ActivityAndSignUpService {
    private final ActivityRepository activityRepository;
    private final SignUpRepository signUpRepository;

    @Autowired
    public ActivityAndSignUpServiceImpl(ActivityRepository activityRepository, SignUpRepository signUpRepository) {
        this.activityRepository = activityRepository;
        this.signUpRepository = signUpRepository;
    }

    @Override
    public Activity findActivityByName(String name) {
        return activityRepository.findActivitiesByActivityName(name);
    }

    @Override
    public void createActivity(Activity activity) {
        activityRepository.saveAndFlush(activity);
    }

    @Override
    public void saveParticipant(Participant participant) {
        signUpRepository.saveAndFlush(participant);
    }

    @Override
    public List<Participant> getAllParticipantsByActivityName(String activityName) {
        return signUpRepository.findAllByActivityName(activityName);
    }
}
