package com.recepinanc.samplegraphqlserver.sample;

import java.util.*;

import com.recepinanc.samplegraphqlserver.pojo.LargeObject;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public List<LargeObject> getLargeObjects(int count) {
        return generateLargeObjects(count);
    }

    private List<LargeObject> generateLargeObjects(int count) {
        List<LargeObject> largeObjects = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            largeObjects.add(generateLargeObject());
        }

        return largeObjects;
    }

    private LargeObject generateLargeObject() {
        return new LargeObject();
    }

}
