package me.eja.voice.voiceplayground.api.rest;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/sample")
public class SampleRestController {
    @GetMapping
    public Map<String, Object> findSample() {
        return Map.of("sample", "Sample response.");
    }
}
