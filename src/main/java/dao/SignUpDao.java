package dao;

import entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import entity.ParticipantId;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface SignUpDao extends JpaRepository<Participant, ParticipantId> {

    @Query("select p from Participant p where p.activityName = ?1")
    List<Participant> findAllByActivityName(String name);


}
