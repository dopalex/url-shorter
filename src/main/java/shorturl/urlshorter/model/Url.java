package shorturl.urlshorter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String urlFull;
    private String urlShort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlFull() {
        return urlFull;
    }

    public void setUrlFull(String urlFull) {
        this.urlFull = urlFull;
    }

    public String getUrlShort() {
        return urlShort;
    }

    public void setUrlShort(String urlShort) {
        this.urlShort = urlShort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Url url = (Url) o;
        return Objects.equals(id, url.id) && Objects.equals(urlFull, url.urlFull)
                && Objects.equals(urlShort, url.urlShort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, urlFull, urlShort);
    }
}
