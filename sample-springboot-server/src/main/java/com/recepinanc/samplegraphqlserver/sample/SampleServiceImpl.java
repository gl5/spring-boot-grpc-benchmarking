package com.recepinanc.samplegraphqlserver.sample;

import java.util.List;
import org.springframework.stereotype.Service;
import com.recepinanc.samplegrpcserver.sample.LargeObject;
import sample.LargeObjectUtil;

@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public List<LargeObject> getLargeObjects(int count) {
        return LargeObjectUtil.getLargeObjects(count);
    }
}
