package kz.beeline.beeplay.beeplay.repository;


import kz.beeline.beeplay.beeplay.entity.Stream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository extends JpaRepository<Stream, Long> {
    Stream getStreamByCategorySlug(String category_slug);
}
