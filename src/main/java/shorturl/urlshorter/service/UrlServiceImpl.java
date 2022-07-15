package shorturl.urlshorter.service;

import org.springframework.stereotype.Service;
import shorturl.urlshorter.model.Url;
import shorturl.urlshorter.repository.UrlRepository;
import shorturl.urlshorter.util.ShortenerUtil;
import shorturl.urlshorter.util.UrlValidator;

@Service
public class UrlServiceImpl implements UrlService {
    private final UrlRepository repository;

    public UrlServiceImpl(UrlRepository repository) {
        this.repository = repository;
    }

    @Override
    public Url getUrlShort(Url longUrl) {
        if (!UrlValidator.validate(longUrl.getUrlFull())) {
            longUrl.setUrlShort("Invalid url");
            return longUrl;
        }
        Url url = repository.getByUrlFull(longUrl.getUrlFull());
        if (url == null) {
            url = repository.save(ShortenerUtil.toShortUrl(longUrl));
        }
        return url;
    }

    @Override
    public Url getUrlFull(String url) {
        return repository.getByUrlShort("http://localhost:8080/" + url).orElseThrow(
                () -> new RuntimeException("Invalid url"));
    }
}
