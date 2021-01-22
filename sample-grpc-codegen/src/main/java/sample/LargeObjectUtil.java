package sample;

import com.recepinanc.samplegrpcserver.sample.Field3;
import com.recepinanc.samplegrpcserver.sample.Field4;
import com.recepinanc.samplegrpcserver.sample.LargeObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class LargeObjectUtil {
    public static List<LargeObject> getLargeObjects(int count) {
        List<LargeObject> largeObjects = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            largeObjects.add(generateLargeObject());
        }
        return largeObjects;
    }

    private static LargeObject generateLargeObject() {
        return LargeObject.newBuilder()
                .setField1(1L)
                .setField2(generateString(1024))
                .setField3(generateField3())
                .addAllField4(generateField4s())
                .build();
    }

    private static String generateString(int size) {
        char[] data = new char[size];
        Arrays.fill(data, 'a');
        return new String(data);
    }

    private static List<Field4> generateField4s() {
        List<Field4> field4s = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            field4s.add(generateField4());
        }
        return field4s;
    }

    private static Field3 generateField3() {
        return Field3.newBuilder()
                .setField31(1L)
                .setField32(generateString(1024))
                .build();
    }

    private static Field4 generateField4() {
        return Field4.newBuilder()
                .setField41(1L)
                .setField42(generateString(1024))
                .build();
    }
}
