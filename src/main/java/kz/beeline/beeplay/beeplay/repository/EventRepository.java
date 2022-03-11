package kz.beeline.beeplay.beeplay.repository;

import kz.beeline.beeplay.beeplay.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    Event findBySlug(String slug);
}
