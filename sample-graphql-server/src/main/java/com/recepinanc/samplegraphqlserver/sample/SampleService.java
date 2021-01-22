package com.recepinanc.samplegraphqlserver.sample;

import com.recepinanc.samplegraphqlserver.pojo.LargeObject;

import java.util.List;


public interface SampleService {
    List<Integer> getRandomNumbers(int count);

    List<LargeObject> getLargeObjects(int count);
}
