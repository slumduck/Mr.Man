// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/resources/first.proto

package hh.mm.nn;

public final class MessageA {
  private MessageA() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Message_AOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Message_A)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>required string sex = 2;</code>
     */
    boolean hasSex();
    /**
     * <code>required string sex = 2;</code>
     */
    java.lang.String getSex();
    /**
     * <code>required string sex = 2;</code>
     */
    com.google.protobuf.ByteString
        getSexBytes();

    /**
     * <code>required int32 age = 3;</code>
     */
    boolean hasAge();
    /**
     * <code>required int32 age = 3;</code>
     */
    int getAge();
  }
  /**
   * Protobuf type {@code Message_A}
   */
  public  static final class Message_A extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Message_A)
      Message_AOrBuilder {
    // Use Message_A.newBuilder() to construct.
    private Message_A(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Message_A() {
      id_ = 0;
      sex_ = "";
      age_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Message_A(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              sex_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              age_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hh.mm.nn.MessageA.internal_static_Message_A_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hh.mm.nn.MessageA.internal_static_Message_A_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hh.mm.nn.MessageA.Message_A.class, hh.mm.nn.MessageA.Message_A.Builder.class);
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>required int32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int SEX_FIELD_NUMBER = 2;
    private volatile java.lang.Object sex_;
    /**
     * <code>required string sex = 2;</code>
     */
    public boolean hasSex() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string sex = 2;</code>
     */
    public java.lang.String getSex() {
      java.lang.Object ref = sex_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sex_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string sex = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSexBytes() {
      java.lang.Object ref = sex_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sex_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 3;
    private int age_;
    /**
     * <code>required int32 age = 3;</code>
     */
    public boolean hasAge() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 age = 3;</code>
     */
    public int getAge() {
      return age_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSex()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAge()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, sex_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, age_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, sex_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, age_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static hh.mm.nn.MessageA.Message_A parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hh.mm.nn.MessageA.Message_A parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hh.mm.nn.MessageA.Message_A parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static hh.mm.nn.MessageA.Message_A parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static hh.mm.nn.MessageA.Message_A parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static hh.mm.nn.MessageA.Message_A parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static hh.mm.nn.MessageA.Message_A parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static hh.mm.nn.MessageA.Message_A parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static hh.mm.nn.MessageA.Message_A parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static hh.mm.nn.MessageA.Message_A parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(hh.mm.nn.MessageA.Message_A prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Message_A}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Message_A)
        hh.mm.nn.MessageA.Message_AOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return hh.mm.nn.MessageA.internal_static_Message_A_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return hh.mm.nn.MessageA.internal_static_Message_A_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                hh.mm.nn.MessageA.Message_A.class, hh.mm.nn.MessageA.Message_A.Builder.class);
      }

      // Construct using hh.mm.nn.MessageA.Message_A.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        sex_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        age_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return hh.mm.nn.MessageA.internal_static_Message_A_descriptor;
      }

      public hh.mm.nn.MessageA.Message_A getDefaultInstanceForType() {
        return hh.mm.nn.MessageA.Message_A.getDefaultInstance();
      }

      public hh.mm.nn.MessageA.Message_A build() {
        hh.mm.nn.MessageA.Message_A result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public hh.mm.nn.MessageA.Message_A buildPartial() {
        hh.mm.nn.MessageA.Message_A result = new hh.mm.nn.MessageA.Message_A(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.sex_ = sex_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.age_ = age_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof hh.mm.nn.MessageA.Message_A) {
          return mergeFrom((hh.mm.nn.MessageA.Message_A)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(hh.mm.nn.MessageA.Message_A other) {
        if (other == hh.mm.nn.MessageA.Message_A.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasSex()) {
          bitField0_ |= 0x00000002;
          sex_ = other.sex_;
          onChanged();
        }
        if (other.hasAge()) {
          setAge(other.getAge());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          return false;
        }
        if (!hasSex()) {
          return false;
        }
        if (!hasAge()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        hh.mm.nn.MessageA.Message_A parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (hh.mm.nn.MessageA.Message_A) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>required int32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object sex_ = "";
      /**
       * <code>required string sex = 2;</code>
       */
      public boolean hasSex() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string sex = 2;</code>
       */
      public java.lang.String getSex() {
        java.lang.Object ref = sex_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            sex_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string sex = 2;</code>
       */
      public com.google.protobuf.ByteString
          getSexBytes() {
        java.lang.Object ref = sex_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sex_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string sex = 2;</code>
       */
      public Builder setSex(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        sex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string sex = 2;</code>
       */
      public Builder clearSex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        sex_ = getDefaultInstance().getSex();
        onChanged();
        return this;
      }
      /**
       * <code>required string sex = 2;</code>
       */
      public Builder setSexBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        sex_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>required int32 age = 3;</code>
       */
      public boolean hasAge() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 age = 3;</code>
       */
      public int getAge() {
        return age_;
      }
      /**
       * <code>required int32 age = 3;</code>
       */
      public Builder setAge(int value) {
        bitField0_ |= 0x00000004;
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 age = 3;</code>
       */
      public Builder clearAge() {
        bitField0_ = (bitField0_ & ~0x00000004);
        age_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Message_A)
    }

    // @@protoc_insertion_point(class_scope:Message_A)
    private static final hh.mm.nn.MessageA.Message_A DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new hh.mm.nn.MessageA.Message_A();
    }

    public static hh.mm.nn.MessageA.Message_A getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Message_A>
        PARSER = new com.google.protobuf.AbstractParser<Message_A>() {
      public Message_A parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new Message_A(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<Message_A> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Message_A> getParserForType() {
      return PARSER;
    }

    public hh.mm.nn.MessageA.Message_A getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Message_A_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Message_A_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032main/resources/first.proto\"1\n\tMessage_" +
      "A\022\n\n\002id\030\001 \002(\005\022\013\n\003sex\030\002 \002(\t\022\013\n\003age\030\003 \002(\005B" +
      "\024\n\010hh.mm.nnB\010MessageA"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_Message_A_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Message_A_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Message_A_descriptor,
        new java.lang.String[] { "Id", "Sex", "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
