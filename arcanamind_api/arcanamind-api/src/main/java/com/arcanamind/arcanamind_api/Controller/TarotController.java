package com.arcanamind.arcanamind_api.Controller;

import com.arcanamind.arcanamind_api.DTO.TarotRequest;
import com.arcanamind.arcanamind_api.Service.TarotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tarot")
@RequiredArgsConstructor
public class TarotController {

    private final TarotService tarotService;

    @PostMapping("/reading")
    public String getTarotReading(@RequestBody TarotRequest request) {
        return tarotService.getReading(request);
    }
}
