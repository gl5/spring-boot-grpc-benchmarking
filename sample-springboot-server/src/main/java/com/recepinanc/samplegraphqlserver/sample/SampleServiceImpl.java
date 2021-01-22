package com.recepinanc.samplegraphqlserver.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.recepinanc.samplegrpcserver.sample.Field36;
import com.recepinanc.samplegrpcserver.sample.Field37;
import com.recepinanc.samplegrpcserver.sample.Field5;
import com.recepinanc.samplegrpcserver.sample.Field54;
import com.recepinanc.samplegrpcserver.sample.Field6;
import com.recepinanc.samplegrpcserver.sample.Field83;
import com.recepinanc.samplegrpcserver.sample.Field84;
import com.recepinanc.samplegrpcserver.sample.Field85;
import com.recepinanc.samplegrpcserver.sample.LargeObject;
import com.recepinanc.samplegraphqlserver.pojo.LargeObjectPOJO;

@Service
public class SampleServiceImpl implements SampleService {
    private static final Map<Integer, List<LargeObject>> LARGE_OBJECT_CACHE = new HashMap<>();
    private static final Map<Integer, List<LargeObjectPOJO>> LARGE_OBJECT_AS_JSON_CACHE = new HashMap<>();
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

    @Override
    public List<LargeObjectPOJO> getLargeObjectPOJOs(int count) {
        if (!LARGE_OBJECT_AS_JSON_CACHE.containsKey(count)) {
            List<LargeObjectPOJO> largeObjectPOJOS = generateLargeObjectPOJOs(count);
            LARGE_OBJECT_AS_JSON_CACHE.put(count, largeObjectPOJOS);
        }

        return LARGE_OBJECT_AS_JSON_CACHE.get(count);
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

    private List<LargeObjectPOJO> generateLargeObjectPOJOs(int count) {
        List<LargeObjectPOJO> largeObjectPOJOS = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            largeObjectPOJOS.add(generateLargeObjectPOJO());
        }
        return largeObjectPOJOS;
    }

    private LargeObject generateLargeObject() {
        return LargeObject.newBuilder()
                .setField1(1L)
                .setField2(1L)
                .setField3(1L)
                .setField4(1)
                .setField5(Field5.FIELD_5_0)
                .setField6(Field6.FIELD_6_0)
                .setField7("S1")
                .setField8("S1")
                .setField9(1)
                .setField10(1L)
                .setField11(1L)
                .setField12(1L)
                .setField13(1L)
                .setField14(1L)
                .setField15(1L)
                .setField16(1L)
                .setField17(1L)
                .setField18(1L)
                .setField19(1)
                .setField20("S1")
                .setField21("S1")
                .setField22(1)
                .setField23(1L)
                .setField24(1L)
                .setField25(1L)
                .setField26(1L)
                .setField27(1L)
                .setField28(1L)
                .setField29(1L)
                .setField30(false)
                .setField31(false)
                .setField32(false)
                .setField33(false)
                .setField34(false)
                .setField35(false)
                .setField36(Field36.FIELD_36_0)
                .setField37(Field37.FIELD_37_0)
                .setField38(1)
                .setField39(1)
                .setField40(1)
                .setField41(1)
                .setField42("S1")
                .setField43(1)
                .setField44("S1")
                .setField45(1)
                .setField46(1)
                .setField47("S1")
                .setField48(1)
                .setField49("S1")
                .setField50(1)
                .setField51("S1")
                .setField52(1)
                .setField53(false)
                .setField54(Field54.FIELD_54_0)
                .setField55(1L)
                .setField56(1)
                .setField57("S1")
                .setField58("S1")
                .setField59(1)
                .setField60(1)
                .setField61("S1")
                .setField62("S1")
                .setField63("S1")
                .setField64(1)
                .setField65(false)
                .setField66(false)
                .setField67("S1")
                .setField68("S1")
                .setField69("S1")
                .setField70("S1")
                .setField71("S1")
                .setField72("S1")
                .setField73(false)
                .setField74(1L)
                .setField75(1L)
                .setField76(1L)
                .setField77(1L)
                .setField78(1L)
                .setField79(1L)
                .setField80(1L)
                .setField81(1L)
                .setField82(1L)
                .addAllField83(generateField83s())
                .addAllField84(generateField84s())
                .addAllField85(generateField85s())
                .build();
    }

    private LargeObjectPOJO generateLargeObjectPOJO() {
        LargeObjectPOJO largeObjectPOJO = new LargeObjectPOJO();
        largeObjectPOJO.setField1(1L);
        largeObjectPOJO.setField2(1L);
        largeObjectPOJO.setField3(1L);
        largeObjectPOJO.setField4(1);
        largeObjectPOJO.setField7("S1");
        largeObjectPOJO.setField8("S1");
        largeObjectPOJO.setField9(1);
        largeObjectPOJO.setField10(1L);
        largeObjectPOJO.setField11(1L);
        largeObjectPOJO.setField12(1L);
        largeObjectPOJO.setField13(1L);
        largeObjectPOJO.setField14(1L);
        largeObjectPOJO.setField15(1L);
        largeObjectPOJO.setField16(1L);
        largeObjectPOJO.setField17(1L);
        largeObjectPOJO.setField18(1L);
        largeObjectPOJO.setField19(1);
        largeObjectPOJO.setField20("S1");
        largeObjectPOJO.setField21("S1");
        largeObjectPOJO.setField22(1);
        largeObjectPOJO.setField23(1L);
        largeObjectPOJO.setField24(1L);
        largeObjectPOJO.setField25(1L);
        largeObjectPOJO.setField26(1L);
        largeObjectPOJO.setField27(1L);
        largeObjectPOJO.setField28(1L);
        largeObjectPOJO.setField29(1L);
        largeObjectPOJO.setField30(false);
        largeObjectPOJO.setField31(false);
        largeObjectPOJO.setField32(false);
        largeObjectPOJO.setField33(false);
        largeObjectPOJO.setField34(false);
        largeObjectPOJO.setField35(false);
        largeObjectPOJO.setField38(1);
        largeObjectPOJO.setField39(1);
        largeObjectPOJO.setField40(1);
        largeObjectPOJO.setField41(1);
        largeObjectPOJO.setField42("S1");
        largeObjectPOJO.setField43(1);
        largeObjectPOJO.setField44("S1");
        largeObjectPOJO.setField45(1);
        largeObjectPOJO.setField46(1);
        largeObjectPOJO.setField47("S1");
        largeObjectPOJO.setField48(1);
        largeObjectPOJO.setField49("S1");
        largeObjectPOJO.setField50(1);
        largeObjectPOJO.setField51("S1");
        largeObjectPOJO.setField52(1);
        largeObjectPOJO.setField53(false);
        largeObjectPOJO.setField55(1L);
        largeObjectPOJO.setField56(1);
        largeObjectPOJO.setField57("S1");
        largeObjectPOJO.setField58("S1");
        largeObjectPOJO.setField59(1);
        largeObjectPOJO.setField60(1);
        largeObjectPOJO.setField61("S1");
        largeObjectPOJO.setField62("S1");
        largeObjectPOJO.setField63("S1");
        largeObjectPOJO.setField64(1);
        largeObjectPOJO.setField65(false);
        largeObjectPOJO.setField66(false);
        largeObjectPOJO.setField67("S1");
        largeObjectPOJO.setField68("S1");
        largeObjectPOJO.setField69("S1");
        largeObjectPOJO.setField70("S1");
        largeObjectPOJO.setField71("S1");
        largeObjectPOJO.setField72("S1");
        largeObjectPOJO.setField73(false);
        largeObjectPOJO.setField74(1L);
        largeObjectPOJO.setField75(1L);
        largeObjectPOJO.setField76(1L);
        largeObjectPOJO.setField77(1L);
        largeObjectPOJO.setField78(1L);
        largeObjectPOJO.setField79(1L);
        largeObjectPOJO.setField80(1L);
        largeObjectPOJO.setField81(1L);
        largeObjectPOJO.setField82(1L);
        return largeObjectPOJO;
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
