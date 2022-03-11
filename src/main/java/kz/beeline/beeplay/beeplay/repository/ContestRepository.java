package kz.beeline.beeplay.beeplay.repository;

import kz.beeline.beeplay.beeplay.entity.Contest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContestRepository extends JpaRepository<Contest, Long> {
    Contest findContestBySlug(String slug);
}
