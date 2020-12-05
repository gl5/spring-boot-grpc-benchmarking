// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Sample.proto

package com.recepinanc.samplegrpcserver.sample;

/**
 * Protobuf type {@code SampleResponse}
 */
public  final class SampleResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SampleResponse)
    SampleResponseOrBuilder {
  // Use SampleResponse.newBuilder() to construct.
  private SampleResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SampleResponse() {
    randomNumber_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SampleResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              randomNumber_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            randomNumber_.add(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              randomNumber_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              randomNumber_.add(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        randomNumber_ = java.util.Collections.unmodifiableList(randomNumber_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.recepinanc.samplegrpcserver.sample.SampleProto.internal_static_SampleResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.recepinanc.samplegrpcserver.sample.SampleProto.internal_static_SampleResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.recepinanc.samplegrpcserver.sample.SampleResponse.class, com.recepinanc.samplegrpcserver.sample.SampleResponse.Builder.class);
  }

  public static final int RANDOMNUMBER_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> randomNumber_;
  /**
   * <code>repeated int32 randomNumber = 1;</code>
   */
  public java.util.List<java.lang.Integer>
      getRandomNumberList() {
    return randomNumber_;
  }
  /**
   * <code>repeated int32 randomNumber = 1;</code>
   */
  public int getRandomNumberCount() {
    return randomNumber_.size();
  }
  /**
   * <code>repeated int32 randomNumber = 1;</code>
   */
  public int getRandomNumber(int index) {
    return randomNumber_.get(index);
  }
  private int randomNumberMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getRandomNumberList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(randomNumberMemoizedSerializedSize);
    }
    for (int i = 0; i < randomNumber_.size(); i++) {
      output.writeInt32NoTag(randomNumber_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < randomNumber_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(randomNumber_.get(i));
      }
      size += dataSize;
      if (!getRandomNumberList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      randomNumberMemoizedSerializedSize = dataSize;
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.recepinanc.samplegrpcserver.sample.SampleResponse)) {
      return super.equals(obj);
    }
    com.recepinanc.samplegrpcserver.sample.SampleResponse other = (com.recepinanc.samplegrpcserver.sample.SampleResponse) obj;

    boolean result = true;
    result = result && getRandomNumberList()
        .equals(other.getRandomNumberList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getRandomNumberCount() > 0) {
      hash = (37 * hash) + RANDOMNUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getRandomNumberList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.recepinanc.samplegrpcserver.sample.SampleResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.recepinanc.samplegrpcserver.sample.SampleResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.recepinanc.samplegrpcserver.sample.SampleResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.recepinanc.samplegrpcserver.sample.SampleResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.recepinanc.samplegrpcserver.sample.SampleResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.recepinanc.samplegrpcserver.sample.SampleResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.recepinanc.samplegrpcserver.sample.SampleResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.recepinanc.samplegrpcserver.sample.SampleResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.recepinanc.samplegrpcserver.sample.SampleResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.recepinanc.samplegrpcserver.sample.SampleResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.recepinanc.samplegrpcserver.sample.SampleResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code SampleResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SampleResponse)
      com.recepinanc.samplegrpcserver.sample.SampleResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.recepinanc.samplegrpcserver.sample.SampleProto.internal_static_SampleResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.recepinanc.samplegrpcserver.sample.SampleProto.internal_static_SampleResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.recepinanc.samplegrpcserver.sample.SampleResponse.class, com.recepinanc.samplegrpcserver.sample.SampleResponse.Builder.class);
    }

    // Construct using com.recepinanc.samplegrpcserver.sample.SampleResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      randomNumber_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.recepinanc.samplegrpcserver.sample.SampleProto.internal_static_SampleResponse_descriptor;
    }

    public com.recepinanc.samplegrpcserver.sample.SampleResponse getDefaultInstanceForType() {
      return com.recepinanc.samplegrpcserver.sample.SampleResponse.getDefaultInstance();
    }

    public com.recepinanc.samplegrpcserver.sample.SampleResponse build() {
      com.recepinanc.samplegrpcserver.sample.SampleResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.recepinanc.samplegrpcserver.sample.SampleResponse buildPartial() {
      com.recepinanc.samplegrpcserver.sample.SampleResponse result = new com.recepinanc.samplegrpcserver.sample.SampleResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        randomNumber_ = java.util.Collections.unmodifiableList(randomNumber_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.randomNumber_ = randomNumber_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.recepinanc.samplegrpcserver.sample.SampleResponse) {
        return mergeFrom((com.recepinanc.samplegrpcserver.sample.SampleResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.recepinanc.samplegrpcserver.sample.SampleResponse other) {
      if (other == com.recepinanc.samplegrpcserver.sample.SampleResponse.getDefaultInstance()) return this;
      if (!other.randomNumber_.isEmpty()) {
        if (randomNumber_.isEmpty()) {
          randomNumber_ = other.randomNumber_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureRandomNumberIsMutable();
          randomNumber_.addAll(other.randomNumber_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.recepinanc.samplegrpcserver.sample.SampleResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.recepinanc.samplegrpcserver.sample.SampleResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> randomNumber_ = java.util.Collections.emptyList();
    private void ensureRandomNumberIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        randomNumber_ = new java.util.ArrayList<java.lang.Integer>(randomNumber_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 randomNumber = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getRandomNumberList() {
      return java.util.Collections.unmodifiableList(randomNumber_);
    }
    /**
     * <code>repeated int32 randomNumber = 1;</code>
     */
    public int getRandomNumberCount() {
      return randomNumber_.size();
    }
    /**
     * <code>repeated int32 randomNumber = 1;</code>
     */
    public int getRandomNumber(int index) {
      return randomNumber_.get(index);
    }
    /**
     * <code>repeated int32 randomNumber = 1;</code>
     */
    public Builder setRandomNumber(
        int index, int value) {
      ensureRandomNumberIsMutable();
      randomNumber_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 randomNumber = 1;</code>
     */
    public Builder addRandomNumber(int value) {
      ensureRandomNumberIsMutable();
      randomNumber_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 randomNumber = 1;</code>
     */
    public Builder addAllRandomNumber(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureRandomNumberIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, randomNumber_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 randomNumber = 1;</code>
     */
    public Builder clearRandomNumber() {
      randomNumber_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:SampleResponse)
  }

  // @@protoc_insertion_point(class_scope:SampleResponse)
  private static final com.recepinanc.samplegrpcserver.sample.SampleResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.recepinanc.samplegrpcserver.sample.SampleResponse();
  }

  public static com.recepinanc.samplegrpcserver.sample.SampleResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SampleResponse>
      PARSER = new com.google.protobuf.AbstractParser<SampleResponse>() {
    public SampleResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SampleResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SampleResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SampleResponse> getParserForType() {
    return PARSER;
  }

  public com.recepinanc.samplegrpcserver.sample.SampleResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
