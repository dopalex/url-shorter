package shorturl.urlshorter.service;

import shorturl.urlshorter.model.Url;

public interface UrlService {
    Url getUrlShort(Url longUrl);

    Url getUrlFull(String path);
}