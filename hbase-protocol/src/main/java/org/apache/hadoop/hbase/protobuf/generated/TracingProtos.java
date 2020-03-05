// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tracing.proto

package org.apache.hadoop.hbase.protobuf.generated;

public final class TracingProtos {
  private TracingProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RPCTInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hbase.pb.RPCTInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 trace_id = 1;</code>
     * @return Whether the traceId field is set.
     */
    boolean hasTraceId();
    /**
     * <code>optional int64 trace_id = 1;</code>
     * @return The traceId.
     */
    long getTraceId();

    /**
     * <code>optional int64 parent_id = 2;</code>
     * @return Whether the parentId field is set.
     */
    boolean hasParentId();
    /**
     * <code>optional int64 parent_id = 2;</code>
     * @return The parentId.
     */
    long getParentId();
  }
  /**
   * <pre>
   *Used to pass through the information necessary to continue
   *a trace after an RPC is made. All we need is the traceid 
   *(so we know the overarching trace this message is a part of), and
   *the id of the current span when this message was sent, so we know 
   *what span caused the new span we will create when this message is received.
   * </pre>
   *
   * Protobuf type {@code hbase.pb.RPCTInfo}
   */
  public  static final class RPCTInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hbase.pb.RPCTInfo)
      RPCTInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RPCTInfo.newBuilder() to construct.
    private RPCTInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RPCTInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RPCTInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RPCTInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              traceId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              parentId_ = input.readInt64();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.protobuf.generated.TracingProtos.internal_static_hbase_pb_RPCTInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.protobuf.generated.TracingProtos.internal_static_hbase_pb_RPCTInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo.class, org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo.Builder.class);
    }

    private int bitField0_;
    public static final int TRACE_ID_FIELD_NUMBER = 1;
    private long traceId_;
    /**
     * <code>optional int64 trace_id = 1;</code>
     * @return Whether the traceId field is set.
     */
    public boolean hasTraceId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 trace_id = 1;</code>
     * @return The traceId.
     */
    public long getTraceId() {
      return traceId_;
    }

    public static final int PARENT_ID_FIELD_NUMBER = 2;
    private long parentId_;
    /**
     * <code>optional int64 parent_id = 2;</code>
     * @return Whether the parentId field is set.
     */
    public boolean hasParentId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int64 parent_id = 2;</code>
     * @return The parentId.
     */
    public long getParentId() {
      return parentId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt64(1, traceId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt64(2, parentId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, traceId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, parentId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo other = (org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo) obj;

      if (hasTraceId() != other.hasTraceId()) return false;
      if (hasTraceId()) {
        if (getTraceId()
            != other.getTraceId()) return false;
      }
      if (hasParentId() != other.hasParentId()) return false;
      if (hasParentId()) {
        if (getParentId()
            != other.getParentId()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTraceId()) {
        hash = (37 * hash) + TRACE_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getTraceId());
      }
      if (hasParentId()) {
        hash = (37 * hash) + PARENT_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getParentId());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     *Used to pass through the information necessary to continue
     *a trace after an RPC is made. All we need is the traceid 
     *(so we know the overarching trace this message is a part of), and
     *the id of the current span when this message was sent, so we know 
     *what span caused the new span we will create when this message is received.
     * </pre>
     *
     * Protobuf type {@code hbase.pb.RPCTInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hbase.pb.RPCTInfo)
        org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.protobuf.generated.TracingProtos.internal_static_hbase_pb_RPCTInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.protobuf.generated.TracingProtos.internal_static_hbase_pb_RPCTInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo.class, org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo.Builder.class);
      }

      // Construct using org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        traceId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        parentId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.protobuf.generated.TracingProtos.internal_static_hbase_pb_RPCTInfo_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo build() {
        org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo buildPartial() {
        org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo result = new org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.traceId_ = traceId_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.parentId_ = parentId_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo) {
          return mergeFrom((org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo other) {
        if (other == org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo.getDefaultInstance()) return this;
        if (other.hasTraceId()) {
          setTraceId(other.getTraceId());
        }
        if (other.hasParentId()) {
          setParentId(other.getParentId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long traceId_ ;
      /**
       * <code>optional int64 trace_id = 1;</code>
       * @return Whether the traceId field is set.
       */
      public boolean hasTraceId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int64 trace_id = 1;</code>
       * @return The traceId.
       */
      public long getTraceId() {
        return traceId_;
      }
      /**
       * <code>optional int64 trace_id = 1;</code>
       * @param value The traceId to set.
       * @return This builder for chaining.
       */
      public Builder setTraceId(long value) {
        bitField0_ |= 0x00000001;
        traceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 trace_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTraceId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        traceId_ = 0L;
        onChanged();
        return this;
      }

      private long parentId_ ;
      /**
       * <code>optional int64 parent_id = 2;</code>
       * @return Whether the parentId field is set.
       */
      public boolean hasParentId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int64 parent_id = 2;</code>
       * @return The parentId.
       */
      public long getParentId() {
        return parentId_;
      }
      /**
       * <code>optional int64 parent_id = 2;</code>
       * @param value The parentId to set.
       * @return This builder for chaining.
       */
      public Builder setParentId(long value) {
        bitField0_ |= 0x00000002;
        parentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 parent_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        parentId_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hbase.pb.RPCTInfo)
    }

    // @@protoc_insertion_point(class_scope:hbase.pb.RPCTInfo)
    private static final org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo();
    }

    public static org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<RPCTInfo>
        PARSER = new com.google.protobuf.AbstractParser<RPCTInfo>() {
      @java.lang.Override
      public RPCTInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RPCTInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RPCTInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RPCTInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hbase.protobuf.generated.TracingProtos.RPCTInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hbase_pb_RPCTInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hbase_pb_RPCTInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rTracing.proto\022\010hbase.pb\"/\n\010RPCTInfo\022\020\n" +
      "\010trace_id\030\001 \001(\003\022\021\n\tparent_id\030\002 \001(\003B@\n*or" +
      "g.apache.hadoop.hbase.protobuf.generated" +
      "B\rTracingProtosH\001\240\001\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_hbase_pb_RPCTInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hbase_pb_RPCTInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hbase_pb_RPCTInfo_descriptor,
        new java.lang.String[] { "TraceId", "ParentId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
