package dao;

import domain.bussiness.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import domain.bussiness.ParticipantId;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface SignUpRepository extends JpaRepository<Participant, ParticipantId> {

    @Query("select p from Participant p where p.activityName = ?1")
    List<Participant> findAllByActivityName(String name);


}
