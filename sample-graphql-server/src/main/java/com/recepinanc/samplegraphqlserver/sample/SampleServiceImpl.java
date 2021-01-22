package com.recepinanc.samplegraphqlserver.sample;

import java.util.*;

import com.recepinanc.samplegraphqlserver.pojo.LargeObject;
import org.springframework.stereotype.Service;

import com.recepinanc.samplegrpcserver.sample.Field83;
import com.recepinanc.samplegrpcserver.sample.Field84;
import com.recepinanc.samplegrpcserver.sample.Field85;

@Service
public class SampleServiceImpl implements SampleService {
    private static final Map<Integer, List<LargeObject>> LARGE_OBJECT_CACHE = new HashMap<>();
    private static final Random RANDOM_GENERATOR = new Random();

    @Override
    public List<Integer> getRandomNumbers(int count) {
        return generateRandomNumbers(count);
    }

    @Override
    public List<LargeObject> getLargeObjects(int count) {
        if (!LARGE_OBJECT_CACHE.containsKey(count)) {
            List<LargeObject> largeObjects = generateLargeObjects(count);
            LARGE_OBJECT_CACHE.put(count, largeObjects);
        }

        return LARGE_OBJECT_CACHE.get(count);
    }

    private List<Integer> generateRandomNumbers(int count) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            randomNumbers.add(RANDOM_GENERATOR.nextInt(10) + 1);
        }
        return randomNumbers;
    }

    private List<LargeObject> generateLargeObjects(int count) {
        List<LargeObject> largeObjects = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            largeObjects.add(generateLargeObject());
        }
        return largeObjects;
    }

    private LargeObject generateLargeObject() {
        LargeObject largeObject = new LargeObject();
        largeObject.setField1(1L);
        largeObject.setField2(1L);
        largeObject.setField3(1L);
        largeObject.setField4(1);
        largeObject.setField7("S1");
        largeObject.setField8("S1");
        largeObject.setField9(1);
        largeObject.setField10(1L);
        largeObject.setField11(1L);
        largeObject.setField12(1L);
        largeObject.setField13(1L);
        largeObject.setField14(1L);
        largeObject.setField15(1L);
        largeObject.setField16(1L);
        largeObject.setField17(1L);
        largeObject.setField18(1L);
        largeObject.setField19(1);
        largeObject.setField20("S1");
        largeObject.setField21("S1");
        largeObject.setField22(1);
        largeObject.setField23(1L);
        largeObject.setField24(1L);
        largeObject.setField25(1L);
        largeObject.setField26(1L);
        largeObject.setField27(1L);
        largeObject.setField28(1L);
        largeObject.setField29(1L);
        largeObject.setField30(false);
        largeObject.setField31(false);
        largeObject.setField32(false);
        largeObject.setField33(false);
        largeObject.setField34(false);
        largeObject.setField35(false);
        largeObject.setField38(1);
        largeObject.setField39(1);
        largeObject.setField40(1);
        largeObject.setField41(1);
        largeObject.setField42("S1");
        largeObject.setField43(1);
        largeObject.setField44("S1");
        largeObject.setField45(1);
        largeObject.setField46(1);
        largeObject.setField47("S1");
        largeObject.setField48(1);
        largeObject.setField49("S1");
        largeObject.setField50(1);
        largeObject.setField51("S1");
        largeObject.setField52(1);
        largeObject.setField53(false);
        largeObject.setField55(1L);
        largeObject.setField56(1);
        largeObject.setField57("S1");
        largeObject.setField58("S1");
        largeObject.setField59(1);
        largeObject.setField60(1);
        largeObject.setField61("S1");
        largeObject.setField62("S1");
        largeObject.setField63("S1");
        largeObject.setField64(1);
        largeObject.setField65(false);
        largeObject.setField66(false);
        largeObject.setField67("S1");
        largeObject.setField68("S1");
        largeObject.setField69("S1");
        largeObject.setField70("S1");
        largeObject.setField71("S1");
        largeObject.setField72("S1");
        largeObject.setField73(false);
        largeObject.setField74(1L);
        largeObject.setField75(1L);
        largeObject.setField76(1L);
        largeObject.setField77(1L);
        largeObject.setField78(1L);
        largeObject.setField79(1L);
        largeObject.setField80(1L);
        largeObject.setField81(1L);
        largeObject.setField82(1L);
        return largeObject;
    }

    private List<Field83> generateField83s() {
        List<Field83> field83s = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            field83s.add(generateField83());
        }
        return field83s;
    }

    private List<Field84> generateField84s() {
        List<Field84> field84s = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            field84s.add(generateField84());
        }
        return field84s;
    }

    private List<Field85> generateField85s() {
        List<Field85> field85s = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            field85s.add(generateField85());
        }
        return field85s;
    }

    private Field83 generateField83() {
        return Field83.newBuilder()
                .setField1(1L)
                .setField2(1L)
                .setField3(1L)
                .setField4("S1")
                .setField5("S1")
                .build();
    }

    private Field84 generateField84() {
        return Field84.newBuilder()
                .setField1(1L)
                .setField2(1L)
                .setField3(1L)
                .setField4("S1")
                .setField5("S1")
                .build();
    }

    private Field85 generateField85() {
        return Field85.newBuilder()
                .setField1(1L)
                .setField2(1L)
                .setField3(1L)
                .setField4("S1")
                .setField5("S1")
                .build();
    }
}
