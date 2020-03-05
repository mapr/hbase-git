// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Table.proto

package org.apache.hadoop.hbase.protobuf.generated;

public final class TableProtos {
  private TableProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TableNameOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hbase.pb.TableName)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required bytes namespace = 1;</code>
     * @return Whether the namespace field is set.
     */
    boolean hasNamespace();
    /**
     * <code>required bytes namespace = 1;</code>
     * @return The namespace.
     */
    com.google.protobuf.ByteString getNamespace();

    /**
     * <code>required bytes qualifier = 2;</code>
     * @return Whether the qualifier field is set.
     */
    boolean hasQualifier();
    /**
     * <code>required bytes qualifier = 2;</code>
     * @return The qualifier.
     */
    com.google.protobuf.ByteString getQualifier();
  }
  /**
   * <pre>
   **
   * Table Name
   * </pre>
   *
   * Protobuf type {@code hbase.pb.TableName}
   */
  public  static final class TableName extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hbase.pb.TableName)
      TableNameOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TableName.newBuilder() to construct.
    private TableName(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TableName() {
      namespace_ = com.google.protobuf.ByteString.EMPTY;
      qualifier_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TableName();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TableName(
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
            case 10: {
              bitField0_ |= 0x00000001;
              namespace_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              qualifier_ = input.readBytes();
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
      return org.apache.hadoop.hbase.protobuf.generated.TableProtos.internal_static_hbase_pb_TableName_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.protobuf.generated.TableProtos.internal_static_hbase_pb_TableName_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName.class, org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName.Builder.class);
    }

    private int bitField0_;
    public static final int NAMESPACE_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString namespace_;
    /**
     * <code>required bytes namespace = 1;</code>
     * @return Whether the namespace field is set.
     */
    public boolean hasNamespace() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required bytes namespace = 1;</code>
     * @return The namespace.
     */
    public com.google.protobuf.ByteString getNamespace() {
      return namespace_;
    }

    public static final int QUALIFIER_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString qualifier_;
    /**
     * <code>required bytes qualifier = 2;</code>
     * @return Whether the qualifier field is set.
     */
    public boolean hasQualifier() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required bytes qualifier = 2;</code>
     * @return The qualifier.
     */
    public com.google.protobuf.ByteString getQualifier() {
      return qualifier_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasNamespace()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasQualifier()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeBytes(1, namespace_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBytes(2, qualifier_);
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
          .computeBytesSize(1, namespace_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, qualifier_);
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
      if (!(obj instanceof org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName other = (org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName) obj;

      if (hasNamespace() != other.hasNamespace()) return false;
      if (hasNamespace()) {
        if (!getNamespace()
            .equals(other.getNamespace())) return false;
      }
      if (hasQualifier() != other.hasQualifier()) return false;
      if (hasQualifier()) {
        if (!getQualifier()
            .equals(other.getQualifier())) return false;
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
      if (hasNamespace()) {
        hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
        hash = (53 * hash) + getNamespace().hashCode();
      }
      if (hasQualifier()) {
        hash = (37 * hash) + QUALIFIER_FIELD_NUMBER;
        hash = (53 * hash) + getQualifier().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parseFrom(
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
    public static Builder newBuilder(org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName prototype) {
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
     **
     * Table Name
     * </pre>
     *
     * Protobuf type {@code hbase.pb.TableName}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hbase.pb.TableName)
        org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableNameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.protobuf.generated.TableProtos.internal_static_hbase_pb_TableName_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.protobuf.generated.TableProtos.internal_static_hbase_pb_TableName_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName.class, org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName.Builder.class);
      }

      // Construct using org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName.newBuilder()
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
        namespace_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        qualifier_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.protobuf.generated.TableProtos.internal_static_hbase_pb_TableName_descriptor;
      }

      @java.lang.Override
      public org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName.getDefaultInstance();
      }

      @java.lang.Override
      public org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName build() {
        org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName buildPartial() {
        org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName result = new org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.namespace_ = namespace_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.qualifier_ = qualifier_;
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
        if (other instanceof org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName) {
          return mergeFrom((org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName other) {
        if (other == org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName.getDefaultInstance()) return this;
        if (other.hasNamespace()) {
          setNamespace(other.getNamespace());
        }
        if (other.hasQualifier()) {
          setQualifier(other.getQualifier());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasNamespace()) {
          return false;
        }
        if (!hasQualifier()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.ByteString namespace_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes namespace = 1;</code>
       * @return Whether the namespace field is set.
       */
      public boolean hasNamespace() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required bytes namespace = 1;</code>
       * @return The namespace.
       */
      public com.google.protobuf.ByteString getNamespace() {
        return namespace_;
      }
      /**
       * <code>required bytes namespace = 1;</code>
       * @param value The namespace to set.
       * @return This builder for chaining.
       */
      public Builder setNamespace(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        namespace_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes namespace = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNamespace() {
        bitField0_ = (bitField0_ & ~0x00000001);
        namespace_ = getDefaultInstance().getNamespace();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString qualifier_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes qualifier = 2;</code>
       * @return Whether the qualifier field is set.
       */
      public boolean hasQualifier() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>required bytes qualifier = 2;</code>
       * @return The qualifier.
       */
      public com.google.protobuf.ByteString getQualifier() {
        return qualifier_;
      }
      /**
       * <code>required bytes qualifier = 2;</code>
       * @param value The qualifier to set.
       * @return This builder for chaining.
       */
      public Builder setQualifier(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        qualifier_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes qualifier = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearQualifier() {
        bitField0_ = (bitField0_ & ~0x00000002);
        qualifier_ = getDefaultInstance().getQualifier();
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


      // @@protoc_insertion_point(builder_scope:hbase.pb.TableName)
    }

    // @@protoc_insertion_point(class_scope:hbase.pb.TableName)
    private static final org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName();
    }

    public static org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TableName>
        PARSER = new com.google.protobuf.AbstractParser<TableName>() {
      @java.lang.Override
      public TableName parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TableName(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TableName> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TableName> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hadoop.hbase.protobuf.generated.TableProtos.TableName getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hbase_pb_TableName_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hbase_pb_TableName_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Table.proto\022\010hbase.pb\"1\n\tTableName\022\021\n\t" +
      "namespace\030\001 \002(\014\022\021\n\tqualifier\030\002 \002(\014B>\n*or" +
      "g.apache.hadoop.hbase.protobuf.generated" +
      "B\013TableProtosH\001\240\001\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_hbase_pb_TableName_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hbase_pb_TableName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hbase_pb_TableName_descriptor,
        new java.lang.String[] { "Namespace", "Qualifier", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
