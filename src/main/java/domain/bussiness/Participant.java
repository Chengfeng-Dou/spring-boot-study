package domain.bussiness;

import javax.persistence.*;

@Entity
@Table(name = "participants")
@IdClass(ParticipantId.class)
public class Participant {
    @Id
    @Column(name = "ac_name")
    private String activityName;

    @Column(name = "p_name")
    private String participantName;

    @Column(name = "p_institution")
    private String institution;

    @Column(name = "p_occupation")
    private String occupation;

    @Id
    @Column(name = "p_mobile_number")
    private String mobileNumber;

    @Column(name = "p_referee")
    private String referee;


    public Participant() {
    }

    public Participant(String activityName, String participantName, String institution, String occupation, String mobileNumber, String referee) {
        this.activityName = activityName;
        this.participantName = participantName;
        this.institution = institution;
        this.occupation = occupation;
        this.mobileNumber = mobileNumber;
        this.referee = referee;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }
}

