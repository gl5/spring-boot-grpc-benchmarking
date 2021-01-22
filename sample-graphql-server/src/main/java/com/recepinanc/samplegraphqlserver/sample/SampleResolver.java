package com.recepinanc.samplegraphqlserver.sample;

import com.recepinanc.samplegraphqlserver.pojo.LargeObjectResponse;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SampleResolver implements GraphQLQueryResolver{
    SampleService sampleService;

    public SampleResolver(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    /**
     * @param count
     * @return
     */
    public List<Integer> getRandomNumbers(int count) {
        return sampleService.getRandomNumbers(count);
    }

    /**
     * @param count
     * @return a Proto Object
     */
    public LargeObjectResponse getLargeObjects(int count) {
        LargeObjectResponse ret = new LargeObjectResponse();
        ret.setLargeObjects(sampleService.getLargeObjects(count));
        return ret;
    }
}