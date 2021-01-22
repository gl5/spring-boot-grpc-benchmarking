package com.recepinanc.sampleclient.sample;

import com.recepinanc.samplegrpcserver.sample.LargeObject;

import java.util.List;

public interface SampleGraphqlClientService {
    void getRandomNumbers(int count);

    Object getLargeObjects(int count);
}
