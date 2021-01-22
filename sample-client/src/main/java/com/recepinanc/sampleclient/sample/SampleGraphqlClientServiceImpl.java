package com.recepinanc.sampleclient.sample;

import com.recepinanc.samplegrpcserver.sample.LargeObjectResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class SampleGraphqlClientServiceImpl implements SampleGraphqlClientService {
    private final RestTemplate restTemplate;

    public SampleGraphqlClientServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void getRandomNumbers(int count) {
        String request =
                "{" +
                "  \"query\": \"getRandomNumbers\"," +
                "  \"operationName\": \"getRandomNumbers\"," +
                "  \"variables\": { \"count\": \"" + count + "\"}" +
                "}";
        restTemplate.postForObject("http://localhost:5000/graphql", request, List.class);
    }

    @Override
    public void getLargeObjects(int count) {
        String request =
                "{" +
                        "  \"query\": \"getLargeObjects\"," +
                        "  \"operationName\": \"getLargeObjects\"," +
                        "  \"variables\": { \"count\": \"" + count + "\"}" +
                        "}";
        restTemplate.postForObject("http://localhost:5000/graphql", request, LargeObjectResponse.class);
    }
}