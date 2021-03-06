// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imageTransfer.proto

package pipe.work;

public final class ImageTransfer {
  private ImageTransfer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ImageMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ImageMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 version = 1;</code>
     */
    boolean hasVersion();
    /**
     * <code>required int32 version = 1;</code>
     */
    int getVersion();

    /**
     * <code>required bytes imageData = 2;</code>
     */
    boolean hasImageData();
    /**
     * <code>required bytes imageData = 2;</code>
     */
    com.google.protobuf.ByteString getImageData();
  }
  /**
   * Protobuf type {@code ImageMsg}
   */
  public static final class ImageMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ImageMsg)
      ImageMsgOrBuilder {
    // Use ImageMsg.newBuilder() to construct.
    private ImageMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ImageMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ImageMsg defaultInstance;
    public static ImageMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ImageMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ImageMsg(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              version_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              imageData_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pipe.work.ImageTransfer.internal_static_ImageMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pipe.work.ImageTransfer.internal_static_ImageMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pipe.work.ImageTransfer.ImageMsg.class, pipe.work.ImageTransfer.ImageMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ImageMsg> PARSER =
        new com.google.protobuf.AbstractParser<ImageMsg>() {
      public ImageMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ImageMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ImageMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;
    /**
     * <code>required int32 version = 1;</code>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 version = 1;</code>
     */
    public int getVersion() {
      return version_;
    }

    public static final int IMAGEDATA_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString imageData_;
    /**
     * <code>required bytes imageData = 2;</code>
     */
    public boolean hasImageData() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bytes imageData = 2;</code>
     */
    public com.google.protobuf.ByteString getImageData() {
      return imageData_;
    }

    private void initFields() {
      version_ = 0;
      imageData_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasImageData()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, version_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, imageData_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, version_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, imageData_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static pipe.work.ImageTransfer.ImageMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pipe.work.ImageTransfer.ImageMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pipe.work.ImageTransfer.ImageMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pipe.work.ImageTransfer.ImageMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pipe.work.ImageTransfer.ImageMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static pipe.work.ImageTransfer.ImageMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static pipe.work.ImageTransfer.ImageMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static pipe.work.ImageTransfer.ImageMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static pipe.work.ImageTransfer.ImageMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static pipe.work.ImageTransfer.ImageMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(pipe.work.ImageTransfer.ImageMsg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ImageMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ImageMsg)
        pipe.work.ImageTransfer.ImageMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pipe.work.ImageTransfer.internal_static_ImageMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pipe.work.ImageTransfer.internal_static_ImageMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                pipe.work.ImageTransfer.ImageMsg.class, pipe.work.ImageTransfer.ImageMsg.Builder.class);
      }

      // Construct using pipe.work.ImageTransfer.ImageMsg.newBuilder()
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
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        version_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        imageData_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pipe.work.ImageTransfer.internal_static_ImageMsg_descriptor;
      }

      public pipe.work.ImageTransfer.ImageMsg getDefaultInstanceForType() {
        return pipe.work.ImageTransfer.ImageMsg.getDefaultInstance();
      }

      public pipe.work.ImageTransfer.ImageMsg build() {
        pipe.work.ImageTransfer.ImageMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public pipe.work.ImageTransfer.ImageMsg buildPartial() {
        pipe.work.ImageTransfer.ImageMsg result = new pipe.work.ImageTransfer.ImageMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.version_ = version_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.imageData_ = imageData_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof pipe.work.ImageTransfer.ImageMsg) {
          return mergeFrom((pipe.work.ImageTransfer.ImageMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(pipe.work.ImageTransfer.ImageMsg other) {
        if (other == pipe.work.ImageTransfer.ImageMsg.getDefaultInstance()) return this;
        if (other.hasVersion()) {
          setVersion(other.getVersion());
        }
        if (other.hasImageData()) {
          setImageData(other.getImageData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasVersion()) {
          
          return false;
        }
        if (!hasImageData()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        pipe.work.ImageTransfer.ImageMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (pipe.work.ImageTransfer.ImageMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int version_ ;
      /**
       * <code>required int32 version = 1;</code>
       */
      public boolean hasVersion() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 version = 1;</code>
       */
      public int getVersion() {
        return version_;
      }
      /**
       * <code>required int32 version = 1;</code>
       */
      public Builder setVersion(int value) {
        bitField0_ |= 0x00000001;
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 version = 1;</code>
       */
      public Builder clearVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        version_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString imageData_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes imageData = 2;</code>
       */
      public boolean hasImageData() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required bytes imageData = 2;</code>
       */
      public com.google.protobuf.ByteString getImageData() {
        return imageData_;
      }
      /**
       * <code>required bytes imageData = 2;</code>
       */
      public Builder setImageData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        imageData_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes imageData = 2;</code>
       */
      public Builder clearImageData() {
        bitField0_ = (bitField0_ & ~0x00000002);
        imageData_ = getDefaultInstance().getImageData();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ImageMsg)
    }

    static {
      defaultInstance = new ImageMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ImageMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImageMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ImageMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023imageTransfer.proto\".\n\010ImageMsg\022\017\n\007ver" +
      "sion\030\001 \002(\005\022\021\n\timageData\030\002 \002(\014B\014\n\nraft.pr" +
      "oto"
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
    internal_static_ImageMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ImageMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ImageMsg_descriptor,
        new java.lang.String[] { "Version", "ImageData", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
