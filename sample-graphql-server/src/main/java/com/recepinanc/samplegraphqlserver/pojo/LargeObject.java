package com.recepinanc.samplegraphqlserver.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class LargeObject {

    public LargeObject() {}

    private long field1 = 1L;
    private String field2 = generateString(1024);
    private Field3 field3 = generateField3();
    private List<Field4> field4 = generateField4s();

    private static String generateString(int size) {
        char[] data = new char[size];
        Arrays.fill(data, 'a');
        return new String(data);
    }

    private List<Field4> generateField4s() {
        List<Field4> field4s = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            field4s.add(generateField4());
        }
        return field4s;
    }

    private Field3 generateField3() {
        Field3 field3 = new Field3();
        field3.setField31(1L);
        field3.setField32(generateString(1024));
        return field3;
    }

    private Field4 generateField4() {
        Field4 field4 = new Field4();
        field4.setField41(1L);
        field4.setField42(generateString(1024));
        return field4;
    }

}

@Data
class Field3 {
    long field31;
    String field32;
}

@Data
class Field4 {
    long field41;
    String field42;
}
