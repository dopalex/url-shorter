package shorturl.urlshorter.mapper;

import org.springframework.stereotype.Component;
import shorturl.urlshorter.dto.UrlRequestDto;
import shorturl.urlshorter.dto.UrlResponseDto;
import shorturl.urlshorter.model.Url;

@Component
public class UrlMapper {
    public UrlResponseDto toDto(Url shortUrl) {
        UrlResponseDto responseDto = new UrlResponseDto();
        responseDto.setUrlShort(shortUrl.getUrlShort());
        return responseDto;
    }

    public Url toModel(UrlRequestDto requestDto) {
        Url url = new Url();
        url.setUrlFull(requestDto.getUrlFull());
        return url;
    }
}