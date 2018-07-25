package dao;

import entity.Activity;
import entity.ActivityId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ActivityDao extends JpaRepository<Activity, ActivityId> {

    @Query("select a from Activity a where a.activityName = ?1")
    Activity findActivitiesByActivityName(String name);
}
