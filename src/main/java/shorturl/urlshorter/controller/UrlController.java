package shorturl.urlshorter.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import shorturl.urlshorter.dto.UrlRequestDto;
import shorturl.urlshorter.dto.UrlResponseDto;
import shorturl.urlshorter.mapper.UrlMapper;
import shorturl.urlshorter.service.UrlService;

@RestController
@RequestMapping("/")
public class UrlController {
    private final UrlMapper mapper;
    private final UrlService urlService;

    public UrlController(UrlMapper mapper, UrlService urlService) {
        this.mapper = mapper;
        this.urlService = urlService;
    }

    @GetMapping("/{request}")
    public RedirectView returnFullUrl(@PathVariable String request) {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(urlService.getUrlFull(request).getUrlFull());
        return redirectView;
    }

    @PostMapping
    public UrlResponseDto getShortUrl(@RequestBody UrlRequestDto request) {
        return mapper.toDto(urlService.getUrlShort(mapper.toModel(request)));
    }
}
