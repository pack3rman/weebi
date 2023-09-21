package pl.java.test.project.weebi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.java.test.project.weebi.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {


}
