package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ParticipantId implements Serializable {
    @Column(name = "ac_name")
    private String activityName;
    @Column(name = "p_mobile_number")
    private String mobileNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParticipantId that = (ParticipantId) o;
        return Objects.equals(activityName, that.activityName) &&
                Objects.equals(mobileNumber, that.mobileNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(activityName, mobileNumber);
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
