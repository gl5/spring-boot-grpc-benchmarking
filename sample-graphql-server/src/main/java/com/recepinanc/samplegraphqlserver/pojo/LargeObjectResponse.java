package com.recepinanc.samplegraphqlserver.pojo;

import java.util.List;

public class LargeObjectResponse {
    List<LargeObject> largeObjects;

    public List<LargeObject> getLargeObjects() {
        return largeObjects;
    }

    public void setLargeObjects(List<LargeObject> largeObjects) {
        this.largeObjects = largeObjects;
    }
}
