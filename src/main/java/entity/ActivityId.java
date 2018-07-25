package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ActivityId implements Serializable {
    @Column(name = "ac_name")
    private String activityName;

    @Column(name = "ac_url")
    private String activityUrl;

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivityId that = (ActivityId) o;
        return Objects.equals(activityName, that.activityName) &&
                Objects.equals(activityUrl, that.activityUrl);
    }

    @Override
    public int hashCode() {

        return Objects.hash(activityName, activityUrl);
    }
}
