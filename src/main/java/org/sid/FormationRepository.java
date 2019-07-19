package org.sid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("*")
public interface FormationRepository extends JpaRepository<Formation, Long> {

}
