package com.recepinanc.samplegraphqlserver.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.recepinanc.samplegrpcserver.sample.LargeObjectResponse;

@RestController
public class SampleController {
    SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    /**
     * @param count
     * @return a Proto Object
     */
    @RequestMapping("/largeObjects")
    public LargeObjectResponse getLargeObjects(@RequestParam("count") int count) {
        return LargeObjectResponse.newBuilder()
                .addAllLargeObjects(sampleService.getLargeObjects(count))
                .build();
    }
}
