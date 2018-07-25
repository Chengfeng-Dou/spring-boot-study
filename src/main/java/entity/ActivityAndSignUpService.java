package entity;


import java.util.List;

public interface ActivityAndSignUpService {

    Activity findActivityByName(String name);
    void createActivity(Activity activity);

    void saveParticipant(Participant participant);
    List<Participant> getAllParticipantsByActivityName(String activityName);
}
