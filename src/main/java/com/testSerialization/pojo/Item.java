package com.testSerialization.pojo;

import java.io.Serializable;

public record Item(int id, String description, float price) implements Serializable {
}
