package com.recepinanc.sampleclient.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    SampleRestClientServiceImpl sampleRestClientService;
    SampleGrpcClientServiceImpl sampleGrpcClientService;
    SampleGraphqlClientServiceImpl sampleGraphqlClientService;

    public SampleController(SampleRestClientServiceImpl sampleRestClientService,
                            SampleGrpcClientServiceImpl sampleGrpcClientService,
                            SampleGraphqlClientServiceImpl sampleGraphqlClientService) {

        this.sampleRestClientService = sampleRestClientService;
        this.sampleGrpcClientService = sampleGrpcClientService;
        this.sampleGraphqlClientService = sampleGraphqlClientService;
    }

    @RequestMapping(value = "/rest/largeObjects")
    public void restLargeObjects(@RequestParam("count") int count) {
        sampleRestClientService.getLargeObjects(count);
    }

    @RequestMapping("/grpc/largeObjects")
    public void grpcLargeObjects(@RequestParam("count") int count) {
        sampleGrpcClientService.getLargeObjects(count);
    }

    @RequestMapping(value = "/graphql/largeObjects")
    public void graphqlLargeObjects(@RequestParam("count") int count) {
        sampleGraphqlClientService.getLargeObjects(count);
    }
}