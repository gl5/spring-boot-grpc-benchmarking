package com.recepinanc.samplegraphqlserver.sample;

import java.util.List;

import com.recepinanc.samplegrpcserver.sample.LargeObject;

public interface SampleService {

    List<LargeObject> getLargeObjects(int count);

}
