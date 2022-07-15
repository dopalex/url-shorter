package shorturl.urlshorter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shorturl.urlshorter.model.Url;

import java.util.Optional;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {
    Url getByUrlFull(String longUrl);

    Optional<Url> getByUrlShort(String shortUrl);
}