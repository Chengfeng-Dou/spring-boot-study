package domain.bussiness;



import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "activity")
@IdClass(ActivityId.class)
public class Activity {
    @Id
    @Column(name = "ac_name")
    private String activityName;

    @Column(name = "ac_start_time")
    private Date activityStartTime;

    @Column(name = "ac_end_time")
    private Date activityEndTime;

    @Id
    @Column(name = "ac_url")
    private String activityUrl;

    @Column(name = "ac_poster_url")
    private String activityPosterUrl;

    public Activity() {
        //default constructor
    }

    public Activity(String activityName, Date activityStartTime, Date activityEndTime, String activityUrl, String activityPosterUrl) {
        this.activityName = activityName;
        this.activityStartTime = activityStartTime;
        this.activityEndTime = activityEndTime;
        this.activityUrl = activityUrl;
        this.activityPosterUrl = activityPosterUrl;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Date getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public String getActivityPosterUrl() {
        return activityPosterUrl;
    }

    public void setActivityPosterUrl(String activityPosterUrl) {
        this.activityPosterUrl = activityPosterUrl;
    }
}

