package service;

import dao.ActivityDao;
import dao.SignUpDao;
import entity.ActivityAndSignUpService;
import entity.Activity;
import entity.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityAndSignUpServiceImpl implements ActivityAndSignUpService {
    private final ActivityDao activityDao;
    private final SignUpDao signUpDao;

    @Autowired
    public ActivityAndSignUpServiceImpl(ActivityDao activityDao, SignUpDao signUpDao) {
        this.activityDao = activityDao;
        this.signUpDao = signUpDao;
    }

    @Override
    public Activity findActivityByName(String name) {
        return activityDao.findActivitiesByActivityName(name);
    }

    @Override
    public void createActivity(Activity activity) {
        activityDao.saveAndFlush(activity);
    }

    @Override
    public void saveParticipant(Participant participant) {
        signUpDao.saveAndFlush(participant);
    }

    @Override
    public List<Participant> getAllParticipantsByActivityName(String activityName) {
        return signUpDao.findAllByActivityName(activityName);
    }
}
