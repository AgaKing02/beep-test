package kz.beeline.beeplay.beeplay.repository;

import kz.beeline.beeplay.beeplay.entity.StreamCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamCategoryRepository extends JpaRepository<StreamCategory, Long> {

    StreamCategory getBySlug(String slug);
}
