package kz.beeline.beeplay.beeplay.repository;

import kz.beeline.beeplay.beeplay.entity.ContestWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestWorkRepository extends JpaRepository<ContestWork,Long> {
}
