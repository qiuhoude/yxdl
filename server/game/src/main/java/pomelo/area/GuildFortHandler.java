package pomelo.area;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.SingleFieldBuilder;
import com.google.protobuf.UnknownFieldSet;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pomelo.Common;
import pomelo.item.ItemOuterClass;


public final class GuildFortHandler {
    public static void registerAllExtensions(ExtensionRegistry registry) {
    }

    public static final class GuildAreaInfo
            extends GeneratedMessage
            implements GuildAreaInfoOrBuilder {
        private static final GuildAreaInfo defaultInstance = new GuildAreaInfo(true);
        private final UnknownFieldSet unknownFields;

        private GuildAreaInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GuildAreaInfo(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GuildAreaInfo getDefaultInstance() {
            return defaultInstance;
        }

        public GuildAreaInfo getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GuildAreaInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.areaId_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.applied_ = input.readInt32();
                            break;
                        case 26:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x4;
                            this.guildId_ = bs;
                            break;
                        case 34:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x8;
                            this.guildName_ = bs;
                            break;
                        case 42:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x10;
                            this.guildName1_ = bs;
                            break;
                        case 50:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x20;
                            this.guildName2_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_GuildAreaInfo_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_GuildAreaInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildAreaInfo.class, Builder.class);
        }

        public static Parser<GuildAreaInfo> PARSER = (Parser<GuildAreaInfo>) new AbstractParser<GuildAreaInfo>() {
            public GuildFortHandler.GuildAreaInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.GuildAreaInfo(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int AREAID_FIELD_NUMBER = 1;
        private int areaId_;
        public static final int APPLIED_FIELD_NUMBER = 2;
        private int applied_;
        public static final int GUILDID_FIELD_NUMBER = 3;
        private Object guildId_;
        public static final int GUILDNAME_FIELD_NUMBER = 4;
        private Object guildName_;
        public static final int GUILDNAME1_FIELD_NUMBER = 5;
        private Object guildName1_;
        public static final int GUILDNAME2_FIELD_NUMBER = 6;
        private Object guildName2_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GuildAreaInfo> getParserForType() {
            return PARSER;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        public boolean hasApplied() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getApplied() {
            return this.applied_;
        }

        public boolean hasGuildId() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public String getGuildId() {
            Object ref = this.guildId_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildId_ = s;
            return s;
        }

        public ByteString getGuildIdBytes() {
            Object ref = this.guildId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildName() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public String getGuildName() {
            Object ref = this.guildName_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildName_ = s;
            return s;
        }

        public ByteString getGuildNameBytes() {
            Object ref = this.guildName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildName1() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public String getGuildName1() {
            Object ref = this.guildName1_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildName1_ = s;
            return s;
        }

        public ByteString getGuildName1Bytes() {
            Object ref = this.guildName1_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildName1_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildName2() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public String getGuildName2() {
            Object ref = this.guildName2_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildName2_ = s;
            return s;
        }

        public ByteString getGuildName2Bytes() {
            Object ref = this.guildName2_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildName2_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.areaId_ = 0;
            this.applied_ = 0;
            this.guildId_ = "";
            this.guildName_ = "";
            this.guildName1_ = "";
            this.guildName2_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasApplied()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildName1()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildName2()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.areaId_);
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.applied_);
            if ((this.bitField0_ & 0x4) == 4) output.writeBytes(3, getGuildIdBytes());
            if ((this.bitField0_ & 0x8) == 8) output.writeBytes(4, getGuildNameBytes());
            if ((this.bitField0_ & 0x10) == 16) output.writeBytes(5, getGuildName1Bytes());
            if ((this.bitField0_ & 0x20) == 32) output.writeBytes(6, getGuildName2Bytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.areaId_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.applied_);
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeBytesSize(3, getGuildIdBytes());
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeBytesSize(4, getGuildNameBytes());
            if ((this.bitField0_ & 0x10) == 16) size += CodedOutputStream.computeBytesSize(5, getGuildName1Bytes());
            if ((this.bitField0_ & 0x20) == 32) size += CodedOutputStream.computeBytesSize(6, getGuildName2Bytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GuildAreaInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GuildAreaInfo) PARSER.parseFrom(data);
        }

        public static GuildAreaInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GuildAreaInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GuildAreaInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GuildAreaInfo) PARSER.parseFrom(data);
        }

        public static GuildAreaInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GuildAreaInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GuildAreaInfo parseFrom(InputStream input) throws IOException {
            return (GuildAreaInfo) PARSER.parseFrom(input);
        }

        public static GuildAreaInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GuildAreaInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GuildAreaInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (GuildAreaInfo) PARSER.parseDelimitedFrom(input);
        }

        public static GuildAreaInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GuildAreaInfo) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GuildAreaInfo parseFrom(CodedInputStream input) throws IOException {
            return (GuildAreaInfo) PARSER.parseFrom(input);
        }

        public static GuildAreaInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GuildAreaInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GuildAreaInfo prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.GuildAreaInfoOrBuilder {
            private int bitField0_;
            private int areaId_;
            private int applied_;
            private Object guildId_;
            private Object guildName_;
            private Object guildName1_;
            private Object guildName2_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_GuildAreaInfo_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_GuildAreaInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.GuildAreaInfo.class, Builder.class);
            }

            private Builder() {
                this.guildId_ = "";
                this.guildName_ = "";
                this.guildName1_ = "";
                this.guildName2_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.guildId_ = "";
                this.guildName_ = "";
                this.guildName1_ = "";
                this.guildName2_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.GuildAreaInfo.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.applied_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildId_ = "";
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildName_ = "";
                this.bitField0_ &= 0xFFFFFFF7;
                this.guildName1_ = "";
                this.bitField0_ &= 0xFFFFFFEF;
                this.guildName2_ = "";
                this.bitField0_ &= 0xFFFFFFDF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_GuildAreaInfo_descriptor;
            }

            public GuildFortHandler.GuildAreaInfo getDefaultInstanceForType() {
                return GuildFortHandler.GuildAreaInfo.getDefaultInstance();
            }

            public GuildFortHandler.GuildAreaInfo build() {
                GuildFortHandler.GuildAreaInfo result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.GuildAreaInfo buildPartial() {
                GuildFortHandler.GuildAreaInfo result = new GuildFortHandler.GuildAreaInfo(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.areaId_ = this.areaId_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.applied_ = this.applied_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.guildId_ = this.guildId_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.guildName_ = this.guildName_;
                if ((from_bitField0_ & 0x10) == 16) to_bitField0_ |= 0x10;
                result.guildName1_ = this.guildName1_;
                if ((from_bitField0_ & 0x20) == 32) to_bitField0_ |= 0x20;
                result.guildName2_ = this.guildName2_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.GuildAreaInfo)
                    return mergeFrom((GuildFortHandler.GuildAreaInfo) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.GuildAreaInfo other) {
                if (other == GuildFortHandler.GuildAreaInfo.getDefaultInstance()) return this;
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                if (other.hasApplied()) setApplied(other.getApplied());
                if (other.hasGuildId()) {
                    this.bitField0_ |= 0x4;
                    this.guildId_ = other.guildId_;
                    onChanged();
                }
                if (other.hasGuildName()) {
                    this.bitField0_ |= 0x8;
                    this.guildName_ = other.guildName_;
                    onChanged();
                }
                if (other.hasGuildName1()) {
                    this.bitField0_ |= 0x10;
                    this.guildName1_ = other.guildName1_;
                    onChanged();
                }
                if (other.hasGuildName2()) {
                    this.bitField0_ |= 0x20;
                    this.guildName2_ = other.guildName2_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAreaId()) return false;
                if (!hasApplied()) return false;
                if (!hasGuildId()) return false;
                if (!hasGuildName()) return false;
                if (!hasGuildName1()) return false;
                if (!hasGuildName2()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.GuildAreaInfo parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.GuildAreaInfo) GuildFortHandler.GuildAreaInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.GuildAreaInfo) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x1;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasApplied() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getApplied() {
                return this.applied_;
            }

            public Builder setApplied(int value) {
                this.bitField0_ |= 0x2;
                this.applied_ = value;
                onChanged();
                return this;
            }

            public Builder clearApplied() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.applied_ = 0;
                onChanged();
                return this;
            }

            public boolean hasGuildId() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public String getGuildId() {
                Object ref = this.guildId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.guildId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildIdBytes() {
                Object ref = this.guildId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildId(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.guildId_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildId() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildId_ = GuildFortHandler.GuildAreaInfo.getDefaultInstance().getGuildId();
                onChanged();
                return this;
            }

            public Builder setGuildIdBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.guildId_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildName() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public String getGuildName() {
                Object ref = this.guildName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.guildName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildNameBytes() {
                Object ref = this.guildName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x8;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildName() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.guildName_ = GuildFortHandler.GuildAreaInfo.getDefaultInstance().getGuildName();
                onChanged();
                return this;
            }

            public Builder setGuildNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x8;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildName1() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public String getGuildName1() {
                Object ref = this.guildName1_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.guildName1_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildName1Bytes() {
                Object ref = this.guildName1_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildName1_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildName1(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.guildName1_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildName1() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.guildName1_ = GuildFortHandler.GuildAreaInfo.getDefaultInstance().getGuildName1();
                onChanged();
                return this;
            }

            public Builder setGuildName1Bytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.guildName1_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildName2() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public String getGuildName2() {
                Object ref = this.guildName2_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.guildName2_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildName2Bytes() {
                Object ref = this.guildName2_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildName2_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildName2(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x20;
                this.guildName2_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildName2() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.guildName2_ = GuildFortHandler.GuildAreaInfo.getDefaultInstance().getGuildName2();
                onChanged();
                return this;
            }

            public Builder setGuildName2Bytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x20;
                this.guildName2_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GetGuildAreaListRequest
            extends GeneratedMessage
            implements GetGuildAreaListRequestOrBuilder {
        private static final GetGuildAreaListRequest defaultInstance = new GetGuildAreaListRequest(true);
        private final UnknownFieldSet unknownFields;

        private GetGuildAreaListRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetGuildAreaListRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetGuildAreaListRequest getDefaultInstance() {
            return defaultInstance;
        }

        public GetGuildAreaListRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetGuildAreaListRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            continue;
                    }
                    if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) done = true;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaListRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetGuildAreaListRequest.class, Builder.class);
        }

        public static Parser<GetGuildAreaListRequest> PARSER = (Parser<GetGuildAreaListRequest>) new AbstractParser<GetGuildAreaListRequest>() {
            public GuildFortHandler.GetGuildAreaListRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.GetGuildAreaListRequest(input, extensionRegistry);
            }
        };
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetGuildAreaListRequest> getParserForType() {
            return PARSER;
        }

        private void initFields() {
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetGuildAreaListRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetGuildAreaListRequest) PARSER.parseFrom(data);
        }

        public static GetGuildAreaListRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaListRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaListRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetGuildAreaListRequest) PARSER.parseFrom(data);
        }

        public static GetGuildAreaListRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaListRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaListRequest parseFrom(InputStream input) throws IOException {
            return (GetGuildAreaListRequest) PARSER.parseFrom(input);
        }

        public static GetGuildAreaListRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaListRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetGuildAreaListRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (GetGuildAreaListRequest) PARSER.parseDelimitedFrom(input);
        }

        public static GetGuildAreaListRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaListRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetGuildAreaListRequest parseFrom(CodedInputStream input) throws IOException {
            return (GetGuildAreaListRequest) PARSER.parseFrom(input);
        }

        public static GetGuildAreaListRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaListRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetGuildAreaListRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.GetGuildAreaListRequestOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaListRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.GetGuildAreaListRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.GetGuildAreaListRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaListRequest_descriptor;
            }

            public GuildFortHandler.GetGuildAreaListRequest getDefaultInstanceForType() {
                return GuildFortHandler.GetGuildAreaListRequest.getDefaultInstance();
            }

            public GuildFortHandler.GetGuildAreaListRequest build() {
                GuildFortHandler.GetGuildAreaListRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.GetGuildAreaListRequest buildPartial() {
                GuildFortHandler.GetGuildAreaListRequest result = new GuildFortHandler.GetGuildAreaListRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.GetGuildAreaListRequest)
                    return mergeFrom((GuildFortHandler.GetGuildAreaListRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.GetGuildAreaListRequest other) {
                if (other == GuildFortHandler.GetGuildAreaListRequest.getDefaultInstance()) return this;
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.GetGuildAreaListRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.GetGuildAreaListRequest) GuildFortHandler.GetGuildAreaListRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.GetGuildAreaListRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GetGuildAreaListResponse
            extends GeneratedMessage
            implements GetGuildAreaListResponseOrBuilder {
        private static final GetGuildAreaListResponse defaultInstance = new GetGuildAreaListResponse(true);
        private final UnknownFieldSet unknownFields;

        private GetGuildAreaListResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetGuildAreaListResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetGuildAreaListResponse getDefaultInstance() {
            return defaultInstance;
        }

        public GetGuildAreaListResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetGuildAreaListResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.curStatus_ = input.readInt32();
                            break;
                        case 34:
                            if ((mutable_bitField0_ & 0x8) != 8) {
                                this.areaList_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.areaList_.add(input.readMessage(GuildFortHandler.GuildAreaInfo.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x8) == 8) this.areaList_ = Collections.unmodifiableList(this.areaList_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaListResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetGuildAreaListResponse.class, Builder.class);
        }

        public static Parser<GetGuildAreaListResponse> PARSER = (Parser<GetGuildAreaListResponse>) new AbstractParser<GetGuildAreaListResponse>() {
            public GuildFortHandler.GetGuildAreaListResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.GetGuildAreaListResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int CURSTATUS_FIELD_NUMBER = 3;
        private int curStatus_;
        public static final int AREALIST_FIELD_NUMBER = 4;
        private List<GuildFortHandler.GuildAreaInfo> areaList_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetGuildAreaListResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasCurStatus() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getCurStatus() {
            return this.curStatus_;
        }

        public List<GuildFortHandler.GuildAreaInfo> getAreaListList() {
            return this.areaList_;
        }

        public List<? extends GuildFortHandler.GuildAreaInfoOrBuilder> getAreaListOrBuilderList() {
            return (List) this.areaList_;
        }

        public int getAreaListCount() {
            return this.areaList_.size();
        }

        public GuildFortHandler.GuildAreaInfo getAreaList(int index) {
            return this.areaList_.get(index);
        }

        public GuildFortHandler.GuildAreaInfoOrBuilder getAreaListOrBuilder(int index) {
            return this.areaList_.get(index);
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.curStatus_ = 0;
            this.areaList_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasCurStatus()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getAreaListCount(); i++) {
                if (!getAreaList(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.curStatus_);
            for (int i = 0; i < this.areaList_.size(); i++) output.writeMessage(4, (MessageLite) this.areaList_.get(i));
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.curStatus_);
            for (int i = 0; i < this.areaList_.size(); i++)
                size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.areaList_.get(i));
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetGuildAreaListResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetGuildAreaListResponse) PARSER.parseFrom(data);
        }

        public static GetGuildAreaListResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaListResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaListResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetGuildAreaListResponse) PARSER.parseFrom(data);
        }

        public static GetGuildAreaListResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaListResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaListResponse parseFrom(InputStream input) throws IOException {
            return (GetGuildAreaListResponse) PARSER.parseFrom(input);
        }

        public static GetGuildAreaListResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaListResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetGuildAreaListResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (GetGuildAreaListResponse) PARSER.parseDelimitedFrom(input);
        }

        public static GetGuildAreaListResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaListResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetGuildAreaListResponse parseFrom(CodedInputStream input) throws IOException {
            return (GetGuildAreaListResponse) PARSER.parseFrom(input);
        }

        public static GetGuildAreaListResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaListResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetGuildAreaListResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.GetGuildAreaListResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private int curStatus_;
            private List<GuildFortHandler.GuildAreaInfo> areaList_;
            private RepeatedFieldBuilder<GuildFortHandler.GuildAreaInfo, GuildFortHandler.GuildAreaInfo.Builder, GuildFortHandler.GuildAreaInfoOrBuilder> areaListBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaListResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.GetGuildAreaListResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.areaList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.areaList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.GetGuildAreaListResponse.alwaysUseFieldBuilders) getAreaListFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.curStatus_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                if (this.areaListBuilder_ == null) {
                    this.areaList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                } else {
                    this.areaListBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaListResponse_descriptor;
            }

            public GuildFortHandler.GetGuildAreaListResponse getDefaultInstanceForType() {
                return GuildFortHandler.GetGuildAreaListResponse.getDefaultInstance();
            }

            public GuildFortHandler.GetGuildAreaListResponse build() {
                GuildFortHandler.GetGuildAreaListResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.GetGuildAreaListResponse buildPartial() {
                GuildFortHandler.GetGuildAreaListResponse result = new GuildFortHandler.GetGuildAreaListResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.curStatus_ = this.curStatus_;
                if (this.areaListBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) == 8) {
                        this.areaList_ = Collections.unmodifiableList(this.areaList_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.areaList_ = this.areaList_;
                } else {
                    result.areaList_ = this.areaListBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.GetGuildAreaListResponse)
                    return mergeFrom((GuildFortHandler.GetGuildAreaListResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.GetGuildAreaListResponse other) {
                if (other == GuildFortHandler.GetGuildAreaListResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasCurStatus()) setCurStatus(other.getCurStatus());
                if (this.areaListBuilder_ == null) {
                    if (!other.areaList_.isEmpty()) {
                        if (this.areaList_.isEmpty()) {
                            this.areaList_ = other.areaList_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        } else {
                            ensureAreaListIsMutable();
                            this.areaList_.addAll(other.areaList_);
                        }
                        onChanged();
                    }
                } else if (!other.areaList_.isEmpty()) {
                    if (this.areaListBuilder_.isEmpty()) {
                        this.areaListBuilder_.dispose();
                        this.areaListBuilder_ = null;
                        this.areaList_ = other.areaList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.areaListBuilder_ = GuildFortHandler.GetGuildAreaListResponse.alwaysUseFieldBuilders ? getAreaListFieldBuilder() : null;
                    } else {
                        this.areaListBuilder_.addAllMessages(other.areaList_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                if (!hasCurStatus()) return false;
                for (int i = 0; i < getAreaListCount(); i++) {
                    if (!getAreaList(i).isInitialized()) return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.GetGuildAreaListResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.GetGuildAreaListResponse) GuildFortHandler.GetGuildAreaListResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.GetGuildAreaListResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.GetGuildAreaListResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public boolean hasCurStatus() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getCurStatus() {
                return this.curStatus_;
            }

            public Builder setCurStatus(int value) {
                this.bitField0_ |= 0x4;
                this.curStatus_ = value;
                onChanged();
                return this;
            }

            public Builder clearCurStatus() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.curStatus_ = 0;
                onChanged();
                return this;
            }

            private void ensureAreaListIsMutable() {
                if ((this.bitField0_ & 0x8) != 8) {
                    this.areaList_ = new ArrayList<>(this.areaList_);
                    this.bitField0_ |= 0x8;
                }
            }

            public List<GuildFortHandler.GuildAreaInfo> getAreaListList() {
                if (this.areaListBuilder_ == null) return Collections.unmodifiableList(this.areaList_);
                return this.areaListBuilder_.getMessageList();
            }

            public int getAreaListCount() {
                if (this.areaListBuilder_ == null) return this.areaList_.size();
                return this.areaListBuilder_.getCount();
            }

            public GuildFortHandler.GuildAreaInfo getAreaList(int index) {
                if (this.areaListBuilder_ == null) return this.areaList_.get(index);
                return (GuildFortHandler.GuildAreaInfo) this.areaListBuilder_.getMessage(index);
            }

            public Builder setAreaList(int index, GuildFortHandler.GuildAreaInfo value) {
                if (this.areaListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureAreaListIsMutable();
                    this.areaList_.set(index, value);
                    onChanged();
                } else {
                    this.areaListBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setAreaList(int index, GuildFortHandler.GuildAreaInfo.Builder builderForValue) {
                if (this.areaListBuilder_ == null) {
                    ensureAreaListIsMutable();
                    this.areaList_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.areaListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAreaList(GuildFortHandler.GuildAreaInfo value) {
                if (this.areaListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureAreaListIsMutable();
                    this.areaList_.add(value);
                    onChanged();
                } else {
                    this.areaListBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addAreaList(int index, GuildFortHandler.GuildAreaInfo value) {
                if (this.areaListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureAreaListIsMutable();
                    this.areaList_.add(index, value);
                    onChanged();
                } else {
                    this.areaListBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addAreaList(GuildFortHandler.GuildAreaInfo.Builder builderForValue) {
                if (this.areaListBuilder_ == null) {
                    ensureAreaListIsMutable();
                    this.areaList_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.areaListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addAreaList(int index, GuildFortHandler.GuildAreaInfo.Builder builderForValue) {
                if (this.areaListBuilder_ == null) {
                    ensureAreaListIsMutable();
                    this.areaList_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.areaListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllAreaList(Iterable<? extends GuildFortHandler.GuildAreaInfo> values) {
                if (this.areaListBuilder_ == null) {
                    ensureAreaListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.areaList_);
                    onChanged();
                } else {
                    this.areaListBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearAreaList() {
                if (this.areaListBuilder_ == null) {
                    this.areaList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    onChanged();
                } else {
                    this.areaListBuilder_.clear();
                }
                return this;
            }

            public Builder removeAreaList(int index) {
                if (this.areaListBuilder_ == null) {
                    ensureAreaListIsMutable();
                    this.areaList_.remove(index);
                    onChanged();
                } else {
                    this.areaListBuilder_.remove(index);
                }
                return this;
            }

            public GuildFortHandler.GuildAreaInfo.Builder getAreaListBuilder(int index) {
                return (GuildFortHandler.GuildAreaInfo.Builder) getAreaListFieldBuilder().getBuilder(index);
            }

            public GuildFortHandler.GuildAreaInfoOrBuilder getAreaListOrBuilder(int index) {
                if (this.areaListBuilder_ == null) return this.areaList_.get(index);
                return (GuildFortHandler.GuildAreaInfoOrBuilder) this.areaListBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GuildFortHandler.GuildAreaInfoOrBuilder> getAreaListOrBuilderList() {
                if (this.areaListBuilder_ != null) return this.areaListBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.areaList_);
            }

            public GuildFortHandler.GuildAreaInfo.Builder addAreaListBuilder() {
                return (GuildFortHandler.GuildAreaInfo.Builder) getAreaListFieldBuilder().addBuilder(GuildFortHandler.GuildAreaInfo.getDefaultInstance());
            }

            public GuildFortHandler.GuildAreaInfo.Builder addAreaListBuilder(int index) {
                return (GuildFortHandler.GuildAreaInfo.Builder) getAreaListFieldBuilder().addBuilder(index, GuildFortHandler.GuildAreaInfo.getDefaultInstance());
            }

            public List<GuildFortHandler.GuildAreaInfo.Builder> getAreaListBuilderList() {
                return getAreaListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GuildFortHandler.GuildAreaInfo, GuildFortHandler.GuildAreaInfo.Builder, GuildFortHandler.GuildAreaInfoOrBuilder> getAreaListFieldBuilder() {
                if (this.areaListBuilder_ == null) {
                    this.areaListBuilder_ = new RepeatedFieldBuilder(this.areaList_, ((this.bitField0_ & 0x8) == 8), getParentForChildren(), isClean());
                    this.areaList_ = null;
                }
                return this.areaListBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GuildAreaDetail
            extends GeneratedMessage
            implements GuildAreaDetailOrBuilder {
        private static final GuildAreaDetail defaultInstance = new GuildAreaDetail(true);
        private final UnknownFieldSet unknownFields;

        private GuildAreaDetail(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GuildAreaDetail(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GuildAreaDetail getDefaultInstance() {
            return defaultInstance;
        }

        public GuildAreaDetail getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GuildAreaDetail(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.guildId_ = bs;
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.guildName_ = bs;
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.guildLevel_ = input.readInt32();
                            break;
                        case 34:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x8;
                            this.guildLeaderId_ = bs;
                            break;
                        case 42:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x10;
                            this.guildLeaderName_ = bs;
                            break;
                        case 48:
                            this.bitField0_ |= 0x20;
                            this.guildNumberCount_ = input.readInt32();
                            break;
                        case 56:
                            this.bitField0_ |= 0x40;
                            this.guildNumberTotalCount_ = input.readInt32();
                            break;
                        case 66:
                            if ((mutable_bitField0_ & 0x80) != 128) {
                                this.winnerAwardList_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x80;
                            }
                            this.winnerAwardList_.add(input.readMessage(ItemOuterClass.MiniItem.PARSER, extensionRegistry));
                            break;
                        case 74:
                            if ((mutable_bitField0_ & 0x100) != 256) {
                                this.dailyAwardList_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x100;
                            }
                            this.dailyAwardList_.add(input.readMessage(ItemOuterClass.MiniItem.PARSER, extensionRegistry));
                            break;
                        case 80:
                            this.bitField0_ |= 0x80;
                            this.dailyAwardFlag_ = input.readInt32();
                            break;
                        case 88:
                            this.bitField0_ |= 0x100;
                            this.areaStatus_ = input.readInt32();
                            break;
                        case 96:
                            this.bitField0_ |= 0x200;
                            this.countDown_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x80) == 128)
                    this.winnerAwardList_ = Collections.unmodifiableList(this.winnerAwardList_);
                if ((mutable_bitField0_ & 0x100) == 256)
                    this.dailyAwardList_ = Collections.unmodifiableList(this.dailyAwardList_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_GuildAreaDetail_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_GuildAreaDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildAreaDetail.class, Builder.class);
        }

        public static Parser<GuildAreaDetail> PARSER = (Parser<GuildAreaDetail>) new AbstractParser<GuildAreaDetail>() {
            public GuildFortHandler.GuildAreaDetail parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.GuildAreaDetail(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int GUILDID_FIELD_NUMBER = 1;
        private Object guildId_;
        public static final int GUILDNAME_FIELD_NUMBER = 2;
        private Object guildName_;
        public static final int GUILDLEVEL_FIELD_NUMBER = 3;
        private int guildLevel_;
        public static final int GUILDLEADERID_FIELD_NUMBER = 4;
        private Object guildLeaderId_;
        public static final int GUILDLEADERNAME_FIELD_NUMBER = 5;
        private Object guildLeaderName_;
        public static final int GUILDNUMBERCOUNT_FIELD_NUMBER = 6;
        private int guildNumberCount_;
        public static final int GUILDNUMBERTOTALCOUNT_FIELD_NUMBER = 7;
        private int guildNumberTotalCount_;
        public static final int WINNERAWARDLIST_FIELD_NUMBER = 8;
        private List<ItemOuterClass.MiniItem> winnerAwardList_;
        public static final int DAILYAWARDLIST_FIELD_NUMBER = 9;
        private List<ItemOuterClass.MiniItem> dailyAwardList_;
        public static final int DAILYAWARDFLAG_FIELD_NUMBER = 10;
        private int dailyAwardFlag_;
        public static final int AREASTATUS_FIELD_NUMBER = 11;
        private int areaStatus_;
        public static final int COUNTDOWN_FIELD_NUMBER = 12;
        private int countDown_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GuildAreaDetail> getParserForType() {
            return PARSER;
        }

        public boolean hasGuildId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getGuildId() {
            Object ref = this.guildId_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildId_ = s;
            return s;
        }

        public ByteString getGuildIdBytes() {
            Object ref = this.guildId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildName() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getGuildName() {
            Object ref = this.guildName_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildName_ = s;
            return s;
        }

        public ByteString getGuildNameBytes() {
            Object ref = this.guildName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildLevel() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getGuildLevel() {
            return this.guildLevel_;
        }

        public boolean hasGuildLeaderId() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public String getGuildLeaderId() {
            Object ref = this.guildLeaderId_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildLeaderId_ = s;
            return s;
        }

        public ByteString getGuildLeaderIdBytes() {
            Object ref = this.guildLeaderId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildLeaderId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildLeaderName() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public String getGuildLeaderName() {
            Object ref = this.guildLeaderName_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildLeaderName_ = s;
            return s;
        }

        public ByteString getGuildLeaderNameBytes() {
            Object ref = this.guildLeaderName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildLeaderName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildNumberCount() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public int getGuildNumberCount() {
            return this.guildNumberCount_;
        }

        public boolean hasGuildNumberTotalCount() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public int getGuildNumberTotalCount() {
            return this.guildNumberTotalCount_;
        }

        public List<ItemOuterClass.MiniItem> getWinnerAwardListList() {
            return this.winnerAwardList_;
        }

        public List<? extends ItemOuterClass.MiniItemOrBuilder> getWinnerAwardListOrBuilderList() {
            return (List) this.winnerAwardList_;
        }

        public int getWinnerAwardListCount() {
            return this.winnerAwardList_.size();
        }

        public ItemOuterClass.MiniItem getWinnerAwardList(int index) {
            return this.winnerAwardList_.get(index);
        }

        public ItemOuterClass.MiniItemOrBuilder getWinnerAwardListOrBuilder(int index) {
            return (ItemOuterClass.MiniItemOrBuilder) this.winnerAwardList_.get(index);
        }

        public List<ItemOuterClass.MiniItem> getDailyAwardListList() {
            return this.dailyAwardList_;
        }

        public List<? extends ItemOuterClass.MiniItemOrBuilder> getDailyAwardListOrBuilderList() {
            return (List) this.dailyAwardList_;
        }

        public int getDailyAwardListCount() {
            return this.dailyAwardList_.size();
        }

        public ItemOuterClass.MiniItem getDailyAwardList(int index) {
            return this.dailyAwardList_.get(index);
        }

        public ItemOuterClass.MiniItemOrBuilder getDailyAwardListOrBuilder(int index) {
            return (ItemOuterClass.MiniItemOrBuilder) this.dailyAwardList_.get(index);
        }

        public boolean hasDailyAwardFlag() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public int getDailyAwardFlag() {
            return this.dailyAwardFlag_;
        }

        public boolean hasAreaStatus() {
            return ((this.bitField0_ & 0x100) == 256);
        }

        public int getAreaStatus() {
            return this.areaStatus_;
        }

        static {
            defaultInstance.initFields();
        }

        public boolean hasCountDown() {
            return ((this.bitField0_ & 0x200) == 512);
        }

        public int getCountDown() {
            return this.countDown_;
        }

        private void initFields() {
            this.guildId_ = "";
            this.guildName_ = "";
            this.guildLevel_ = 0;
            this.guildLeaderId_ = "";
            this.guildLeaderName_ = "";
            this.guildNumberCount_ = 0;
            this.guildNumberTotalCount_ = 0;
            this.winnerAwardList_ = Collections.emptyList();
            this.dailyAwardList_ = Collections.emptyList();
            this.dailyAwardFlag_ = 0;
            this.areaStatus_ = 0;
            this.countDown_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;
            if (!hasGuildId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDailyAwardFlag()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAreaStatus()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            int i;
            for (i = 0; i < getWinnerAwardListCount(); i++) {
                if (!getWinnerAwardList(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (i = 0; i < getDailyAwardListCount(); i++) {
                if (!getDailyAwardList(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1)
                output.writeBytes(1, getGuildIdBytes());
            if ((this.bitField0_ & 0x2) == 2)
                output.writeBytes(2, getGuildNameBytes());
            if ((this.bitField0_ & 0x4) == 4)
                output.writeInt32(3, this.guildLevel_);
            if ((this.bitField0_ & 0x8) == 8)
                output.writeBytes(4, getGuildLeaderIdBytes());
            if ((this.bitField0_ & 0x10) == 16)
                output.writeBytes(5, getGuildLeaderNameBytes());
            if ((this.bitField0_ & 0x20) == 32)
                output.writeInt32(6, this.guildNumberCount_);
            if ((this.bitField0_ & 0x40) == 64)
                output.writeInt32(7, this.guildNumberTotalCount_);
            int i;
            for (i = 0; i < this.winnerAwardList_.size(); i++)
                output.writeMessage(8, (MessageLite) this.winnerAwardList_.get(i));
            for (i = 0; i < this.dailyAwardList_.size(); i++)
                output.writeMessage(9, (MessageLite) this.dailyAwardList_.get(i));
            if ((this.bitField0_ & 0x80) == 128)
                output.writeInt32(10, this.dailyAwardFlag_);
            if ((this.bitField0_ & 0x100) == 256)
                output.writeInt32(11, this.areaStatus_);
            if ((this.bitField0_ & 0x200) == 512)
                output.writeInt32(12, this.countDown_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1)
                return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeBytesSize(1, getGuildIdBytes());
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeBytesSize(2, getGuildNameBytes());
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeInt32Size(3, this.guildLevel_);
            if ((this.bitField0_ & 0x8) == 8)
                size += CodedOutputStream.computeBytesSize(4, getGuildLeaderIdBytes());
            if ((this.bitField0_ & 0x10) == 16)
                size += CodedOutputStream.computeBytesSize(5, getGuildLeaderNameBytes());
            if ((this.bitField0_ & 0x20) == 32)
                size += CodedOutputStream.computeInt32Size(6, this.guildNumberCount_);
            if ((this.bitField0_ & 0x40) == 64)
                size += CodedOutputStream.computeInt32Size(7, this.guildNumberTotalCount_);
            int i;
            for (i = 0; i < this.winnerAwardList_.size(); i++)
                size += CodedOutputStream.computeMessageSize(8, (MessageLite) this.winnerAwardList_.get(i));
            for (i = 0; i < this.dailyAwardList_.size(); i++)
                size += CodedOutputStream.computeMessageSize(9, (MessageLite) this.dailyAwardList_.get(i));
            if ((this.bitField0_ & 0x80) == 128)
                size += CodedOutputStream.computeInt32Size(10, this.dailyAwardFlag_);
            if ((this.bitField0_ & 0x100) == 256)
                size += CodedOutputStream.computeInt32Size(11, this.areaStatus_);
            if ((this.bitField0_ & 0x200) == 512)
                size += CodedOutputStream.computeInt32Size(12, this.countDown_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GuildAreaDetail parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GuildAreaDetail) PARSER.parseFrom(data);
        }

        public static GuildAreaDetail parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GuildAreaDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GuildAreaDetail parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GuildAreaDetail) PARSER.parseFrom(data);
        }

        public static GuildAreaDetail parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GuildAreaDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GuildAreaDetail parseFrom(InputStream input) throws IOException {
            return (GuildAreaDetail) PARSER.parseFrom(input);
        }

        public static GuildAreaDetail parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GuildAreaDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GuildAreaDetail parseDelimitedFrom(InputStream input) throws IOException {
            return (GuildAreaDetail) PARSER.parseDelimitedFrom(input);
        }

        public static GuildAreaDetail parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GuildAreaDetail) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GuildAreaDetail parseFrom(CodedInputStream input) throws IOException {
            return (GuildAreaDetail) PARSER.parseFrom(input);
        }

        public static GuildAreaDetail parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GuildAreaDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GuildAreaDetail prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.GuildAreaDetailOrBuilder {
            private int bitField0_;
            private Object guildId_;
            private Object guildName_;
            private int guildLevel_;
            private Object guildLeaderId_;
            private Object guildLeaderName_;
            private int guildNumberCount_;
            private int guildNumberTotalCount_;
            private List<ItemOuterClass.MiniItem> winnerAwardList_;
            private RepeatedFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> winnerAwardListBuilder_;
            private List<ItemOuterClass.MiniItem> dailyAwardList_;
            private RepeatedFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> dailyAwardListBuilder_;
            private int dailyAwardFlag_;
            private int areaStatus_;
            private int countDown_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_GuildAreaDetail_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_GuildAreaDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.GuildAreaDetail.class, Builder.class);
            }

            private Builder() {
                this.guildId_ = "";
                this.guildName_ = "";
                this.guildLeaderId_ = "";
                this.guildLeaderName_ = "";
                this.winnerAwardList_ = Collections.emptyList();
                this.dailyAwardList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.guildId_ = "";
                this.guildName_ = "";
                this.guildLeaderId_ = "";
                this.guildLeaderName_ = "";
                this.winnerAwardList_ = Collections.emptyList();
                this.dailyAwardList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.GuildAreaDetail.alwaysUseFieldBuilders) {
                    getWinnerAwardListFieldBuilder();
                    getDailyAwardListFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.guildId_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.guildName_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildLevel_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildLeaderId_ = "";
                this.bitField0_ &= 0xFFFFFFF7;
                this.guildLeaderName_ = "";
                this.bitField0_ &= 0xFFFFFFEF;
                this.guildNumberCount_ = 0;
                this.bitField0_ &= 0xFFFFFFDF;
                this.guildNumberTotalCount_ = 0;
                this.bitField0_ &= 0xFFFFFFBF;
                if (this.winnerAwardListBuilder_ == null) {
                    this.winnerAwardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFF7F;
                } else {
                    this.winnerAwardListBuilder_.clear();
                }
                if (this.dailyAwardListBuilder_ == null) {
                    this.dailyAwardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFEFF;
                } else {
                    this.dailyAwardListBuilder_.clear();
                }
                this.dailyAwardFlag_ = 0;
                this.bitField0_ &= 0xFFFFFDFF;
                this.areaStatus_ = 0;
                this.bitField0_ &= 0xFFFFFBFF;
                this.countDown_ = 0;
                this.bitField0_ &= 0xFFFFF7FF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_GuildAreaDetail_descriptor;
            }

            public GuildFortHandler.GuildAreaDetail getDefaultInstanceForType() {
                return GuildFortHandler.GuildAreaDetail.getDefaultInstance();
            }

            public GuildFortHandler.GuildAreaDetail build() {
                GuildFortHandler.GuildAreaDetail result = buildPartial();
                if (!result.isInitialized())
                    throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.GuildAreaDetail buildPartial() {
                GuildFortHandler.GuildAreaDetail result = new GuildFortHandler.GuildAreaDetail(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1)
                    to_bitField0_ |= 0x1;
                result.guildId_ = this.guildId_;
                if ((from_bitField0_ & 0x2) == 2)
                    to_bitField0_ |= 0x2;
                result.guildName_ = this.guildName_;
                if ((from_bitField0_ & 0x4) == 4)
                    to_bitField0_ |= 0x4;
                result.guildLevel_ = this.guildLevel_;
                if ((from_bitField0_ & 0x8) == 8)
                    to_bitField0_ |= 0x8;
                result.guildLeaderId_ = this.guildLeaderId_;
                if ((from_bitField0_ & 0x10) == 16)
                    to_bitField0_ |= 0x10;
                result.guildLeaderName_ = this.guildLeaderName_;
                if ((from_bitField0_ & 0x20) == 32)
                    to_bitField0_ |= 0x20;
                result.guildNumberCount_ = this.guildNumberCount_;
                if ((from_bitField0_ & 0x40) == 64)
                    to_bitField0_ |= 0x40;
                result.guildNumberTotalCount_ = this.guildNumberTotalCount_;
                if (this.winnerAwardListBuilder_ == null) {
                    if ((this.bitField0_ & 0x80) == 128) {
                        this.winnerAwardList_ = Collections.unmodifiableList(this.winnerAwardList_);
                        this.bitField0_ &= 0xFFFFFF7F;
                    }
                    result.winnerAwardList_ = this.winnerAwardList_;
                } else {
                    result.winnerAwardList_ = this.winnerAwardListBuilder_.build();
                }
                if (this.dailyAwardListBuilder_ == null) {
                    if ((this.bitField0_ & 0x100) == 256) {
                        this.dailyAwardList_ = Collections.unmodifiableList(this.dailyAwardList_);
                        this.bitField0_ &= 0xFFFFFEFF;
                    }
                    result.dailyAwardList_ = this.dailyAwardList_;
                } else {
                    result.dailyAwardList_ = this.dailyAwardListBuilder_.build();
                }
                if ((from_bitField0_ & 0x200) == 512)
                    to_bitField0_ |= 0x80;
                result.dailyAwardFlag_ = this.dailyAwardFlag_;
                if ((from_bitField0_ & 0x400) == 1024)
                    to_bitField0_ |= 0x100;
                result.areaStatus_ = this.areaStatus_;
                if ((from_bitField0_ & 0x800) == 2048)
                    to_bitField0_ |= 0x200;
                result.countDown_ = this.countDown_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.GuildAreaDetail)
                    return mergeFrom((GuildFortHandler.GuildAreaDetail) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.GuildAreaDetail other) {
                if (other == GuildFortHandler.GuildAreaDetail.getDefaultInstance())
                    return this;
                if (other.hasGuildId()) {
                    this.bitField0_ |= 0x1;
                    this.guildId_ = other.guildId_;
                    onChanged();
                }
                if (other.hasGuildName()) {
                    this.bitField0_ |= 0x2;
                    this.guildName_ = other.guildName_;
                    onChanged();
                }
                if (other.hasGuildLevel())
                    setGuildLevel(other.getGuildLevel());
                if (other.hasGuildLeaderId()) {
                    this.bitField0_ |= 0x8;
                    this.guildLeaderId_ = other.guildLeaderId_;
                    onChanged();
                }
                if (other.hasGuildLeaderName()) {
                    this.bitField0_ |= 0x10;
                    this.guildLeaderName_ = other.guildLeaderName_;
                    onChanged();
                }
                if (other.hasGuildNumberCount())
                    setGuildNumberCount(other.getGuildNumberCount());
                if (other.hasGuildNumberTotalCount())
                    setGuildNumberTotalCount(other.getGuildNumberTotalCount());
                if (this.winnerAwardListBuilder_ == null) {
                    if (!other.winnerAwardList_.isEmpty()) {
                        if (this.winnerAwardList_.isEmpty()) {
                            this.winnerAwardList_ = other.winnerAwardList_;
                            this.bitField0_ &= 0xFFFFFF7F;
                        } else {
                            ensureWinnerAwardListIsMutable();
                            this.winnerAwardList_.addAll(other.winnerAwardList_);
                        }
                        onChanged();
                    }
                } else if (!other.winnerAwardList_.isEmpty()) {
                    if (this.winnerAwardListBuilder_.isEmpty()) {
                        this.winnerAwardListBuilder_.dispose();
                        this.winnerAwardListBuilder_ = null;
                        this.winnerAwardList_ = other.winnerAwardList_;
                        this.bitField0_ &= 0xFFFFFF7F;
                        this.winnerAwardListBuilder_ = GuildFortHandler.GuildAreaDetail.alwaysUseFieldBuilders ? getWinnerAwardListFieldBuilder() : null;
                    } else {
                        this.winnerAwardListBuilder_.addAllMessages(other.winnerAwardList_);
                    }
                }
                if (this.dailyAwardListBuilder_ == null) {
                    if (!other.dailyAwardList_.isEmpty()) {
                        if (this.dailyAwardList_.isEmpty()) {
                            this.dailyAwardList_ = other.dailyAwardList_;
                            this.bitField0_ &= 0xFFFFFEFF;
                        } else {
                            ensureDailyAwardListIsMutable();
                            this.dailyAwardList_.addAll(other.dailyAwardList_);
                        }
                        onChanged();
                    }
                } else if (!other.dailyAwardList_.isEmpty()) {
                    if (this.dailyAwardListBuilder_.isEmpty()) {
                        this.dailyAwardListBuilder_.dispose();
                        this.dailyAwardListBuilder_ = null;
                        this.dailyAwardList_ = other.dailyAwardList_;
                        this.bitField0_ &= 0xFFFFFEFF;
                        this.dailyAwardListBuilder_ = GuildFortHandler.GuildAreaDetail.alwaysUseFieldBuilders ? getDailyAwardListFieldBuilder() : null;
                    } else {
                        this.dailyAwardListBuilder_.addAllMessages(other.dailyAwardList_);
                    }
                }
                if (other.hasDailyAwardFlag())
                    setDailyAwardFlag(other.getDailyAwardFlag());
                if (other.hasAreaStatus())
                    setAreaStatus(other.getAreaStatus());
                if (other.hasCountDown())
                    setCountDown(other.getCountDown());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasGuildId())
                    return false;
                if (!hasDailyAwardFlag())
                    return false;
                if (!hasAreaStatus())
                    return false;
                int i;
                for (i = 0; i < getWinnerAwardListCount(); i++) {
                    if (!getWinnerAwardList(i).isInitialized())
                        return false;
                }
                for (i = 0; i < getDailyAwardListCount(); i++) {
                    if (!getDailyAwardList(i).isInitialized())
                        return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.GuildAreaDetail parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.GuildAreaDetail) GuildFortHandler.GuildAreaDetail.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.GuildAreaDetail) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null)
                        mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasGuildId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getGuildId() {
                Object ref = this.guildId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildIdBytes() {
                Object ref = this.guildId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildId(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.guildId_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.guildId_ = GuildFortHandler.GuildAreaDetail.getDefaultInstance().getGuildId();
                onChanged();
                return this;
            }

            public Builder setGuildIdBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.guildId_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildName() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getGuildName() {
                Object ref = this.guildName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildNameBytes() {
                Object ref = this.guildName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildName(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildName() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildName_ = GuildFortHandler.GuildAreaDetail.getDefaultInstance().getGuildName();
                onChanged();
                return this;
            }

            public Builder setGuildNameBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildLevel() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getGuildLevel() {
                return this.guildLevel_;
            }

            public Builder setGuildLevel(int value) {
                this.bitField0_ |= 0x4;
                this.guildLevel_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildLevel() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildLevel_ = 0;
                onChanged();
                return this;
            }

            public boolean hasGuildLeaderId() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public String getGuildLeaderId() {
                Object ref = this.guildLeaderId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildLeaderId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildLeaderIdBytes() {
                Object ref = this.guildLeaderId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildLeaderId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildLeaderId(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x8;
                this.guildLeaderId_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildLeaderId() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.guildLeaderId_ = GuildFortHandler.GuildAreaDetail.getDefaultInstance().getGuildLeaderId();
                onChanged();
                return this;
            }

            public Builder setGuildLeaderIdBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x8;
                this.guildLeaderId_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildLeaderName() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public String getGuildLeaderName() {
                Object ref = this.guildLeaderName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildLeaderName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildLeaderNameBytes() {
                Object ref = this.guildLeaderName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildLeaderName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildLeaderName(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.guildLeaderName_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildLeaderName() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.guildLeaderName_ = GuildFortHandler.GuildAreaDetail.getDefaultInstance().getGuildLeaderName();
                onChanged();
                return this;
            }

            public Builder setGuildLeaderNameBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.guildLeaderName_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildNumberCount() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public int getGuildNumberCount() {
                return this.guildNumberCount_;
            }

            public Builder setGuildNumberCount(int value) {
                this.bitField0_ |= 0x20;
                this.guildNumberCount_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildNumberCount() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.guildNumberCount_ = 0;
                onChanged();
                return this;
            }

            public boolean hasGuildNumberTotalCount() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public int getGuildNumberTotalCount() {
                return this.guildNumberTotalCount_;
            }

            public Builder setGuildNumberTotalCount(int value) {
                this.bitField0_ |= 0x40;
                this.guildNumberTotalCount_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildNumberTotalCount() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.guildNumberTotalCount_ = 0;
                onChanged();
                return this;
            }

            private void ensureWinnerAwardListIsMutable() {
                if ((this.bitField0_ & 0x80) != 128) {
                    this.winnerAwardList_ = new ArrayList<>(this.winnerAwardList_);
                    this.bitField0_ |= 0x80;
                }
            }

            public List<ItemOuterClass.MiniItem> getWinnerAwardListList() {
                if (this.winnerAwardListBuilder_ == null)
                    return Collections.unmodifiableList(this.winnerAwardList_);
                return this.winnerAwardListBuilder_.getMessageList();
            }

            public int getWinnerAwardListCount() {
                if (this.winnerAwardListBuilder_ == null)
                    return this.winnerAwardList_.size();
                return this.winnerAwardListBuilder_.getCount();
            }

            public ItemOuterClass.MiniItem getWinnerAwardList(int index) {
                if (this.winnerAwardListBuilder_ == null)
                    return this.winnerAwardList_.get(index);
                return (ItemOuterClass.MiniItem) this.winnerAwardListBuilder_.getMessage(index);
            }

            public Builder setWinnerAwardList(int index, ItemOuterClass.MiniItem value) {
                if (this.winnerAwardListBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureWinnerAwardListIsMutable();
                    this.winnerAwardList_.set(index, value);
                    onChanged();
                } else {
                    this.winnerAwardListBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setWinnerAwardList(int index, ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.winnerAwardListBuilder_ == null) {
                    ensureWinnerAwardListIsMutable();
                    this.winnerAwardList_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.winnerAwardListBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addWinnerAwardList(ItemOuterClass.MiniItem value) {
                if (this.winnerAwardListBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureWinnerAwardListIsMutable();
                    this.winnerAwardList_.add(value);
                    onChanged();
                } else {
                    this.winnerAwardListBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addWinnerAwardList(int index, ItemOuterClass.MiniItem value) {
                if (this.winnerAwardListBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureWinnerAwardListIsMutable();
                    this.winnerAwardList_.add(index, value);
                    onChanged();
                } else {
                    this.winnerAwardListBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addWinnerAwardList(ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.winnerAwardListBuilder_ == null) {
                    ensureWinnerAwardListIsMutable();
                    this.winnerAwardList_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.winnerAwardListBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addWinnerAwardList(int index, ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.winnerAwardListBuilder_ == null) {
                    ensureWinnerAwardListIsMutable();
                    this.winnerAwardList_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.winnerAwardListBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllWinnerAwardList(Iterable<? extends ItemOuterClass.MiniItem> values) {
                if (this.winnerAwardListBuilder_ == null) {
                    ensureWinnerAwardListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.winnerAwardList_);
                    onChanged();
                } else {
                    this.winnerAwardListBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearWinnerAwardList() {
                if (this.winnerAwardListBuilder_ == null) {
                    this.winnerAwardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFF7F;
                    onChanged();
                } else {
                    this.winnerAwardListBuilder_.clear();
                }
                return this;
            }

            public Builder removeWinnerAwardList(int index) {
                if (this.winnerAwardListBuilder_ == null) {
                    ensureWinnerAwardListIsMutable();
                    this.winnerAwardList_.remove(index);
                    onChanged();
                } else {
                    this.winnerAwardListBuilder_.remove(index);
                }
                return this;
            }

            public ItemOuterClass.MiniItem.Builder getWinnerAwardListBuilder(int index) {
                return (ItemOuterClass.MiniItem.Builder) getWinnerAwardListFieldBuilder().getBuilder(index);
            }

            public ItemOuterClass.MiniItemOrBuilder getWinnerAwardListOrBuilder(int index) {
                if (this.winnerAwardListBuilder_ == null)
                    return (ItemOuterClass.MiniItemOrBuilder) this.winnerAwardList_.get(index);
                return (ItemOuterClass.MiniItemOrBuilder) this.winnerAwardListBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends ItemOuterClass.MiniItemOrBuilder> getWinnerAwardListOrBuilderList() {
                if (this.winnerAwardListBuilder_ != null)
                    return this.winnerAwardListBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.winnerAwardList_);
            }

            public ItemOuterClass.MiniItem.Builder addWinnerAwardListBuilder() {
                return (ItemOuterClass.MiniItem.Builder) getWinnerAwardListFieldBuilder().addBuilder((GeneratedMessage) ItemOuterClass.MiniItem.getDefaultInstance());
            }

            public ItemOuterClass.MiniItem.Builder addWinnerAwardListBuilder(int index) {
                return (ItemOuterClass.MiniItem.Builder) getWinnerAwardListFieldBuilder().addBuilder(index, (GeneratedMessage) ItemOuterClass.MiniItem.getDefaultInstance());
            }

            public List<ItemOuterClass.MiniItem.Builder> getWinnerAwardListBuilderList() {
                return getWinnerAwardListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> getWinnerAwardListFieldBuilder() {
                if (this.winnerAwardListBuilder_ == null) {
                    this.winnerAwardListBuilder_ = new RepeatedFieldBuilder(this.winnerAwardList_, ((this.bitField0_ & 0x80) == 128), getParentForChildren(), isClean());
                    this.winnerAwardList_ = null;
                }
                return this.winnerAwardListBuilder_;
            }

            private void ensureDailyAwardListIsMutable() {
                if ((this.bitField0_ & 0x100) != 256) {
                    this.dailyAwardList_ = new ArrayList<>(this.dailyAwardList_);
                    this.bitField0_ |= 0x100;
                }
            }

            public List<ItemOuterClass.MiniItem> getDailyAwardListList() {
                if (this.dailyAwardListBuilder_ == null)
                    return Collections.unmodifiableList(this.dailyAwardList_);
                return this.dailyAwardListBuilder_.getMessageList();
            }

            public int getDailyAwardListCount() {
                if (this.dailyAwardListBuilder_ == null)
                    return this.dailyAwardList_.size();
                return this.dailyAwardListBuilder_.getCount();
            }

            public ItemOuterClass.MiniItem getDailyAwardList(int index) {
                if (this.dailyAwardListBuilder_ == null)
                    return this.dailyAwardList_.get(index);
                return (ItemOuterClass.MiniItem) this.dailyAwardListBuilder_.getMessage(index);
            }

            public Builder setDailyAwardList(int index, ItemOuterClass.MiniItem value) {
                if (this.dailyAwardListBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.set(index, value);
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setDailyAwardList(int index, ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.dailyAwardListBuilder_ == null) {
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addDailyAwardList(ItemOuterClass.MiniItem value) {
                if (this.dailyAwardListBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.add(value);
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addDailyAwardList(int index, ItemOuterClass.MiniItem value) {
                if (this.dailyAwardListBuilder_ == null) {
                    if (value == null)
                        throw new NullPointerException();
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.add(index, value);
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addDailyAwardList(ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.dailyAwardListBuilder_ == null) {
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addDailyAwardList(int index, ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.dailyAwardListBuilder_ == null) {
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllDailyAwardList(Iterable<? extends ItemOuterClass.MiniItem> values) {
                if (this.dailyAwardListBuilder_ == null) {
                    ensureDailyAwardListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.dailyAwardList_);
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearDailyAwardList() {
                if (this.dailyAwardListBuilder_ == null) {
                    this.dailyAwardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFEFF;
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.clear();
                }
                return this;
            }

            public Builder removeDailyAwardList(int index) {
                if (this.dailyAwardListBuilder_ == null) {
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.remove(index);
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.remove(index);
                }
                return this;
            }

            public ItemOuterClass.MiniItem.Builder getDailyAwardListBuilder(int index) {
                return (ItemOuterClass.MiniItem.Builder) getDailyAwardListFieldBuilder().getBuilder(index);
            }

            public ItemOuterClass.MiniItemOrBuilder getDailyAwardListOrBuilder(int index) {
                if (this.dailyAwardListBuilder_ == null)
                    return (ItemOuterClass.MiniItemOrBuilder) this.dailyAwardList_.get(index);
                return (ItemOuterClass.MiniItemOrBuilder) this.dailyAwardListBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends ItemOuterClass.MiniItemOrBuilder> getDailyAwardListOrBuilderList() {
                if (this.dailyAwardListBuilder_ != null)
                    return this.dailyAwardListBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.dailyAwardList_);
            }

            public ItemOuterClass.MiniItem.Builder addDailyAwardListBuilder() {
                return (ItemOuterClass.MiniItem.Builder) getDailyAwardListFieldBuilder().addBuilder((GeneratedMessage) ItemOuterClass.MiniItem.getDefaultInstance());
            }

            public ItemOuterClass.MiniItem.Builder addDailyAwardListBuilder(int index) {
                return (ItemOuterClass.MiniItem.Builder) getDailyAwardListFieldBuilder().addBuilder(index, (GeneratedMessage) ItemOuterClass.MiniItem.getDefaultInstance());
            }

            public List<ItemOuterClass.MiniItem.Builder> getDailyAwardListBuilderList() {
                return getDailyAwardListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> getDailyAwardListFieldBuilder() {
                if (this.dailyAwardListBuilder_ == null) {
                    this.dailyAwardListBuilder_ = new RepeatedFieldBuilder(this.dailyAwardList_, ((this.bitField0_ & 0x100) == 256), getParentForChildren(), isClean());
                    this.dailyAwardList_ = null;
                }
                return this.dailyAwardListBuilder_;
            }

            public boolean hasDailyAwardFlag() {
                return ((this.bitField0_ & 0x200) == 512);
            }

            public int getDailyAwardFlag() {
                return this.dailyAwardFlag_;
            }

            public Builder setDailyAwardFlag(int value) {
                this.bitField0_ |= 0x200;
                this.dailyAwardFlag_ = value;
                onChanged();
                return this;
            }

            public Builder clearDailyAwardFlag() {
                this.bitField0_ &= 0xFFFFFDFF;
                this.dailyAwardFlag_ = 0;
                onChanged();
                return this;
            }

            public boolean hasAreaStatus() {
                return ((this.bitField0_ & 0x400) == 1024);
            }

            public int getAreaStatus() {
                return this.areaStatus_;
            }

            public Builder setAreaStatus(int value) {
                this.bitField0_ |= 0x400;
                this.areaStatus_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaStatus() {
                this.bitField0_ &= 0xFFFFFBFF;
                this.areaStatus_ = 0;
                onChanged();
                return this;
            }

            public boolean hasCountDown() {
                return ((this.bitField0_ & 0x800) == 2048);
            }

            public int getCountDown() {
                return this.countDown_;
            }

            public Builder setCountDown(int value) {
                this.bitField0_ |= 0x800;
                this.countDown_ = value;
                onChanged();
                return this;
            }

            public Builder clearCountDown() {
                this.bitField0_ &= 0xFFFFF7FF;
                this.countDown_ = 0;
                onChanged();
                return this;
            }
        }
    }

    public static final class GetGuildAreaDetailRequest extends GeneratedMessage implements GetGuildAreaDetailRequestOrBuilder {
        private static final GetGuildAreaDetailRequest defaultInstance = new GetGuildAreaDetailRequest(true);
        private final UnknownFieldSet unknownFields;

        private GetGuildAreaDetailRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetGuildAreaDetailRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetGuildAreaDetailRequest getDefaultInstance() {
            return defaultInstance;
        }

        public GetGuildAreaDetailRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetGuildAreaDetailRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.areaId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaDetailRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaDetailRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetGuildAreaDetailRequest.class, Builder.class);
        }

        public static Parser<GetGuildAreaDetailRequest> PARSER = (Parser<GetGuildAreaDetailRequest>) new AbstractParser<GetGuildAreaDetailRequest>() {
            public GuildFortHandler.GetGuildAreaDetailRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.GetGuildAreaDetailRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int AREAID_FIELD_NUMBER = 1;
        private int areaId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetGuildAreaDetailRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        private void initFields() {
            this.areaId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.areaId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.areaId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetGuildAreaDetailRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetGuildAreaDetailRequest) PARSER.parseFrom(data);
        }

        public static GetGuildAreaDetailRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaDetailRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaDetailRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetGuildAreaDetailRequest) PARSER.parseFrom(data);
        }

        public static GetGuildAreaDetailRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaDetailRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaDetailRequest parseFrom(InputStream input) throws IOException {
            return (GetGuildAreaDetailRequest) PARSER.parseFrom(input);
        }

        public static GetGuildAreaDetailRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaDetailRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetGuildAreaDetailRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (GetGuildAreaDetailRequest) PARSER.parseDelimitedFrom(input);
        }

        public static GetGuildAreaDetailRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaDetailRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetGuildAreaDetailRequest parseFrom(CodedInputStream input) throws IOException {
            return (GetGuildAreaDetailRequest) PARSER.parseFrom(input);
        }

        public static GetGuildAreaDetailRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaDetailRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetGuildAreaDetailRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.GetGuildAreaDetailRequestOrBuilder {
            private int bitField0_;
            private int areaId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaDetailRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaDetailRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.GetGuildAreaDetailRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.GetGuildAreaDetailRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaDetailRequest_descriptor;
            }

            public GuildFortHandler.GetGuildAreaDetailRequest getDefaultInstanceForType() {
                return GuildFortHandler.GetGuildAreaDetailRequest.getDefaultInstance();
            }

            public GuildFortHandler.GetGuildAreaDetailRequest build() {
                GuildFortHandler.GetGuildAreaDetailRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.GetGuildAreaDetailRequest buildPartial() {
                GuildFortHandler.GetGuildAreaDetailRequest result = new GuildFortHandler.GetGuildAreaDetailRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.areaId_ = this.areaId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.GetGuildAreaDetailRequest)
                    return mergeFrom((GuildFortHandler.GetGuildAreaDetailRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.GetGuildAreaDetailRequest other) {
                if (other == GuildFortHandler.GetGuildAreaDetailRequest.getDefaultInstance()) return this;
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAreaId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.GetGuildAreaDetailRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.GetGuildAreaDetailRequest) GuildFortHandler.GetGuildAreaDetailRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.GetGuildAreaDetailRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x1;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GetGuildAreaDetailResponse
            extends GeneratedMessage
            implements GetGuildAreaDetailResponseOrBuilder {
        private static final GetGuildAreaDetailResponse defaultInstance = new GetGuildAreaDetailResponse(true);
        private final UnknownFieldSet unknownFields;

        private GetGuildAreaDetailResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetGuildAreaDetailResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetGuildAreaDetailResponse getDefaultInstance() {
            return defaultInstance;
        }

        public GetGuildAreaDetailResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetGuildAreaDetailResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    GuildFortHandler.GuildAreaDetail.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 26:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x4) == 4) subBuilder = this.areaDetail_.toBuilder();
                            this.areaDetail_ = (GuildFortHandler.GuildAreaDetail) input.readMessage(GuildFortHandler.GuildAreaDetail.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.areaDetail_);
                                this.areaDetail_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x4;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaDetailResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaDetailResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetGuildAreaDetailResponse.class, Builder.class);
        }

        public static Parser<GetGuildAreaDetailResponse> PARSER = (Parser<GetGuildAreaDetailResponse>) new AbstractParser<GetGuildAreaDetailResponse>() {
            public GuildFortHandler.GetGuildAreaDetailResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.GetGuildAreaDetailResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int AREADETAIL_FIELD_NUMBER = 3;
        private GuildFortHandler.GuildAreaDetail areaDetail_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetGuildAreaDetailResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasAreaDetail() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public GuildFortHandler.GuildAreaDetail getAreaDetail() {
            return this.areaDetail_;
        }

        public GuildFortHandler.GuildAreaDetailOrBuilder getAreaDetailOrBuilder() {
            return this.areaDetail_;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.areaDetail_ = GuildFortHandler.GuildAreaDetail.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAreaDetail()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!getAreaDetail().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeMessage(3, (MessageLite) this.areaDetail_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.areaDetail_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetGuildAreaDetailResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetGuildAreaDetailResponse) PARSER.parseFrom(data);
        }

        public static GetGuildAreaDetailResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaDetailResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaDetailResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetGuildAreaDetailResponse) PARSER.parseFrom(data);
        }

        public static GetGuildAreaDetailResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaDetailResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaDetailResponse parseFrom(InputStream input) throws IOException {
            return (GetGuildAreaDetailResponse) PARSER.parseFrom(input);
        }

        public static GetGuildAreaDetailResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaDetailResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetGuildAreaDetailResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (GetGuildAreaDetailResponse) PARSER.parseDelimitedFrom(input);
        }

        public static GetGuildAreaDetailResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaDetailResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetGuildAreaDetailResponse parseFrom(CodedInputStream input) throws IOException {
            return (GetGuildAreaDetailResponse) PARSER.parseFrom(input);
        }

        public static GetGuildAreaDetailResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaDetailResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetGuildAreaDetailResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.GetGuildAreaDetailResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private GuildFortHandler.GuildAreaDetail areaDetail_;
            private SingleFieldBuilder<GuildFortHandler.GuildAreaDetail, GuildFortHandler.GuildAreaDetail.Builder, GuildFortHandler.GuildAreaDetailOrBuilder> areaDetailBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaDetailResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaDetailResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.GetGuildAreaDetailResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.areaDetail_ = GuildFortHandler.GuildAreaDetail.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.areaDetail_ = GuildFortHandler.GuildAreaDetail.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.GetGuildAreaDetailResponse.alwaysUseFieldBuilders) getAreaDetailFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.areaDetailBuilder_ == null) {
                    this.areaDetail_ = GuildFortHandler.GuildAreaDetail.getDefaultInstance();
                } else {
                    this.areaDetailBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaDetailResponse_descriptor;
            }

            public GuildFortHandler.GetGuildAreaDetailResponse getDefaultInstanceForType() {
                return GuildFortHandler.GetGuildAreaDetailResponse.getDefaultInstance();
            }

            public GuildFortHandler.GetGuildAreaDetailResponse build() {
                GuildFortHandler.GetGuildAreaDetailResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.GetGuildAreaDetailResponse buildPartial() {
                GuildFortHandler.GetGuildAreaDetailResponse result = new GuildFortHandler.GetGuildAreaDetailResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                if (this.areaDetailBuilder_ == null) {
                    result.areaDetail_ = this.areaDetail_;
                } else {
                    result.areaDetail_ = (GuildFortHandler.GuildAreaDetail) this.areaDetailBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.GetGuildAreaDetailResponse)
                    return mergeFrom((GuildFortHandler.GetGuildAreaDetailResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.GetGuildAreaDetailResponse other) {
                if (other == GuildFortHandler.GetGuildAreaDetailResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasAreaDetail()) mergeAreaDetail(other.getAreaDetail());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                if (!hasAreaDetail()) return false;
                if (!getAreaDetail().isInitialized()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.GetGuildAreaDetailResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.GetGuildAreaDetailResponse) GuildFortHandler.GetGuildAreaDetailResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.GetGuildAreaDetailResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.GetGuildAreaDetailResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public boolean hasAreaDetail() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public GuildFortHandler.GuildAreaDetail getAreaDetail() {
                if (this.areaDetailBuilder_ == null) return this.areaDetail_;
                return (GuildFortHandler.GuildAreaDetail) this.areaDetailBuilder_.getMessage();
            }

            public Builder setAreaDetail(GuildFortHandler.GuildAreaDetail value) {
                if (this.areaDetailBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.areaDetail_ = value;
                    onChanged();
                } else {
                    this.areaDetailBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder setAreaDetail(GuildFortHandler.GuildAreaDetail.Builder builderForValue) {
                if (this.areaDetailBuilder_ == null) {
                    this.areaDetail_ = builderForValue.build();
                    onChanged();
                } else {
                    this.areaDetailBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder mergeAreaDetail(GuildFortHandler.GuildAreaDetail value) {
                if (this.areaDetailBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4 && this.areaDetail_ != GuildFortHandler.GuildAreaDetail.getDefaultInstance()) {
                        this.areaDetail_ = GuildFortHandler.GuildAreaDetail.newBuilder(this.areaDetail_).mergeFrom(value).buildPartial();
                    } else {
                        this.areaDetail_ = value;
                    }
                    onChanged();
                } else {
                    this.areaDetailBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder clearAreaDetail() {
                if (this.areaDetailBuilder_ == null) {
                    this.areaDetail_ = GuildFortHandler.GuildAreaDetail.getDefaultInstance();
                    onChanged();
                } else {
                    this.areaDetailBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public GuildFortHandler.GuildAreaDetail.Builder getAreaDetailBuilder() {
                this.bitField0_ |= 0x4;
                onChanged();
                return (GuildFortHandler.GuildAreaDetail.Builder) getAreaDetailFieldBuilder().getBuilder();
            }

            public GuildFortHandler.GuildAreaDetailOrBuilder getAreaDetailOrBuilder() {
                if (this.areaDetailBuilder_ != null)
                    return (GuildFortHandler.GuildAreaDetailOrBuilder) this.areaDetailBuilder_.getMessageOrBuilder();
                return this.areaDetail_;
            }

            private SingleFieldBuilder<GuildFortHandler.GuildAreaDetail, GuildFortHandler.GuildAreaDetail.Builder, GuildFortHandler.GuildAreaDetailOrBuilder> getAreaDetailFieldBuilder() {
                if (this.areaDetailBuilder_ == null) {
                    this.areaDetailBuilder_ = new SingleFieldBuilder(getAreaDetail(), getParentForChildren(), isClean());
                    this.areaDetail_ = null;
                }
                return this.areaDetailBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class GuildAreaApplyInfo
            extends GeneratedMessage
            implements GuildAreaApplyInfoOrBuilder {
        private static final GuildAreaApplyInfo defaultInstance = new GuildAreaApplyInfo(true);
        private final UnknownFieldSet unknownFields;

        private GuildAreaApplyInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GuildAreaApplyInfo(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GuildAreaApplyInfo getDefaultInstance() {
            return defaultInstance;
        }

        public GuildAreaApplyInfo getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GuildAreaApplyInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.guildIcon_ = bs;
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.guildId_ = bs;
                            break;
                        case 26:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x4;
                            this.guildName_ = bs;
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.guildLevel_ = input.readInt32();
                            break;
                        case 42:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x10;
                            this.guildLeaderId_ = bs;
                            break;
                        case 50:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x20;
                            this.guildLeaderName_ = bs;
                            break;
                        case 56:
                            this.bitField0_ |= 0x40;
                            this.guildNumberCount_ = input.readInt32();
                            break;
                        case 64:
                            this.bitField0_ |= 0x80;
                            this.guildNumberTotalCount_ = input.readInt32();
                            break;
                        case 72:
                            this.bitField0_ |= 0x100;
                            this.applyFund_ = input.readInt32();
                            break;
                        case 80:
                            this.bitField0_ |= 0x200;
                            this.isWinner_ = input.readBool();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_GuildAreaApplyInfo_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_GuildAreaApplyInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildAreaApplyInfo.class, Builder.class);
        }

        public static Parser<GuildAreaApplyInfo> PARSER = (Parser<GuildAreaApplyInfo>) new AbstractParser<GuildAreaApplyInfo>() {
            public GuildFortHandler.GuildAreaApplyInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.GuildAreaApplyInfo(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int GUILDICON_FIELD_NUMBER = 1;
        private Object guildIcon_;
        public static final int GUILDID_FIELD_NUMBER = 2;
        private Object guildId_;
        public static final int GUILDNAME_FIELD_NUMBER = 3;
        private Object guildName_;
        public static final int GUILDLEVEL_FIELD_NUMBER = 4;
        private int guildLevel_;
        public static final int GUILDLEADERID_FIELD_NUMBER = 5;
        private Object guildLeaderId_;
        public static final int GUILDLEADERNAME_FIELD_NUMBER = 6;
        private Object guildLeaderName_;
        public static final int GUILDNUMBERCOUNT_FIELD_NUMBER = 7;
        private int guildNumberCount_;
        public static final int GUILDNUMBERTOTALCOUNT_FIELD_NUMBER = 8;
        private int guildNumberTotalCount_;
        public static final int APPLYFUND_FIELD_NUMBER = 9;
        private int applyFund_;
        public static final int ISWINNER_FIELD_NUMBER = 10;
        private boolean isWinner_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GuildAreaApplyInfo> getParserForType() {
            return PARSER;
        }

        public boolean hasGuildIcon() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getGuildIcon() {
            Object ref = this.guildIcon_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildIcon_ = s;
            return s;
        }

        public ByteString getGuildIconBytes() {
            Object ref = this.guildIcon_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildIcon_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getGuildId() {
            Object ref = this.guildId_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildId_ = s;
            return s;
        }

        static {
            defaultInstance.initFields();
        }

        public ByteString getGuildIdBytes() {
            Object ref = this.guildId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildName() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public String getGuildName() {
            Object ref = this.guildName_;
            if (ref instanceof String)
                return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8())
                this.guildName_ = s;
            return s;
        }

        public ByteString getGuildNameBytes() {
            Object ref = this.guildName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildLevel() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getGuildLevel() {
            return this.guildLevel_;
        }

        public boolean hasGuildLeaderId() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public String getGuildLeaderId() {
            Object ref = this.guildLeaderId_;
            if (ref instanceof String)
                return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8())
                this.guildLeaderId_ = s;
            return s;
        }

        public ByteString getGuildLeaderIdBytes() {
            Object ref = this.guildLeaderId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildLeaderId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildLeaderName() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public String getGuildLeaderName() {
            Object ref = this.guildLeaderName_;
            if (ref instanceof String)
                return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8())
                this.guildLeaderName_ = s;
            return s;
        }

        public ByteString getGuildLeaderNameBytes() {
            Object ref = this.guildLeaderName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildLeaderName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildNumberCount() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public int getGuildNumberCount() {
            return this.guildNumberCount_;
        }

        public boolean hasGuildNumberTotalCount() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public int getGuildNumberTotalCount() {
            return this.guildNumberTotalCount_;
        }

        public boolean hasApplyFund() {
            return ((this.bitField0_ & 0x100) == 256);
        }

        public int getApplyFund() {
            return this.applyFund_;
        }

        public boolean hasIsWinner() {
            return ((this.bitField0_ & 0x200) == 512);
        }

        public boolean getIsWinner() {
            return this.isWinner_;
        }

        private void initFields() {
            this.guildIcon_ = "";
            this.guildId_ = "";
            this.guildName_ = "";
            this.guildLevel_ = 0;
            this.guildLeaderId_ = "";
            this.guildLeaderName_ = "";
            this.guildNumberCount_ = 0;
            this.guildNumberTotalCount_ = 0;
            this.applyFund_ = 0;
            this.isWinner_ = false;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;
            if (!hasGuildIcon()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildLevel()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildLeaderId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildLeaderName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildNumberCount()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1)
                output.writeBytes(1, getGuildIconBytes());
            if ((this.bitField0_ & 0x2) == 2)
                output.writeBytes(2, getGuildIdBytes());
            if ((this.bitField0_ & 0x4) == 4)
                output.writeBytes(3, getGuildNameBytes());
            if ((this.bitField0_ & 0x8) == 8)
                output.writeInt32(4, this.guildLevel_);
            if ((this.bitField0_ & 0x10) == 16)
                output.writeBytes(5, getGuildLeaderIdBytes());
            if ((this.bitField0_ & 0x20) == 32)
                output.writeBytes(6, getGuildLeaderNameBytes());
            if ((this.bitField0_ & 0x40) == 64)
                output.writeInt32(7, this.guildNumberCount_);
            if ((this.bitField0_ & 0x80) == 128)
                output.writeInt32(8, this.guildNumberTotalCount_);
            if ((this.bitField0_ & 0x100) == 256)
                output.writeInt32(9, this.applyFund_);
            if ((this.bitField0_ & 0x200) == 512)
                output.writeBool(10, this.isWinner_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1)
                return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeBytesSize(1, getGuildIconBytes());
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeBytesSize(2, getGuildIdBytes());
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeBytesSize(3, getGuildNameBytes());
            if ((this.bitField0_ & 0x8) == 8)
                size += CodedOutputStream.computeInt32Size(4, this.guildLevel_);
            if ((this.bitField0_ & 0x10) == 16)
                size += CodedOutputStream.computeBytesSize(5, getGuildLeaderIdBytes());
            if ((this.bitField0_ & 0x20) == 32)
                size += CodedOutputStream.computeBytesSize(6, getGuildLeaderNameBytes());
            if ((this.bitField0_ & 0x40) == 64)
                size += CodedOutputStream.computeInt32Size(7, this.guildNumberCount_);
            if ((this.bitField0_ & 0x80) == 128)
                size += CodedOutputStream.computeInt32Size(8, this.guildNumberTotalCount_);
            if ((this.bitField0_ & 0x100) == 256)
                size += CodedOutputStream.computeInt32Size(9, this.applyFund_);
            if ((this.bitField0_ & 0x200) == 512)
                size += CodedOutputStream.computeBoolSize(10, this.isWinner_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GuildAreaApplyInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GuildAreaApplyInfo) PARSER.parseFrom(data);
        }

        public static GuildAreaApplyInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GuildAreaApplyInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GuildAreaApplyInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GuildAreaApplyInfo) PARSER.parseFrom(data);
        }

        public static GuildAreaApplyInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GuildAreaApplyInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GuildAreaApplyInfo parseFrom(InputStream input) throws IOException {
            return (GuildAreaApplyInfo) PARSER.parseFrom(input);
        }

        public static GuildAreaApplyInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GuildAreaApplyInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GuildAreaApplyInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (GuildAreaApplyInfo) PARSER.parseDelimitedFrom(input);
        }

        public static GuildAreaApplyInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GuildAreaApplyInfo) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GuildAreaApplyInfo parseFrom(CodedInputStream input) throws IOException {
            return (GuildAreaApplyInfo) PARSER.parseFrom(input);
        }

        public static GuildAreaApplyInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GuildAreaApplyInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GuildAreaApplyInfo prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.GuildAreaApplyInfoOrBuilder {
            private int bitField0_;
            private Object guildIcon_;
            private Object guildId_;
            private Object guildName_;
            private int guildLevel_;
            private Object guildLeaderId_;
            private Object guildLeaderName_;
            private int guildNumberCount_;
            private int guildNumberTotalCount_;
            private int applyFund_;
            private boolean isWinner_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_GuildAreaApplyInfo_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_GuildAreaApplyInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.GuildAreaApplyInfo.class, Builder.class);
            }

            private Builder() {
                this.guildIcon_ = "";
                this.guildId_ = "";
                this.guildName_ = "";
                this.guildLeaderId_ = "";
                this.guildLeaderName_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.guildIcon_ = "";
                this.guildId_ = "";
                this.guildName_ = "";
                this.guildLeaderId_ = "";
                this.guildLeaderName_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.GuildAreaApplyInfo.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.guildIcon_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.guildId_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildName_ = "";
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildLevel_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.guildLeaderId_ = "";
                this.bitField0_ &= 0xFFFFFFEF;
                this.guildLeaderName_ = "";
                this.bitField0_ &= 0xFFFFFFDF;
                this.guildNumberCount_ = 0;
                this.bitField0_ &= 0xFFFFFFBF;
                this.guildNumberTotalCount_ = 0;
                this.bitField0_ &= 0xFFFFFF7F;
                this.applyFund_ = 0;
                this.bitField0_ &= 0xFFFFFEFF;
                this.isWinner_ = false;
                this.bitField0_ &= 0xFFFFFDFF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_GuildAreaApplyInfo_descriptor;
            }

            public GuildFortHandler.GuildAreaApplyInfo getDefaultInstanceForType() {
                return GuildFortHandler.GuildAreaApplyInfo.getDefaultInstance();
            }

            public GuildFortHandler.GuildAreaApplyInfo build() {
                GuildFortHandler.GuildAreaApplyInfo result = buildPartial();
                if (!result.isInitialized())
                    throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.GuildAreaApplyInfo buildPartial() {
                GuildFortHandler.GuildAreaApplyInfo result = new GuildFortHandler.GuildAreaApplyInfo(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1)
                    to_bitField0_ |= 0x1;
                result.guildIcon_ = this.guildIcon_;
                if ((from_bitField0_ & 0x2) == 2)
                    to_bitField0_ |= 0x2;
                result.guildId_ = this.guildId_;
                if ((from_bitField0_ & 0x4) == 4)
                    to_bitField0_ |= 0x4;
                result.guildName_ = this.guildName_;
                if ((from_bitField0_ & 0x8) == 8)
                    to_bitField0_ |= 0x8;
                result.guildLevel_ = this.guildLevel_;
                if ((from_bitField0_ & 0x10) == 16)
                    to_bitField0_ |= 0x10;
                result.guildLeaderId_ = this.guildLeaderId_;
                if ((from_bitField0_ & 0x20) == 32)
                    to_bitField0_ |= 0x20;
                result.guildLeaderName_ = this.guildLeaderName_;
                if ((from_bitField0_ & 0x40) == 64)
                    to_bitField0_ |= 0x40;
                result.guildNumberCount_ = this.guildNumberCount_;
                if ((from_bitField0_ & 0x80) == 128)
                    to_bitField0_ |= 0x80;
                result.guildNumberTotalCount_ = this.guildNumberTotalCount_;
                if ((from_bitField0_ & 0x100) == 256)
                    to_bitField0_ |= 0x100;
                result.applyFund_ = this.applyFund_;
                if ((from_bitField0_ & 0x200) == 512)
                    to_bitField0_ |= 0x200;
                result.isWinner_ = this.isWinner_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.GuildAreaApplyInfo)
                    return mergeFrom((GuildFortHandler.GuildAreaApplyInfo) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.GuildAreaApplyInfo other) {
                if (other == GuildFortHandler.GuildAreaApplyInfo.getDefaultInstance())
                    return this;
                if (other.hasGuildIcon()) {
                    this.bitField0_ |= 0x1;
                    this.guildIcon_ = other.guildIcon_;
                    onChanged();
                }
                if (other.hasGuildId()) {
                    this.bitField0_ |= 0x2;
                    this.guildId_ = other.guildId_;
                    onChanged();
                }
                if (other.hasGuildName()) {
                    this.bitField0_ |= 0x4;
                    this.guildName_ = other.guildName_;
                    onChanged();
                }
                if (other.hasGuildLevel())
                    setGuildLevel(other.getGuildLevel());
                if (other.hasGuildLeaderId()) {
                    this.bitField0_ |= 0x10;
                    this.guildLeaderId_ = other.guildLeaderId_;
                    onChanged();
                }
                if (other.hasGuildLeaderName()) {
                    this.bitField0_ |= 0x20;
                    this.guildLeaderName_ = other.guildLeaderName_;
                    onChanged();
                }
                if (other.hasGuildNumberCount())
                    setGuildNumberCount(other.getGuildNumberCount());
                if (other.hasGuildNumberTotalCount())
                    setGuildNumberTotalCount(other.getGuildNumberTotalCount());
                if (other.hasApplyFund())
                    setApplyFund(other.getApplyFund());
                if (other.hasIsWinner())
                    setIsWinner(other.getIsWinner());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasGuildIcon())
                    return false;
                if (!hasGuildId())
                    return false;
                if (!hasGuildName())
                    return false;
                if (!hasGuildLevel())
                    return false;
                if (!hasGuildLeaderId())
                    return false;
                if (!hasGuildLeaderName())
                    return false;
                if (!hasGuildNumberCount())
                    return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.GuildAreaApplyInfo parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.GuildAreaApplyInfo) GuildFortHandler.GuildAreaApplyInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.GuildAreaApplyInfo) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null)
                        mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasGuildIcon() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getGuildIcon() {
                Object ref = this.guildIcon_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildIcon_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildIconBytes() {
                Object ref = this.guildIcon_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildIcon_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildIcon(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.guildIcon_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildIcon() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.guildIcon_ = GuildFortHandler.GuildAreaApplyInfo.getDefaultInstance().getGuildIcon();
                onChanged();
                return this;
            }

            public Builder setGuildIconBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.guildIcon_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getGuildId() {
                Object ref = this.guildId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildIdBytes() {
                Object ref = this.guildId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildId(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.guildId_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildId_ = GuildFortHandler.GuildAreaApplyInfo.getDefaultInstance().getGuildId();
                onChanged();
                return this;
            }

            public Builder setGuildIdBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.guildId_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildName() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public String getGuildName() {
                Object ref = this.guildName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildNameBytes() {
                Object ref = this.guildName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildName(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildName() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildName_ = GuildFortHandler.GuildAreaApplyInfo.getDefaultInstance().getGuildName();
                onChanged();
                return this;
            }

            public Builder setGuildNameBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildLevel() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getGuildLevel() {
                return this.guildLevel_;
            }

            public Builder setGuildLevel(int value) {
                this.bitField0_ |= 0x8;
                this.guildLevel_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildLevel() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.guildLevel_ = 0;
                onChanged();
                return this;
            }

            public boolean hasGuildLeaderId() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public String getGuildLeaderId() {
                Object ref = this.guildLeaderId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildLeaderId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildLeaderIdBytes() {
                Object ref = this.guildLeaderId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildLeaderId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildLeaderId(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.guildLeaderId_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildLeaderId() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.guildLeaderId_ = GuildFortHandler.GuildAreaApplyInfo.getDefaultInstance().getGuildLeaderId();
                onChanged();
                return this;
            }

            public Builder setGuildLeaderIdBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.guildLeaderId_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildLeaderName() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public String getGuildLeaderName() {
                Object ref = this.guildLeaderName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildLeaderName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildLeaderNameBytes() {
                Object ref = this.guildLeaderName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildLeaderName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildLeaderName(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x20;
                this.guildLeaderName_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildLeaderName() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.guildLeaderName_ = GuildFortHandler.GuildAreaApplyInfo.getDefaultInstance().getGuildLeaderName();
                onChanged();
                return this;
            }

            public Builder setGuildLeaderNameBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x20;
                this.guildLeaderName_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildNumberCount() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public int getGuildNumberCount() {
                return this.guildNumberCount_;
            }

            public Builder setGuildNumberCount(int value) {
                this.bitField0_ |= 0x40;
                this.guildNumberCount_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildNumberCount() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.guildNumberCount_ = 0;
                onChanged();
                return this;
            }

            public boolean hasGuildNumberTotalCount() {
                return ((this.bitField0_ & 0x80) == 128);
            }

            public int getGuildNumberTotalCount() {
                return this.guildNumberTotalCount_;
            }

            public Builder setGuildNumberTotalCount(int value) {
                this.bitField0_ |= 0x80;
                this.guildNumberTotalCount_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildNumberTotalCount() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.guildNumberTotalCount_ = 0;
                onChanged();
                return this;
            }

            public boolean hasApplyFund() {
                return ((this.bitField0_ & 0x100) == 256);
            }

            public int getApplyFund() {
                return this.applyFund_;
            }

            public Builder setApplyFund(int value) {
                this.bitField0_ |= 0x100;
                this.applyFund_ = value;
                onChanged();
                return this;
            }

            public Builder clearApplyFund() {
                this.bitField0_ &= 0xFFFFFEFF;
                this.applyFund_ = 0;
                onChanged();
                return this;
            }

            public boolean hasIsWinner() {
                return ((this.bitField0_ & 0x200) == 512);
            }

            public boolean getIsWinner() {
                return this.isWinner_;
            }

            public Builder setIsWinner(boolean value) {
                this.bitField0_ |= 0x200;
                this.isWinner_ = value;
                onChanged();
                return this;
            }

            public Builder clearIsWinner() {
                this.bitField0_ &= 0xFFFFFDFF;
                this.isWinner_ = false;
                onChanged();
                return this;
            }
        }
    }

    public static final class GetGuildAreaApplyListRequest extends GeneratedMessage implements GetGuildAreaApplyListRequestOrBuilder {
        private static final GetGuildAreaApplyListRequest defaultInstance = new GetGuildAreaApplyListRequest(true);
        private final UnknownFieldSet unknownFields;

        private GetGuildAreaApplyListRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetGuildAreaApplyListRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetGuildAreaApplyListRequest getDefaultInstance() {
            return defaultInstance;
        }

        public GetGuildAreaApplyListRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetGuildAreaApplyListRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.areaId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaApplyListRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaApplyListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetGuildAreaApplyListRequest.class, Builder.class);
        }

        public static Parser<GetGuildAreaApplyListRequest> PARSER = (Parser<GetGuildAreaApplyListRequest>) new AbstractParser<GetGuildAreaApplyListRequest>() {
            public GuildFortHandler.GetGuildAreaApplyListRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.GetGuildAreaApplyListRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int AREAID_FIELD_NUMBER = 1;
        private int areaId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetGuildAreaApplyListRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        private void initFields() {
            this.areaId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.areaId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.areaId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetGuildAreaApplyListRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetGuildAreaApplyListRequest) PARSER.parseFrom(data);
        }

        public static GetGuildAreaApplyListRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaApplyListRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaApplyListRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetGuildAreaApplyListRequest) PARSER.parseFrom(data);
        }

        public static GetGuildAreaApplyListRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaApplyListRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaApplyListRequest parseFrom(InputStream input) throws IOException {
            return (GetGuildAreaApplyListRequest) PARSER.parseFrom(input);
        }

        public static GetGuildAreaApplyListRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaApplyListRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetGuildAreaApplyListRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (GetGuildAreaApplyListRequest) PARSER.parseDelimitedFrom(input);
        }

        public static GetGuildAreaApplyListRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaApplyListRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetGuildAreaApplyListRequest parseFrom(CodedInputStream input) throws IOException {
            return (GetGuildAreaApplyListRequest) PARSER.parseFrom(input);
        }

        public static GetGuildAreaApplyListRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaApplyListRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetGuildAreaApplyListRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.GetGuildAreaApplyListRequestOrBuilder {
            private int bitField0_;
            private int areaId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaApplyListRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaApplyListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.GetGuildAreaApplyListRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.GetGuildAreaApplyListRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaApplyListRequest_descriptor;
            }

            public GuildFortHandler.GetGuildAreaApplyListRequest getDefaultInstanceForType() {
                return GuildFortHandler.GetGuildAreaApplyListRequest.getDefaultInstance();
            }

            public GuildFortHandler.GetGuildAreaApplyListRequest build() {
                GuildFortHandler.GetGuildAreaApplyListRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.GetGuildAreaApplyListRequest buildPartial() {
                GuildFortHandler.GetGuildAreaApplyListRequest result = new GuildFortHandler.GetGuildAreaApplyListRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.areaId_ = this.areaId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.GetGuildAreaApplyListRequest)
                    return mergeFrom((GuildFortHandler.GetGuildAreaApplyListRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.GetGuildAreaApplyListRequest other) {
                if (other == GuildFortHandler.GetGuildAreaApplyListRequest.getDefaultInstance()) return this;
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAreaId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.GetGuildAreaApplyListRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.GetGuildAreaApplyListRequest) GuildFortHandler.GetGuildAreaApplyListRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.GetGuildAreaApplyListRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x1;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }
    }


    public static final class GetGuildAreaApplyListResponse
            extends GeneratedMessage
            implements GetGuildAreaApplyListResponseOrBuilder {
        private static final GetGuildAreaApplyListResponse defaultInstance = new GetGuildAreaApplyListResponse(true);
        private final UnknownFieldSet unknownFields;

        private GetGuildAreaApplyListResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private GetGuildAreaApplyListResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static GetGuildAreaApplyListResponse getDefaultInstance() {
            return defaultInstance;
        }

        public GetGuildAreaApplyListResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetGuildAreaApplyListResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 26:
                            if ((mutable_bitField0_ & 0x4) != 4) {
                                this.applyList_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.applyList_.add(input.readMessage(GuildFortHandler.GuildAreaApplyInfo.PARSER, extensionRegistry));
                            break;
                        case 32:
                            this.bitField0_ |= 0x4;
                            this.countDown_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x4) == 4) this.applyList_ = Collections.unmodifiableList(this.applyList_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaApplyListResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaApplyListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetGuildAreaApplyListResponse.class, Builder.class);
        }

        public static Parser<GetGuildAreaApplyListResponse> PARSER = (Parser<GetGuildAreaApplyListResponse>) new AbstractParser<GetGuildAreaApplyListResponse>() {
            public GuildFortHandler.GetGuildAreaApplyListResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.GetGuildAreaApplyListResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int APPLYLIST_FIELD_NUMBER = 3;
        private List<GuildFortHandler.GuildAreaApplyInfo> applyList_;
        public static final int COUNTDOWN_FIELD_NUMBER = 4;
        private int countDown_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<GetGuildAreaApplyListResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public List<GuildFortHandler.GuildAreaApplyInfo> getApplyListList() {
            return this.applyList_;
        }

        public List<? extends GuildFortHandler.GuildAreaApplyInfoOrBuilder> getApplyListOrBuilderList() {
            return (List) this.applyList_;
        }

        public int getApplyListCount() {
            return this.applyList_.size();
        }

        public GuildFortHandler.GuildAreaApplyInfo getApplyList(int index) {
            return this.applyList_.get(index);
        }

        public GuildFortHandler.GuildAreaApplyInfoOrBuilder getApplyListOrBuilder(int index) {
            return this.applyList_.get(index);
        }

        public boolean hasCountDown() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getCountDown() {
            return this.countDown_;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.applyList_ = Collections.emptyList();
            this.countDown_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getApplyListCount(); i++) {
                if (!getApplyList(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            for (int i = 0; i < this.applyList_.size(); i++)
                output.writeMessage(3, (MessageLite) this.applyList_.get(i));
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(4, this.countDown_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            for (int i = 0; i < this.applyList_.size(); i++)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.applyList_.get(i));
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(4, this.countDown_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static GetGuildAreaApplyListResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GetGuildAreaApplyListResponse) PARSER.parseFrom(data);
        }

        public static GetGuildAreaApplyListResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaApplyListResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaApplyListResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GetGuildAreaApplyListResponse) PARSER.parseFrom(data);
        }

        public static GetGuildAreaApplyListResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GetGuildAreaApplyListResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static GetGuildAreaApplyListResponse parseFrom(InputStream input) throws IOException {
            return (GetGuildAreaApplyListResponse) PARSER.parseFrom(input);
        }

        public static GetGuildAreaApplyListResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaApplyListResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static GetGuildAreaApplyListResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (GetGuildAreaApplyListResponse) PARSER.parseDelimitedFrom(input);
        }

        public static GetGuildAreaApplyListResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaApplyListResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static GetGuildAreaApplyListResponse parseFrom(CodedInputStream input) throws IOException {
            return (GetGuildAreaApplyListResponse) PARSER.parseFrom(input);
        }

        public static GetGuildAreaApplyListResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GetGuildAreaApplyListResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(GetGuildAreaApplyListResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.GetGuildAreaApplyListResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private List<GuildFortHandler.GuildAreaApplyInfo> applyList_;
            private RepeatedFieldBuilder<GuildFortHandler.GuildAreaApplyInfo, GuildFortHandler.GuildAreaApplyInfo.Builder, GuildFortHandler.GuildAreaApplyInfoOrBuilder> applyListBuilder_;
            private int countDown_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaApplyListResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaApplyListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.GetGuildAreaApplyListResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.applyList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.applyList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.GetGuildAreaApplyListResponse.alwaysUseFieldBuilders) getApplyListFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.applyListBuilder_ == null) {
                    this.applyList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                } else {
                    this.applyListBuilder_.clear();
                }
                this.countDown_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_GetGuildAreaApplyListResponse_descriptor;
            }

            public GuildFortHandler.GetGuildAreaApplyListResponse getDefaultInstanceForType() {
                return GuildFortHandler.GetGuildAreaApplyListResponse.getDefaultInstance();
            }

            public GuildFortHandler.GetGuildAreaApplyListResponse build() {
                GuildFortHandler.GetGuildAreaApplyListResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.GetGuildAreaApplyListResponse buildPartial() {
                GuildFortHandler.GetGuildAreaApplyListResponse result = new GuildFortHandler.GetGuildAreaApplyListResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if (this.applyListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4) {
                        this.applyList_ = Collections.unmodifiableList(this.applyList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.applyList_ = this.applyList_;
                } else {
                    result.applyList_ = this.applyListBuilder_.build();
                }
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x4;
                result.countDown_ = this.countDown_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.GetGuildAreaApplyListResponse)
                    return mergeFrom((GuildFortHandler.GetGuildAreaApplyListResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.GetGuildAreaApplyListResponse other) {
                if (other == GuildFortHandler.GetGuildAreaApplyListResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (this.applyListBuilder_ == null) {
                    if (!other.applyList_.isEmpty()) {
                        if (this.applyList_.isEmpty()) {
                            this.applyList_ = other.applyList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        } else {
                            ensureApplyListIsMutable();
                            this.applyList_.addAll(other.applyList_);
                        }
                        onChanged();
                    }
                } else if (!other.applyList_.isEmpty()) {
                    if (this.applyListBuilder_.isEmpty()) {
                        this.applyListBuilder_.dispose();
                        this.applyListBuilder_ = null;
                        this.applyList_ = other.applyList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.applyListBuilder_ = GuildFortHandler.GetGuildAreaApplyListResponse.alwaysUseFieldBuilders ? getApplyListFieldBuilder() : null;
                    } else {
                        this.applyListBuilder_.addAllMessages(other.applyList_);
                    }
                }
                if (other.hasCountDown()) setCountDown(other.getCountDown());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                for (int i = 0; i < getApplyListCount(); i++) {
                    if (!getApplyList(i).isInitialized()) return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.GetGuildAreaApplyListResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.GetGuildAreaApplyListResponse) GuildFortHandler.GetGuildAreaApplyListResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.GetGuildAreaApplyListResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.GetGuildAreaApplyListResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            private void ensureApplyListIsMutable() {
                if ((this.bitField0_ & 0x4) != 4) {
                    this.applyList_ = new ArrayList<>(this.applyList_);
                    this.bitField0_ |= 0x4;
                }
            }

            public List<GuildFortHandler.GuildAreaApplyInfo> getApplyListList() {
                if (this.applyListBuilder_ == null) return Collections.unmodifiableList(this.applyList_);
                return this.applyListBuilder_.getMessageList();
            }

            public int getApplyListCount() {
                if (this.applyListBuilder_ == null) return this.applyList_.size();
                return this.applyListBuilder_.getCount();
            }

            public GuildFortHandler.GuildAreaApplyInfo getApplyList(int index) {
                if (this.applyListBuilder_ == null) return this.applyList_.get(index);
                return (GuildFortHandler.GuildAreaApplyInfo) this.applyListBuilder_.getMessage(index);
            }

            public Builder setApplyList(int index, GuildFortHandler.GuildAreaApplyInfo value) {
                if (this.applyListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureApplyListIsMutable();
                    this.applyList_.set(index, value);
                    onChanged();
                } else {
                    this.applyListBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setApplyList(int index, GuildFortHandler.GuildAreaApplyInfo.Builder builderForValue) {
                if (this.applyListBuilder_ == null) {
                    ensureApplyListIsMutable();
                    this.applyList_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.applyListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addApplyList(GuildFortHandler.GuildAreaApplyInfo value) {
                if (this.applyListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureApplyListIsMutable();
                    this.applyList_.add(value);
                    onChanged();
                } else {
                    this.applyListBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addApplyList(int index, GuildFortHandler.GuildAreaApplyInfo value) {
                if (this.applyListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureApplyListIsMutable();
                    this.applyList_.add(index, value);
                    onChanged();
                } else {
                    this.applyListBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addApplyList(GuildFortHandler.GuildAreaApplyInfo.Builder builderForValue) {
                if (this.applyListBuilder_ == null) {
                    ensureApplyListIsMutable();
                    this.applyList_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.applyListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addApplyList(int index, GuildFortHandler.GuildAreaApplyInfo.Builder builderForValue) {
                if (this.applyListBuilder_ == null) {
                    ensureApplyListIsMutable();
                    this.applyList_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.applyListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllApplyList(Iterable<? extends GuildFortHandler.GuildAreaApplyInfo> values) {
                if (this.applyListBuilder_ == null) {
                    ensureApplyListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.applyList_);
                    onChanged();
                } else {
                    this.applyListBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearApplyList() {
                if (this.applyListBuilder_ == null) {
                    this.applyList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    onChanged();
                } else {
                    this.applyListBuilder_.clear();
                }
                return this;
            }

            public Builder removeApplyList(int index) {
                if (this.applyListBuilder_ == null) {
                    ensureApplyListIsMutable();
                    this.applyList_.remove(index);
                    onChanged();
                } else {
                    this.applyListBuilder_.remove(index);
                }
                return this;
            }

            public GuildFortHandler.GuildAreaApplyInfo.Builder getApplyListBuilder(int index) {
                return (GuildFortHandler.GuildAreaApplyInfo.Builder) getApplyListFieldBuilder().getBuilder(index);
            }

            public GuildFortHandler.GuildAreaApplyInfoOrBuilder getApplyListOrBuilder(int index) {
                if (this.applyListBuilder_ == null) return this.applyList_.get(index);
                return (GuildFortHandler.GuildAreaApplyInfoOrBuilder) this.applyListBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GuildFortHandler.GuildAreaApplyInfoOrBuilder> getApplyListOrBuilderList() {
                if (this.applyListBuilder_ != null) return this.applyListBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.applyList_);
            }

            public GuildFortHandler.GuildAreaApplyInfo.Builder addApplyListBuilder() {
                return (GuildFortHandler.GuildAreaApplyInfo.Builder) getApplyListFieldBuilder().addBuilder(GuildFortHandler.GuildAreaApplyInfo.getDefaultInstance());
            }

            public GuildFortHandler.GuildAreaApplyInfo.Builder addApplyListBuilder(int index) {
                return (GuildFortHandler.GuildAreaApplyInfo.Builder) getApplyListFieldBuilder().addBuilder(index, GuildFortHandler.GuildAreaApplyInfo.getDefaultInstance());
            }

            public List<GuildFortHandler.GuildAreaApplyInfo.Builder> getApplyListBuilderList() {
                return getApplyListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GuildFortHandler.GuildAreaApplyInfo, GuildFortHandler.GuildAreaApplyInfo.Builder, GuildFortHandler.GuildAreaApplyInfoOrBuilder> getApplyListFieldBuilder() {
                if (this.applyListBuilder_ == null) {
                    this.applyListBuilder_ = new RepeatedFieldBuilder(this.applyList_, ((this.bitField0_ & 0x4) == 4), getParentForChildren(), isClean());
                    this.applyList_ = null;
                }
                return this.applyListBuilder_;
            }

            public boolean hasCountDown() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getCountDown() {
                return this.countDown_;
            }

            public Builder setCountDown(int value) {
                this.bitField0_ |= 0x8;
                this.countDown_ = value;
                onChanged();
                return this;
            }

            public Builder clearCountDown() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.countDown_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyGuildFundRequest
            extends GeneratedMessage
            implements ApplyGuildFundRequestOrBuilder {
        private static final ApplyGuildFundRequest defaultInstance = new ApplyGuildFundRequest(true);
        private final UnknownFieldSet unknownFields;

        private ApplyGuildFundRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyGuildFundRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyGuildFundRequest getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyGuildFundRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyGuildFundRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            continue;
                    }
                    if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) done = true;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyGuildFundRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyGuildFundRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyGuildFundRequest.class, Builder.class);
        }

        public static Parser<ApplyGuildFundRequest> PARSER = (Parser<ApplyGuildFundRequest>) new AbstractParser<ApplyGuildFundRequest>() {
            public GuildFortHandler.ApplyGuildFundRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyGuildFundRequest(input, extensionRegistry);
            }
        };
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyGuildFundRequest> getParserForType() {
            return PARSER;
        }

        private void initFields() {
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyGuildFundRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyGuildFundRequest) PARSER.parseFrom(data);
        }

        public static ApplyGuildFundRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyGuildFundRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyGuildFundRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyGuildFundRequest) PARSER.parseFrom(data);
        }

        public static ApplyGuildFundRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyGuildFundRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyGuildFundRequest parseFrom(InputStream input) throws IOException {
            return (ApplyGuildFundRequest) PARSER.parseFrom(input);
        }

        public static ApplyGuildFundRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyGuildFundRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyGuildFundRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyGuildFundRequest) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyGuildFundRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyGuildFundRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyGuildFundRequest parseFrom(CodedInputStream input) throws IOException {
            return (ApplyGuildFundRequest) PARSER.parseFrom(input);
        }

        public static ApplyGuildFundRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyGuildFundRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyGuildFundRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyGuildFundRequestOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyGuildFundRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyGuildFundRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyGuildFundRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyGuildFundRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyGuildFundRequest_descriptor;
            }

            public GuildFortHandler.ApplyGuildFundRequest getDefaultInstanceForType() {
                return GuildFortHandler.ApplyGuildFundRequest.getDefaultInstance();
            }

            public GuildFortHandler.ApplyGuildFundRequest build() {
                GuildFortHandler.ApplyGuildFundRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyGuildFundRequest buildPartial() {
                GuildFortHandler.ApplyGuildFundRequest result = new GuildFortHandler.ApplyGuildFundRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyGuildFundRequest)
                    return mergeFrom((GuildFortHandler.ApplyGuildFundRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyGuildFundRequest other) {
                if (other == GuildFortHandler.ApplyGuildFundRequest.getDefaultInstance()) return this;
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyGuildFundRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyGuildFundRequest) GuildFortHandler.ApplyGuildFundRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyGuildFundRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyGuildFundResponse
            extends GeneratedMessage
            implements ApplyGuildFundResponseOrBuilder {
        private static final ApplyGuildFundResponse defaultInstance = new ApplyGuildFundResponse(true);
        private final UnknownFieldSet unknownFields;

        private ApplyGuildFundResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyGuildFundResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyGuildFundResponse getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyGuildFundResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyGuildFundResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.guildFund_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyGuildFundResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyGuildFundResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyGuildFundResponse.class, Builder.class);
        }

        public static Parser<ApplyGuildFundResponse> PARSER = (Parser<ApplyGuildFundResponse>) new AbstractParser<ApplyGuildFundResponse>() {
            public GuildFortHandler.ApplyGuildFundResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyGuildFundResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int GUILDFUND_FIELD_NUMBER = 3;
        private int guildFund_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyGuildFundResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildFund() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getGuildFund() {
            return this.guildFund_;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.guildFund_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildFund()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.guildFund_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.guildFund_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyGuildFundResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyGuildFundResponse) PARSER.parseFrom(data);
        }

        public static ApplyGuildFundResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyGuildFundResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyGuildFundResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyGuildFundResponse) PARSER.parseFrom(data);
        }

        public static ApplyGuildFundResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyGuildFundResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyGuildFundResponse parseFrom(InputStream input) throws IOException {
            return (ApplyGuildFundResponse) PARSER.parseFrom(input);
        }

        public static ApplyGuildFundResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyGuildFundResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyGuildFundResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyGuildFundResponse) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyGuildFundResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyGuildFundResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyGuildFundResponse parseFrom(CodedInputStream input) throws IOException {
            return (ApplyGuildFundResponse) PARSER.parseFrom(input);
        }

        public static ApplyGuildFundResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyGuildFundResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyGuildFundResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyGuildFundResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private int guildFund_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyGuildFundResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyGuildFundResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyGuildFundResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyGuildFundResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildFund_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyGuildFundResponse_descriptor;
            }

            public GuildFortHandler.ApplyGuildFundResponse getDefaultInstanceForType() {
                return GuildFortHandler.ApplyGuildFundResponse.getDefaultInstance();
            }

            public GuildFortHandler.ApplyGuildFundResponse build() {
                GuildFortHandler.ApplyGuildFundResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyGuildFundResponse buildPartial() {
                GuildFortHandler.ApplyGuildFundResponse result = new GuildFortHandler.ApplyGuildFundResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.guildFund_ = this.guildFund_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyGuildFundResponse)
                    return mergeFrom((GuildFortHandler.ApplyGuildFundResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyGuildFundResponse other) {
                if (other == GuildFortHandler.ApplyGuildFundResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasGuildFund()) setGuildFund(other.getGuildFund());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                if (!hasGuildFund()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyGuildFundResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyGuildFundResponse) GuildFortHandler.ApplyGuildFundResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyGuildFundResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.ApplyGuildFundResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildFund() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getGuildFund() {
                return this.guildFund_;
            }

            public Builder setGuildFund(int value) {
                this.bitField0_ |= 0x4;
                this.guildFund_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildFund() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildFund_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyFundRequest
            extends GeneratedMessage
            implements ApplyFundRequestOrBuilder {
        private static final ApplyFundRequest defaultInstance = new ApplyFundRequest(true);
        private final UnknownFieldSet unknownFields;

        private ApplyFundRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyFundRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyFundRequest getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyFundRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyFundRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.areaId_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.applyFund_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyFundRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyFundRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyFundRequest.class, Builder.class);
        }

        public static Parser<ApplyFundRequest> PARSER = (Parser<ApplyFundRequest>) new AbstractParser<ApplyFundRequest>() {
            public GuildFortHandler.ApplyFundRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyFundRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int AREAID_FIELD_NUMBER = 1;
        private int areaId_;
        public static final int APPLYFUND_FIELD_NUMBER = 2;
        private int applyFund_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyFundRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        public boolean hasApplyFund() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getApplyFund() {
            return this.applyFund_;
        }

        private void initFields() {
            this.areaId_ = 0;
            this.applyFund_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasApplyFund()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.areaId_);
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.applyFund_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.areaId_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.applyFund_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyFundRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyFundRequest) PARSER.parseFrom(data);
        }

        public static ApplyFundRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyFundRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyFundRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyFundRequest) PARSER.parseFrom(data);
        }

        public static ApplyFundRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyFundRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyFundRequest parseFrom(InputStream input) throws IOException {
            return (ApplyFundRequest) PARSER.parseFrom(input);
        }

        public static ApplyFundRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFundRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyFundRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyFundRequest) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyFundRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFundRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyFundRequest parseFrom(CodedInputStream input) throws IOException {
            return (ApplyFundRequest) PARSER.parseFrom(input);
        }

        public static ApplyFundRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFundRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyFundRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyFundRequestOrBuilder {
            private int bitField0_;
            private int areaId_;
            private int applyFund_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFundRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFundRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyFundRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyFundRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.applyFund_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFundRequest_descriptor;
            }

            public GuildFortHandler.ApplyFundRequest getDefaultInstanceForType() {
                return GuildFortHandler.ApplyFundRequest.getDefaultInstance();
            }

            public GuildFortHandler.ApplyFundRequest build() {
                GuildFortHandler.ApplyFundRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyFundRequest buildPartial() {
                GuildFortHandler.ApplyFundRequest result = new GuildFortHandler.ApplyFundRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.areaId_ = this.areaId_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.applyFund_ = this.applyFund_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyFundRequest)
                    return mergeFrom((GuildFortHandler.ApplyFundRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyFundRequest other) {
                if (other == GuildFortHandler.ApplyFundRequest.getDefaultInstance()) return this;
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                if (other.hasApplyFund()) setApplyFund(other.getApplyFund());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAreaId()) return false;
                if (!hasApplyFund()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyFundRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyFundRequest) GuildFortHandler.ApplyFundRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyFundRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x1;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasApplyFund() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getApplyFund() {
                return this.applyFund_;
            }

            public Builder setApplyFund(int value) {
                this.bitField0_ |= 0x2;
                this.applyFund_ = value;
                onChanged();
                return this;
            }

            public Builder clearApplyFund() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.applyFund_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyFundResponse
            extends GeneratedMessage
            implements ApplyFundResponseOrBuilder {
        private static final ApplyFundResponse defaultInstance = new ApplyFundResponse(true);
        private final UnknownFieldSet unknownFields;

        private ApplyFundResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyFundResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyFundResponse getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyFundResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyFundResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyFundResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyFundResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyFundResponse.class, Builder.class);
        }

        public static Parser<ApplyFundResponse> PARSER = (Parser<ApplyFundResponse>) new AbstractParser<ApplyFundResponse>() {
            public GuildFortHandler.ApplyFundResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyFundResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyFundResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyFundResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyFundResponse) PARSER.parseFrom(data);
        }

        public static ApplyFundResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyFundResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyFundResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyFundResponse) PARSER.parseFrom(data);
        }

        public static ApplyFundResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyFundResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyFundResponse parseFrom(InputStream input) throws IOException {
            return (ApplyFundResponse) PARSER.parseFrom(input);
        }

        public static ApplyFundResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFundResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyFundResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyFundResponse) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyFundResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFundResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyFundResponse parseFrom(CodedInputStream input) throws IOException {
            return (ApplyFundResponse) PARSER.parseFrom(input);
        }

        public static ApplyFundResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFundResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyFundResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyFundResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFundResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFundResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyFundResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyFundResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFundResponse_descriptor;
            }

            public GuildFortHandler.ApplyFundResponse getDefaultInstanceForType() {
                return GuildFortHandler.ApplyFundResponse.getDefaultInstance();
            }

            public GuildFortHandler.ApplyFundResponse build() {
                GuildFortHandler.ApplyFundResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyFundResponse buildPartial() {
                GuildFortHandler.ApplyFundResponse result = new GuildFortHandler.ApplyFundResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyFundResponse)
                    return mergeFrom((GuildFortHandler.ApplyFundResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyFundResponse other) {
                if (other == GuildFortHandler.ApplyFundResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyFundResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyFundResponse) GuildFortHandler.ApplyFundResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyFundResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.ApplyFundResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyCancelFundRequest
            extends GeneratedMessage
            implements ApplyCancelFundRequestOrBuilder {
        private static final ApplyCancelFundRequest defaultInstance = new ApplyCancelFundRequest(true);
        private final UnknownFieldSet unknownFields;

        private ApplyCancelFundRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyCancelFundRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyCancelFundRequest getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyCancelFundRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyCancelFundRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.areaId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyCancelFundRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyCancelFundRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyCancelFundRequest.class, Builder.class);
        }

        public static Parser<ApplyCancelFundRequest> PARSER = (Parser<ApplyCancelFundRequest>) new AbstractParser<ApplyCancelFundRequest>() {
            public GuildFortHandler.ApplyCancelFundRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyCancelFundRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int AREAID_FIELD_NUMBER = 1;
        private int areaId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyCancelFundRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        private void initFields() {
            this.areaId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.areaId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.areaId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyCancelFundRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyCancelFundRequest) PARSER.parseFrom(data);
        }

        public static ApplyCancelFundRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyCancelFundRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyCancelFundRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyCancelFundRequest) PARSER.parseFrom(data);
        }

        public static ApplyCancelFundRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyCancelFundRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyCancelFundRequest parseFrom(InputStream input) throws IOException {
            return (ApplyCancelFundRequest) PARSER.parseFrom(input);
        }

        public static ApplyCancelFundRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyCancelFundRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyCancelFundRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyCancelFundRequest) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyCancelFundRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyCancelFundRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyCancelFundRequest parseFrom(CodedInputStream input) throws IOException {
            return (ApplyCancelFundRequest) PARSER.parseFrom(input);
        }

        public static ApplyCancelFundRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyCancelFundRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyCancelFundRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyCancelFundRequestOrBuilder {
            private int bitField0_;
            private int areaId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyCancelFundRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyCancelFundRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyCancelFundRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyCancelFundRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyCancelFundRequest_descriptor;
            }

            public GuildFortHandler.ApplyCancelFundRequest getDefaultInstanceForType() {
                return GuildFortHandler.ApplyCancelFundRequest.getDefaultInstance();
            }

            public GuildFortHandler.ApplyCancelFundRequest build() {
                GuildFortHandler.ApplyCancelFundRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyCancelFundRequest buildPartial() {
                GuildFortHandler.ApplyCancelFundRequest result = new GuildFortHandler.ApplyCancelFundRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.areaId_ = this.areaId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyCancelFundRequest)
                    return mergeFrom((GuildFortHandler.ApplyCancelFundRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyCancelFundRequest other) {
                if (other == GuildFortHandler.ApplyCancelFundRequest.getDefaultInstance()) return this;
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAreaId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyCancelFundRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyCancelFundRequest) GuildFortHandler.ApplyCancelFundRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyCancelFundRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x1;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyCancelFundResponse
            extends GeneratedMessage
            implements ApplyCancelFundResponseOrBuilder {
        private static final ApplyCancelFundResponse defaultInstance = new ApplyCancelFundResponse(true);
        private final UnknownFieldSet unknownFields;

        private ApplyCancelFundResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyCancelFundResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyCancelFundResponse getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyCancelFundResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyCancelFundResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyCancelFundResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyCancelFundResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyCancelFundResponse.class, Builder.class);
        }

        public static Parser<ApplyCancelFundResponse> PARSER = (Parser<ApplyCancelFundResponse>) new AbstractParser<ApplyCancelFundResponse>() {
            public GuildFortHandler.ApplyCancelFundResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyCancelFundResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyCancelFundResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyCancelFundResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyCancelFundResponse) PARSER.parseFrom(data);
        }

        public static ApplyCancelFundResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyCancelFundResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyCancelFundResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyCancelFundResponse) PARSER.parseFrom(data);
        }

        public static ApplyCancelFundResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyCancelFundResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyCancelFundResponse parseFrom(InputStream input) throws IOException {
            return (ApplyCancelFundResponse) PARSER.parseFrom(input);
        }

        public static ApplyCancelFundResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyCancelFundResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyCancelFundResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyCancelFundResponse) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyCancelFundResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyCancelFundResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyCancelFundResponse parseFrom(CodedInputStream input) throws IOException {
            return (ApplyCancelFundResponse) PARSER.parseFrom(input);
        }

        public static ApplyCancelFundResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyCancelFundResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyCancelFundResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyCancelFundResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyCancelFundResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyCancelFundResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyCancelFundResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyCancelFundResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyCancelFundResponse_descriptor;
            }

            public GuildFortHandler.ApplyCancelFundResponse getDefaultInstanceForType() {
                return GuildFortHandler.ApplyCancelFundResponse.getDefaultInstance();
            }

            public GuildFortHandler.ApplyCancelFundResponse build() {
                GuildFortHandler.ApplyCancelFundResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyCancelFundResponse buildPartial() {
                GuildFortHandler.ApplyCancelFundResponse result = new GuildFortHandler.ApplyCancelFundResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyCancelFundResponse)
                    return mergeFrom((GuildFortHandler.ApplyCancelFundResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyCancelFundResponse other) {
                if (other == GuildFortHandler.ApplyCancelFundResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyCancelFundResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyCancelFundResponse) GuildFortHandler.ApplyCancelFundResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyCancelFundResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.ApplyCancelFundResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class AreaAward
            extends GeneratedMessage
            implements AreaAwardOrBuilder {
        private static final AreaAward defaultInstance = new AreaAward(true);
        private final UnknownFieldSet unknownFields;

        private AreaAward(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private AreaAward(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static AreaAward getDefaultInstance() {
            return defaultInstance;
        }

        public AreaAward getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private AreaAward(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.areaId_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.guildName_ = bs;
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.status_ = input.readInt32();
                            break;
                        case 34:
                            if ((mutable_bitField0_ & 0x8) != 8) {
                                this.dailyAwardList_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x8;
                            }
                            this.dailyAwardList_.add(input.readMessage(ItemOuterClass.MiniItem.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x8) == 8)
                    this.dailyAwardList_ = Collections.unmodifiableList(this.dailyAwardList_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_AreaAward_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_AreaAward_fieldAccessorTable.ensureFieldAccessorsInitialized(AreaAward.class, Builder.class);
        }

        public static Parser<AreaAward> PARSER = (Parser<AreaAward>) new AbstractParser<AreaAward>() {
            public GuildFortHandler.AreaAward parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.AreaAward(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int AREAID_FIELD_NUMBER = 1;
        private int areaId_;
        public static final int GUILDNAME_FIELD_NUMBER = 2;
        private Object guildName_;
        public static final int STATUS_FIELD_NUMBER = 3;
        private int status_;
        public static final int DAILYAWARDLIST_FIELD_NUMBER = 4;
        private List<ItemOuterClass.MiniItem> dailyAwardList_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<AreaAward> getParserForType() {
            return PARSER;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        public boolean hasGuildName() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getGuildName() {
            Object ref = this.guildName_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildName_ = s;
            return s;
        }

        public ByteString getGuildNameBytes() {
            Object ref = this.guildName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasStatus() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getStatus() {
            return this.status_;
        }

        public List<ItemOuterClass.MiniItem> getDailyAwardListList() {
            return this.dailyAwardList_;
        }

        public List<? extends ItemOuterClass.MiniItemOrBuilder> getDailyAwardListOrBuilderList() {
            return (List) this.dailyAwardList_;
        }

        public int getDailyAwardListCount() {
            return this.dailyAwardList_.size();
        }

        public ItemOuterClass.MiniItem getDailyAwardList(int index) {
            return this.dailyAwardList_.get(index);
        }

        public ItemOuterClass.MiniItemOrBuilder getDailyAwardListOrBuilder(int index) {
            return (ItemOuterClass.MiniItemOrBuilder) this.dailyAwardList_.get(index);
        }

        private void initFields() {
            this.areaId_ = 0;
            this.guildName_ = "";
            this.status_ = 0;
            this.dailyAwardList_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasStatus()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getDailyAwardListCount(); i++) {
                if (!getDailyAwardList(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.areaId_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getGuildNameBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.status_);
            for (int i = 0; i < this.dailyAwardList_.size(); i++)
                output.writeMessage(4, (MessageLite) this.dailyAwardList_.get(i));
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.areaId_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getGuildNameBytes());
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.status_);
            for (int i = 0; i < this.dailyAwardList_.size(); i++)
                size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.dailyAwardList_.get(i));
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static AreaAward parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (AreaAward) PARSER.parseFrom(data);
        }

        public static AreaAward parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AreaAward) PARSER.parseFrom(data, extensionRegistry);
        }

        public static AreaAward parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (AreaAward) PARSER.parseFrom(data);
        }

        public static AreaAward parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (AreaAward) PARSER.parseFrom(data, extensionRegistry);
        }

        public static AreaAward parseFrom(InputStream input) throws IOException {
            return (AreaAward) PARSER.parseFrom(input);
        }

        public static AreaAward parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AreaAward) PARSER.parseFrom(input, extensionRegistry);
        }

        public static AreaAward parseDelimitedFrom(InputStream input) throws IOException {
            return (AreaAward) PARSER.parseDelimitedFrom(input);
        }

        public static AreaAward parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AreaAward) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static AreaAward parseFrom(CodedInputStream input) throws IOException {
            return (AreaAward) PARSER.parseFrom(input);
        }

        public static AreaAward parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (AreaAward) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(AreaAward prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.AreaAwardOrBuilder {
            private int bitField0_;
            private int areaId_;
            private Object guildName_;
            private int status_;
            private List<ItemOuterClass.MiniItem> dailyAwardList_;
            private RepeatedFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> dailyAwardListBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_AreaAward_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_AreaAward_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.AreaAward.class, Builder.class);
            }

            private Builder() {
                this.guildName_ = "";
                this.dailyAwardList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.guildName_ = "";
                this.dailyAwardList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.AreaAward.alwaysUseFieldBuilders) getDailyAwardListFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.guildName_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.status_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                if (this.dailyAwardListBuilder_ == null) {
                    this.dailyAwardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                } else {
                    this.dailyAwardListBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_AreaAward_descriptor;
            }

            public GuildFortHandler.AreaAward getDefaultInstanceForType() {
                return GuildFortHandler.AreaAward.getDefaultInstance();
            }

            public GuildFortHandler.AreaAward build() {
                GuildFortHandler.AreaAward result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.AreaAward buildPartial() {
                GuildFortHandler.AreaAward result = new GuildFortHandler.AreaAward(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.areaId_ = this.areaId_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.guildName_ = this.guildName_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.status_ = this.status_;
                if (this.dailyAwardListBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) == 8) {
                        this.dailyAwardList_ = Collections.unmodifiableList(this.dailyAwardList_);
                        this.bitField0_ &= 0xFFFFFFF7;
                    }
                    result.dailyAwardList_ = this.dailyAwardList_;
                } else {
                    result.dailyAwardList_ = this.dailyAwardListBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.AreaAward) return mergeFrom((GuildFortHandler.AreaAward) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.AreaAward other) {
                if (other == GuildFortHandler.AreaAward.getDefaultInstance()) return this;
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                if (other.hasGuildName()) {
                    this.bitField0_ |= 0x2;
                    this.guildName_ = other.guildName_;
                    onChanged();
                }
                if (other.hasStatus()) setStatus(other.getStatus());
                if (this.dailyAwardListBuilder_ == null) {
                    if (!other.dailyAwardList_.isEmpty()) {
                        if (this.dailyAwardList_.isEmpty()) {
                            this.dailyAwardList_ = other.dailyAwardList_;
                            this.bitField0_ &= 0xFFFFFFF7;
                        } else {
                            ensureDailyAwardListIsMutable();
                            this.dailyAwardList_.addAll(other.dailyAwardList_);
                        }
                        onChanged();
                    }
                } else if (!other.dailyAwardList_.isEmpty()) {
                    if (this.dailyAwardListBuilder_.isEmpty()) {
                        this.dailyAwardListBuilder_.dispose();
                        this.dailyAwardListBuilder_ = null;
                        this.dailyAwardList_ = other.dailyAwardList_;
                        this.bitField0_ &= 0xFFFFFFF7;
                        this.dailyAwardListBuilder_ = GuildFortHandler.AreaAward.alwaysUseFieldBuilders ? getDailyAwardListFieldBuilder() : null;
                    } else {
                        this.dailyAwardListBuilder_.addAllMessages(other.dailyAwardList_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAreaId()) return false;
                if (!hasGuildName()) return false;
                if (!hasStatus()) return false;
                for (int i = 0; i < getDailyAwardListCount(); i++) {
                    if (!getDailyAwardList(i).isInitialized()) return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.AreaAward parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.AreaAward) GuildFortHandler.AreaAward.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.AreaAward) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x1;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasGuildName() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getGuildName() {
                Object ref = this.guildName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.guildName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildNameBytes() {
                Object ref = this.guildName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildName() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildName_ = GuildFortHandler.AreaAward.getDefaultInstance().getGuildName();
                onChanged();
                return this;
            }

            public Builder setGuildNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public boolean hasStatus() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getStatus() {
                return this.status_;
            }

            public Builder setStatus(int value) {
                this.bitField0_ |= 0x4;
                this.status_ = value;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.status_ = 0;
                onChanged();
                return this;
            }

            private void ensureDailyAwardListIsMutable() {
                if ((this.bitField0_ & 0x8) != 8) {
                    this.dailyAwardList_ = new ArrayList<>(this.dailyAwardList_);
                    this.bitField0_ |= 0x8;
                }
            }

            public List<ItemOuterClass.MiniItem> getDailyAwardListList() {
                if (this.dailyAwardListBuilder_ == null) return Collections.unmodifiableList(this.dailyAwardList_);
                return this.dailyAwardListBuilder_.getMessageList();
            }

            public int getDailyAwardListCount() {
                if (this.dailyAwardListBuilder_ == null) return this.dailyAwardList_.size();
                return this.dailyAwardListBuilder_.getCount();
            }

            public ItemOuterClass.MiniItem getDailyAwardList(int index) {
                if (this.dailyAwardListBuilder_ == null) return this.dailyAwardList_.get(index);
                return (ItemOuterClass.MiniItem) this.dailyAwardListBuilder_.getMessage(index);
            }

            public Builder setDailyAwardList(int index, ItemOuterClass.MiniItem value) {
                if (this.dailyAwardListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.set(index, value);
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.setMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder setDailyAwardList(int index, ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.dailyAwardListBuilder_ == null) {
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.setMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addDailyAwardList(ItemOuterClass.MiniItem value) {
                if (this.dailyAwardListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.add(value);
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.addMessage((GeneratedMessage) value);
                }
                return this;
            }

            public Builder addDailyAwardList(int index, ItemOuterClass.MiniItem value) {
                if (this.dailyAwardListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.add(index, value);
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.addMessage(index, (GeneratedMessage) value);
                }
                return this;
            }

            public Builder addDailyAwardList(ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.dailyAwardListBuilder_ == null) {
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.addMessage((GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addDailyAwardList(int index, ItemOuterClass.MiniItem.Builder builderForValue) {
                if (this.dailyAwardListBuilder_ == null) {
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.addMessage(index, (GeneratedMessage) builderForValue.build());
                }
                return this;
            }

            public Builder addAllDailyAwardList(Iterable<? extends ItemOuterClass.MiniItem> values) {
                if (this.dailyAwardListBuilder_ == null) {
                    ensureDailyAwardListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.dailyAwardList_);
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearDailyAwardList() {
                if (this.dailyAwardListBuilder_ == null) {
                    this.dailyAwardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFF7;
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.clear();
                }
                return this;
            }

            public Builder removeDailyAwardList(int index) {
                if (this.dailyAwardListBuilder_ == null) {
                    ensureDailyAwardListIsMutable();
                    this.dailyAwardList_.remove(index);
                    onChanged();
                } else {
                    this.dailyAwardListBuilder_.remove(index);
                }
                return this;
            }

            public ItemOuterClass.MiniItem.Builder getDailyAwardListBuilder(int index) {
                return (ItemOuterClass.MiniItem.Builder) getDailyAwardListFieldBuilder().getBuilder(index);
            }

            public ItemOuterClass.MiniItemOrBuilder getDailyAwardListOrBuilder(int index) {
                if (this.dailyAwardListBuilder_ == null)
                    return (ItemOuterClass.MiniItemOrBuilder) this.dailyAwardList_.get(index);
                return (ItemOuterClass.MiniItemOrBuilder) this.dailyAwardListBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends ItemOuterClass.MiniItemOrBuilder> getDailyAwardListOrBuilderList() {
                if (this.dailyAwardListBuilder_ != null) return this.dailyAwardListBuilder_.getMessageOrBuilderList();
                return (List) Collections.unmodifiableList(this.dailyAwardList_);
            }

            public ItemOuterClass.MiniItem.Builder addDailyAwardListBuilder() {
                return (ItemOuterClass.MiniItem.Builder) getDailyAwardListFieldBuilder().addBuilder((GeneratedMessage) ItemOuterClass.MiniItem.getDefaultInstance());
            }

            public ItemOuterClass.MiniItem.Builder addDailyAwardListBuilder(int index) {
                return (ItemOuterClass.MiniItem.Builder) getDailyAwardListFieldBuilder().addBuilder(index, (GeneratedMessage) ItemOuterClass.MiniItem.getDefaultInstance());
            }

            public List<ItemOuterClass.MiniItem.Builder> getDailyAwardListBuilderList() {
                return getDailyAwardListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<ItemOuterClass.MiniItem, ItemOuterClass.MiniItem.Builder, ItemOuterClass.MiniItemOrBuilder> getDailyAwardListFieldBuilder() {
                if (this.dailyAwardListBuilder_ == null) {
                    this.dailyAwardListBuilder_ = new RepeatedFieldBuilder(this.dailyAwardList_, ((this.bitField0_ & 0x8) == 8), getParentForChildren(), isClean());
                    this.dailyAwardList_ = null;
                }
                return this.dailyAwardListBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyDailyAwardListRequest
            extends GeneratedMessage
            implements ApplyDailyAwardListRequestOrBuilder {
        private static final ApplyDailyAwardListRequest defaultInstance = new ApplyDailyAwardListRequest(true);
        private final UnknownFieldSet unknownFields;

        private ApplyDailyAwardListRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyDailyAwardListRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyDailyAwardListRequest getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyDailyAwardListRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyDailyAwardListRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            continue;
                    }
                    if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) done = true;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardListRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyDailyAwardListRequest.class, Builder.class);
        }

        public static Parser<ApplyDailyAwardListRequest> PARSER = (Parser<ApplyDailyAwardListRequest>) new AbstractParser<ApplyDailyAwardListRequest>() {
            public GuildFortHandler.ApplyDailyAwardListRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyDailyAwardListRequest(input, extensionRegistry);
            }
        };
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyDailyAwardListRequest> getParserForType() {
            return PARSER;
        }

        private void initFields() {
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyDailyAwardListRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardListRequest) PARSER.parseFrom(data);
        }

        public static ApplyDailyAwardListRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardListRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyDailyAwardListRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardListRequest) PARSER.parseFrom(data);
        }

        public static ApplyDailyAwardListRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardListRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyDailyAwardListRequest parseFrom(InputStream input) throws IOException {
            return (ApplyDailyAwardListRequest) PARSER.parseFrom(input);
        }

        public static ApplyDailyAwardListRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardListRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyDailyAwardListRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyDailyAwardListRequest) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyDailyAwardListRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardListRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyDailyAwardListRequest parseFrom(CodedInputStream input) throws IOException {
            return (ApplyDailyAwardListRequest) PARSER.parseFrom(input);
        }

        public static ApplyDailyAwardListRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardListRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyDailyAwardListRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyDailyAwardListRequestOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardListRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyDailyAwardListRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyDailyAwardListRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardListRequest_descriptor;
            }

            public GuildFortHandler.ApplyDailyAwardListRequest getDefaultInstanceForType() {
                return GuildFortHandler.ApplyDailyAwardListRequest.getDefaultInstance();
            }

            public GuildFortHandler.ApplyDailyAwardListRequest build() {
                GuildFortHandler.ApplyDailyAwardListRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyDailyAwardListRequest buildPartial() {
                GuildFortHandler.ApplyDailyAwardListRequest result = new GuildFortHandler.ApplyDailyAwardListRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyDailyAwardListRequest)
                    return mergeFrom((GuildFortHandler.ApplyDailyAwardListRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyDailyAwardListRequest other) {
                if (other == GuildFortHandler.ApplyDailyAwardListRequest.getDefaultInstance()) return this;
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyDailyAwardListRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyDailyAwardListRequest) GuildFortHandler.ApplyDailyAwardListRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyDailyAwardListRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyDailyAwardListResponse
            extends GeneratedMessage
            implements ApplyDailyAwardListResponseOrBuilder {
        private static final ApplyDailyAwardListResponse defaultInstance = new ApplyDailyAwardListResponse(true);
        private final UnknownFieldSet unknownFields;

        private ApplyDailyAwardListResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyDailyAwardListResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyDailyAwardListResponse getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyDailyAwardListResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyDailyAwardListResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            if ((mutable_bitField0_ & 0x2) != 2) {
                                this.areaAwardList_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.areaAwardList_.add(input.readMessage(GuildFortHandler.AreaAward.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x2) == 2)
                    this.areaAwardList_ = Collections.unmodifiableList(this.areaAwardList_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardListResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyDailyAwardListResponse.class, Builder.class);
        }

        public static Parser<ApplyDailyAwardListResponse> PARSER = (Parser<ApplyDailyAwardListResponse>) new AbstractParser<ApplyDailyAwardListResponse>() {
            public GuildFortHandler.ApplyDailyAwardListResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyDailyAwardListResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int AREAAWARDLIST_FIELD_NUMBER = 2;
        private List<GuildFortHandler.AreaAward> areaAwardList_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyDailyAwardListResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public List<GuildFortHandler.AreaAward> getAreaAwardListList() {
            return this.areaAwardList_;
        }

        public List<? extends GuildFortHandler.AreaAwardOrBuilder> getAreaAwardListOrBuilderList() {
            return (List) this.areaAwardList_;
        }

        public int getAreaAwardListCount() {
            return this.areaAwardList_.size();
        }

        public GuildFortHandler.AreaAward getAreaAwardList(int index) {
            return this.areaAwardList_.get(index);
        }

        public GuildFortHandler.AreaAwardOrBuilder getAreaAwardListOrBuilder(int index) {
            return this.areaAwardList_.get(index);
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.areaAwardList_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getAreaAwardListCount(); i++) {
                if (!getAreaAwardList(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            for (int i = 0; i < this.areaAwardList_.size(); i++)
                output.writeMessage(2, (MessageLite) this.areaAwardList_.get(i));
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            for (int i = 0; i < this.areaAwardList_.size(); i++)
                size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.areaAwardList_.get(i));
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyDailyAwardListResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardListResponse) PARSER.parseFrom(data);
        }

        public static ApplyDailyAwardListResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardListResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyDailyAwardListResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardListResponse) PARSER.parseFrom(data);
        }

        public static ApplyDailyAwardListResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardListResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyDailyAwardListResponse parseFrom(InputStream input) throws IOException {
            return (ApplyDailyAwardListResponse) PARSER.parseFrom(input);
        }

        public static ApplyDailyAwardListResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardListResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyDailyAwardListResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyDailyAwardListResponse) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyDailyAwardListResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardListResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyDailyAwardListResponse parseFrom(CodedInputStream input) throws IOException {
            return (ApplyDailyAwardListResponse) PARSER.parseFrom(input);
        }

        public static ApplyDailyAwardListResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardListResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyDailyAwardListResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyDailyAwardListResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private List<GuildFortHandler.AreaAward> areaAwardList_;
            private RepeatedFieldBuilder<GuildFortHandler.AreaAward, GuildFortHandler.AreaAward.Builder, GuildFortHandler.AreaAwardOrBuilder> areaAwardListBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardListResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyDailyAwardListResponse.class, Builder.class);
            }

            private Builder() {
                this.areaAwardList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.areaAwardList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyDailyAwardListResponse.alwaysUseFieldBuilders) getAreaAwardListFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.areaAwardListBuilder_ == null) {
                    this.areaAwardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                } else {
                    this.areaAwardListBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardListResponse_descriptor;
            }

            public GuildFortHandler.ApplyDailyAwardListResponse getDefaultInstanceForType() {
                return GuildFortHandler.ApplyDailyAwardListResponse.getDefaultInstance();
            }

            public GuildFortHandler.ApplyDailyAwardListResponse build() {
                GuildFortHandler.ApplyDailyAwardListResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyDailyAwardListResponse buildPartial() {
                GuildFortHandler.ApplyDailyAwardListResponse result = new GuildFortHandler.ApplyDailyAwardListResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if (this.areaAwardListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) == 2) {
                        this.areaAwardList_ = Collections.unmodifiableList(this.areaAwardList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.areaAwardList_ = this.areaAwardList_;
                } else {
                    result.areaAwardList_ = this.areaAwardListBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyDailyAwardListResponse)
                    return mergeFrom((GuildFortHandler.ApplyDailyAwardListResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyDailyAwardListResponse other) {
                if (other == GuildFortHandler.ApplyDailyAwardListResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (this.areaAwardListBuilder_ == null) {
                    if (!other.areaAwardList_.isEmpty()) {
                        if (this.areaAwardList_.isEmpty()) {
                            this.areaAwardList_ = other.areaAwardList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        } else {
                            ensureAreaAwardListIsMutable();
                            this.areaAwardList_.addAll(other.areaAwardList_);
                        }
                        onChanged();
                    }
                } else if (!other.areaAwardList_.isEmpty()) {
                    if (this.areaAwardListBuilder_.isEmpty()) {
                        this.areaAwardListBuilder_.dispose();
                        this.areaAwardListBuilder_ = null;
                        this.areaAwardList_ = other.areaAwardList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.areaAwardListBuilder_ = GuildFortHandler.ApplyDailyAwardListResponse.alwaysUseFieldBuilders ? getAreaAwardListFieldBuilder() : null;
                    } else {
                        this.areaAwardListBuilder_.addAllMessages(other.areaAwardList_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                for (int i = 0; i < getAreaAwardListCount(); i++) {
                    if (!getAreaAwardList(i).isInitialized()) return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyDailyAwardListResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyDailyAwardListResponse) GuildFortHandler.ApplyDailyAwardListResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyDailyAwardListResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            private void ensureAreaAwardListIsMutable() {
                if ((this.bitField0_ & 0x2) != 2) {
                    this.areaAwardList_ = new ArrayList<>(this.areaAwardList_);
                    this.bitField0_ |= 0x2;
                }
            }

            public List<GuildFortHandler.AreaAward> getAreaAwardListList() {
                if (this.areaAwardListBuilder_ == null) return Collections.unmodifiableList(this.areaAwardList_);
                return this.areaAwardListBuilder_.getMessageList();
            }

            public int getAreaAwardListCount() {
                if (this.areaAwardListBuilder_ == null) return this.areaAwardList_.size();
                return this.areaAwardListBuilder_.getCount();
            }

            public GuildFortHandler.AreaAward getAreaAwardList(int index) {
                if (this.areaAwardListBuilder_ == null) return this.areaAwardList_.get(index);
                return (GuildFortHandler.AreaAward) this.areaAwardListBuilder_.getMessage(index);
            }

            public Builder setAreaAwardList(int index, GuildFortHandler.AreaAward value) {
                if (this.areaAwardListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureAreaAwardListIsMutable();
                    this.areaAwardList_.set(index, value);
                    onChanged();
                } else {
                    this.areaAwardListBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setAreaAwardList(int index, GuildFortHandler.AreaAward.Builder builderForValue) {
                if (this.areaAwardListBuilder_ == null) {
                    ensureAreaAwardListIsMutable();
                    this.areaAwardList_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.areaAwardListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAreaAwardList(GuildFortHandler.AreaAward value) {
                if (this.areaAwardListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureAreaAwardListIsMutable();
                    this.areaAwardList_.add(value);
                    onChanged();
                } else {
                    this.areaAwardListBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addAreaAwardList(int index, GuildFortHandler.AreaAward value) {
                if (this.areaAwardListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureAreaAwardListIsMutable();
                    this.areaAwardList_.add(index, value);
                    onChanged();
                } else {
                    this.areaAwardListBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addAreaAwardList(GuildFortHandler.AreaAward.Builder builderForValue) {
                if (this.areaAwardListBuilder_ == null) {
                    ensureAreaAwardListIsMutable();
                    this.areaAwardList_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.areaAwardListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addAreaAwardList(int index, GuildFortHandler.AreaAward.Builder builderForValue) {
                if (this.areaAwardListBuilder_ == null) {
                    ensureAreaAwardListIsMutable();
                    this.areaAwardList_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.areaAwardListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllAreaAwardList(Iterable<? extends GuildFortHandler.AreaAward> values) {
                if (this.areaAwardListBuilder_ == null) {
                    ensureAreaAwardListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.areaAwardList_);
                    onChanged();
                } else {
                    this.areaAwardListBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearAreaAwardList() {
                if (this.areaAwardListBuilder_ == null) {
                    this.areaAwardList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    onChanged();
                } else {
                    this.areaAwardListBuilder_.clear();
                }
                return this;
            }

            public Builder removeAreaAwardList(int index) {
                if (this.areaAwardListBuilder_ == null) {
                    ensureAreaAwardListIsMutable();
                    this.areaAwardList_.remove(index);
                    onChanged();
                } else {
                    this.areaAwardListBuilder_.remove(index);
                }
                return this;
            }

            public GuildFortHandler.AreaAward.Builder getAreaAwardListBuilder(int index) {
                return (GuildFortHandler.AreaAward.Builder) getAreaAwardListFieldBuilder().getBuilder(index);
            }

            public GuildFortHandler.AreaAwardOrBuilder getAreaAwardListOrBuilder(int index) {
                if (this.areaAwardListBuilder_ == null) return this.areaAwardList_.get(index);
                return (GuildFortHandler.AreaAwardOrBuilder) this.areaAwardListBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GuildFortHandler.AreaAwardOrBuilder> getAreaAwardListOrBuilderList() {
                if (this.areaAwardListBuilder_ != null) return this.areaAwardListBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.areaAwardList_);
            }

            public GuildFortHandler.AreaAward.Builder addAreaAwardListBuilder() {
                return (GuildFortHandler.AreaAward.Builder) getAreaAwardListFieldBuilder().addBuilder(GuildFortHandler.AreaAward.getDefaultInstance());
            }

            public GuildFortHandler.AreaAward.Builder addAreaAwardListBuilder(int index) {
                return (GuildFortHandler.AreaAward.Builder) getAreaAwardListFieldBuilder().addBuilder(index, GuildFortHandler.AreaAward.getDefaultInstance());
            }

            public List<GuildFortHandler.AreaAward.Builder> getAreaAwardListBuilderList() {
                return getAreaAwardListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GuildFortHandler.AreaAward, GuildFortHandler.AreaAward.Builder, GuildFortHandler.AreaAwardOrBuilder> getAreaAwardListFieldBuilder() {
                if (this.areaAwardListBuilder_ == null) {
                    this.areaAwardListBuilder_ = new RepeatedFieldBuilder(this.areaAwardList_, ((this.bitField0_ & 0x2) == 2), getParentForChildren(), isClean());
                    this.areaAwardList_ = null;
                }
                return this.areaAwardListBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyDailyAwardRequest
            extends GeneratedMessage
            implements ApplyDailyAwardRequestOrBuilder {
        private static final ApplyDailyAwardRequest defaultInstance = new ApplyDailyAwardRequest(true);
        private final UnknownFieldSet unknownFields;

        private ApplyDailyAwardRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyDailyAwardRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyDailyAwardRequest getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyDailyAwardRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyDailyAwardRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.areaId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyDailyAwardRequest.class, Builder.class);
        }

        public static Parser<ApplyDailyAwardRequest> PARSER = (Parser<ApplyDailyAwardRequest>) new AbstractParser<ApplyDailyAwardRequest>() {
            public GuildFortHandler.ApplyDailyAwardRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyDailyAwardRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int AREAID_FIELD_NUMBER = 1;
        private int areaId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyDailyAwardRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        private void initFields() {
            this.areaId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.areaId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.areaId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyDailyAwardRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardRequest) PARSER.parseFrom(data);
        }

        public static ApplyDailyAwardRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyDailyAwardRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardRequest) PARSER.parseFrom(data);
        }

        public static ApplyDailyAwardRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyDailyAwardRequest parseFrom(InputStream input) throws IOException {
            return (ApplyDailyAwardRequest) PARSER.parseFrom(input);
        }

        public static ApplyDailyAwardRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyDailyAwardRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyDailyAwardRequest) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyDailyAwardRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyDailyAwardRequest parseFrom(CodedInputStream input) throws IOException {
            return (ApplyDailyAwardRequest) PARSER.parseFrom(input);
        }

        public static ApplyDailyAwardRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyDailyAwardRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyDailyAwardRequestOrBuilder {
            private int bitField0_;
            private int areaId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyDailyAwardRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyDailyAwardRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardRequest_descriptor;
            }

            public GuildFortHandler.ApplyDailyAwardRequest getDefaultInstanceForType() {
                return GuildFortHandler.ApplyDailyAwardRequest.getDefaultInstance();
            }

            public GuildFortHandler.ApplyDailyAwardRequest build() {
                GuildFortHandler.ApplyDailyAwardRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyDailyAwardRequest buildPartial() {
                GuildFortHandler.ApplyDailyAwardRequest result = new GuildFortHandler.ApplyDailyAwardRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.areaId_ = this.areaId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyDailyAwardRequest)
                    return mergeFrom((GuildFortHandler.ApplyDailyAwardRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyDailyAwardRequest other) {
                if (other == GuildFortHandler.ApplyDailyAwardRequest.getDefaultInstance()) return this;
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAreaId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyDailyAwardRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyDailyAwardRequest) GuildFortHandler.ApplyDailyAwardRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyDailyAwardRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x1;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyDailyAwardResponse
            extends GeneratedMessage
            implements ApplyDailyAwardResponseOrBuilder {
        private static final ApplyDailyAwardResponse defaultInstance = new ApplyDailyAwardResponse(true);
        private final UnknownFieldSet unknownFields;

        private ApplyDailyAwardResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyDailyAwardResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyDailyAwardResponse getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyDailyAwardResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyDailyAwardResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyDailyAwardResponse.class, Builder.class);
        }

        public static Parser<ApplyDailyAwardResponse> PARSER = (Parser<ApplyDailyAwardResponse>) new AbstractParser<ApplyDailyAwardResponse>() {
            public GuildFortHandler.ApplyDailyAwardResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyDailyAwardResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyDailyAwardResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyDailyAwardResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardResponse) PARSER.parseFrom(data);
        }

        public static ApplyDailyAwardResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyDailyAwardResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardResponse) PARSER.parseFrom(data);
        }

        public static ApplyDailyAwardResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyDailyAwardResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyDailyAwardResponse parseFrom(InputStream input) throws IOException {
            return (ApplyDailyAwardResponse) PARSER.parseFrom(input);
        }

        public static ApplyDailyAwardResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyDailyAwardResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyDailyAwardResponse) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyDailyAwardResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyDailyAwardResponse parseFrom(CodedInputStream input) throws IOException {
            return (ApplyDailyAwardResponse) PARSER.parseFrom(input);
        }

        public static ApplyDailyAwardResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyDailyAwardResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyDailyAwardResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyDailyAwardResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyDailyAwardResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyDailyAwardResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyDailyAwardResponse_descriptor;
            }

            public GuildFortHandler.ApplyDailyAwardResponse getDefaultInstanceForType() {
                return GuildFortHandler.ApplyDailyAwardResponse.getDefaultInstance();
            }

            public GuildFortHandler.ApplyDailyAwardResponse build() {
                GuildFortHandler.ApplyDailyAwardResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyDailyAwardResponse buildPartial() {
                GuildFortHandler.ApplyDailyAwardResponse result = new GuildFortHandler.ApplyDailyAwardResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyDailyAwardResponse)
                    return mergeFrom((GuildFortHandler.ApplyDailyAwardResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyDailyAwardResponse other) {
                if (other == GuildFortHandler.ApplyDailyAwardResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyDailyAwardResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyDailyAwardResponse) GuildFortHandler.ApplyDailyAwardResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyDailyAwardResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.ApplyDailyAwardResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyAccessRequest
            extends GeneratedMessage
            implements ApplyAccessRequestOrBuilder {
        private static final ApplyAccessRequest defaultInstance = new ApplyAccessRequest(true);
        private final UnknownFieldSet unknownFields;

        private ApplyAccessRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyAccessRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyAccessRequest getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyAccessRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyAccessRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.areaId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyAccessRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyAccessRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyAccessRequest.class, Builder.class);
        }

        public static Parser<ApplyAccessRequest> PARSER = (Parser<ApplyAccessRequest>) new AbstractParser<ApplyAccessRequest>() {
            public GuildFortHandler.ApplyAccessRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyAccessRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int AREAID_FIELD_NUMBER = 1;
        private int areaId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyAccessRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        private void initFields() {
            this.areaId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.areaId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.areaId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyAccessRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyAccessRequest) PARSER.parseFrom(data);
        }

        public static ApplyAccessRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyAccessRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyAccessRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyAccessRequest) PARSER.parseFrom(data);
        }

        public static ApplyAccessRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyAccessRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyAccessRequest parseFrom(InputStream input) throws IOException {
            return (ApplyAccessRequest) PARSER.parseFrom(input);
        }

        public static ApplyAccessRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAccessRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyAccessRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyAccessRequest) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyAccessRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAccessRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyAccessRequest parseFrom(CodedInputStream input) throws IOException {
            return (ApplyAccessRequest) PARSER.parseFrom(input);
        }

        public static ApplyAccessRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAccessRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyAccessRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyAccessRequestOrBuilder {
            private int bitField0_;
            private int areaId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAccessRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAccessRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyAccessRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyAccessRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAccessRequest_descriptor;
            }

            public GuildFortHandler.ApplyAccessRequest getDefaultInstanceForType() {
                return GuildFortHandler.ApplyAccessRequest.getDefaultInstance();
            }

            public GuildFortHandler.ApplyAccessRequest build() {
                GuildFortHandler.ApplyAccessRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyAccessRequest buildPartial() {
                GuildFortHandler.ApplyAccessRequest result = new GuildFortHandler.ApplyAccessRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.areaId_ = this.areaId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyAccessRequest)
                    return mergeFrom((GuildFortHandler.ApplyAccessRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyAccessRequest other) {
                if (other == GuildFortHandler.ApplyAccessRequest.getDefaultInstance()) return this;
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAreaId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyAccessRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyAccessRequest) GuildFortHandler.ApplyAccessRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyAccessRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x1;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyAccessResponse
            extends GeneratedMessage
            implements ApplyAccessResponseOrBuilder {
        private static final ApplyAccessResponse defaultInstance = new ApplyAccessResponse(true);
        private final UnknownFieldSet unknownFields;

        private ApplyAccessResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyAccessResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyAccessResponse getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyAccessResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyAccessResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyAccessResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyAccessResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyAccessResponse.class, Builder.class);
        }

        public static Parser<ApplyAccessResponse> PARSER = (Parser<ApplyAccessResponse>) new AbstractParser<ApplyAccessResponse>() {
            public GuildFortHandler.ApplyAccessResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyAccessResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyAccessResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyAccessResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyAccessResponse) PARSER.parseFrom(data);
        }

        public static ApplyAccessResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyAccessResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyAccessResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyAccessResponse) PARSER.parseFrom(data);
        }

        public static ApplyAccessResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyAccessResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyAccessResponse parseFrom(InputStream input) throws IOException {
            return (ApplyAccessResponse) PARSER.parseFrom(input);
        }

        public static ApplyAccessResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAccessResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyAccessResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyAccessResponse) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyAccessResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAccessResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyAccessResponse parseFrom(CodedInputStream input) throws IOException {
            return (ApplyAccessResponse) PARSER.parseFrom(input);
        }

        public static ApplyAccessResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAccessResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyAccessResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyAccessResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAccessResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAccessResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyAccessResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyAccessResponse.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAccessResponse_descriptor;
            }

            public GuildFortHandler.ApplyAccessResponse getDefaultInstanceForType() {
                return GuildFortHandler.ApplyAccessResponse.getDefaultInstance();
            }

            public GuildFortHandler.ApplyAccessResponse build() {
                GuildFortHandler.ApplyAccessResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyAccessResponse buildPartial() {
                GuildFortHandler.ApplyAccessResponse result = new GuildFortHandler.ApplyAccessResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyAccessResponse)
                    return mergeFrom((GuildFortHandler.ApplyAccessResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyAccessResponse other) {
                if (other == GuildFortHandler.ApplyAccessResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyAccessResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyAccessResponse) GuildFortHandler.ApplyAccessResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyAccessResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.ApplyAccessResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class FortGuildInfo
            extends GeneratedMessage
            implements FortGuildInfoOrBuilder {
        private static final FortGuildInfo defaultInstance = new FortGuildInfo(true);
        private final UnknownFieldSet unknownFields;

        private FortGuildInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private FortGuildInfo(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static FortGuildInfo getDefaultInstance() {
            return defaultInstance;
        }

        public FortGuildInfo getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FortGuildInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.guildIcon_ = bs;
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.guildId_ = bs;
                            break;
                        case 26:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x4;
                            this.guildName_ = bs;
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.guildLevel_ = input.readInt32();
                            break;
                        case 40:
                            this.bitField0_ |= 0x10;
                            this.armyFlag_ = input.readInt32();
                            break;
                        case 48:
                            this.bitField0_ |= 0x20;
                            this.mumber_ = input.readInt32();
                            break;
                        case 56:
                            this.bitField0_ |= 0x40;
                            this.defenseSoul_ = input.readInt32();
                            break;
                        case 64:
                            this.bitField0_ |= 0x80;
                            this.attackSoul_ = input.readInt32();
                            break;
                        case 72:
                            this.bitField0_ |= 0x100;
                            this.kill_ = input.readInt32();
                            break;
                        case 80:
                            this.bitField0_ |= 0x200;
                            this.defense_ = input.readInt32();
                            break;
                        case 88:
                            this.bitField0_ |= 0x400;
                            this.attack_ = input.readInt32();
                            break;
                        case 96:
                            this.bitField0_ |= 0x800;
                            this.score_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_FortGuildInfo_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_FortGuildInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(FortGuildInfo.class, Builder.class);
        }

        public static Parser<FortGuildInfo> PARSER = (Parser<FortGuildInfo>) new AbstractParser<FortGuildInfo>() {
            public GuildFortHandler.FortGuildInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.FortGuildInfo(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int GUILDICON_FIELD_NUMBER = 1;
        private Object guildIcon_;
        public static final int GUILDID_FIELD_NUMBER = 2;
        private Object guildId_;
        public static final int GUILDNAME_FIELD_NUMBER = 3;
        private Object guildName_;
        public static final int GUILDLEVEL_FIELD_NUMBER = 4;
        private int guildLevel_;
        public static final int ARMYFLAG_FIELD_NUMBER = 5;
        private int armyFlag_;
        public static final int MUMBER_FIELD_NUMBER = 6;
        private int mumber_;
        public static final int DEFENSESOUL_FIELD_NUMBER = 7;
        private int defenseSoul_;
        public static final int ATTACKSOUL_FIELD_NUMBER = 8;
        private int attackSoul_;
        public static final int KILL_FIELD_NUMBER = 9;
        private int kill_;
        public static final int DEFENSE_FIELD_NUMBER = 10;
        private int defense_;
        public static final int ATTACK_FIELD_NUMBER = 11;
        private int attack_;
        public static final int SCORE_FIELD_NUMBER = 12;
        private int score_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<FortGuildInfo> getParserForType() {
            return PARSER;
        }

        public boolean hasGuildIcon() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getGuildIcon() {
            Object ref = this.guildIcon_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildIcon_ = s;
            return s;
        }

        public ByteString getGuildIconBytes() {
            Object ref = this.guildIcon_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildIcon_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        static {
            defaultInstance.initFields();
        }

        public String getGuildId() {
            Object ref = this.guildId_;
            if (ref instanceof String)
                return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8())
                this.guildId_ = s;
            return s;
        }

        public ByteString getGuildIdBytes() {
            Object ref = this.guildId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildName() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public String getGuildName() {
            Object ref = this.guildName_;
            if (ref instanceof String)
                return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8())
                this.guildName_ = s;
            return s;
        }

        public ByteString getGuildNameBytes() {
            Object ref = this.guildName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildLevel() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getGuildLevel() {
            return this.guildLevel_;
        }

        public boolean hasArmyFlag() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public int getArmyFlag() {
            return this.armyFlag_;
        }

        public boolean hasMumber() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public int getMumber() {
            return this.mumber_;
        }

        public boolean hasDefenseSoul() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public int getDefenseSoul() {
            return this.defenseSoul_;
        }

        public boolean hasAttackSoul() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public int getAttackSoul() {
            return this.attackSoul_;
        }

        public boolean hasKill() {
            return ((this.bitField0_ & 0x100) == 256);
        }

        public int getKill() {
            return this.kill_;
        }

        public boolean hasDefense() {
            return ((this.bitField0_ & 0x200) == 512);
        }

        public int getDefense() {
            return this.defense_;
        }

        public boolean hasAttack() {
            return ((this.bitField0_ & 0x400) == 1024);
        }

        public int getAttack() {
            return this.attack_;
        }

        public boolean hasScore() {
            return ((this.bitField0_ & 0x800) == 2048);
        }

        public int getScore() {
            return this.score_;
        }

        private void initFields() {
            this.guildIcon_ = "";
            this.guildId_ = "";
            this.guildName_ = "";
            this.guildLevel_ = 0;
            this.armyFlag_ = 0;
            this.mumber_ = 0;
            this.defenseSoul_ = 0;
            this.attackSoul_ = 0;
            this.kill_ = 0;
            this.defense_ = 0;
            this.attack_ = 0;
            this.score_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;
            if (!hasGuildId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasArmyFlag()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasMumber()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDefenseSoul()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAttackSoul()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasKill()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDefense()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAttack()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasScore()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1)
                output.writeBytes(1, getGuildIconBytes());
            if ((this.bitField0_ & 0x2) == 2)
                output.writeBytes(2, getGuildIdBytes());
            if ((this.bitField0_ & 0x4) == 4)
                output.writeBytes(3, getGuildNameBytes());
            if ((this.bitField0_ & 0x8) == 8)
                output.writeInt32(4, this.guildLevel_);
            if ((this.bitField0_ & 0x10) == 16)
                output.writeInt32(5, this.armyFlag_);
            if ((this.bitField0_ & 0x20) == 32)
                output.writeInt32(6, this.mumber_);
            if ((this.bitField0_ & 0x40) == 64)
                output.writeInt32(7, this.defenseSoul_);
            if ((this.bitField0_ & 0x80) == 128)
                output.writeInt32(8, this.attackSoul_);
            if ((this.bitField0_ & 0x100) == 256)
                output.writeInt32(9, this.kill_);
            if ((this.bitField0_ & 0x200) == 512)
                output.writeInt32(10, this.defense_);
            if ((this.bitField0_ & 0x400) == 1024)
                output.writeInt32(11, this.attack_);
            if ((this.bitField0_ & 0x800) == 2048)
                output.writeInt32(12, this.score_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1)
                return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeBytesSize(1, getGuildIconBytes());
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeBytesSize(2, getGuildIdBytes());
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeBytesSize(3, getGuildNameBytes());
            if ((this.bitField0_ & 0x8) == 8)
                size += CodedOutputStream.computeInt32Size(4, this.guildLevel_);
            if ((this.bitField0_ & 0x10) == 16)
                size += CodedOutputStream.computeInt32Size(5, this.armyFlag_);
            if ((this.bitField0_ & 0x20) == 32)
                size += CodedOutputStream.computeInt32Size(6, this.mumber_);
            if ((this.bitField0_ & 0x40) == 64)
                size += CodedOutputStream.computeInt32Size(7, this.defenseSoul_);
            if ((this.bitField0_ & 0x80) == 128)
                size += CodedOutputStream.computeInt32Size(8, this.attackSoul_);
            if ((this.bitField0_ & 0x100) == 256)
                size += CodedOutputStream.computeInt32Size(9, this.kill_);
            if ((this.bitField0_ & 0x200) == 512)
                size += CodedOutputStream.computeInt32Size(10, this.defense_);
            if ((this.bitField0_ & 0x400) == 1024)
                size += CodedOutputStream.computeInt32Size(11, this.attack_);
            if ((this.bitField0_ & 0x800) == 2048)
                size += CodedOutputStream.computeInt32Size(12, this.score_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static FortGuildInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (FortGuildInfo) PARSER.parseFrom(data);
        }

        public static FortGuildInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FortGuildInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static FortGuildInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (FortGuildInfo) PARSER.parseFrom(data);
        }

        public static FortGuildInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FortGuildInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static FortGuildInfo parseFrom(InputStream input) throws IOException {
            return (FortGuildInfo) PARSER.parseFrom(input);
        }

        public static FortGuildInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FortGuildInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static FortGuildInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (FortGuildInfo) PARSER.parseDelimitedFrom(input);
        }

        public static FortGuildInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FortGuildInfo) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static FortGuildInfo parseFrom(CodedInputStream input) throws IOException {
            return (FortGuildInfo) PARSER.parseFrom(input);
        }

        public static FortGuildInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FortGuildInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(FortGuildInfo prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.FortGuildInfoOrBuilder {
            private int bitField0_;
            private Object guildIcon_;
            private Object guildId_;
            private Object guildName_;
            private int guildLevel_;
            private int armyFlag_;
            private int mumber_;
            private int defenseSoul_;
            private int attackSoul_;
            private int kill_;
            private int defense_;
            private int attack_;
            private int score_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_FortGuildInfo_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_FortGuildInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.FortGuildInfo.class, Builder.class);
            }

            private Builder() {
                this.guildIcon_ = "";
                this.guildId_ = "";
                this.guildName_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.guildIcon_ = "";
                this.guildId_ = "";
                this.guildName_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.FortGuildInfo.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.guildIcon_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.guildId_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildName_ = "";
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildLevel_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.armyFlag_ = 0;
                this.bitField0_ &= 0xFFFFFFEF;
                this.mumber_ = 0;
                this.bitField0_ &= 0xFFFFFFDF;
                this.defenseSoul_ = 0;
                this.bitField0_ &= 0xFFFFFFBF;
                this.attackSoul_ = 0;
                this.bitField0_ &= 0xFFFFFF7F;
                this.kill_ = 0;
                this.bitField0_ &= 0xFFFFFEFF;
                this.defense_ = 0;
                this.bitField0_ &= 0xFFFFFDFF;
                this.attack_ = 0;
                this.bitField0_ &= 0xFFFFFBFF;
                this.score_ = 0;
                this.bitField0_ &= 0xFFFFF7FF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_FortGuildInfo_descriptor;
            }

            public GuildFortHandler.FortGuildInfo getDefaultInstanceForType() {
                return GuildFortHandler.FortGuildInfo.getDefaultInstance();
            }

            public GuildFortHandler.FortGuildInfo build() {
                GuildFortHandler.FortGuildInfo result = buildPartial();
                if (!result.isInitialized())
                    throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.FortGuildInfo buildPartial() {
                GuildFortHandler.FortGuildInfo result = new GuildFortHandler.FortGuildInfo(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1)
                    to_bitField0_ |= 0x1;
                result.guildIcon_ = this.guildIcon_;
                if ((from_bitField0_ & 0x2) == 2)
                    to_bitField0_ |= 0x2;
                result.guildId_ = this.guildId_;
                if ((from_bitField0_ & 0x4) == 4)
                    to_bitField0_ |= 0x4;
                result.guildName_ = this.guildName_;
                if ((from_bitField0_ & 0x8) == 8)
                    to_bitField0_ |= 0x8;
                result.guildLevel_ = this.guildLevel_;
                if ((from_bitField0_ & 0x10) == 16)
                    to_bitField0_ |= 0x10;
                result.armyFlag_ = this.armyFlag_;
                if ((from_bitField0_ & 0x20) == 32)
                    to_bitField0_ |= 0x20;
                result.mumber_ = this.mumber_;
                if ((from_bitField0_ & 0x40) == 64)
                    to_bitField0_ |= 0x40;
                result.defenseSoul_ = this.defenseSoul_;
                if ((from_bitField0_ & 0x80) == 128)
                    to_bitField0_ |= 0x80;
                result.attackSoul_ = this.attackSoul_;
                if ((from_bitField0_ & 0x100) == 256)
                    to_bitField0_ |= 0x100;
                result.kill_ = this.kill_;
                if ((from_bitField0_ & 0x200) == 512)
                    to_bitField0_ |= 0x200;
                result.defense_ = this.defense_;
                if ((from_bitField0_ & 0x400) == 1024)
                    to_bitField0_ |= 0x400;
                result.attack_ = this.attack_;
                if ((from_bitField0_ & 0x800) == 2048)
                    to_bitField0_ |= 0x800;
                result.score_ = this.score_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.FortGuildInfo)
                    return mergeFrom((GuildFortHandler.FortGuildInfo) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.FortGuildInfo other) {
                if (other == GuildFortHandler.FortGuildInfo.getDefaultInstance())
                    return this;
                if (other.hasGuildIcon()) {
                    this.bitField0_ |= 0x1;
                    this.guildIcon_ = other.guildIcon_;
                    onChanged();
                }
                if (other.hasGuildId()) {
                    this.bitField0_ |= 0x2;
                    this.guildId_ = other.guildId_;
                    onChanged();
                }
                if (other.hasGuildName()) {
                    this.bitField0_ |= 0x4;
                    this.guildName_ = other.guildName_;
                    onChanged();
                }
                if (other.hasGuildLevel())
                    setGuildLevel(other.getGuildLevel());
                if (other.hasArmyFlag())
                    setArmyFlag(other.getArmyFlag());
                if (other.hasMumber())
                    setMumber(other.getMumber());
                if (other.hasDefenseSoul())
                    setDefenseSoul(other.getDefenseSoul());
                if (other.hasAttackSoul())
                    setAttackSoul(other.getAttackSoul());
                if (other.hasKill())
                    setKill(other.getKill());
                if (other.hasDefense())
                    setDefense(other.getDefense());
                if (other.hasAttack())
                    setAttack(other.getAttack());
                if (other.hasScore())
                    setScore(other.getScore());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasGuildId())
                    return false;
                if (!hasArmyFlag())
                    return false;
                if (!hasMumber())
                    return false;
                if (!hasDefenseSoul())
                    return false;
                if (!hasAttackSoul())
                    return false;
                if (!hasKill())
                    return false;
                if (!hasDefense())
                    return false;
                if (!hasAttack())
                    return false;
                if (!hasScore())
                    return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.FortGuildInfo parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.FortGuildInfo) GuildFortHandler.FortGuildInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.FortGuildInfo) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null)
                        mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasGuildIcon() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getGuildIcon() {
                Object ref = this.guildIcon_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildIcon_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildIconBytes() {
                Object ref = this.guildIcon_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildIcon_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildIcon(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.guildIcon_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildIcon() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.guildIcon_ = GuildFortHandler.FortGuildInfo.getDefaultInstance().getGuildIcon();
                onChanged();
                return this;
            }

            public Builder setGuildIconBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.guildIcon_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getGuildId() {
                Object ref = this.guildId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildIdBytes() {
                Object ref = this.guildId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildId(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.guildId_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildId_ = GuildFortHandler.FortGuildInfo.getDefaultInstance().getGuildId();
                onChanged();
                return this;
            }

            public Builder setGuildIdBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.guildId_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildName() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public String getGuildName() {
                Object ref = this.guildName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildNameBytes() {
                Object ref = this.guildName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildName(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildName() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildName_ = GuildFortHandler.FortGuildInfo.getDefaultInstance().getGuildName();
                onChanged();
                return this;
            }

            public Builder setGuildNameBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildLevel() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getGuildLevel() {
                return this.guildLevel_;
            }

            public Builder setGuildLevel(int value) {
                this.bitField0_ |= 0x8;
                this.guildLevel_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildLevel() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.guildLevel_ = 0;
                onChanged();
                return this;
            }

            public boolean hasArmyFlag() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public int getArmyFlag() {
                return this.armyFlag_;
            }

            public Builder setArmyFlag(int value) {
                this.bitField0_ |= 0x10;
                this.armyFlag_ = value;
                onChanged();
                return this;
            }

            public Builder clearArmyFlag() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.armyFlag_ = 0;
                onChanged();
                return this;
            }

            public boolean hasMumber() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public int getMumber() {
                return this.mumber_;
            }

            public Builder setMumber(int value) {
                this.bitField0_ |= 0x20;
                this.mumber_ = value;
                onChanged();
                return this;
            }

            public Builder clearMumber() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.mumber_ = 0;
                onChanged();
                return this;
            }

            public boolean hasDefenseSoul() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public int getDefenseSoul() {
                return this.defenseSoul_;
            }

            public Builder setDefenseSoul(int value) {
                this.bitField0_ |= 0x40;
                this.defenseSoul_ = value;
                onChanged();
                return this;
            }

            public Builder clearDefenseSoul() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.defenseSoul_ = 0;
                onChanged();
                return this;
            }

            public boolean hasAttackSoul() {
                return ((this.bitField0_ & 0x80) == 128);
            }

            public int getAttackSoul() {
                return this.attackSoul_;
            }

            public Builder setAttackSoul(int value) {
                this.bitField0_ |= 0x80;
                this.attackSoul_ = value;
                onChanged();
                return this;
            }

            public Builder clearAttackSoul() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.attackSoul_ = 0;
                onChanged();
                return this;
            }

            public boolean hasKill() {
                return ((this.bitField0_ & 0x100) == 256);
            }

            public int getKill() {
                return this.kill_;
            }

            public Builder setKill(int value) {
                this.bitField0_ |= 0x100;
                this.kill_ = value;
                onChanged();
                return this;
            }

            public Builder clearKill() {
                this.bitField0_ &= 0xFFFFFEFF;
                this.kill_ = 0;
                onChanged();
                return this;
            }

            public boolean hasDefense() {
                return ((this.bitField0_ & 0x200) == 512);
            }

            public int getDefense() {
                return this.defense_;
            }

            public Builder setDefense(int value) {
                this.bitField0_ |= 0x200;
                this.defense_ = value;
                onChanged();
                return this;
            }

            public Builder clearDefense() {
                this.bitField0_ &= 0xFFFFFDFF;
                this.defense_ = 0;
                onChanged();
                return this;
            }

            public boolean hasAttack() {
                return ((this.bitField0_ & 0x400) == 1024);
            }

            public int getAttack() {
                return this.attack_;
            }

            public Builder setAttack(int value) {
                this.bitField0_ |= 0x400;
                this.attack_ = value;
                onChanged();
                return this;
            }

            public Builder clearAttack() {
                this.bitField0_ &= 0xFFFFFBFF;
                this.attack_ = 0;
                onChanged();
                return this;
            }

            public boolean hasScore() {
                return ((this.bitField0_ & 0x800) == 2048);
            }

            public int getScore() {
                return this.score_;
            }

            public Builder setScore(int value) {
                this.bitField0_ |= 0x800;
                this.score_ = value;
                onChanged();
                return this;
            }

            public Builder clearScore() {
                this.bitField0_ &= 0xFFFFF7FF;
                this.score_ = 0;
                onChanged();
                return this;
            }
        }
    }

    public static final class ApplyFortGuildInfoRequest extends GeneratedMessage implements ApplyFortGuildInfoRequestOrBuilder {
        private static final ApplyFortGuildInfoRequest defaultInstance = new ApplyFortGuildInfoRequest(true);
        private final UnknownFieldSet unknownFields;

        private ApplyFortGuildInfoRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyFortGuildInfoRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyFortGuildInfoRequest getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyFortGuildInfoRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyFortGuildInfoRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            continue;
                    }
                    if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) done = true;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyFortGuildInfoRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyFortGuildInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyFortGuildInfoRequest.class, Builder.class);
        }

        public static Parser<ApplyFortGuildInfoRequest> PARSER = (Parser<ApplyFortGuildInfoRequest>) new AbstractParser<ApplyFortGuildInfoRequest>() {
            public GuildFortHandler.ApplyFortGuildInfoRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyFortGuildInfoRequest(input, extensionRegistry);
            }
        };
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyFortGuildInfoRequest> getParserForType() {
            return PARSER;
        }

        private void initFields() {
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyFortGuildInfoRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyFortGuildInfoRequest) PARSER.parseFrom(data);
        }

        public static ApplyFortGuildInfoRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyFortGuildInfoRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyFortGuildInfoRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyFortGuildInfoRequest) PARSER.parseFrom(data);
        }

        public static ApplyFortGuildInfoRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyFortGuildInfoRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyFortGuildInfoRequest parseFrom(InputStream input) throws IOException {
            return (ApplyFortGuildInfoRequest) PARSER.parseFrom(input);
        }

        public static ApplyFortGuildInfoRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFortGuildInfoRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyFortGuildInfoRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyFortGuildInfoRequest) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyFortGuildInfoRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFortGuildInfoRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyFortGuildInfoRequest parseFrom(CodedInputStream input) throws IOException {
            return (ApplyFortGuildInfoRequest) PARSER.parseFrom(input);
        }

        public static ApplyFortGuildInfoRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFortGuildInfoRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyFortGuildInfoRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyFortGuildInfoRequestOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFortGuildInfoRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFortGuildInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyFortGuildInfoRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyFortGuildInfoRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFortGuildInfoRequest_descriptor;
            }

            public GuildFortHandler.ApplyFortGuildInfoRequest getDefaultInstanceForType() {
                return GuildFortHandler.ApplyFortGuildInfoRequest.getDefaultInstance();
            }

            public GuildFortHandler.ApplyFortGuildInfoRequest build() {
                GuildFortHandler.ApplyFortGuildInfoRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyFortGuildInfoRequest buildPartial() {
                GuildFortHandler.ApplyFortGuildInfoRequest result = new GuildFortHandler.ApplyFortGuildInfoRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyFortGuildInfoRequest)
                    return mergeFrom((GuildFortHandler.ApplyFortGuildInfoRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyFortGuildInfoRequest other) {
                if (other == GuildFortHandler.ApplyFortGuildInfoRequest.getDefaultInstance()) return this;
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyFortGuildInfoRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyFortGuildInfoRequest) GuildFortHandler.ApplyFortGuildInfoRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyFortGuildInfoRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }
    }


    public static final class ApplyFortGuildInfoResponse
            extends GeneratedMessage
            implements ApplyFortGuildInfoResponseOrBuilder {
        private static final ApplyFortGuildInfoResponse defaultInstance = new ApplyFortGuildInfoResponse(true);
        private final UnknownFieldSet unknownFields;

        private ApplyFortGuildInfoResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyFortGuildInfoResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyFortGuildInfoResponse getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyFortGuildInfoResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyFortGuildInfoResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    GuildFortHandler.FortGuildInfo.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 26:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x4) == 4) subBuilder = this.ownGuild_.toBuilder();
                            this.ownGuild_ = (GuildFortHandler.FortGuildInfo) input.readMessage(GuildFortHandler.FortGuildInfo.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.ownGuild_);
                                this.ownGuild_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x4;
                            break;
                        case 34:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x8) == 8) subBuilder = this.enemyGuild_.toBuilder();
                            this.enemyGuild_ = (GuildFortHandler.FortGuildInfo) input.readMessage(GuildFortHandler.FortGuildInfo.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.enemyGuild_);
                                this.enemyGuild_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x8;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyFortGuildInfoResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyFortGuildInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyFortGuildInfoResponse.class, Builder.class);
        }

        public static Parser<ApplyFortGuildInfoResponse> PARSER = (Parser<ApplyFortGuildInfoResponse>) new AbstractParser<ApplyFortGuildInfoResponse>() {
            public GuildFortHandler.ApplyFortGuildInfoResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyFortGuildInfoResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int OWNGUILD_FIELD_NUMBER = 3;
        private GuildFortHandler.FortGuildInfo ownGuild_;
        public static final int ENEMYGUILD_FIELD_NUMBER = 4;
        private GuildFortHandler.FortGuildInfo enemyGuild_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyFortGuildInfoResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasOwnGuild() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public GuildFortHandler.FortGuildInfo getOwnGuild() {
            return this.ownGuild_;
        }

        public GuildFortHandler.FortGuildInfoOrBuilder getOwnGuildOrBuilder() {
            return this.ownGuild_;
        }

        public boolean hasEnemyGuild() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public GuildFortHandler.FortGuildInfo getEnemyGuild() {
            return this.enemyGuild_;
        }

        public GuildFortHandler.FortGuildInfoOrBuilder getEnemyGuildOrBuilder() {
            return this.enemyGuild_;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.ownGuild_ = GuildFortHandler.FortGuildInfo.getDefaultInstance();
            this.enemyGuild_ = GuildFortHandler.FortGuildInfo.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasOwnGuild() && !getOwnGuild().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasEnemyGuild() && !getEnemyGuild().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeMessage(3, (MessageLite) this.ownGuild_);
            if ((this.bitField0_ & 0x8) == 8) output.writeMessage(4, (MessageLite) this.enemyGuild_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.ownGuild_);
            if ((this.bitField0_ & 0x8) == 8)
                size += CodedOutputStream.computeMessageSize(4, (MessageLite) this.enemyGuild_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyFortGuildInfoResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyFortGuildInfoResponse) PARSER.parseFrom(data);
        }

        public static ApplyFortGuildInfoResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyFortGuildInfoResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyFortGuildInfoResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyFortGuildInfoResponse) PARSER.parseFrom(data);
        }

        public static ApplyFortGuildInfoResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyFortGuildInfoResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyFortGuildInfoResponse parseFrom(InputStream input) throws IOException {
            return (ApplyFortGuildInfoResponse) PARSER.parseFrom(input);
        }

        public static ApplyFortGuildInfoResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFortGuildInfoResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyFortGuildInfoResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyFortGuildInfoResponse) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyFortGuildInfoResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFortGuildInfoResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyFortGuildInfoResponse parseFrom(CodedInputStream input) throws IOException {
            return (ApplyFortGuildInfoResponse) PARSER.parseFrom(input);
        }

        public static ApplyFortGuildInfoResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyFortGuildInfoResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyFortGuildInfoResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyFortGuildInfoResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private GuildFortHandler.FortGuildInfo ownGuild_;
            private SingleFieldBuilder<GuildFortHandler.FortGuildInfo, GuildFortHandler.FortGuildInfo.Builder, GuildFortHandler.FortGuildInfoOrBuilder> ownGuildBuilder_;
            private GuildFortHandler.FortGuildInfo enemyGuild_;
            private SingleFieldBuilder<GuildFortHandler.FortGuildInfo, GuildFortHandler.FortGuildInfo.Builder, GuildFortHandler.FortGuildInfoOrBuilder> enemyGuildBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFortGuildInfoResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFortGuildInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyFortGuildInfoResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.ownGuild_ = GuildFortHandler.FortGuildInfo.getDefaultInstance();
                this.enemyGuild_ = GuildFortHandler.FortGuildInfo.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.ownGuild_ = GuildFortHandler.FortGuildInfo.getDefaultInstance();
                this.enemyGuild_ = GuildFortHandler.FortGuildInfo.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyFortGuildInfoResponse.alwaysUseFieldBuilders) {
                    getOwnGuildFieldBuilder();
                    getEnemyGuildFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.ownGuildBuilder_ == null) {
                    this.ownGuild_ = GuildFortHandler.FortGuildInfo.getDefaultInstance();
                } else {
                    this.ownGuildBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                if (this.enemyGuildBuilder_ == null) {
                    this.enemyGuild_ = GuildFortHandler.FortGuildInfo.getDefaultInstance();
                } else {
                    this.enemyGuildBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyFortGuildInfoResponse_descriptor;
            }

            public GuildFortHandler.ApplyFortGuildInfoResponse getDefaultInstanceForType() {
                return GuildFortHandler.ApplyFortGuildInfoResponse.getDefaultInstance();
            }

            public GuildFortHandler.ApplyFortGuildInfoResponse build() {
                GuildFortHandler.ApplyFortGuildInfoResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyFortGuildInfoResponse buildPartial() {
                GuildFortHandler.ApplyFortGuildInfoResponse result = new GuildFortHandler.ApplyFortGuildInfoResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                if (this.ownGuildBuilder_ == null) {
                    result.ownGuild_ = this.ownGuild_;
                } else {
                    result.ownGuild_ = (GuildFortHandler.FortGuildInfo) this.ownGuildBuilder_.build();
                }
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                if (this.enemyGuildBuilder_ == null) {
                    result.enemyGuild_ = this.enemyGuild_;
                } else {
                    result.enemyGuild_ = (GuildFortHandler.FortGuildInfo) this.enemyGuildBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyFortGuildInfoResponse)
                    return mergeFrom((GuildFortHandler.ApplyFortGuildInfoResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyFortGuildInfoResponse other) {
                if (other == GuildFortHandler.ApplyFortGuildInfoResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasOwnGuild()) mergeOwnGuild(other.getOwnGuild());
                if (other.hasEnemyGuild()) mergeEnemyGuild(other.getEnemyGuild());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                if (hasOwnGuild() && !getOwnGuild().isInitialized()) return false;
                if (hasEnemyGuild() && !getEnemyGuild().isInitialized()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyFortGuildInfoResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyFortGuildInfoResponse) GuildFortHandler.ApplyFortGuildInfoResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyFortGuildInfoResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.ApplyFortGuildInfoResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public boolean hasOwnGuild() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public GuildFortHandler.FortGuildInfo getOwnGuild() {
                if (this.ownGuildBuilder_ == null) return this.ownGuild_;
                return (GuildFortHandler.FortGuildInfo) this.ownGuildBuilder_.getMessage();
            }

            public Builder setOwnGuild(GuildFortHandler.FortGuildInfo value) {
                if (this.ownGuildBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.ownGuild_ = value;
                    onChanged();
                } else {
                    this.ownGuildBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder setOwnGuild(GuildFortHandler.FortGuildInfo.Builder builderForValue) {
                if (this.ownGuildBuilder_ == null) {
                    this.ownGuild_ = builderForValue.build();
                    onChanged();
                } else {
                    this.ownGuildBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder mergeOwnGuild(GuildFortHandler.FortGuildInfo value) {
                if (this.ownGuildBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4 && this.ownGuild_ != GuildFortHandler.FortGuildInfo.getDefaultInstance()) {
                        this.ownGuild_ = GuildFortHandler.FortGuildInfo.newBuilder(this.ownGuild_).mergeFrom(value).buildPartial();
                    } else {
                        this.ownGuild_ = value;
                    }
                    onChanged();
                } else {
                    this.ownGuildBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder clearOwnGuild() {
                if (this.ownGuildBuilder_ == null) {
                    this.ownGuild_ = GuildFortHandler.FortGuildInfo.getDefaultInstance();
                    onChanged();
                } else {
                    this.ownGuildBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public GuildFortHandler.FortGuildInfo.Builder getOwnGuildBuilder() {
                this.bitField0_ |= 0x4;
                onChanged();
                return (GuildFortHandler.FortGuildInfo.Builder) getOwnGuildFieldBuilder().getBuilder();
            }

            public GuildFortHandler.FortGuildInfoOrBuilder getOwnGuildOrBuilder() {
                if (this.ownGuildBuilder_ != null)
                    return (GuildFortHandler.FortGuildInfoOrBuilder) this.ownGuildBuilder_.getMessageOrBuilder();
                return this.ownGuild_;
            }

            private SingleFieldBuilder<GuildFortHandler.FortGuildInfo, GuildFortHandler.FortGuildInfo.Builder, GuildFortHandler.FortGuildInfoOrBuilder> getOwnGuildFieldBuilder() {
                if (this.ownGuildBuilder_ == null) {
                    this.ownGuildBuilder_ = new SingleFieldBuilder(getOwnGuild(), getParentForChildren(), isClean());
                    this.ownGuild_ = null;
                }
                return this.ownGuildBuilder_;
            }

            public boolean hasEnemyGuild() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public GuildFortHandler.FortGuildInfo getEnemyGuild() {
                if (this.enemyGuildBuilder_ == null) return this.enemyGuild_;
                return (GuildFortHandler.FortGuildInfo) this.enemyGuildBuilder_.getMessage();
            }

            public Builder setEnemyGuild(GuildFortHandler.FortGuildInfo value) {
                if (this.enemyGuildBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.enemyGuild_ = value;
                    onChanged();
                } else {
                    this.enemyGuildBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x8;
                return this;
            }

            public Builder setEnemyGuild(GuildFortHandler.FortGuildInfo.Builder builderForValue) {
                if (this.enemyGuildBuilder_ == null) {
                    this.enemyGuild_ = builderForValue.build();
                    onChanged();
                } else {
                    this.enemyGuildBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x8;
                return this;
            }

            public Builder mergeEnemyGuild(GuildFortHandler.FortGuildInfo value) {
                if (this.enemyGuildBuilder_ == null) {
                    if ((this.bitField0_ & 0x8) == 8 && this.enemyGuild_ != GuildFortHandler.FortGuildInfo.getDefaultInstance()) {
                        this.enemyGuild_ = GuildFortHandler.FortGuildInfo.newBuilder(this.enemyGuild_).mergeFrom(value).buildPartial();
                    } else {
                        this.enemyGuild_ = value;
                    }
                    onChanged();
                } else {
                    this.enemyGuildBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x8;
                return this;
            }

            public Builder clearEnemyGuild() {
                if (this.enemyGuildBuilder_ == null) {
                    this.enemyGuild_ = GuildFortHandler.FortGuildInfo.getDefaultInstance();
                    onChanged();
                } else {
                    this.enemyGuildBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFF7;
                return this;
            }

            public GuildFortHandler.FortGuildInfo.Builder getEnemyGuildBuilder() {
                this.bitField0_ |= 0x8;
                onChanged();
                return (GuildFortHandler.FortGuildInfo.Builder) getEnemyGuildFieldBuilder().getBuilder();
            }

            public GuildFortHandler.FortGuildInfoOrBuilder getEnemyGuildOrBuilder() {
                if (this.enemyGuildBuilder_ != null)
                    return (GuildFortHandler.FortGuildInfoOrBuilder) this.enemyGuildBuilder_.getMessageOrBuilder();
                return this.enemyGuild_;
            }

            private SingleFieldBuilder<GuildFortHandler.FortGuildInfo, GuildFortHandler.FortGuildInfo.Builder, GuildFortHandler.FortGuildInfoOrBuilder> getEnemyGuildFieldBuilder() {
                if (this.enemyGuildBuilder_ == null) {
                    this.enemyGuildBuilder_ = new SingleFieldBuilder(getEnemyGuild(), getParentForChildren(), isClean());
                    this.enemyGuild_ = null;
                }
                return this.enemyGuildBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ReportListInfo
            extends GeneratedMessage
            implements ReportListInfoOrBuilder {
        private static final ReportListInfo defaultInstance = new ReportListInfo(true);
        private final UnknownFieldSet unknownFields;

        private ReportListInfo(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ReportListInfo(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ReportListInfo getDefaultInstance() {
            return defaultInstance;
        }

        public ReportListInfo getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ReportListInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.areaId_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.defenseGuildName_ = bs;
                            break;
                        case 26:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x4;
                            this.defenseGuildIcon_ = bs;
                            break;
                        case 34:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x8;
                            this.attackGuildName_ = bs;
                            break;
                        case 42:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x10;
                            this.attackGuildIcon_ = bs;
                            break;
                        case 48:
                            this.bitField0_ |= 0x20;
                            this.result_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ReportListInfo_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ReportListInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(ReportListInfo.class, Builder.class);
        }

        public static Parser<ReportListInfo> PARSER = (Parser<ReportListInfo>) new AbstractParser<ReportListInfo>() {
            public GuildFortHandler.ReportListInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ReportListInfo(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int AREAID_FIELD_NUMBER = 1;
        private int areaId_;
        public static final int DEFENSEGUILDNAME_FIELD_NUMBER = 2;
        private Object defenseGuildName_;
        public static final int DEFENSEGUILDICON_FIELD_NUMBER = 3;
        private Object defenseGuildIcon_;
        public static final int ATTACKGUILDNAME_FIELD_NUMBER = 4;
        private Object attackGuildName_;
        public static final int ATTACKGUILDICON_FIELD_NUMBER = 5;
        private Object attackGuildIcon_;
        public static final int RESULT_FIELD_NUMBER = 6;
        private int result_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ReportListInfo> getParserForType() {
            return PARSER;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        public boolean hasDefenseGuildName() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getDefenseGuildName() {
            Object ref = this.defenseGuildName_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.defenseGuildName_ = s;
            return s;
        }

        public ByteString getDefenseGuildNameBytes() {
            Object ref = this.defenseGuildName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.defenseGuildName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasDefenseGuildIcon() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public String getDefenseGuildIcon() {
            Object ref = this.defenseGuildIcon_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.defenseGuildIcon_ = s;
            return s;
        }

        public ByteString getDefenseGuildIconBytes() {
            Object ref = this.defenseGuildIcon_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.defenseGuildIcon_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasAttackGuildName() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public String getAttackGuildName() {
            Object ref = this.attackGuildName_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.attackGuildName_ = s;
            return s;
        }

        public ByteString getAttackGuildNameBytes() {
            Object ref = this.attackGuildName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.attackGuildName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasAttackGuildIcon() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public String getAttackGuildIcon() {
            Object ref = this.attackGuildIcon_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.attackGuildIcon_ = s;
            return s;
        }

        public ByteString getAttackGuildIconBytes() {
            Object ref = this.attackGuildIcon_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.attackGuildIcon_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasResult() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public int getResult() {
            return this.result_;
        }

        private void initFields() {
            this.areaId_ = 0;
            this.defenseGuildName_ = "";
            this.defenseGuildIcon_ = "";
            this.attackGuildName_ = "";
            this.attackGuildIcon_ = "";
            this.result_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasResult()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.areaId_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getDefenseGuildNameBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeBytes(3, getDefenseGuildIconBytes());
            if ((this.bitField0_ & 0x8) == 8) output.writeBytes(4, getAttackGuildNameBytes());
            if ((this.bitField0_ & 0x10) == 16) output.writeBytes(5, getAttackGuildIconBytes());
            if ((this.bitField0_ & 0x20) == 32) output.writeInt32(6, this.result_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.areaId_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getDefenseGuildNameBytes());
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeBytesSize(3, getDefenseGuildIconBytes());
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeBytesSize(4, getAttackGuildNameBytes());
            if ((this.bitField0_ & 0x10) == 16)
                size += CodedOutputStream.computeBytesSize(5, getAttackGuildIconBytes());
            if ((this.bitField0_ & 0x20) == 32) size += CodedOutputStream.computeInt32Size(6, this.result_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ReportListInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ReportListInfo) PARSER.parseFrom(data);
        }

        public static ReportListInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ReportListInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ReportListInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ReportListInfo) PARSER.parseFrom(data);
        }

        public static ReportListInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ReportListInfo) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ReportListInfo parseFrom(InputStream input) throws IOException {
            return (ReportListInfo) PARSER.parseFrom(input);
        }

        public static ReportListInfo parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportListInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ReportListInfo parseDelimitedFrom(InputStream input) throws IOException {
            return (ReportListInfo) PARSER.parseDelimitedFrom(input);
        }

        public static ReportListInfo parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportListInfo) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ReportListInfo parseFrom(CodedInputStream input) throws IOException {
            return (ReportListInfo) PARSER.parseFrom(input);
        }

        public static ReportListInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportListInfo) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ReportListInfo prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ReportListInfoOrBuilder {
            private int bitField0_;
            private int areaId_;
            private Object defenseGuildName_;
            private Object defenseGuildIcon_;
            private Object attackGuildName_;
            private Object attackGuildIcon_;
            private int result_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ReportListInfo_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ReportListInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ReportListInfo.class, Builder.class);
            }

            private Builder() {
                this.defenseGuildName_ = "";
                this.defenseGuildIcon_ = "";
                this.attackGuildName_ = "";
                this.attackGuildIcon_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.defenseGuildName_ = "";
                this.defenseGuildIcon_ = "";
                this.attackGuildName_ = "";
                this.attackGuildIcon_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ReportListInfo.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.defenseGuildName_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.defenseGuildIcon_ = "";
                this.bitField0_ &= 0xFFFFFFFB;
                this.attackGuildName_ = "";
                this.bitField0_ &= 0xFFFFFFF7;
                this.attackGuildIcon_ = "";
                this.bitField0_ &= 0xFFFFFFEF;
                this.result_ = 0;
                this.bitField0_ &= 0xFFFFFFDF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ReportListInfo_descriptor;
            }

            public GuildFortHandler.ReportListInfo getDefaultInstanceForType() {
                return GuildFortHandler.ReportListInfo.getDefaultInstance();
            }

            public GuildFortHandler.ReportListInfo build() {
                GuildFortHandler.ReportListInfo result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ReportListInfo buildPartial() {
                GuildFortHandler.ReportListInfo result = new GuildFortHandler.ReportListInfo(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.areaId_ = this.areaId_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.defenseGuildName_ = this.defenseGuildName_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.defenseGuildIcon_ = this.defenseGuildIcon_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.attackGuildName_ = this.attackGuildName_;
                if ((from_bitField0_ & 0x10) == 16) to_bitField0_ |= 0x10;
                result.attackGuildIcon_ = this.attackGuildIcon_;
                if ((from_bitField0_ & 0x20) == 32) to_bitField0_ |= 0x20;
                result.result_ = this.result_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ReportListInfo)
                    return mergeFrom((GuildFortHandler.ReportListInfo) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ReportListInfo other) {
                if (other == GuildFortHandler.ReportListInfo.getDefaultInstance()) return this;
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                if (other.hasDefenseGuildName()) {
                    this.bitField0_ |= 0x2;
                    this.defenseGuildName_ = other.defenseGuildName_;
                    onChanged();
                }
                if (other.hasDefenseGuildIcon()) {
                    this.bitField0_ |= 0x4;
                    this.defenseGuildIcon_ = other.defenseGuildIcon_;
                    onChanged();
                }
                if (other.hasAttackGuildName()) {
                    this.bitField0_ |= 0x8;
                    this.attackGuildName_ = other.attackGuildName_;
                    onChanged();
                }
                if (other.hasAttackGuildIcon()) {
                    this.bitField0_ |= 0x10;
                    this.attackGuildIcon_ = other.attackGuildIcon_;
                    onChanged();
                }
                if (other.hasResult()) setResult(other.getResult());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAreaId()) return false;
                if (!hasResult()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ReportListInfo parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ReportListInfo) GuildFortHandler.ReportListInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ReportListInfo) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x1;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasDefenseGuildName() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getDefenseGuildName() {
                Object ref = this.defenseGuildName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.defenseGuildName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getDefenseGuildNameBytes() {
                Object ref = this.defenseGuildName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.defenseGuildName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setDefenseGuildName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.defenseGuildName_ = value;
                onChanged();
                return this;
            }

            public Builder clearDefenseGuildName() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.defenseGuildName_ = GuildFortHandler.ReportListInfo.getDefaultInstance().getDefenseGuildName();
                onChanged();
                return this;
            }

            public Builder setDefenseGuildNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.defenseGuildName_ = value;
                onChanged();
                return this;
            }

            public boolean hasDefenseGuildIcon() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public String getDefenseGuildIcon() {
                Object ref = this.defenseGuildIcon_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.defenseGuildIcon_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getDefenseGuildIconBytes() {
                Object ref = this.defenseGuildIcon_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.defenseGuildIcon_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setDefenseGuildIcon(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.defenseGuildIcon_ = value;
                onChanged();
                return this;
            }

            public Builder clearDefenseGuildIcon() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.defenseGuildIcon_ = GuildFortHandler.ReportListInfo.getDefaultInstance().getDefenseGuildIcon();
                onChanged();
                return this;
            }

            public Builder setDefenseGuildIconBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.defenseGuildIcon_ = value;
                onChanged();
                return this;
            }

            public boolean hasAttackGuildName() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public String getAttackGuildName() {
                Object ref = this.attackGuildName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.attackGuildName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getAttackGuildNameBytes() {
                Object ref = this.attackGuildName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.attackGuildName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setAttackGuildName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x8;
                this.attackGuildName_ = value;
                onChanged();
                return this;
            }

            public Builder clearAttackGuildName() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.attackGuildName_ = GuildFortHandler.ReportListInfo.getDefaultInstance().getAttackGuildName();
                onChanged();
                return this;
            }

            public Builder setAttackGuildNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x8;
                this.attackGuildName_ = value;
                onChanged();
                return this;
            }

            public boolean hasAttackGuildIcon() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public String getAttackGuildIcon() {
                Object ref = this.attackGuildIcon_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.attackGuildIcon_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getAttackGuildIconBytes() {
                Object ref = this.attackGuildIcon_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.attackGuildIcon_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setAttackGuildIcon(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.attackGuildIcon_ = value;
                onChanged();
                return this;
            }

            public Builder clearAttackGuildIcon() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.attackGuildIcon_ = GuildFortHandler.ReportListInfo.getDefaultInstance().getAttackGuildIcon();
                onChanged();
                return this;
            }

            public Builder setAttackGuildIconBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x10;
                this.attackGuildIcon_ = value;
                onChanged();
                return this;
            }

            public boolean hasResult() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public int getResult() {
                return this.result_;
            }

            public Builder setResult(int value) {
                this.bitField0_ |= 0x20;
                this.result_ = value;
                onChanged();
                return this;
            }

            public Builder clearResult() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.result_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ReportList
            extends GeneratedMessage
            implements ReportListOrBuilder {
        private static final ReportList defaultInstance = new ReportList(true);
        private final UnknownFieldSet unknownFields;

        private ReportList(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ReportList(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ReportList getDefaultInstance() {
            return defaultInstance;
        }

        public ReportList getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ReportList(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.date_ = bs;
                            break;
                        case 18:
                            if ((mutable_bitField0_ & 0x2) != 2) {
                                this.reportListInfo_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.reportListInfo_.add(input.readMessage(GuildFortHandler.ReportListInfo.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x2) == 2)
                    this.reportListInfo_ = Collections.unmodifiableList(this.reportListInfo_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ReportList_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ReportList_fieldAccessorTable.ensureFieldAccessorsInitialized(ReportList.class, Builder.class);
        }

        public static Parser<ReportList> PARSER = (Parser<ReportList>) new AbstractParser<ReportList>() {
            public GuildFortHandler.ReportList parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ReportList(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int DATE_FIELD_NUMBER = 1;
        private Object date_;
        public static final int REPORTLISTINFO_FIELD_NUMBER = 2;
        private List<GuildFortHandler.ReportListInfo> reportListInfo_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ReportList> getParserForType() {
            return PARSER;
        }

        public boolean hasDate() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getDate() {
            Object ref = this.date_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.date_ = s;
            return s;
        }

        public ByteString getDateBytes() {
            Object ref = this.date_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.date_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public List<GuildFortHandler.ReportListInfo> getReportListInfoList() {
            return this.reportListInfo_;
        }

        public List<? extends GuildFortHandler.ReportListInfoOrBuilder> getReportListInfoOrBuilderList() {
            return (List) this.reportListInfo_;
        }

        public int getReportListInfoCount() {
            return this.reportListInfo_.size();
        }

        public GuildFortHandler.ReportListInfo getReportListInfo(int index) {
            return this.reportListInfo_.get(index);
        }

        public GuildFortHandler.ReportListInfoOrBuilder getReportListInfoOrBuilder(int index) {
            return this.reportListInfo_.get(index);
        }

        private void initFields() {
            this.date_ = "";
            this.reportListInfo_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasDate()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getReportListInfoCount(); i++) {
                if (!getReportListInfo(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getDateBytes());
            for (int i = 0; i < this.reportListInfo_.size(); i++)
                output.writeMessage(2, (MessageLite) this.reportListInfo_.get(i));
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getDateBytes());
            for (int i = 0; i < this.reportListInfo_.size(); i++)
                size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.reportListInfo_.get(i));
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ReportList parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ReportList) PARSER.parseFrom(data);
        }

        public static ReportList parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ReportList) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ReportList parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ReportList) PARSER.parseFrom(data);
        }

        public static ReportList parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ReportList) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ReportList parseFrom(InputStream input) throws IOException {
            return (ReportList) PARSER.parseFrom(input);
        }

        public static ReportList parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportList) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ReportList parseDelimitedFrom(InputStream input) throws IOException {
            return (ReportList) PARSER.parseDelimitedFrom(input);
        }

        public static ReportList parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportList) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ReportList parseFrom(CodedInputStream input) throws IOException {
            return (ReportList) PARSER.parseFrom(input);
        }

        public static ReportList parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportList) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ReportList prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ReportListOrBuilder {
            private int bitField0_;
            private Object date_;
            private List<GuildFortHandler.ReportListInfo> reportListInfo_;
            private RepeatedFieldBuilder<GuildFortHandler.ReportListInfo, GuildFortHandler.ReportListInfo.Builder, GuildFortHandler.ReportListInfoOrBuilder> reportListInfoBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ReportList_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ReportList_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ReportList.class, Builder.class);
            }

            private Builder() {
                this.date_ = "";
                this.reportListInfo_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.date_ = "";
                this.reportListInfo_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ReportList.alwaysUseFieldBuilders) getReportListInfoFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.date_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.reportListInfoBuilder_ == null) {
                    this.reportListInfo_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                } else {
                    this.reportListInfoBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ReportList_descriptor;
            }

            public GuildFortHandler.ReportList getDefaultInstanceForType() {
                return GuildFortHandler.ReportList.getDefaultInstance();
            }

            public GuildFortHandler.ReportList build() {
                GuildFortHandler.ReportList result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ReportList buildPartial() {
                GuildFortHandler.ReportList result = new GuildFortHandler.ReportList(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.date_ = this.date_;
                if (this.reportListInfoBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) == 2) {
                        this.reportListInfo_ = Collections.unmodifiableList(this.reportListInfo_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.reportListInfo_ = this.reportListInfo_;
                } else {
                    result.reportListInfo_ = this.reportListInfoBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ReportList) return mergeFrom((GuildFortHandler.ReportList) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ReportList other) {
                if (other == GuildFortHandler.ReportList.getDefaultInstance()) return this;
                if (other.hasDate()) {
                    this.bitField0_ |= 0x1;
                    this.date_ = other.date_;
                    onChanged();
                }
                if (this.reportListInfoBuilder_ == null) {
                    if (!other.reportListInfo_.isEmpty()) {
                        if (this.reportListInfo_.isEmpty()) {
                            this.reportListInfo_ = other.reportListInfo_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        } else {
                            ensureReportListInfoIsMutable();
                            this.reportListInfo_.addAll(other.reportListInfo_);
                        }
                        onChanged();
                    }
                } else if (!other.reportListInfo_.isEmpty()) {
                    if (this.reportListInfoBuilder_.isEmpty()) {
                        this.reportListInfoBuilder_.dispose();
                        this.reportListInfoBuilder_ = null;
                        this.reportListInfo_ = other.reportListInfo_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.reportListInfoBuilder_ = GuildFortHandler.ReportList.alwaysUseFieldBuilders ? getReportListInfoFieldBuilder() : null;
                    } else {
                        this.reportListInfoBuilder_.addAllMessages(other.reportListInfo_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasDate()) return false;
                for (int i = 0; i < getReportListInfoCount(); i++) {
                    if (!getReportListInfo(i).isInitialized()) return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ReportList parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ReportList) GuildFortHandler.ReportList.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ReportList) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasDate() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getDate() {
                Object ref = this.date_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.date_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getDateBytes() {
                Object ref = this.date_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.date_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setDate(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.date_ = value;
                onChanged();
                return this;
            }

            public Builder clearDate() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.date_ = GuildFortHandler.ReportList.getDefaultInstance().getDate();
                onChanged();
                return this;
            }

            public Builder setDateBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.date_ = value;
                onChanged();
                return this;
            }

            private void ensureReportListInfoIsMutable() {
                if ((this.bitField0_ & 0x2) != 2) {
                    this.reportListInfo_ = new ArrayList<>(this.reportListInfo_);
                    this.bitField0_ |= 0x2;
                }
            }

            public List<GuildFortHandler.ReportListInfo> getReportListInfoList() {
                if (this.reportListInfoBuilder_ == null) return Collections.unmodifiableList(this.reportListInfo_);
                return this.reportListInfoBuilder_.getMessageList();
            }

            public int getReportListInfoCount() {
                if (this.reportListInfoBuilder_ == null) return this.reportListInfo_.size();
                return this.reportListInfoBuilder_.getCount();
            }

            public GuildFortHandler.ReportListInfo getReportListInfo(int index) {
                if (this.reportListInfoBuilder_ == null) return this.reportListInfo_.get(index);
                return (GuildFortHandler.ReportListInfo) this.reportListInfoBuilder_.getMessage(index);
            }

            public Builder setReportListInfo(int index, GuildFortHandler.ReportListInfo value) {
                if (this.reportListInfoBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureReportListInfoIsMutable();
                    this.reportListInfo_.set(index, value);
                    onChanged();
                } else {
                    this.reportListInfoBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setReportListInfo(int index, GuildFortHandler.ReportListInfo.Builder builderForValue) {
                if (this.reportListInfoBuilder_ == null) {
                    ensureReportListInfoIsMutable();
                    this.reportListInfo_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.reportListInfoBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addReportListInfo(GuildFortHandler.ReportListInfo value) {
                if (this.reportListInfoBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureReportListInfoIsMutable();
                    this.reportListInfo_.add(value);
                    onChanged();
                } else {
                    this.reportListInfoBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addReportListInfo(int index, GuildFortHandler.ReportListInfo value) {
                if (this.reportListInfoBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureReportListInfoIsMutable();
                    this.reportListInfo_.add(index, value);
                    onChanged();
                } else {
                    this.reportListInfoBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addReportListInfo(GuildFortHandler.ReportListInfo.Builder builderForValue) {
                if (this.reportListInfoBuilder_ == null) {
                    ensureReportListInfoIsMutable();
                    this.reportListInfo_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.reportListInfoBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addReportListInfo(int index, GuildFortHandler.ReportListInfo.Builder builderForValue) {
                if (this.reportListInfoBuilder_ == null) {
                    ensureReportListInfoIsMutable();
                    this.reportListInfo_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.reportListInfoBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllReportListInfo(Iterable<? extends GuildFortHandler.ReportListInfo> values) {
                if (this.reportListInfoBuilder_ == null) {
                    ensureReportListInfoIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.reportListInfo_);
                    onChanged();
                } else {
                    this.reportListInfoBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearReportListInfo() {
                if (this.reportListInfoBuilder_ == null) {
                    this.reportListInfo_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    onChanged();
                } else {
                    this.reportListInfoBuilder_.clear();
                }
                return this;
            }

            public Builder removeReportListInfo(int index) {
                if (this.reportListInfoBuilder_ == null) {
                    ensureReportListInfoIsMutable();
                    this.reportListInfo_.remove(index);
                    onChanged();
                } else {
                    this.reportListInfoBuilder_.remove(index);
                }
                return this;
            }

            public GuildFortHandler.ReportListInfo.Builder getReportListInfoBuilder(int index) {
                return (GuildFortHandler.ReportListInfo.Builder) getReportListInfoFieldBuilder().getBuilder(index);
            }

            public GuildFortHandler.ReportListInfoOrBuilder getReportListInfoOrBuilder(int index) {
                if (this.reportListInfoBuilder_ == null) return this.reportListInfo_.get(index);
                return (GuildFortHandler.ReportListInfoOrBuilder) this.reportListInfoBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GuildFortHandler.ReportListInfoOrBuilder> getReportListInfoOrBuilderList() {
                if (this.reportListInfoBuilder_ != null) return this.reportListInfoBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.reportListInfo_);
            }

            public GuildFortHandler.ReportListInfo.Builder addReportListInfoBuilder() {
                return (GuildFortHandler.ReportListInfo.Builder) getReportListInfoFieldBuilder().addBuilder(GuildFortHandler.ReportListInfo.getDefaultInstance());
            }

            public GuildFortHandler.ReportListInfo.Builder addReportListInfoBuilder(int index) {
                return (GuildFortHandler.ReportListInfo.Builder) getReportListInfoFieldBuilder().addBuilder(index, GuildFortHandler.ReportListInfo.getDefaultInstance());
            }

            public List<GuildFortHandler.ReportListInfo.Builder> getReportListInfoBuilderList() {
                return getReportListInfoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GuildFortHandler.ReportListInfo, GuildFortHandler.ReportListInfo.Builder, GuildFortHandler.ReportListInfoOrBuilder> getReportListInfoFieldBuilder() {
                if (this.reportListInfoBuilder_ == null) {
                    this.reportListInfoBuilder_ = new RepeatedFieldBuilder(this.reportListInfo_, ((this.bitField0_ & 0x2) == 2), getParentForChildren(), isClean());
                    this.reportListInfo_ = null;
                }
                return this.reportListInfoBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyAllReportListRequest
            extends GeneratedMessage
            implements ApplyAllReportListRequestOrBuilder {
        private static final ApplyAllReportListRequest defaultInstance = new ApplyAllReportListRequest(true);
        private final UnknownFieldSet unknownFields;

        private ApplyAllReportListRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyAllReportListRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyAllReportListRequest getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyAllReportListRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyAllReportListRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            continue;
                    }
                    if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) done = true;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyAllReportListRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyAllReportListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyAllReportListRequest.class, Builder.class);
        }

        public static Parser<ApplyAllReportListRequest> PARSER = (Parser<ApplyAllReportListRequest>) new AbstractParser<ApplyAllReportListRequest>() {
            public GuildFortHandler.ApplyAllReportListRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyAllReportListRequest(input, extensionRegistry);
            }
        };
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyAllReportListRequest> getParserForType() {
            return PARSER;
        }

        private void initFields() {
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyAllReportListRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyAllReportListRequest) PARSER.parseFrom(data);
        }

        public static ApplyAllReportListRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyAllReportListRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyAllReportListRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyAllReportListRequest) PARSER.parseFrom(data);
        }

        public static ApplyAllReportListRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyAllReportListRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyAllReportListRequest parseFrom(InputStream input) throws IOException {
            return (ApplyAllReportListRequest) PARSER.parseFrom(input);
        }

        public static ApplyAllReportListRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAllReportListRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyAllReportListRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyAllReportListRequest) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyAllReportListRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAllReportListRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyAllReportListRequest parseFrom(CodedInputStream input) throws IOException {
            return (ApplyAllReportListRequest) PARSER.parseFrom(input);
        }

        public static ApplyAllReportListRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAllReportListRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyAllReportListRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyAllReportListRequestOrBuilder {
            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAllReportListRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAllReportListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyAllReportListRequest.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyAllReportListRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAllReportListRequest_descriptor;
            }

            public GuildFortHandler.ApplyAllReportListRequest getDefaultInstanceForType() {
                return GuildFortHandler.ApplyAllReportListRequest.getDefaultInstance();
            }

            public GuildFortHandler.ApplyAllReportListRequest build() {
                GuildFortHandler.ApplyAllReportListRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyAllReportListRequest buildPartial() {
                GuildFortHandler.ApplyAllReportListRequest result = new GuildFortHandler.ApplyAllReportListRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyAllReportListRequest)
                    return mergeFrom((GuildFortHandler.ApplyAllReportListRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyAllReportListRequest other) {
                if (other == GuildFortHandler.ApplyAllReportListRequest.getDefaultInstance()) return this;
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyAllReportListRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyAllReportListRequest) GuildFortHandler.ApplyAllReportListRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyAllReportListRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyAllReportListResponse
            extends GeneratedMessage
            implements ApplyAllReportListResponseOrBuilder {
        private static final ApplyAllReportListResponse defaultInstance = new ApplyAllReportListResponse(true);
        private final UnknownFieldSet unknownFields;

        private ApplyAllReportListResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyAllReportListResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyAllReportListResponse getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyAllReportListResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyAllReportListResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 26:
                            if ((mutable_bitField0_ & 0x4) != 4) {
                                this.reportList_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.reportList_.add(input.readMessage(GuildFortHandler.ReportList.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x4) == 4) this.reportList_ = Collections.unmodifiableList(this.reportList_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyAllReportListResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyAllReportListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyAllReportListResponse.class, Builder.class);
        }

        public static Parser<ApplyAllReportListResponse> PARSER = (Parser<ApplyAllReportListResponse>) new AbstractParser<ApplyAllReportListResponse>() {
            public GuildFortHandler.ApplyAllReportListResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyAllReportListResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int REPORTLIST_FIELD_NUMBER = 3;
        private List<GuildFortHandler.ReportList> reportList_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyAllReportListResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public List<GuildFortHandler.ReportList> getReportListList() {
            return this.reportList_;
        }

        public List<? extends GuildFortHandler.ReportListOrBuilder> getReportListOrBuilderList() {
            return (List) this.reportList_;
        }

        public int getReportListCount() {
            return this.reportList_.size();
        }

        public GuildFortHandler.ReportList getReportList(int index) {
            return this.reportList_.get(index);
        }

        public GuildFortHandler.ReportListOrBuilder getReportListOrBuilder(int index) {
            return this.reportList_.get(index);
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.reportList_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getReportListCount(); i++) {
                if (!getReportList(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            for (int i = 0; i < this.reportList_.size(); i++)
                output.writeMessage(3, (MessageLite) this.reportList_.get(i));
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            for (int i = 0; i < this.reportList_.size(); i++)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.reportList_.get(i));
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyAllReportListResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyAllReportListResponse) PARSER.parseFrom(data);
        }

        public static ApplyAllReportListResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyAllReportListResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyAllReportListResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyAllReportListResponse) PARSER.parseFrom(data);
        }

        public static ApplyAllReportListResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyAllReportListResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyAllReportListResponse parseFrom(InputStream input) throws IOException {
            return (ApplyAllReportListResponse) PARSER.parseFrom(input);
        }

        public static ApplyAllReportListResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAllReportListResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyAllReportListResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyAllReportListResponse) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyAllReportListResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAllReportListResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyAllReportListResponse parseFrom(CodedInputStream input) throws IOException {
            return (ApplyAllReportListResponse) PARSER.parseFrom(input);
        }

        public static ApplyAllReportListResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyAllReportListResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyAllReportListResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyAllReportListResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private List<GuildFortHandler.ReportList> reportList_;
            private RepeatedFieldBuilder<GuildFortHandler.ReportList, GuildFortHandler.ReportList.Builder, GuildFortHandler.ReportListOrBuilder> reportListBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAllReportListResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAllReportListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyAllReportListResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.reportList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.reportList_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyAllReportListResponse.alwaysUseFieldBuilders) getReportListFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.reportListBuilder_ == null) {
                    this.reportList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                } else {
                    this.reportListBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyAllReportListResponse_descriptor;
            }

            public GuildFortHandler.ApplyAllReportListResponse getDefaultInstanceForType() {
                return GuildFortHandler.ApplyAllReportListResponse.getDefaultInstance();
            }

            public GuildFortHandler.ApplyAllReportListResponse build() {
                GuildFortHandler.ApplyAllReportListResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyAllReportListResponse buildPartial() {
                GuildFortHandler.ApplyAllReportListResponse result = new GuildFortHandler.ApplyAllReportListResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if (this.reportListBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4) {
                        this.reportList_ = Collections.unmodifiableList(this.reportList_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.reportList_ = this.reportList_;
                } else {
                    result.reportList_ = this.reportListBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyAllReportListResponse)
                    return mergeFrom((GuildFortHandler.ApplyAllReportListResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyAllReportListResponse other) {
                if (other == GuildFortHandler.ApplyAllReportListResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (this.reportListBuilder_ == null) {
                    if (!other.reportList_.isEmpty()) {
                        if (this.reportList_.isEmpty()) {
                            this.reportList_ = other.reportList_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        } else {
                            ensureReportListIsMutable();
                            this.reportList_.addAll(other.reportList_);
                        }
                        onChanged();
                    }
                } else if (!other.reportList_.isEmpty()) {
                    if (this.reportListBuilder_.isEmpty()) {
                        this.reportListBuilder_.dispose();
                        this.reportListBuilder_ = null;
                        this.reportList_ = other.reportList_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.reportListBuilder_ = GuildFortHandler.ApplyAllReportListResponse.alwaysUseFieldBuilders ? getReportListFieldBuilder() : null;
                    } else {
                        this.reportListBuilder_.addAllMessages(other.reportList_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                for (int i = 0; i < getReportListCount(); i++) {
                    if (!getReportList(i).isInitialized()) return false;
                }
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyAllReportListResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyAllReportListResponse) GuildFortHandler.ApplyAllReportListResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyAllReportListResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.ApplyAllReportListResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            private void ensureReportListIsMutable() {
                if ((this.bitField0_ & 0x4) != 4) {
                    this.reportList_ = new ArrayList<>(this.reportList_);
                    this.bitField0_ |= 0x4;
                }
            }

            public List<GuildFortHandler.ReportList> getReportListList() {
                if (this.reportListBuilder_ == null) return Collections.unmodifiableList(this.reportList_);
                return this.reportListBuilder_.getMessageList();
            }

            public int getReportListCount() {
                if (this.reportListBuilder_ == null) return this.reportList_.size();
                return this.reportListBuilder_.getCount();
            }

            public GuildFortHandler.ReportList getReportList(int index) {
                if (this.reportListBuilder_ == null) return this.reportList_.get(index);
                return (GuildFortHandler.ReportList) this.reportListBuilder_.getMessage(index);
            }

            public Builder setReportList(int index, GuildFortHandler.ReportList value) {
                if (this.reportListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureReportListIsMutable();
                    this.reportList_.set(index, value);
                    onChanged();
                } else {
                    this.reportListBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setReportList(int index, GuildFortHandler.ReportList.Builder builderForValue) {
                if (this.reportListBuilder_ == null) {
                    ensureReportListIsMutable();
                    this.reportList_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.reportListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addReportList(GuildFortHandler.ReportList value) {
                if (this.reportListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureReportListIsMutable();
                    this.reportList_.add(value);
                    onChanged();
                } else {
                    this.reportListBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addReportList(int index, GuildFortHandler.ReportList value) {
                if (this.reportListBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureReportListIsMutable();
                    this.reportList_.add(index, value);
                    onChanged();
                } else {
                    this.reportListBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addReportList(GuildFortHandler.ReportList.Builder builderForValue) {
                if (this.reportListBuilder_ == null) {
                    ensureReportListIsMutable();
                    this.reportList_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.reportListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addReportList(int index, GuildFortHandler.ReportList.Builder builderForValue) {
                if (this.reportListBuilder_ == null) {
                    ensureReportListIsMutable();
                    this.reportList_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.reportListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllReportList(Iterable<? extends GuildFortHandler.ReportList> values) {
                if (this.reportListBuilder_ == null) {
                    ensureReportListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.reportList_);
                    onChanged();
                } else {
                    this.reportListBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearReportList() {
                if (this.reportListBuilder_ == null) {
                    this.reportList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    onChanged();
                } else {
                    this.reportListBuilder_.clear();
                }
                return this;
            }

            public Builder removeReportList(int index) {
                if (this.reportListBuilder_ == null) {
                    ensureReportListIsMutable();
                    this.reportList_.remove(index);
                    onChanged();
                } else {
                    this.reportListBuilder_.remove(index);
                }
                return this;
            }

            public GuildFortHandler.ReportList.Builder getReportListBuilder(int index) {
                return (GuildFortHandler.ReportList.Builder) getReportListFieldBuilder().getBuilder(index);
            }

            public GuildFortHandler.ReportListOrBuilder getReportListOrBuilder(int index) {
                if (this.reportListBuilder_ == null) return this.reportList_.get(index);
                return (GuildFortHandler.ReportListOrBuilder) this.reportListBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GuildFortHandler.ReportListOrBuilder> getReportListOrBuilderList() {
                if (this.reportListBuilder_ != null) return this.reportListBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.reportList_);
            }

            public GuildFortHandler.ReportList.Builder addReportListBuilder() {
                return (GuildFortHandler.ReportList.Builder) getReportListFieldBuilder().addBuilder(GuildFortHandler.ReportList.getDefaultInstance());
            }

            public GuildFortHandler.ReportList.Builder addReportListBuilder(int index) {
                return (GuildFortHandler.ReportList.Builder) getReportListFieldBuilder().addBuilder(index, GuildFortHandler.ReportList.getDefaultInstance());
            }

            public List<GuildFortHandler.ReportList.Builder> getReportListBuilderList() {
                return getReportListFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GuildFortHandler.ReportList, GuildFortHandler.ReportList.Builder, GuildFortHandler.ReportListOrBuilder> getReportListFieldBuilder() {
                if (this.reportListBuilder_ == null) {
                    this.reportListBuilder_ = new RepeatedFieldBuilder(this.reportList_, ((this.bitField0_ & 0x4) == 4), getParentForChildren(), isClean());
                    this.reportList_ = null;
                }
                return this.reportListBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ReportGuildDetail
            extends GeneratedMessage
            implements ReportGuildDetailOrBuilder {
        private static final ReportGuildDetail defaultInstance = new ReportGuildDetail(true);
        private final UnknownFieldSet unknownFields;

        private ReportGuildDetail(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ReportGuildDetail(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ReportGuildDetail getDefaultInstance() {
            return defaultInstance;
        }

        public ReportGuildDetail getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ReportGuildDetail(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.guildIcon_ = bs;
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.guildId_ = bs;
                            break;
                        case 26:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x4;
                            this.guildName_ = bs;
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.guildLevel_ = input.readInt32();
                            break;
                        case 40:
                            this.bitField0_ |= 0x10;
                            this.isWinner_ = input.readInt32();
                            break;
                        case 48:
                            this.bitField0_ |= 0x20;
                            this.collect_ = input.readInt32();
                            break;
                        case 56:
                            this.bitField0_ |= 0x40;
                            this.defense_ = input.readInt32();
                            break;
                        case 64:
                            this.bitField0_ |= 0x80;
                            this.soul_ = input.readInt32();
                            break;
                        case 72:
                            this.bitField0_ |= 0x100;
                            this.attack_ = input.readInt32();
                            break;
                        case 80:
                            this.bitField0_ |= 0x200;
                            this.kill_ = input.readInt32();
                            break;
                        case 88:
                            this.bitField0_ |= 0x400;
                            this.killScore_ = input.readInt32();
                            break;
                        case 96:
                            this.bitField0_ |= 0x800;
                            this.destroyFlag_ = input.readInt32();
                            break;
                        case 104:
                            this.bitField0_ |= 0x1000;
                            this.destroyFlagScore_ = input.readInt32();
                            break;
                        case 112:
                            this.bitField0_ |= 0x2000;
                            this.totalScore_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ReportGuildDetail_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ReportGuildDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(ReportGuildDetail.class, Builder.class);
        }

        public static Parser<ReportGuildDetail> PARSER = (Parser<ReportGuildDetail>) new AbstractParser<ReportGuildDetail>() {
            public GuildFortHandler.ReportGuildDetail parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ReportGuildDetail(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int GUILDICON_FIELD_NUMBER = 1;
        private Object guildIcon_;
        public static final int GUILDID_FIELD_NUMBER = 2;
        private Object guildId_;
        public static final int GUILDNAME_FIELD_NUMBER = 3;
        private Object guildName_;
        public static final int GUILDLEVEL_FIELD_NUMBER = 4;
        private int guildLevel_;
        public static final int ISWINNER_FIELD_NUMBER = 5;
        private int isWinner_;
        public static final int COLLECT_FIELD_NUMBER = 6;
        private int collect_;
        public static final int DEFENSE_FIELD_NUMBER = 7;
        private int defense_;
        public static final int SOUL_FIELD_NUMBER = 8;
        private int soul_;
        public static final int ATTACK_FIELD_NUMBER = 9;
        private int attack_;
        public static final int KILL_FIELD_NUMBER = 10;
        private int kill_;
        public static final int KILLSCORE_FIELD_NUMBER = 11;
        private int killScore_;
        public static final int DESTROYFLAG_FIELD_NUMBER = 12;
        private int destroyFlag_;
        public static final int DESTROYFLAGSCORE_FIELD_NUMBER = 13;
        private int destroyFlagScore_;
        public static final int TOTALSCORE_FIELD_NUMBER = 14;
        private int totalScore_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ReportGuildDetail> getParserForType() {
            return PARSER;
        }

        public boolean hasGuildIcon() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getGuildIcon() {
            Object ref = this.guildIcon_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildIcon_ = s;
            return s;
        }

        public ByteString getGuildIconBytes() {
            Object ref = this.guildIcon_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildIcon_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        static {
            defaultInstance.initFields();
        }

        public String getGuildId() {
            Object ref = this.guildId_;
            if (ref instanceof String)
                return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8())
                this.guildId_ = s;
            return s;
        }

        public ByteString getGuildIdBytes() {
            Object ref = this.guildId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildName() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public String getGuildName() {
            Object ref = this.guildName_;
            if (ref instanceof String)
                return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8())
                this.guildName_ = s;
            return s;
        }

        public ByteString getGuildNameBytes() {
            Object ref = this.guildName_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildName_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasGuildLevel() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getGuildLevel() {
            return this.guildLevel_;
        }

        public boolean hasIsWinner() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public int getIsWinner() {
            return this.isWinner_;
        }

        public boolean hasCollect() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public int getCollect() {
            return this.collect_;
        }

        public boolean hasDefense() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public int getDefense() {
            return this.defense_;
        }

        public boolean hasSoul() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public int getSoul() {
            return this.soul_;
        }

        public boolean hasAttack() {
            return ((this.bitField0_ & 0x100) == 256);
        }

        public int getAttack() {
            return this.attack_;
        }

        public boolean hasKill() {
            return ((this.bitField0_ & 0x200) == 512);
        }

        public int getKill() {
            return this.kill_;
        }

        public boolean hasKillScore() {
            return ((this.bitField0_ & 0x400) == 1024);
        }

        public int getKillScore() {
            return this.killScore_;
        }

        public boolean hasDestroyFlag() {
            return ((this.bitField0_ & 0x800) == 2048);
        }

        public int getDestroyFlag() {
            return this.destroyFlag_;
        }

        public boolean hasDestroyFlagScore() {
            return ((this.bitField0_ & 0x1000) == 4096);
        }

        public int getDestroyFlagScore() {
            return this.destroyFlagScore_;
        }

        public boolean hasTotalScore() {
            return ((this.bitField0_ & 0x2000) == 8192);
        }

        public int getTotalScore() {
            return this.totalScore_;
        }

        private void initFields() {
            this.guildIcon_ = "";
            this.guildId_ = "";
            this.guildName_ = "";
            this.guildLevel_ = 0;
            this.isWinner_ = 0;
            this.collect_ = 0;
            this.defense_ = 0;
            this.soul_ = 0;
            this.attack_ = 0;
            this.kill_ = 0;
            this.killScore_ = 0;
            this.destroyFlag_ = 0;
            this.destroyFlagScore_ = 0;
            this.totalScore_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1)
                return true;
            if (isInitialized == 0)
                return false;
            if (!hasGuildId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1)
                output.writeBytes(1, getGuildIconBytes());
            if ((this.bitField0_ & 0x2) == 2)
                output.writeBytes(2, getGuildIdBytes());
            if ((this.bitField0_ & 0x4) == 4)
                output.writeBytes(3, getGuildNameBytes());
            if ((this.bitField0_ & 0x8) == 8)
                output.writeInt32(4, this.guildLevel_);
            if ((this.bitField0_ & 0x10) == 16)
                output.writeInt32(5, this.isWinner_);
            if ((this.bitField0_ & 0x20) == 32)
                output.writeInt32(6, this.collect_);
            if ((this.bitField0_ & 0x40) == 64)
                output.writeInt32(7, this.defense_);
            if ((this.bitField0_ & 0x80) == 128)
                output.writeInt32(8, this.soul_);
            if ((this.bitField0_ & 0x100) == 256)
                output.writeInt32(9, this.attack_);
            if ((this.bitField0_ & 0x200) == 512)
                output.writeInt32(10, this.kill_);
            if ((this.bitField0_ & 0x400) == 1024)
                output.writeInt32(11, this.killScore_);
            if ((this.bitField0_ & 0x800) == 2048)
                output.writeInt32(12, this.destroyFlag_);
            if ((this.bitField0_ & 0x1000) == 4096)
                output.writeInt32(13, this.destroyFlagScore_);
            if ((this.bitField0_ & 0x2000) == 8192)
                output.writeInt32(14, this.totalScore_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1)
                return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1)
                size += CodedOutputStream.computeBytesSize(1, getGuildIconBytes());
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeBytesSize(2, getGuildIdBytes());
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeBytesSize(3, getGuildNameBytes());
            if ((this.bitField0_ & 0x8) == 8)
                size += CodedOutputStream.computeInt32Size(4, this.guildLevel_);
            if ((this.bitField0_ & 0x10) == 16)
                size += CodedOutputStream.computeInt32Size(5, this.isWinner_);
            if ((this.bitField0_ & 0x20) == 32)
                size += CodedOutputStream.computeInt32Size(6, this.collect_);
            if ((this.bitField0_ & 0x40) == 64)
                size += CodedOutputStream.computeInt32Size(7, this.defense_);
            if ((this.bitField0_ & 0x80) == 128)
                size += CodedOutputStream.computeInt32Size(8, this.soul_);
            if ((this.bitField0_ & 0x100) == 256)
                size += CodedOutputStream.computeInt32Size(9, this.attack_);
            if ((this.bitField0_ & 0x200) == 512)
                size += CodedOutputStream.computeInt32Size(10, this.kill_);
            if ((this.bitField0_ & 0x400) == 1024)
                size += CodedOutputStream.computeInt32Size(11, this.killScore_);
            if ((this.bitField0_ & 0x800) == 2048)
                size += CodedOutputStream.computeInt32Size(12, this.destroyFlag_);
            if ((this.bitField0_ & 0x1000) == 4096)
                size += CodedOutputStream.computeInt32Size(13, this.destroyFlagScore_);
            if ((this.bitField0_ & 0x2000) == 8192)
                size += CodedOutputStream.computeInt32Size(14, this.totalScore_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ReportGuildDetail parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ReportGuildDetail) PARSER.parseFrom(data);
        }

        public static ReportGuildDetail parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ReportGuildDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ReportGuildDetail parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ReportGuildDetail) PARSER.parseFrom(data);
        }

        public static ReportGuildDetail parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ReportGuildDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ReportGuildDetail parseFrom(InputStream input) throws IOException {
            return (ReportGuildDetail) PARSER.parseFrom(input);
        }

        public static ReportGuildDetail parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportGuildDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ReportGuildDetail parseDelimitedFrom(InputStream input) throws IOException {
            return (ReportGuildDetail) PARSER.parseDelimitedFrom(input);
        }

        public static ReportGuildDetail parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportGuildDetail) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ReportGuildDetail parseFrom(CodedInputStream input) throws IOException {
            return (ReportGuildDetail) PARSER.parseFrom(input);
        }

        public static ReportGuildDetail parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportGuildDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ReportGuildDetail prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ReportGuildDetailOrBuilder {
            private int bitField0_;
            private Object guildIcon_;
            private Object guildId_;
            private Object guildName_;
            private int guildLevel_;
            private int isWinner_;
            private int collect_;
            private int defense_;
            private int soul_;
            private int attack_;
            private int kill_;
            private int killScore_;
            private int destroyFlag_;
            private int destroyFlagScore_;
            private int totalScore_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ReportGuildDetail_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ReportGuildDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ReportGuildDetail.class, Builder.class);
            }

            private Builder() {
                this.guildIcon_ = "";
                this.guildId_ = "";
                this.guildName_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.guildIcon_ = "";
                this.guildId_ = "";
                this.guildName_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ReportGuildDetail.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.guildIcon_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.guildId_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildName_ = "";
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildLevel_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.isWinner_ = 0;
                this.bitField0_ &= 0xFFFFFFEF;
                this.collect_ = 0;
                this.bitField0_ &= 0xFFFFFFDF;
                this.defense_ = 0;
                this.bitField0_ &= 0xFFFFFFBF;
                this.soul_ = 0;
                this.bitField0_ &= 0xFFFFFF7F;
                this.attack_ = 0;
                this.bitField0_ &= 0xFFFFFEFF;
                this.kill_ = 0;
                this.bitField0_ &= 0xFFFFFDFF;
                this.killScore_ = 0;
                this.bitField0_ &= 0xFFFFFBFF;
                this.destroyFlag_ = 0;
                this.bitField0_ &= 0xFFFFF7FF;
                this.destroyFlagScore_ = 0;
                this.bitField0_ &= 0xFFFFEFFF;
                this.totalScore_ = 0;
                this.bitField0_ &= 0xFFFFDFFF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ReportGuildDetail_descriptor;
            }

            public GuildFortHandler.ReportGuildDetail getDefaultInstanceForType() {
                return GuildFortHandler.ReportGuildDetail.getDefaultInstance();
            }

            public GuildFortHandler.ReportGuildDetail build() {
                GuildFortHandler.ReportGuildDetail result = buildPartial();
                if (!result.isInitialized())
                    throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ReportGuildDetail buildPartial() {
                GuildFortHandler.ReportGuildDetail result = new GuildFortHandler.ReportGuildDetail(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1)
                    to_bitField0_ |= 0x1;
                result.guildIcon_ = this.guildIcon_;
                if ((from_bitField0_ & 0x2) == 2)
                    to_bitField0_ |= 0x2;
                result.guildId_ = this.guildId_;
                if ((from_bitField0_ & 0x4) == 4)
                    to_bitField0_ |= 0x4;
                result.guildName_ = this.guildName_;
                if ((from_bitField0_ & 0x8) == 8)
                    to_bitField0_ |= 0x8;
                result.guildLevel_ = this.guildLevel_;
                if ((from_bitField0_ & 0x10) == 16)
                    to_bitField0_ |= 0x10;
                result.isWinner_ = this.isWinner_;
                if ((from_bitField0_ & 0x20) == 32)
                    to_bitField0_ |= 0x20;
                result.collect_ = this.collect_;
                if ((from_bitField0_ & 0x40) == 64)
                    to_bitField0_ |= 0x40;
                result.defense_ = this.defense_;
                if ((from_bitField0_ & 0x80) == 128)
                    to_bitField0_ |= 0x80;
                result.soul_ = this.soul_;
                if ((from_bitField0_ & 0x100) == 256)
                    to_bitField0_ |= 0x100;
                result.attack_ = this.attack_;
                if ((from_bitField0_ & 0x200) == 512)
                    to_bitField0_ |= 0x200;
                result.kill_ = this.kill_;
                if ((from_bitField0_ & 0x400) == 1024)
                    to_bitField0_ |= 0x400;
                result.killScore_ = this.killScore_;
                if ((from_bitField0_ & 0x800) == 2048)
                    to_bitField0_ |= 0x800;
                result.destroyFlag_ = this.destroyFlag_;
                if ((from_bitField0_ & 0x1000) == 4096)
                    to_bitField0_ |= 0x1000;
                result.destroyFlagScore_ = this.destroyFlagScore_;
                if ((from_bitField0_ & 0x2000) == 8192)
                    to_bitField0_ |= 0x2000;
                result.totalScore_ = this.totalScore_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ReportGuildDetail)
                    return mergeFrom((GuildFortHandler.ReportGuildDetail) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ReportGuildDetail other) {
                if (other == GuildFortHandler.ReportGuildDetail.getDefaultInstance())
                    return this;
                if (other.hasGuildIcon()) {
                    this.bitField0_ |= 0x1;
                    this.guildIcon_ = other.guildIcon_;
                    onChanged();
                }
                if (other.hasGuildId()) {
                    this.bitField0_ |= 0x2;
                    this.guildId_ = other.guildId_;
                    onChanged();
                }
                if (other.hasGuildName()) {
                    this.bitField0_ |= 0x4;
                    this.guildName_ = other.guildName_;
                    onChanged();
                }
                if (other.hasGuildLevel())
                    setGuildLevel(other.getGuildLevel());
                if (other.hasIsWinner())
                    setIsWinner(other.getIsWinner());
                if (other.hasCollect())
                    setCollect(other.getCollect());
                if (other.hasDefense())
                    setDefense(other.getDefense());
                if (other.hasSoul())
                    setSoul(other.getSoul());
                if (other.hasAttack())
                    setAttack(other.getAttack());
                if (other.hasKill())
                    setKill(other.getKill());
                if (other.hasKillScore())
                    setKillScore(other.getKillScore());
                if (other.hasDestroyFlag())
                    setDestroyFlag(other.getDestroyFlag());
                if (other.hasDestroyFlagScore())
                    setDestroyFlagScore(other.getDestroyFlagScore());
                if (other.hasTotalScore())
                    setTotalScore(other.getTotalScore());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasGuildId())
                    return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ReportGuildDetail parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ReportGuildDetail) GuildFortHandler.ReportGuildDetail.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ReportGuildDetail) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null)
                        mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasGuildIcon() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getGuildIcon() {
                Object ref = this.guildIcon_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildIcon_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildIconBytes() {
                Object ref = this.guildIcon_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildIcon_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildIcon(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.guildIcon_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildIcon() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.guildIcon_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance().getGuildIcon();
                onChanged();
                return this;
            }

            public Builder setGuildIconBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.guildIcon_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getGuildId() {
                Object ref = this.guildId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildIdBytes() {
                Object ref = this.guildId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildId(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.guildId_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildId_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance().getGuildId();
                onChanged();
                return this;
            }

            public Builder setGuildIdBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.guildId_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildName() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public String getGuildName() {
                Object ref = this.guildName_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8())
                        this.guildName_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildNameBytes() {
                Object ref = this.guildName_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildName_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildName(String value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildName() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildName_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance().getGuildName();
                onChanged();
                return this;
            }

            public Builder setGuildNameBytes(ByteString value) {
                if (value == null)
                    throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.guildName_ = value;
                onChanged();
                return this;
            }

            public boolean hasGuildLevel() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getGuildLevel() {
                return this.guildLevel_;
            }

            public Builder setGuildLevel(int value) {
                this.bitField0_ |= 0x8;
                this.guildLevel_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildLevel() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.guildLevel_ = 0;
                onChanged();
                return this;
            }

            public boolean hasIsWinner() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public int getIsWinner() {
                return this.isWinner_;
            }

            public Builder setIsWinner(int value) {
                this.bitField0_ |= 0x10;
                this.isWinner_ = value;
                onChanged();
                return this;
            }

            public Builder clearIsWinner() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.isWinner_ = 0;
                onChanged();
                return this;
            }

            public boolean hasCollect() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public int getCollect() {
                return this.collect_;
            }

            public Builder setCollect(int value) {
                this.bitField0_ |= 0x20;
                this.collect_ = value;
                onChanged();
                return this;
            }

            public Builder clearCollect() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.collect_ = 0;
                onChanged();
                return this;
            }

            public boolean hasDefense() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public int getDefense() {
                return this.defense_;
            }

            public Builder setDefense(int value) {
                this.bitField0_ |= 0x40;
                this.defense_ = value;
                onChanged();
                return this;
            }

            public Builder clearDefense() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.defense_ = 0;
                onChanged();
                return this;
            }

            public boolean hasSoul() {
                return ((this.bitField0_ & 0x80) == 128);
            }

            public int getSoul() {
                return this.soul_;
            }

            public Builder setSoul(int value) {
                this.bitField0_ |= 0x80;
                this.soul_ = value;
                onChanged();
                return this;
            }

            public Builder clearSoul() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.soul_ = 0;
                onChanged();
                return this;
            }

            public boolean hasAttack() {
                return ((this.bitField0_ & 0x100) == 256);
            }

            public int getAttack() {
                return this.attack_;
            }

            public Builder setAttack(int value) {
                this.bitField0_ |= 0x100;
                this.attack_ = value;
                onChanged();
                return this;
            }

            public Builder clearAttack() {
                this.bitField0_ &= 0xFFFFFEFF;
                this.attack_ = 0;
                onChanged();
                return this;
            }

            public boolean hasKill() {
                return ((this.bitField0_ & 0x200) == 512);
            }

            public int getKill() {
                return this.kill_;
            }

            public Builder setKill(int value) {
                this.bitField0_ |= 0x200;
                this.kill_ = value;
                onChanged();
                return this;
            }

            public Builder clearKill() {
                this.bitField0_ &= 0xFFFFFDFF;
                this.kill_ = 0;
                onChanged();
                return this;
            }

            public boolean hasKillScore() {
                return ((this.bitField0_ & 0x400) == 1024);
            }

            public int getKillScore() {
                return this.killScore_;
            }

            public Builder setKillScore(int value) {
                this.bitField0_ |= 0x400;
                this.killScore_ = value;
                onChanged();
                return this;
            }

            public Builder clearKillScore() {
                this.bitField0_ &= 0xFFFFFBFF;
                this.killScore_ = 0;
                onChanged();
                return this;
            }

            public boolean hasDestroyFlag() {
                return ((this.bitField0_ & 0x800) == 2048);
            }

            public int getDestroyFlag() {
                return this.destroyFlag_;
            }

            public Builder setDestroyFlag(int value) {
                this.bitField0_ |= 0x800;
                this.destroyFlag_ = value;
                onChanged();
                return this;
            }

            public Builder clearDestroyFlag() {
                this.bitField0_ &= 0xFFFFF7FF;
                this.destroyFlag_ = 0;
                onChanged();
                return this;
            }

            public boolean hasDestroyFlagScore() {
                return ((this.bitField0_ & 0x1000) == 4096);
            }

            public int getDestroyFlagScore() {
                return this.destroyFlagScore_;
            }

            public Builder setDestroyFlagScore(int value) {
                this.bitField0_ |= 0x1000;
                this.destroyFlagScore_ = value;
                onChanged();
                return this;
            }

            public Builder clearDestroyFlagScore() {
                this.bitField0_ &= 0xFFFFEFFF;
                this.destroyFlagScore_ = 0;
                onChanged();
                return this;
            }

            public boolean hasTotalScore() {
                return ((this.bitField0_ & 0x2000) == 8192);
            }

            public int getTotalScore() {
                return this.totalScore_;
            }

            public Builder setTotalScore(int value) {
                this.bitField0_ |= 0x2000;
                this.totalScore_ = value;
                onChanged();
                return this;
            }

            public Builder clearTotalScore() {
                this.bitField0_ &= 0xFFFFDFFF;
                this.totalScore_ = 0;
                onChanged();
                return this;
            }
        }
    }

    public static final class ReportDetail extends GeneratedMessage implements ReportDetailOrBuilder {
        private static final ReportDetail defaultInstance = new ReportDetail(true);
        private final UnknownFieldSet unknownFields;

        private ReportDetail(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ReportDetail(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ReportDetail getDefaultInstance() {
            return defaultInstance;
        }

        public ReportDetail getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ReportDetail(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    GuildFortHandler.ReportGuildDetail.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.areaId_ = input.readInt32();
                            break;
                        case 18:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x2) == 2) subBuilder = this.detail1_.toBuilder();
                            this.detail1_ = (GuildFortHandler.ReportGuildDetail) input.readMessage(GuildFortHandler.ReportGuildDetail.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.detail1_);
                                this.detail1_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x2;
                            break;
                        case 26:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x4) == 4) subBuilder = this.detail2_.toBuilder();
                            this.detail2_ = (GuildFortHandler.ReportGuildDetail) input.readMessage(GuildFortHandler.ReportGuildDetail.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.detail2_);
                                this.detail2_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x4;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ReportDetail_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ReportDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(ReportDetail.class, Builder.class);
        }

        public static Parser<ReportDetail> PARSER = (Parser<ReportDetail>) new AbstractParser<ReportDetail>() {
            public GuildFortHandler.ReportDetail parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ReportDetail(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int AREAID_FIELD_NUMBER = 1;
        private int areaId_;
        public static final int DETAIL1_FIELD_NUMBER = 2;
        private GuildFortHandler.ReportGuildDetail detail1_;
        public static final int DETAIL2_FIELD_NUMBER = 3;
        private GuildFortHandler.ReportGuildDetail detail2_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ReportDetail> getParserForType() {
            return PARSER;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        public boolean hasDetail1() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public GuildFortHandler.ReportGuildDetail getDetail1() {
            return this.detail1_;
        }

        public GuildFortHandler.ReportGuildDetailOrBuilder getDetail1OrBuilder() {
            return this.detail1_;
        }

        public boolean hasDetail2() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public GuildFortHandler.ReportGuildDetail getDetail2() {
            return this.detail2_;
        }

        public GuildFortHandler.ReportGuildDetailOrBuilder getDetail2OrBuilder() {
            return this.detail2_;
        }

        private void initFields() {
            this.areaId_ = 0;
            this.detail1_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance();
            this.detail2_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasDetail1() && !getDetail1().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasDetail2() && !getDetail2().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.areaId_);
            if ((this.bitField0_ & 0x2) == 2) output.writeMessage(2, (MessageLite) this.detail1_);
            if ((this.bitField0_ & 0x4) == 4) output.writeMessage(3, (MessageLite) this.detail2_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.areaId_);
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.detail1_);
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.detail2_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ReportDetail parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ReportDetail) PARSER.parseFrom(data);
        }

        public static ReportDetail parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ReportDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ReportDetail parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ReportDetail) PARSER.parseFrom(data);
        }

        public static ReportDetail parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ReportDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ReportDetail parseFrom(InputStream input) throws IOException {
            return (ReportDetail) PARSER.parseFrom(input);
        }

        public static ReportDetail parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ReportDetail parseDelimitedFrom(InputStream input) throws IOException {
            return (ReportDetail) PARSER.parseDelimitedFrom(input);
        }

        public static ReportDetail parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportDetail) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ReportDetail parseFrom(CodedInputStream input) throws IOException {
            return (ReportDetail) PARSER.parseFrom(input);
        }

        public static ReportDetail parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ReportDetail prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ReportDetailOrBuilder {
            private int bitField0_;
            private int areaId_;
            private GuildFortHandler.ReportGuildDetail detail1_;
            private SingleFieldBuilder<GuildFortHandler.ReportGuildDetail, GuildFortHandler.ReportGuildDetail.Builder, GuildFortHandler.ReportGuildDetailOrBuilder> detail1Builder_;
            private GuildFortHandler.ReportGuildDetail detail2_;
            private SingleFieldBuilder<GuildFortHandler.ReportGuildDetail, GuildFortHandler.ReportGuildDetail.Builder, GuildFortHandler.ReportGuildDetailOrBuilder> detail2Builder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ReportDetail_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ReportDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ReportDetail.class, Builder.class);
            }

            private Builder() {
                this.detail1_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance();
                this.detail2_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.detail1_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance();
                this.detail2_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ReportDetail.alwaysUseFieldBuilders) {
                    getDetail1FieldBuilder();
                    getDetail2FieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.detail1Builder_ == null) {
                    this.detail1_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance();
                } else {
                    this.detail1Builder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.detail2Builder_ == null) {
                    this.detail2_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance();
                } else {
                    this.detail2Builder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ReportDetail_descriptor;
            }

            public GuildFortHandler.ReportDetail getDefaultInstanceForType() {
                return GuildFortHandler.ReportDetail.getDefaultInstance();
            }

            public GuildFortHandler.ReportDetail build() {
                GuildFortHandler.ReportDetail result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ReportDetail buildPartial() {
                GuildFortHandler.ReportDetail result = new GuildFortHandler.ReportDetail(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.areaId_ = this.areaId_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                if (this.detail1Builder_ == null) {
                    result.detail1_ = this.detail1_;
                } else {
                    result.detail1_ = (GuildFortHandler.ReportGuildDetail) this.detail1Builder_.build();
                }
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                if (this.detail2Builder_ == null) {
                    result.detail2_ = this.detail2_;
                } else {
                    result.detail2_ = (GuildFortHandler.ReportGuildDetail) this.detail2Builder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ReportDetail)
                    return mergeFrom((GuildFortHandler.ReportDetail) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ReportDetail other) {
                if (other == GuildFortHandler.ReportDetail.getDefaultInstance()) return this;
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                if (other.hasDetail1()) mergeDetail1(other.getDetail1());
                if (other.hasDetail2()) mergeDetail2(other.getDetail2());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasAreaId()) return false;
                if (hasDetail1() && !getDetail1().isInitialized()) return false;
                if (hasDetail2() && !getDetail2().isInitialized()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ReportDetail parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ReportDetail) GuildFortHandler.ReportDetail.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ReportDetail) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x1;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasDetail1() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public GuildFortHandler.ReportGuildDetail getDetail1() {
                if (this.detail1Builder_ == null) return this.detail1_;
                return (GuildFortHandler.ReportGuildDetail) this.detail1Builder_.getMessage();
            }

            public Builder setDetail1(GuildFortHandler.ReportGuildDetail value) {
                if (this.detail1Builder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.detail1_ = value;
                    onChanged();
                } else {
                    this.detail1Builder_.setMessage(value);
                }
                this.bitField0_ |= 0x2;
                return this;
            }

            public Builder setDetail1(GuildFortHandler.ReportGuildDetail.Builder builderForValue) {
                if (this.detail1Builder_ == null) {
                    this.detail1_ = builderForValue.build();
                    onChanged();
                } else {
                    this.detail1Builder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x2;
                return this;
            }

            public Builder mergeDetail1(GuildFortHandler.ReportGuildDetail value) {
                if (this.detail1Builder_ == null) {
                    if ((this.bitField0_ & 0x2) == 2 && this.detail1_ != GuildFortHandler.ReportGuildDetail.getDefaultInstance()) {
                        this.detail1_ = GuildFortHandler.ReportGuildDetail.newBuilder(this.detail1_).mergeFrom(value).buildPartial();
                    } else {
                        this.detail1_ = value;
                    }
                    onChanged();
                } else {
                    this.detail1Builder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x2;
                return this;
            }

            public Builder clearDetail1() {
                if (this.detail1Builder_ == null) {
                    this.detail1_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance();
                    onChanged();
                } else {
                    this.detail1Builder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public GuildFortHandler.ReportGuildDetail.Builder getDetail1Builder() {
                this.bitField0_ |= 0x2;
                onChanged();
                return (GuildFortHandler.ReportGuildDetail.Builder) getDetail1FieldBuilder().getBuilder();
            }

            public GuildFortHandler.ReportGuildDetailOrBuilder getDetail1OrBuilder() {
                if (this.detail1Builder_ != null)
                    return (GuildFortHandler.ReportGuildDetailOrBuilder) this.detail1Builder_.getMessageOrBuilder();
                return this.detail1_;
            }

            private SingleFieldBuilder<GuildFortHandler.ReportGuildDetail, GuildFortHandler.ReportGuildDetail.Builder, GuildFortHandler.ReportGuildDetailOrBuilder> getDetail1FieldBuilder() {
                if (this.detail1Builder_ == null) {
                    this.detail1Builder_ = new SingleFieldBuilder(getDetail1(), getParentForChildren(), isClean());
                    this.detail1_ = null;
                }
                return this.detail1Builder_;
            }

            public boolean hasDetail2() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public GuildFortHandler.ReportGuildDetail getDetail2() {
                if (this.detail2Builder_ == null) return this.detail2_;
                return (GuildFortHandler.ReportGuildDetail) this.detail2Builder_.getMessage();
            }

            public Builder setDetail2(GuildFortHandler.ReportGuildDetail value) {
                if (this.detail2Builder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.detail2_ = value;
                    onChanged();
                } else {
                    this.detail2Builder_.setMessage(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder setDetail2(GuildFortHandler.ReportGuildDetail.Builder builderForValue) {
                if (this.detail2Builder_ == null) {
                    this.detail2_ = builderForValue.build();
                    onChanged();
                } else {
                    this.detail2Builder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder mergeDetail2(GuildFortHandler.ReportGuildDetail value) {
                if (this.detail2Builder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4 && this.detail2_ != GuildFortHandler.ReportGuildDetail.getDefaultInstance()) {
                        this.detail2_ = GuildFortHandler.ReportGuildDetail.newBuilder(this.detail2_).mergeFrom(value).buildPartial();
                    } else {
                        this.detail2_ = value;
                    }
                    onChanged();
                } else {
                    this.detail2Builder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder clearDetail2() {
                if (this.detail2Builder_ == null) {
                    this.detail2_ = GuildFortHandler.ReportGuildDetail.getDefaultInstance();
                    onChanged();
                } else {
                    this.detail2Builder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public GuildFortHandler.ReportGuildDetail.Builder getDetail2Builder() {
                this.bitField0_ |= 0x4;
                onChanged();
                return (GuildFortHandler.ReportGuildDetail.Builder) getDetail2FieldBuilder().getBuilder();
            }

            public GuildFortHandler.ReportGuildDetailOrBuilder getDetail2OrBuilder() {
                if (this.detail2Builder_ != null)
                    return (GuildFortHandler.ReportGuildDetailOrBuilder) this.detail2Builder_.getMessageOrBuilder();
                return this.detail2_;
            }

            private SingleFieldBuilder<GuildFortHandler.ReportGuildDetail, GuildFortHandler.ReportGuildDetail.Builder, GuildFortHandler.ReportGuildDetailOrBuilder> getDetail2FieldBuilder() {
                if (this.detail2Builder_ == null) {
                    this.detail2Builder_ = new SingleFieldBuilder(getDetail2(), getParentForChildren(), isClean());
                    this.detail2_ = null;
                }
                return this.detail2Builder_;
            }
        }

        static {
            defaultInstance.initFields();
        }
    }


    public static final class ApplyReportDetailRequest
            extends GeneratedMessage
            implements ApplyReportDetailRequestOrBuilder {
        private static final ApplyReportDetailRequest defaultInstance = new ApplyReportDetailRequest(true);
        private final UnknownFieldSet unknownFields;

        private ApplyReportDetailRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyReportDetailRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyReportDetailRequest getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyReportDetailRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyReportDetailRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.date_ = bs;
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.areaId_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyReportDetailRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyReportDetailRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyReportDetailRequest.class, Builder.class);
        }

        public static Parser<ApplyReportDetailRequest> PARSER = (Parser<ApplyReportDetailRequest>) new AbstractParser<ApplyReportDetailRequest>() {
            public GuildFortHandler.ApplyReportDetailRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyReportDetailRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int DATE_FIELD_NUMBER = 1;
        private Object date_;
        public static final int AREAID_FIELD_NUMBER = 2;
        private int areaId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyReportDetailRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasDate() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getDate() {
            Object ref = this.date_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.date_ = s;
            return s;
        }

        public ByteString getDateBytes() {
            Object ref = this.date_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.date_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        private void initFields() {
            this.date_ = "";
            this.areaId_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasDate()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getDateBytes());
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.areaId_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getDateBytes());
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.areaId_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyReportDetailRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyReportDetailRequest) PARSER.parseFrom(data);
        }

        public static ApplyReportDetailRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyReportDetailRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyReportDetailRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyReportDetailRequest) PARSER.parseFrom(data);
        }

        public static ApplyReportDetailRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyReportDetailRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyReportDetailRequest parseFrom(InputStream input) throws IOException {
            return (ApplyReportDetailRequest) PARSER.parseFrom(input);
        }

        public static ApplyReportDetailRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportDetailRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyReportDetailRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyReportDetailRequest) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyReportDetailRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportDetailRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyReportDetailRequest parseFrom(CodedInputStream input) throws IOException {
            return (ApplyReportDetailRequest) PARSER.parseFrom(input);
        }

        public static ApplyReportDetailRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportDetailRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyReportDetailRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyReportDetailRequestOrBuilder {
            private int bitField0_;
            private Object date_;
            private int areaId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportDetailRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportDetailRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyReportDetailRequest.class, Builder.class);
            }

            private Builder() {
                this.date_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.date_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyReportDetailRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.date_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportDetailRequest_descriptor;
            }

            public GuildFortHandler.ApplyReportDetailRequest getDefaultInstanceForType() {
                return GuildFortHandler.ApplyReportDetailRequest.getDefaultInstance();
            }

            public GuildFortHandler.ApplyReportDetailRequest build() {
                GuildFortHandler.ApplyReportDetailRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyReportDetailRequest buildPartial() {
                GuildFortHandler.ApplyReportDetailRequest result = new GuildFortHandler.ApplyReportDetailRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.date_ = this.date_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.areaId_ = this.areaId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyReportDetailRequest)
                    return mergeFrom((GuildFortHandler.ApplyReportDetailRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyReportDetailRequest other) {
                if (other == GuildFortHandler.ApplyReportDetailRequest.getDefaultInstance()) return this;
                if (other.hasDate()) {
                    this.bitField0_ |= 0x1;
                    this.date_ = other.date_;
                    onChanged();
                }
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasDate()) return false;
                if (!hasAreaId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyReportDetailRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyReportDetailRequest) GuildFortHandler.ApplyReportDetailRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyReportDetailRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasDate() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getDate() {
                Object ref = this.date_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.date_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getDateBytes() {
                Object ref = this.date_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.date_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setDate(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.date_ = value;
                onChanged();
                return this;
            }

            public Builder clearDate() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.date_ = GuildFortHandler.ApplyReportDetailRequest.getDefaultInstance().getDate();
                onChanged();
                return this;
            }

            public Builder setDateBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.date_ = value;
                onChanged();
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x2;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.areaId_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyReportDetailResponse
            extends GeneratedMessage
            implements ApplyReportDetailResponseOrBuilder {
        private static final ApplyReportDetailResponse defaultInstance = new ApplyReportDetailResponse(true);
        private final UnknownFieldSet unknownFields;

        private ApplyReportDetailResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyReportDetailResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyReportDetailResponse getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyReportDetailResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyReportDetailResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    GuildFortHandler.ReportDetail.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 26:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x4) == 4) subBuilder = this.reportDetail_.toBuilder();
                            this.reportDetail_ = (GuildFortHandler.ReportDetail) input.readMessage(GuildFortHandler.ReportDetail.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.reportDetail_);
                                this.reportDetail_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x4;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyReportDetailResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyReportDetailResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyReportDetailResponse.class, Builder.class);
        }

        public static Parser<ApplyReportDetailResponse> PARSER = (Parser<ApplyReportDetailResponse>) new AbstractParser<ApplyReportDetailResponse>() {
            public GuildFortHandler.ApplyReportDetailResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyReportDetailResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int REPORTDETAIL_FIELD_NUMBER = 3;
        private GuildFortHandler.ReportDetail reportDetail_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyReportDetailResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasReportDetail() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public GuildFortHandler.ReportDetail getReportDetail() {
            return this.reportDetail_;
        }

        public GuildFortHandler.ReportDetailOrBuilder getReportDetailOrBuilder() {
            return this.reportDetail_;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.reportDetail_ = GuildFortHandler.ReportDetail.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasReportDetail()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!getReportDetail().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4) output.writeMessage(3, (MessageLite) this.reportDetail_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.reportDetail_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyReportDetailResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyReportDetailResponse) PARSER.parseFrom(data);
        }

        public static ApplyReportDetailResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyReportDetailResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyReportDetailResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyReportDetailResponse) PARSER.parseFrom(data);
        }

        public static ApplyReportDetailResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyReportDetailResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyReportDetailResponse parseFrom(InputStream input) throws IOException {
            return (ApplyReportDetailResponse) PARSER.parseFrom(input);
        }

        public static ApplyReportDetailResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportDetailResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyReportDetailResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyReportDetailResponse) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyReportDetailResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportDetailResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyReportDetailResponse parseFrom(CodedInputStream input) throws IOException {
            return (ApplyReportDetailResponse) PARSER.parseFrom(input);
        }

        public static ApplyReportDetailResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportDetailResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyReportDetailResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyReportDetailResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private GuildFortHandler.ReportDetail reportDetail_;
            private SingleFieldBuilder<GuildFortHandler.ReportDetail, GuildFortHandler.ReportDetail.Builder, GuildFortHandler.ReportDetailOrBuilder> reportDetailBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportDetailResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportDetailResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyReportDetailResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.reportDetail_ = GuildFortHandler.ReportDetail.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.reportDetail_ = GuildFortHandler.ReportDetail.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyReportDetailResponse.alwaysUseFieldBuilders) getReportDetailFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.reportDetailBuilder_ == null) {
                    this.reportDetail_ = GuildFortHandler.ReportDetail.getDefaultInstance();
                } else {
                    this.reportDetailBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportDetailResponse_descriptor;
            }

            public GuildFortHandler.ApplyReportDetailResponse getDefaultInstanceForType() {
                return GuildFortHandler.ApplyReportDetailResponse.getDefaultInstance();
            }

            public GuildFortHandler.ApplyReportDetailResponse build() {
                GuildFortHandler.ApplyReportDetailResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyReportDetailResponse buildPartial() {
                GuildFortHandler.ApplyReportDetailResponse result = new GuildFortHandler.ApplyReportDetailResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                if (this.reportDetailBuilder_ == null) {
                    result.reportDetail_ = this.reportDetail_;
                } else {
                    result.reportDetail_ = (GuildFortHandler.ReportDetail) this.reportDetailBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyReportDetailResponse)
                    return mergeFrom((GuildFortHandler.ApplyReportDetailResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyReportDetailResponse other) {
                if (other == GuildFortHandler.ApplyReportDetailResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (other.hasReportDetail()) mergeReportDetail(other.getReportDetail());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                if (!hasReportDetail()) return false;
                if (!getReportDetail().isInitialized()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyReportDetailResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyReportDetailResponse) GuildFortHandler.ApplyReportDetailResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyReportDetailResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.ApplyReportDetailResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public boolean hasReportDetail() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public GuildFortHandler.ReportDetail getReportDetail() {
                if (this.reportDetailBuilder_ == null) return this.reportDetail_;
                return (GuildFortHandler.ReportDetail) this.reportDetailBuilder_.getMessage();
            }

            public Builder setReportDetail(GuildFortHandler.ReportDetail value) {
                if (this.reportDetailBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.reportDetail_ = value;
                    onChanged();
                } else {
                    this.reportDetailBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder setReportDetail(GuildFortHandler.ReportDetail.Builder builderForValue) {
                if (this.reportDetailBuilder_ == null) {
                    this.reportDetail_ = builderForValue.build();
                    onChanged();
                } else {
                    this.reportDetailBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder mergeReportDetail(GuildFortHandler.ReportDetail value) {
                if (this.reportDetailBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4 && this.reportDetail_ != GuildFortHandler.ReportDetail.getDefaultInstance()) {
                        this.reportDetail_ = GuildFortHandler.ReportDetail.newBuilder(this.reportDetail_).mergeFrom(value).buildPartial();
                    } else {
                        this.reportDetail_ = value;
                    }
                    onChanged();
                } else {
                    this.reportDetailBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder clearReportDetail() {
                if (this.reportDetailBuilder_ == null) {
                    this.reportDetail_ = GuildFortHandler.ReportDetail.getDefaultInstance();
                    onChanged();
                } else {
                    this.reportDetailBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public GuildFortHandler.ReportDetail.Builder getReportDetailBuilder() {
                this.bitField0_ |= 0x4;
                onChanged();
                return (GuildFortHandler.ReportDetail.Builder) getReportDetailFieldBuilder().getBuilder();
            }

            public GuildFortHandler.ReportDetailOrBuilder getReportDetailOrBuilder() {
                if (this.reportDetailBuilder_ != null)
                    return (GuildFortHandler.ReportDetailOrBuilder) this.reportDetailBuilder_.getMessageOrBuilder();
                return this.reportDetail_;
            }

            private SingleFieldBuilder<GuildFortHandler.ReportDetail, GuildFortHandler.ReportDetail.Builder, GuildFortHandler.ReportDetailOrBuilder> getReportDetailFieldBuilder() {
                if (this.reportDetailBuilder_ == null) {
                    this.reportDetailBuilder_ = new SingleFieldBuilder(getReportDetail(), getParentForChildren(), isClean());
                    this.reportDetail_ = null;
                }
                return this.reportDetailBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ReportStatisticsDetail
            extends GeneratedMessage
            implements ReportStatisticsDetailOrBuilder {
        private static final ReportStatisticsDetail defaultInstance = new ReportStatisticsDetail(true);
        private final UnknownFieldSet unknownFields;

        private ReportStatisticsDetail(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ReportStatisticsDetail(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ReportStatisticsDetail getDefaultInstance() {
            return defaultInstance;
        }

        public ReportStatisticsDetail getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ReportStatisticsDetail(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.name_ = bs;
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.level_ = input.readInt32();
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.job_ = input.readInt32();
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.kill_ = input.readInt32();
                            break;
                        case 40:
                            this.bitField0_ |= 0x10;
                            this.destroyFlag_ = input.readInt32();
                            break;
                        case 48:
                            this.bitField0_ |= 0x20;
                            this.damage_ = input.readInt64();
                            break;
                        case 56:
                            this.bitField0_ |= 0x40;
                            this.cure_ = input.readInt64();
                            break;
                        case 64:
                            this.bitField0_ |= 0x80;
                            this.defenseScore_ = input.readInt32();
                            break;
                        case 72:
                            this.bitField0_ |= 0x100;
                            this.attackSoul_ = input.readInt32();
                            break;
                        case 80:
                            this.bitField0_ |= 0x200;
                            this.totalScore_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ReportStatisticsDetail_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ReportStatisticsDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(ReportStatisticsDetail.class, Builder.class);
        }

        public static Parser<ReportStatisticsDetail> PARSER = (Parser<ReportStatisticsDetail>) new AbstractParser<ReportStatisticsDetail>() {
            public GuildFortHandler.ReportStatisticsDetail parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ReportStatisticsDetail(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int NAME_FIELD_NUMBER = 1;
        private Object name_;
        public static final int LEVEL_FIELD_NUMBER = 2;
        private int level_;
        public static final int JOB_FIELD_NUMBER = 3;
        private int job_;
        public static final int KILL_FIELD_NUMBER = 4;
        private int kill_;
        public static final int DESTROYFLAG_FIELD_NUMBER = 5;
        private int destroyFlag_;
        public static final int DAMAGE_FIELD_NUMBER = 6;
        private long damage_;
        public static final int CURE_FIELD_NUMBER = 7;
        private long cure_;
        public static final int DEFENSESCORE_FIELD_NUMBER = 8;
        private int defenseScore_;
        public static final int ATTACKSOUL_FIELD_NUMBER = 9;
        private int attackSoul_;
        public static final int TOTALSCORE_FIELD_NUMBER = 10;
        private int totalScore_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ReportStatisticsDetail> getParserForType() {
            return PARSER;
        }

        public boolean hasName() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getName() {
            Object ref = this.name_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.name_ = s;
            return s;
        }

        public ByteString getNameBytes() {
            Object ref = this.name_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.name_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasLevel() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getLevel() {
            return this.level_;
        }

        public boolean hasJob() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getJob() {
            return this.job_;
        }

        public boolean hasKill() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getKill() {
            return this.kill_;
        }

        public boolean hasDestroyFlag() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public int getDestroyFlag() {
            return this.destroyFlag_;
        }

        public boolean hasDamage() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public long getDamage() {
            return this.damage_;
        }

        public boolean hasCure() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public long getCure() {
            return this.cure_;
        }

        public boolean hasDefenseScore() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public int getDefenseScore() {
            return this.defenseScore_;
        }

        public boolean hasAttackSoul() {
            return ((this.bitField0_ & 0x100) == 256);
        }

        public int getAttackSoul() {
            return this.attackSoul_;
        }

        public boolean hasTotalScore() {
            return ((this.bitField0_ & 0x200) == 512);
        }

        public int getTotalScore() {
            return this.totalScore_;
        }

        private void initFields() {
            this.name_ = "";
            this.level_ = 0;
            this.job_ = 0;
            this.kill_ = 0;
            this.destroyFlag_ = 0;
            this.damage_ = 0L;
            this.cure_ = 0L;
            this.defenseScore_ = 0;
            this.attackSoul_ = 0;
            this.totalScore_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getNameBytes());
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.level_);
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.job_);
            if ((this.bitField0_ & 0x8) == 8) output.writeInt32(4, this.kill_);
            if ((this.bitField0_ & 0x10) == 16) output.writeInt32(5, this.destroyFlag_);
            if ((this.bitField0_ & 0x20) == 32) output.writeInt64(6, this.damage_);
            if ((this.bitField0_ & 0x40) == 64) output.writeInt64(7, this.cure_);
            if ((this.bitField0_ & 0x80) == 128) output.writeInt32(8, this.defenseScore_);
            if ((this.bitField0_ & 0x100) == 256) output.writeInt32(9, this.attackSoul_);
            if ((this.bitField0_ & 0x200) == 512) output.writeInt32(10, this.totalScore_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getNameBytes());
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.level_);
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.job_);
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeInt32Size(4, this.kill_);
            if ((this.bitField0_ & 0x10) == 16) size += CodedOutputStream.computeInt32Size(5, this.destroyFlag_);
            if ((this.bitField0_ & 0x20) == 32) size += CodedOutputStream.computeInt64Size(6, this.damage_);
            if ((this.bitField0_ & 0x40) == 64) size += CodedOutputStream.computeInt64Size(7, this.cure_);
            if ((this.bitField0_ & 0x80) == 128) size += CodedOutputStream.computeInt32Size(8, this.defenseScore_);
            if ((this.bitField0_ & 0x100) == 256) size += CodedOutputStream.computeInt32Size(9, this.attackSoul_);
            if ((this.bitField0_ & 0x200) == 512) size += CodedOutputStream.computeInt32Size(10, this.totalScore_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ReportStatisticsDetail parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ReportStatisticsDetail) PARSER.parseFrom(data);
        }

        public static ReportStatisticsDetail parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ReportStatisticsDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ReportStatisticsDetail parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ReportStatisticsDetail) PARSER.parseFrom(data);
        }

        public static ReportStatisticsDetail parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ReportStatisticsDetail) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ReportStatisticsDetail parseFrom(InputStream input) throws IOException {
            return (ReportStatisticsDetail) PARSER.parseFrom(input);
        }

        public static ReportStatisticsDetail parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportStatisticsDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ReportStatisticsDetail parseDelimitedFrom(InputStream input) throws IOException {
            return (ReportStatisticsDetail) PARSER.parseDelimitedFrom(input);
        }

        public static ReportStatisticsDetail parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportStatisticsDetail) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ReportStatisticsDetail parseFrom(CodedInputStream input) throws IOException {
            return (ReportStatisticsDetail) PARSER.parseFrom(input);
        }

        public static ReportStatisticsDetail parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ReportStatisticsDetail) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ReportStatisticsDetail prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ReportStatisticsDetailOrBuilder {
            private int bitField0_;
            private Object name_;
            private int level_;
            private int job_;
            private int kill_;
            private int destroyFlag_;
            private long damage_;
            private long cure_;
            private int defenseScore_;
            private int attackSoul_;
            private int totalScore_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ReportStatisticsDetail_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ReportStatisticsDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ReportStatisticsDetail.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ReportStatisticsDetail.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.name_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.level_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.job_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                this.kill_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.destroyFlag_ = 0;
                this.bitField0_ &= 0xFFFFFFEF;
                this.damage_ = 0L;
                this.bitField0_ &= 0xFFFFFFDF;
                this.cure_ = 0L;
                this.bitField0_ &= 0xFFFFFFBF;
                this.defenseScore_ = 0;
                this.bitField0_ &= 0xFFFFFF7F;
                this.attackSoul_ = 0;
                this.bitField0_ &= 0xFFFFFEFF;
                this.totalScore_ = 0;
                this.bitField0_ &= 0xFFFFFDFF;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ReportStatisticsDetail_descriptor;
            }

            public GuildFortHandler.ReportStatisticsDetail getDefaultInstanceForType() {
                return GuildFortHandler.ReportStatisticsDetail.getDefaultInstance();
            }

            public GuildFortHandler.ReportStatisticsDetail build() {
                GuildFortHandler.ReportStatisticsDetail result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ReportStatisticsDetail buildPartial() {
                GuildFortHandler.ReportStatisticsDetail result = new GuildFortHandler.ReportStatisticsDetail(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.name_ = this.name_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.level_ = this.level_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.job_ = this.job_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.kill_ = this.kill_;
                if ((from_bitField0_ & 0x10) == 16) to_bitField0_ |= 0x10;
                result.destroyFlag_ = this.destroyFlag_;
                if ((from_bitField0_ & 0x20) == 32) to_bitField0_ |= 0x20;
                result.damage_ = this.damage_;
                if ((from_bitField0_ & 0x40) == 64) to_bitField0_ |= 0x40;
                result.cure_ = this.cure_;
                if ((from_bitField0_ & 0x80) == 128) to_bitField0_ |= 0x80;
                result.defenseScore_ = this.defenseScore_;
                if ((from_bitField0_ & 0x100) == 256) to_bitField0_ |= 0x100;
                result.attackSoul_ = this.attackSoul_;
                if ((from_bitField0_ & 0x200) == 512) to_bitField0_ |= 0x200;
                result.totalScore_ = this.totalScore_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ReportStatisticsDetail)
                    return mergeFrom((GuildFortHandler.ReportStatisticsDetail) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ReportStatisticsDetail other) {
                if (other == GuildFortHandler.ReportStatisticsDetail.getDefaultInstance()) return this;
                if (other.hasName()) {
                    this.bitField0_ |= 0x1;
                    this.name_ = other.name_;
                    onChanged();
                }
                if (other.hasLevel()) setLevel(other.getLevel());
                if (other.hasJob()) setJob(other.getJob());
                if (other.hasKill()) setKill(other.getKill());
                if (other.hasDestroyFlag()) setDestroyFlag(other.getDestroyFlag());
                if (other.hasDamage()) setDamage(other.getDamage());
                if (other.hasCure()) setCure(other.getCure());
                if (other.hasDefenseScore()) setDefenseScore(other.getDefenseScore());
                if (other.hasAttackSoul()) setAttackSoul(other.getAttackSoul());
                if (other.hasTotalScore()) setTotalScore(other.getTotalScore());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ReportStatisticsDetail parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ReportStatisticsDetail) GuildFortHandler.ReportStatisticsDetail.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ReportStatisticsDetail) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasName() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getName() {
                Object ref = this.name_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.name_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getNameBytes() {
                Object ref = this.name_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.name_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setName(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.name_ = value;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.name_ = GuildFortHandler.ReportStatisticsDetail.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.name_ = value;
                onChanged();
                return this;
            }

            public boolean hasLevel() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getLevel() {
                return this.level_;
            }

            public Builder setLevel(int value) {
                this.bitField0_ |= 0x2;
                this.level_ = value;
                onChanged();
                return this;
            }

            public Builder clearLevel() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.level_ = 0;
                onChanged();
                return this;
            }

            public boolean hasJob() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getJob() {
                return this.job_;
            }

            public Builder setJob(int value) {
                this.bitField0_ |= 0x4;
                this.job_ = value;
                onChanged();
                return this;
            }

            public Builder clearJob() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.job_ = 0;
                onChanged();
                return this;
            }

            public boolean hasKill() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getKill() {
                return this.kill_;
            }

            public Builder setKill(int value) {
                this.bitField0_ |= 0x8;
                this.kill_ = value;
                onChanged();
                return this;
            }

            public Builder clearKill() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.kill_ = 0;
                onChanged();
                return this;
            }

            public boolean hasDestroyFlag() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public int getDestroyFlag() {
                return this.destroyFlag_;
            }

            public Builder setDestroyFlag(int value) {
                this.bitField0_ |= 0x10;
                this.destroyFlag_ = value;
                onChanged();
                return this;
            }

            public Builder clearDestroyFlag() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.destroyFlag_ = 0;
                onChanged();
                return this;
            }

            public boolean hasDamage() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public long getDamage() {
                return this.damage_;
            }

            public Builder setDamage(long value) {
                this.bitField0_ |= 0x20;
                this.damage_ = value;
                onChanged();
                return this;
            }

            public Builder clearDamage() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.damage_ = 0L;
                onChanged();
                return this;
            }

            public boolean hasCure() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public long getCure() {
                return this.cure_;
            }

            public Builder setCure(long value) {
                this.bitField0_ |= 0x40;
                this.cure_ = value;
                onChanged();
                return this;
            }

            public Builder clearCure() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.cure_ = 0L;
                onChanged();
                return this;
            }

            public boolean hasDefenseScore() {
                return ((this.bitField0_ & 0x80) == 128);
            }

            public int getDefenseScore() {
                return this.defenseScore_;
            }

            public Builder setDefenseScore(int value) {
                this.bitField0_ |= 0x80;
                this.defenseScore_ = value;
                onChanged();
                return this;
            }

            public Builder clearDefenseScore() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.defenseScore_ = 0;
                onChanged();
                return this;
            }

            public boolean hasAttackSoul() {
                return ((this.bitField0_ & 0x100) == 256);
            }

            public int getAttackSoul() {
                return this.attackSoul_;
            }

            public Builder setAttackSoul(int value) {
                this.bitField0_ |= 0x100;
                this.attackSoul_ = value;
                onChanged();
                return this;
            }

            public Builder clearAttackSoul() {
                this.bitField0_ &= 0xFFFFFEFF;
                this.attackSoul_ = 0;
                onChanged();
                return this;
            }

            public boolean hasTotalScore() {
                return ((this.bitField0_ & 0x200) == 512);
            }

            public int getTotalScore() {
                return this.totalScore_;
            }

            public Builder setTotalScore(int value) {
                this.bitField0_ |= 0x200;
                this.totalScore_ = value;
                onChanged();
                return this;
            }

            public Builder clearTotalScore() {
                this.bitField0_ &= 0xFFFFFDFF;
                this.totalScore_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyReportStatisticsRequest
            extends GeneratedMessage
            implements ApplyReportStatisticsRequestOrBuilder {
        private static final ApplyReportStatisticsRequest defaultInstance = new ApplyReportStatisticsRequest(true);
        private final UnknownFieldSet unknownFields;

        private ApplyReportStatisticsRequest(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyReportStatisticsRequest(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyReportStatisticsRequest getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyReportStatisticsRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyReportStatisticsRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x1;
                            this.date_ = bs;
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.areaId_ = input.readInt32();
                            break;
                        case 26:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x4;
                            this.guildId_ = bs;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyReportStatisticsRequest_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyReportStatisticsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyReportStatisticsRequest.class, Builder.class);
        }

        public static Parser<ApplyReportStatisticsRequest> PARSER = (Parser<ApplyReportStatisticsRequest>) new AbstractParser<ApplyReportStatisticsRequest>() {
            public GuildFortHandler.ApplyReportStatisticsRequest parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyReportStatisticsRequest(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int DATE_FIELD_NUMBER = 1;
        private Object date_;
        public static final int AREAID_FIELD_NUMBER = 2;
        private int areaId_;
        public static final int GUILDID_FIELD_NUMBER = 3;
        private Object guildId_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyReportStatisticsRequest> getParserForType() {
            return PARSER;
        }

        public boolean hasDate() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public String getDate() {
            Object ref = this.date_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.date_ = s;
            return s;
        }

        public ByteString getDateBytes() {
            Object ref = this.date_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.date_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public boolean hasAreaId() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getAreaId() {
            return this.areaId_;
        }

        public boolean hasGuildId() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public String getGuildId() {
            Object ref = this.guildId_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.guildId_ = s;
            return s;
        }

        public ByteString getGuildIdBytes() {
            Object ref = this.guildId_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.guildId_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        private void initFields() {
            this.date_ = "";
            this.areaId_ = 0;
            this.guildId_ = "";
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasDate()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAreaId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasGuildId()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeBytes(1, getDateBytes());
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.areaId_);
            if ((this.bitField0_ & 0x4) == 4) output.writeBytes(3, getGuildIdBytes());
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeBytesSize(1, getDateBytes());
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.areaId_);
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeBytesSize(3, getGuildIdBytes());
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyReportStatisticsRequest parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyReportStatisticsRequest) PARSER.parseFrom(data);
        }

        public static ApplyReportStatisticsRequest parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyReportStatisticsRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyReportStatisticsRequest parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyReportStatisticsRequest) PARSER.parseFrom(data);
        }

        public static ApplyReportStatisticsRequest parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyReportStatisticsRequest) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyReportStatisticsRequest parseFrom(InputStream input) throws IOException {
            return (ApplyReportStatisticsRequest) PARSER.parseFrom(input);
        }

        public static ApplyReportStatisticsRequest parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportStatisticsRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyReportStatisticsRequest parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyReportStatisticsRequest) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyReportStatisticsRequest parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportStatisticsRequest) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyReportStatisticsRequest parseFrom(CodedInputStream input) throws IOException {
            return (ApplyReportStatisticsRequest) PARSER.parseFrom(input);
        }

        public static ApplyReportStatisticsRequest parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportStatisticsRequest) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyReportStatisticsRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyReportStatisticsRequestOrBuilder {
            private int bitField0_;
            private Object date_;
            private int areaId_;
            private Object guildId_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportStatisticsRequest_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportStatisticsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyReportStatisticsRequest.class, Builder.class);
            }

            private Builder() {
                this.date_ = "";
                this.guildId_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.date_ = "";
                this.guildId_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyReportStatisticsRequest.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.date_ = "";
                this.bitField0_ &= 0xFFFFFFFE;
                this.areaId_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.guildId_ = "";
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportStatisticsRequest_descriptor;
            }

            public GuildFortHandler.ApplyReportStatisticsRequest getDefaultInstanceForType() {
                return GuildFortHandler.ApplyReportStatisticsRequest.getDefaultInstance();
            }

            public GuildFortHandler.ApplyReportStatisticsRequest build() {
                GuildFortHandler.ApplyReportStatisticsRequest result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyReportStatisticsRequest buildPartial() {
                GuildFortHandler.ApplyReportStatisticsRequest result = new GuildFortHandler.ApplyReportStatisticsRequest(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.date_ = this.date_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.areaId_ = this.areaId_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.guildId_ = this.guildId_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyReportStatisticsRequest)
                    return mergeFrom((GuildFortHandler.ApplyReportStatisticsRequest) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyReportStatisticsRequest other) {
                if (other == GuildFortHandler.ApplyReportStatisticsRequest.getDefaultInstance()) return this;
                if (other.hasDate()) {
                    this.bitField0_ |= 0x1;
                    this.date_ = other.date_;
                    onChanged();
                }
                if (other.hasAreaId()) setAreaId(other.getAreaId());
                if (other.hasGuildId()) {
                    this.bitField0_ |= 0x4;
                    this.guildId_ = other.guildId_;
                    onChanged();
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasDate()) return false;
                if (!hasAreaId()) return false;
                if (!hasGuildId()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyReportStatisticsRequest parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyReportStatisticsRequest) GuildFortHandler.ApplyReportStatisticsRequest.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyReportStatisticsRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasDate() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public String getDate() {
                Object ref = this.date_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.date_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getDateBytes() {
                Object ref = this.date_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.date_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setDate(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.date_ = value;
                onChanged();
                return this;
            }

            public Builder clearDate() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.date_ = GuildFortHandler.ApplyReportStatisticsRequest.getDefaultInstance().getDate();
                onChanged();
                return this;
            }

            public Builder setDateBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x1;
                this.date_ = value;
                onChanged();
                return this;
            }

            public boolean hasAreaId() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getAreaId() {
                return this.areaId_;
            }

            public Builder setAreaId(int value) {
                this.bitField0_ |= 0x2;
                this.areaId_ = value;
                onChanged();
                return this;
            }

            public Builder clearAreaId() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.areaId_ = 0;
                onChanged();
                return this;
            }

            public boolean hasGuildId() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public String getGuildId() {
                Object ref = this.guildId_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.guildId_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getGuildIdBytes() {
                Object ref = this.guildId_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.guildId_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setGuildId(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.guildId_ = value;
                onChanged();
                return this;
            }

            public Builder clearGuildId() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.guildId_ = GuildFortHandler.ApplyReportStatisticsRequest.getDefaultInstance().getGuildId();
                onChanged();
                return this;
            }

            public Builder setGuildIdBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x4;
                this.guildId_ = value;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class ApplyReportStatisticsResponse
            extends GeneratedMessage
            implements ApplyReportStatisticsResponseOrBuilder {
        private static final ApplyReportStatisticsResponse defaultInstance = new ApplyReportStatisticsResponse(true);
        private final UnknownFieldSet unknownFields;

        private ApplyReportStatisticsResponse(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private ApplyReportStatisticsResponse(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static ApplyReportStatisticsResponse getDefaultInstance() {
            return defaultInstance;
        }

        public ApplyReportStatisticsResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ApplyReportStatisticsResponse(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    ByteString bs;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            bs = input.readBytes();
                            this.bitField0_ |= 0x2;
                            this.s2CMsg_ = bs;
                            break;
                        case 26:
                            if ((mutable_bitField0_ & 0x4) != 4) {
                                this.statisticsDetail_ = new ArrayList<>();
                                mutable_bitField0_ |= 0x4;
                            }
                            this.statisticsDetail_.add(input.readMessage(GuildFortHandler.ReportStatisticsDetail.PARSER, extensionRegistry));
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                if ((mutable_bitField0_ & 0x4) == 4)
                    this.statisticsDetail_ = Collections.unmodifiableList(this.statisticsDetail_);
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyReportStatisticsResponse_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_ApplyReportStatisticsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ApplyReportStatisticsResponse.class, Builder.class);
        }

        public static Parser<ApplyReportStatisticsResponse> PARSER = (Parser<ApplyReportStatisticsResponse>) new AbstractParser<ApplyReportStatisticsResponse>() {
            public GuildFortHandler.ApplyReportStatisticsResponse parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.ApplyReportStatisticsResponse(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int S2C_MSG_FIELD_NUMBER = 2;
        private Object s2CMsg_;
        public static final int STATISTICSDETAIL_FIELD_NUMBER = 3;
        private List<GuildFortHandler.ReportStatisticsDetail> statisticsDetail_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<ApplyReportStatisticsResponse> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasS2CMsg() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public String getS2CMsg() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) return (String) ref;
            ByteString bs = (ByteString) ref;
            String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) this.s2CMsg_ = s;
            return s;
        }

        public ByteString getS2CMsgBytes() {
            Object ref = this.s2CMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String) ref);
                this.s2CMsg_ = b;
                return b;
            }
            return (ByteString) ref;
        }

        public List<GuildFortHandler.ReportStatisticsDetail> getStatisticsDetailList() {
            return this.statisticsDetail_;
        }

        public List<? extends GuildFortHandler.ReportStatisticsDetailOrBuilder> getStatisticsDetailOrBuilderList() {
            return (List) this.statisticsDetail_;
        }

        public int getStatisticsDetailCount() {
            return this.statisticsDetail_.size();
        }

        public GuildFortHandler.ReportStatisticsDetail getStatisticsDetail(int index) {
            return this.statisticsDetail_.get(index);
        }

        public GuildFortHandler.ReportStatisticsDetailOrBuilder getStatisticsDetailOrBuilder(int index) {
            return this.statisticsDetail_.get(index);
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.s2CMsg_ = "";
            this.statisticsDetail_ = Collections.emptyList();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeBytes(2, getS2CMsgBytes());
            for (int i = 0; i < this.statisticsDetail_.size(); i++)
                output.writeMessage(3, (MessageLite) this.statisticsDetail_.get(i));
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeBytesSize(2, getS2CMsgBytes());
            for (int i = 0; i < this.statisticsDetail_.size(); i++)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.statisticsDetail_.get(i));
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static ApplyReportStatisticsResponse parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ApplyReportStatisticsResponse) PARSER.parseFrom(data);
        }

        public static ApplyReportStatisticsResponse parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyReportStatisticsResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyReportStatisticsResponse parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ApplyReportStatisticsResponse) PARSER.parseFrom(data);
        }

        public static ApplyReportStatisticsResponse parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ApplyReportStatisticsResponse) PARSER.parseFrom(data, extensionRegistry);
        }

        public static ApplyReportStatisticsResponse parseFrom(InputStream input) throws IOException {
            return (ApplyReportStatisticsResponse) PARSER.parseFrom(input);
        }

        public static ApplyReportStatisticsResponse parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportStatisticsResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static ApplyReportStatisticsResponse parseDelimitedFrom(InputStream input) throws IOException {
            return (ApplyReportStatisticsResponse) PARSER.parseDelimitedFrom(input);
        }

        public static ApplyReportStatisticsResponse parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportStatisticsResponse) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static ApplyReportStatisticsResponse parseFrom(CodedInputStream input) throws IOException {
            return (ApplyReportStatisticsResponse) PARSER.parseFrom(input);
        }

        public static ApplyReportStatisticsResponse parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ApplyReportStatisticsResponse) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(ApplyReportStatisticsResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.ApplyReportStatisticsResponseOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private Object s2CMsg_;
            private List<GuildFortHandler.ReportStatisticsDetail> statisticsDetail_;
            private RepeatedFieldBuilder<GuildFortHandler.ReportStatisticsDetail, GuildFortHandler.ReportStatisticsDetail.Builder, GuildFortHandler.ReportStatisticsDetailOrBuilder> statisticsDetailBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportStatisticsResponse_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportStatisticsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.ApplyReportStatisticsResponse.class, Builder.class);
            }

            private Builder() {
                this.s2CMsg_ = "";
                this.statisticsDetail_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.s2CMsg_ = "";
                this.statisticsDetail_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.ApplyReportStatisticsResponse.alwaysUseFieldBuilders)
                    getStatisticsDetailFieldBuilder();
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CMsg_ = "";
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.statisticsDetailBuilder_ == null) {
                    this.statisticsDetail_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                } else {
                    this.statisticsDetailBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_ApplyReportStatisticsResponse_descriptor;
            }

            public GuildFortHandler.ApplyReportStatisticsResponse getDefaultInstanceForType() {
                return GuildFortHandler.ApplyReportStatisticsResponse.getDefaultInstance();
            }

            public GuildFortHandler.ApplyReportStatisticsResponse build() {
                GuildFortHandler.ApplyReportStatisticsResponse result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.ApplyReportStatisticsResponse buildPartial() {
                GuildFortHandler.ApplyReportStatisticsResponse result = new GuildFortHandler.ApplyReportStatisticsResponse(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.s2CMsg_ = this.s2CMsg_;
                if (this.statisticsDetailBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4) {
                        this.statisticsDetail_ = Collections.unmodifiableList(this.statisticsDetail_);
                        this.bitField0_ &= 0xFFFFFFFB;
                    }
                    result.statisticsDetail_ = this.statisticsDetail_;
                } else {
                    result.statisticsDetail_ = this.statisticsDetailBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.ApplyReportStatisticsResponse)
                    return mergeFrom((GuildFortHandler.ApplyReportStatisticsResponse) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.ApplyReportStatisticsResponse other) {
                if (other == GuildFortHandler.ApplyReportStatisticsResponse.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasS2CMsg()) {
                    this.bitField0_ |= 0x2;
                    this.s2CMsg_ = other.s2CMsg_;
                    onChanged();
                }
                if (this.statisticsDetailBuilder_ == null) {
                    if (!other.statisticsDetail_.isEmpty()) {
                        if (this.statisticsDetail_.isEmpty()) {
                            this.statisticsDetail_ = other.statisticsDetail_;
                            this.bitField0_ &= 0xFFFFFFFB;
                        } else {
                            ensureStatisticsDetailIsMutable();
                            this.statisticsDetail_.addAll(other.statisticsDetail_);
                        }
                        onChanged();
                    }
                } else if (!other.statisticsDetail_.isEmpty()) {
                    if (this.statisticsDetailBuilder_.isEmpty()) {
                        this.statisticsDetailBuilder_.dispose();
                        this.statisticsDetailBuilder_ = null;
                        this.statisticsDetail_ = other.statisticsDetail_;
                        this.bitField0_ &= 0xFFFFFFFB;
                        this.statisticsDetailBuilder_ = GuildFortHandler.ApplyReportStatisticsResponse.alwaysUseFieldBuilders ? getStatisticsDetailFieldBuilder() : null;
                    } else {
                        this.statisticsDetailBuilder_.addAllMessages(other.statisticsDetail_);
                    }
                }
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.ApplyReportStatisticsResponse parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.ApplyReportStatisticsResponse) GuildFortHandler.ApplyReportStatisticsResponse.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.ApplyReportStatisticsResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasS2CMsg() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public String getS2CMsg() {
                Object ref = this.s2CMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) this.s2CMsg_ = s;
                    return s;
                }
                return (String) ref;
            }

            public ByteString getS2CMsgBytes() {
                Object ref = this.s2CMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String) ref);
                    this.s2CMsg_ = b;
                    return b;
                }
                return (ByteString) ref;
            }

            public Builder setS2CMsg(String value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CMsg() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.s2CMsg_ = GuildFortHandler.ApplyReportStatisticsResponse.getDefaultInstance().getS2CMsg();
                onChanged();
                return this;
            }

            public Builder setS2CMsgBytes(ByteString value) {
                if (value == null) throw new NullPointerException();
                this.bitField0_ |= 0x2;
                this.s2CMsg_ = value;
                onChanged();
                return this;
            }

            private void ensureStatisticsDetailIsMutable() {
                if ((this.bitField0_ & 0x4) != 4) {
                    this.statisticsDetail_ = new ArrayList<>(this.statisticsDetail_);
                    this.bitField0_ |= 0x4;
                }
            }

            public List<GuildFortHandler.ReportStatisticsDetail> getStatisticsDetailList() {
                if (this.statisticsDetailBuilder_ == null) return Collections.unmodifiableList(this.statisticsDetail_);
                return this.statisticsDetailBuilder_.getMessageList();
            }

            public int getStatisticsDetailCount() {
                if (this.statisticsDetailBuilder_ == null) return this.statisticsDetail_.size();
                return this.statisticsDetailBuilder_.getCount();
            }

            public GuildFortHandler.ReportStatisticsDetail getStatisticsDetail(int index) {
                if (this.statisticsDetailBuilder_ == null) return this.statisticsDetail_.get(index);
                return (GuildFortHandler.ReportStatisticsDetail) this.statisticsDetailBuilder_.getMessage(index);
            }

            public Builder setStatisticsDetail(int index, GuildFortHandler.ReportStatisticsDetail value) {
                if (this.statisticsDetailBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureStatisticsDetailIsMutable();
                    this.statisticsDetail_.set(index, value);
                    onChanged();
                } else {
                    this.statisticsDetailBuilder_.setMessage(index, value);
                }
                return this;
            }

            public Builder setStatisticsDetail(int index, GuildFortHandler.ReportStatisticsDetail.Builder builderForValue) {
                if (this.statisticsDetailBuilder_ == null) {
                    ensureStatisticsDetailIsMutable();
                    this.statisticsDetail_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    this.statisticsDetailBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addStatisticsDetail(GuildFortHandler.ReportStatisticsDetail value) {
                if (this.statisticsDetailBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureStatisticsDetailIsMutable();
                    this.statisticsDetail_.add(value);
                    onChanged();
                } else {
                    this.statisticsDetailBuilder_.addMessage(value);
                }
                return this;
            }

            public Builder addStatisticsDetail(int index, GuildFortHandler.ReportStatisticsDetail value) {
                if (this.statisticsDetailBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    ensureStatisticsDetailIsMutable();
                    this.statisticsDetail_.add(index, value);
                    onChanged();
                } else {
                    this.statisticsDetailBuilder_.addMessage(index, value);
                }
                return this;
            }

            public Builder addStatisticsDetail(GuildFortHandler.ReportStatisticsDetail.Builder builderForValue) {
                if (this.statisticsDetailBuilder_ == null) {
                    ensureStatisticsDetailIsMutable();
                    this.statisticsDetail_.add(builderForValue.build());
                    onChanged();
                } else {
                    this.statisticsDetailBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }

            public Builder addStatisticsDetail(int index, GuildFortHandler.ReportStatisticsDetail.Builder builderForValue) {
                if (this.statisticsDetailBuilder_ == null) {
                    ensureStatisticsDetailIsMutable();
                    this.statisticsDetail_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    this.statisticsDetailBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }

            public Builder addAllStatisticsDetail(Iterable<? extends GuildFortHandler.ReportStatisticsDetail> values) {
                if (this.statisticsDetailBuilder_ == null) {
                    ensureStatisticsDetailIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.statisticsDetail_);
                    onChanged();
                } else {
                    this.statisticsDetailBuilder_.addAllMessages(values);
                }
                return this;
            }

            public Builder clearStatisticsDetail() {
                if (this.statisticsDetailBuilder_ == null) {
                    this.statisticsDetail_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFB;
                    onChanged();
                } else {
                    this.statisticsDetailBuilder_.clear();
                }
                return this;
            }

            public Builder removeStatisticsDetail(int index) {
                if (this.statisticsDetailBuilder_ == null) {
                    ensureStatisticsDetailIsMutable();
                    this.statisticsDetail_.remove(index);
                    onChanged();
                } else {
                    this.statisticsDetailBuilder_.remove(index);
                }
                return this;
            }

            public GuildFortHandler.ReportStatisticsDetail.Builder getStatisticsDetailBuilder(int index) {
                return (GuildFortHandler.ReportStatisticsDetail.Builder) getStatisticsDetailFieldBuilder().getBuilder(index);
            }

            public GuildFortHandler.ReportStatisticsDetailOrBuilder getStatisticsDetailOrBuilder(int index) {
                if (this.statisticsDetailBuilder_ == null) return this.statisticsDetail_.get(index);
                return (GuildFortHandler.ReportStatisticsDetailOrBuilder) this.statisticsDetailBuilder_.getMessageOrBuilder(index);
            }

            public List<? extends GuildFortHandler.ReportStatisticsDetailOrBuilder> getStatisticsDetailOrBuilderList() {
                if (this.statisticsDetailBuilder_ != null)
                    return this.statisticsDetailBuilder_.getMessageOrBuilderList();
                return Collections.unmodifiableList((List) this.statisticsDetail_);
            }

            public GuildFortHandler.ReportStatisticsDetail.Builder addStatisticsDetailBuilder() {
                return (GuildFortHandler.ReportStatisticsDetail.Builder) getStatisticsDetailFieldBuilder().addBuilder(GuildFortHandler.ReportStatisticsDetail.getDefaultInstance());
            }

            public GuildFortHandler.ReportStatisticsDetail.Builder addStatisticsDetailBuilder(int index) {
                return (GuildFortHandler.ReportStatisticsDetail.Builder) getStatisticsDetailFieldBuilder().addBuilder(index, GuildFortHandler.ReportStatisticsDetail.getDefaultInstance());
            }

            public List<GuildFortHandler.ReportStatisticsDetail.Builder> getStatisticsDetailBuilderList() {
                return getStatisticsDetailFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilder<GuildFortHandler.ReportStatisticsDetail, GuildFortHandler.ReportStatisticsDetail.Builder, GuildFortHandler.ReportStatisticsDetailOrBuilder> getStatisticsDetailFieldBuilder() {
                if (this.statisticsDetailBuilder_ == null) {
                    this.statisticsDetailBuilder_ = new RepeatedFieldBuilder(this.statisticsDetail_, ((this.bitField0_ & 0x4) == 4), getParentForChildren(), isClean());
                    this.statisticsDetail_ = null;
                }
                return this.statisticsDetailBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class FortGuildStatistics
            extends GeneratedMessage
            implements FortGuildStatisticsOrBuilder {
        private static final FortGuildStatistics defaultInstance = new FortGuildStatistics(true);
        private final UnknownFieldSet unknownFields;

        private FortGuildStatistics(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private FortGuildStatistics(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static FortGuildStatistics getDefaultInstance() {
            return defaultInstance;
        }

        public FortGuildStatistics getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FortGuildStatistics(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.armyFlag_ = input.readInt32();
                            break;
                        case 16:
                            this.bitField0_ |= 0x2;
                            this.mumber_ = input.readInt32();
                            break;
                        case 24:
                            this.bitField0_ |= 0x4;
                            this.defenseSoul_ = input.readInt32();
                            break;
                        case 32:
                            this.bitField0_ |= 0x8;
                            this.attackSoul_ = input.readInt32();
                            break;
                        case 40:
                            this.bitField0_ |= 0x10;
                            this.kill_ = input.readInt32();
                            break;
                        case 48:
                            this.bitField0_ |= 0x20;
                            this.defense_ = input.readInt32();
                            break;
                        case 56:
                            this.bitField0_ |= 0x40;
                            this.attack_ = input.readInt32();
                            break;
                        case 64:
                            this.bitField0_ |= 0x80;
                            this.score_ = input.readInt32();
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_FortGuildStatistics_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_FortGuildStatistics_fieldAccessorTable.ensureFieldAccessorsInitialized(FortGuildStatistics.class, Builder.class);
        }

        public static Parser<FortGuildStatistics> PARSER = (Parser<FortGuildStatistics>) new AbstractParser<FortGuildStatistics>() {
            public GuildFortHandler.FortGuildStatistics parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.FortGuildStatistics(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int ARMYFLAG_FIELD_NUMBER = 1;
        private int armyFlag_;
        public static final int MUMBER_FIELD_NUMBER = 2;
        private int mumber_;
        public static final int DEFENSESOUL_FIELD_NUMBER = 3;
        private int defenseSoul_;
        public static final int ATTACKSOUL_FIELD_NUMBER = 4;
        private int attackSoul_;
        public static final int KILL_FIELD_NUMBER = 5;
        private int kill_;
        public static final int DEFENSE_FIELD_NUMBER = 6;
        private int defense_;
        public static final int ATTACK_FIELD_NUMBER = 7;
        private int attack_;
        public static final int SCORE_FIELD_NUMBER = 8;
        private int score_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<FortGuildStatistics> getParserForType() {
            return PARSER;
        }

        public boolean hasArmyFlag() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getArmyFlag() {
            return this.armyFlag_;
        }

        public boolean hasMumber() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public int getMumber() {
            return this.mumber_;
        }

        public boolean hasDefenseSoul() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public int getDefenseSoul() {
            return this.defenseSoul_;
        }

        public boolean hasAttackSoul() {
            return ((this.bitField0_ & 0x8) == 8);
        }

        public int getAttackSoul() {
            return this.attackSoul_;
        }

        public boolean hasKill() {
            return ((this.bitField0_ & 0x10) == 16);
        }

        public int getKill() {
            return this.kill_;
        }

        public boolean hasDefense() {
            return ((this.bitField0_ & 0x20) == 32);
        }

        public int getDefense() {
            return this.defense_;
        }

        public boolean hasAttack() {
            return ((this.bitField0_ & 0x40) == 64);
        }

        public int getAttack() {
            return this.attack_;
        }

        public boolean hasScore() {
            return ((this.bitField0_ & 0x80) == 128);
        }

        public int getScore() {
            return this.score_;
        }

        private void initFields() {
            this.armyFlag_ = 0;
            this.mumber_ = 0;
            this.defenseSoul_ = 0;
            this.attackSoul_ = 0;
            this.kill_ = 0;
            this.defense_ = 0;
            this.attack_ = 0;
            this.score_ = 0;
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasArmyFlag()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasMumber()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDefenseSoul()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAttackSoul()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasKill()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasDefense()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasAttack()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (!hasScore()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.armyFlag_);
            if ((this.bitField0_ & 0x2) == 2) output.writeInt32(2, this.mumber_);
            if ((this.bitField0_ & 0x4) == 4) output.writeInt32(3, this.defenseSoul_);
            if ((this.bitField0_ & 0x8) == 8) output.writeInt32(4, this.attackSoul_);
            if ((this.bitField0_ & 0x10) == 16) output.writeInt32(5, this.kill_);
            if ((this.bitField0_ & 0x20) == 32) output.writeInt32(6, this.defense_);
            if ((this.bitField0_ & 0x40) == 64) output.writeInt32(7, this.attack_);
            if ((this.bitField0_ & 0x80) == 128) output.writeInt32(8, this.score_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.armyFlag_);
            if ((this.bitField0_ & 0x2) == 2) size += CodedOutputStream.computeInt32Size(2, this.mumber_);
            if ((this.bitField0_ & 0x4) == 4) size += CodedOutputStream.computeInt32Size(3, this.defenseSoul_);
            if ((this.bitField0_ & 0x8) == 8) size += CodedOutputStream.computeInt32Size(4, this.attackSoul_);
            if ((this.bitField0_ & 0x10) == 16) size += CodedOutputStream.computeInt32Size(5, this.kill_);
            if ((this.bitField0_ & 0x20) == 32) size += CodedOutputStream.computeInt32Size(6, this.defense_);
            if ((this.bitField0_ & 0x40) == 64) size += CodedOutputStream.computeInt32Size(7, this.attack_);
            if ((this.bitField0_ & 0x80) == 128) size += CodedOutputStream.computeInt32Size(8, this.score_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static FortGuildStatistics parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (FortGuildStatistics) PARSER.parseFrom(data);
        }

        public static FortGuildStatistics parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FortGuildStatistics) PARSER.parseFrom(data, extensionRegistry);
        }

        public static FortGuildStatistics parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (FortGuildStatistics) PARSER.parseFrom(data);
        }

        public static FortGuildStatistics parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FortGuildStatistics) PARSER.parseFrom(data, extensionRegistry);
        }

        public static FortGuildStatistics parseFrom(InputStream input) throws IOException {
            return (FortGuildStatistics) PARSER.parseFrom(input);
        }

        public static FortGuildStatistics parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FortGuildStatistics) PARSER.parseFrom(input, extensionRegistry);
        }

        public static FortGuildStatistics parseDelimitedFrom(InputStream input) throws IOException {
            return (FortGuildStatistics) PARSER.parseDelimitedFrom(input);
        }

        public static FortGuildStatistics parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FortGuildStatistics) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static FortGuildStatistics parseFrom(CodedInputStream input) throws IOException {
            return (FortGuildStatistics) PARSER.parseFrom(input);
        }

        public static FortGuildStatistics parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FortGuildStatistics) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(FortGuildStatistics prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.FortGuildStatisticsOrBuilder {
            private int bitField0_;
            private int armyFlag_;
            private int mumber_;
            private int defenseSoul_;
            private int attackSoul_;
            private int kill_;
            private int defense_;
            private int attack_;
            private int score_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_FortGuildStatistics_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_FortGuildStatistics_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.FortGuildStatistics.class, Builder.class);
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.FortGuildStatistics.alwaysUseFieldBuilders) ;
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.armyFlag_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                this.mumber_ = 0;
                this.bitField0_ &= 0xFFFFFFFD;
                this.defenseSoul_ = 0;
                this.bitField0_ &= 0xFFFFFFFB;
                this.attackSoul_ = 0;
                this.bitField0_ &= 0xFFFFFFF7;
                this.kill_ = 0;
                this.bitField0_ &= 0xFFFFFFEF;
                this.defense_ = 0;
                this.bitField0_ &= 0xFFFFFFDF;
                this.attack_ = 0;
                this.bitField0_ &= 0xFFFFFFBF;
                this.score_ = 0;
                this.bitField0_ &= 0xFFFFFF7F;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_FortGuildStatistics_descriptor;
            }

            public GuildFortHandler.FortGuildStatistics getDefaultInstanceForType() {
                return GuildFortHandler.FortGuildStatistics.getDefaultInstance();
            }

            public GuildFortHandler.FortGuildStatistics build() {
                GuildFortHandler.FortGuildStatistics result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.FortGuildStatistics buildPartial() {
                GuildFortHandler.FortGuildStatistics result = new GuildFortHandler.FortGuildStatistics(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.armyFlag_ = this.armyFlag_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                result.mumber_ = this.mumber_;
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                result.defenseSoul_ = this.defenseSoul_;
                if ((from_bitField0_ & 0x8) == 8) to_bitField0_ |= 0x8;
                result.attackSoul_ = this.attackSoul_;
                if ((from_bitField0_ & 0x10) == 16) to_bitField0_ |= 0x10;
                result.kill_ = this.kill_;
                if ((from_bitField0_ & 0x20) == 32) to_bitField0_ |= 0x20;
                result.defense_ = this.defense_;
                if ((from_bitField0_ & 0x40) == 64) to_bitField0_ |= 0x40;
                result.attack_ = this.attack_;
                if ((from_bitField0_ & 0x80) == 128) to_bitField0_ |= 0x80;
                result.score_ = this.score_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.FortGuildStatistics)
                    return mergeFrom((GuildFortHandler.FortGuildStatistics) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.FortGuildStatistics other) {
                if (other == GuildFortHandler.FortGuildStatistics.getDefaultInstance()) return this;
                if (other.hasArmyFlag()) setArmyFlag(other.getArmyFlag());
                if (other.hasMumber()) setMumber(other.getMumber());
                if (other.hasDefenseSoul()) setDefenseSoul(other.getDefenseSoul());
                if (other.hasAttackSoul()) setAttackSoul(other.getAttackSoul());
                if (other.hasKill()) setKill(other.getKill());
                if (other.hasDefense()) setDefense(other.getDefense());
                if (other.hasAttack()) setAttack(other.getAttack());
                if (other.hasScore()) setScore(other.getScore());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasArmyFlag()) return false;
                if (!hasMumber()) return false;
                if (!hasDefenseSoul()) return false;
                if (!hasAttackSoul()) return false;
                if (!hasKill()) return false;
                if (!hasDefense()) return false;
                if (!hasAttack()) return false;
                if (!hasScore()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.FortGuildStatistics parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.FortGuildStatistics) GuildFortHandler.FortGuildStatistics.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.FortGuildStatistics) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasArmyFlag() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getArmyFlag() {
                return this.armyFlag_;
            }

            public Builder setArmyFlag(int value) {
                this.bitField0_ |= 0x1;
                this.armyFlag_ = value;
                onChanged();
                return this;
            }

            public Builder clearArmyFlag() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.armyFlag_ = 0;
                onChanged();
                return this;
            }

            public boolean hasMumber() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public int getMumber() {
                return this.mumber_;
            }

            public Builder setMumber(int value) {
                this.bitField0_ |= 0x2;
                this.mumber_ = value;
                onChanged();
                return this;
            }

            public Builder clearMumber() {
                this.bitField0_ &= 0xFFFFFFFD;
                this.mumber_ = 0;
                onChanged();
                return this;
            }

            public boolean hasDefenseSoul() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public int getDefenseSoul() {
                return this.defenseSoul_;
            }

            public Builder setDefenseSoul(int value) {
                this.bitField0_ |= 0x4;
                this.defenseSoul_ = value;
                onChanged();
                return this;
            }

            public Builder clearDefenseSoul() {
                this.bitField0_ &= 0xFFFFFFFB;
                this.defenseSoul_ = 0;
                onChanged();
                return this;
            }

            public boolean hasAttackSoul() {
                return ((this.bitField0_ & 0x8) == 8);
            }

            public int getAttackSoul() {
                return this.attackSoul_;
            }

            public Builder setAttackSoul(int value) {
                this.bitField0_ |= 0x8;
                this.attackSoul_ = value;
                onChanged();
                return this;
            }

            public Builder clearAttackSoul() {
                this.bitField0_ &= 0xFFFFFFF7;
                this.attackSoul_ = 0;
                onChanged();
                return this;
            }

            public boolean hasKill() {
                return ((this.bitField0_ & 0x10) == 16);
            }

            public int getKill() {
                return this.kill_;
            }

            public Builder setKill(int value) {
                this.bitField0_ |= 0x10;
                this.kill_ = value;
                onChanged();
                return this;
            }

            public Builder clearKill() {
                this.bitField0_ &= 0xFFFFFFEF;
                this.kill_ = 0;
                onChanged();
                return this;
            }

            public boolean hasDefense() {
                return ((this.bitField0_ & 0x20) == 32);
            }

            public int getDefense() {
                return this.defense_;
            }

            public Builder setDefense(int value) {
                this.bitField0_ |= 0x20;
                this.defense_ = value;
                onChanged();
                return this;
            }

            public Builder clearDefense() {
                this.bitField0_ &= 0xFFFFFFDF;
                this.defense_ = 0;
                onChanged();
                return this;
            }

            public boolean hasAttack() {
                return ((this.bitField0_ & 0x40) == 64);
            }

            public int getAttack() {
                return this.attack_;
            }

            public Builder setAttack(int value) {
                this.bitField0_ |= 0x40;
                this.attack_ = value;
                onChanged();
                return this;
            }

            public Builder clearAttack() {
                this.bitField0_ &= 0xFFFFFFBF;
                this.attack_ = 0;
                onChanged();
                return this;
            }

            public boolean hasScore() {
                return ((this.bitField0_ & 0x80) == 128);
            }

            public int getScore() {
                return this.score_;
            }

            public Builder setScore(int value) {
                this.bitField0_ |= 0x80;
                this.score_ = value;
                onChanged();
                return this;
            }

            public Builder clearScore() {
                this.bitField0_ &= 0xFFFFFF7F;
                this.score_ = 0;
                onChanged();
                return this;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static final class OnGuildFortPush
            extends GeneratedMessage
            implements OnGuildFortPushOrBuilder {
        private static final OnGuildFortPush defaultInstance = new OnGuildFortPush(true);
        private final UnknownFieldSet unknownFields;

        private OnGuildFortPush(GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = builder.getUnknownFields();
        }

        private OnGuildFortPush(boolean noInit) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = UnknownFieldSet.getDefaultInstance();
        }

        public static OnGuildFortPush getDefaultInstance() {
            return defaultInstance;
        }

        public OnGuildFortPush getDefaultInstanceForType() {
            return defaultInstance;
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private OnGuildFortPush(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            initFields();
            int mutable_bitField0_ = 0;
            UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    GuildFortHandler.FortGuildStatistics.Builder subBuilder;
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 8:
                            this.bitField0_ |= 0x1;
                            this.s2CCode_ = input.readInt32();
                            break;
                        case 18:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x2) == 2) subBuilder = this.ownGuild_.toBuilder();
                            this.ownGuild_ = (GuildFortHandler.FortGuildStatistics) input.readMessage(GuildFortHandler.FortGuildStatistics.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.ownGuild_);
                                this.ownGuild_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x2;
                            break;
                        case 26:
                            subBuilder = null;
                            if ((this.bitField0_ & 0x4) == 4) subBuilder = this.enemyGuild_.toBuilder();
                            this.enemyGuild_ = (GuildFortHandler.FortGuildStatistics) input.readMessage(GuildFortHandler.FortGuildStatistics.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.enemyGuild_);
                                this.enemyGuild_ = subBuilder.buildPartial();
                            }
                            this.bitField0_ |= 0x4;
                            break;
                    }
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e) {
                throw (new InvalidProtocolBufferException(e.getMessage())).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GuildFortHandler.internal_static_pomelo_area_OnGuildFortPush_descriptor;
        }

        protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return GuildFortHandler.internal_static_pomelo_area_OnGuildFortPush_fieldAccessorTable.ensureFieldAccessorsInitialized(OnGuildFortPush.class, Builder.class);
        }

        public static Parser<OnGuildFortPush> PARSER = (Parser<OnGuildFortPush>) new AbstractParser<OnGuildFortPush>() {
            public GuildFortHandler.OnGuildFortPush parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new GuildFortHandler.OnGuildFortPush(input, extensionRegistry);
            }
        };
        private int bitField0_;
        public static final int S2C_CODE_FIELD_NUMBER = 1;
        private int s2CCode_;
        public static final int OWNGUILD_FIELD_NUMBER = 2;
        private GuildFortHandler.FortGuildStatistics ownGuild_;
        public static final int ENEMYGUILD_FIELD_NUMBER = 3;
        private GuildFortHandler.FortGuildStatistics enemyGuild_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private static final long serialVersionUID = 0L;

        public Parser<OnGuildFortPush> getParserForType() {
            return PARSER;
        }

        public boolean hasS2CCode() {
            return ((this.bitField0_ & 0x1) == 1);
        }

        public int getS2CCode() {
            return this.s2CCode_;
        }

        public boolean hasOwnGuild() {
            return ((this.bitField0_ & 0x2) == 2);
        }

        public GuildFortHandler.FortGuildStatistics getOwnGuild() {
            return this.ownGuild_;
        }

        public GuildFortHandler.FortGuildStatisticsOrBuilder getOwnGuildOrBuilder() {
            return this.ownGuild_;
        }

        public boolean hasEnemyGuild() {
            return ((this.bitField0_ & 0x4) == 4);
        }

        public GuildFortHandler.FortGuildStatistics getEnemyGuild() {
            return this.enemyGuild_;
        }

        public GuildFortHandler.FortGuildStatisticsOrBuilder getEnemyGuildOrBuilder() {
            return this.enemyGuild_;
        }

        private void initFields() {
            this.s2CCode_ = 0;
            this.ownGuild_ = GuildFortHandler.FortGuildStatistics.getDefaultInstance();
            this.enemyGuild_ = GuildFortHandler.FortGuildStatistics.getDefaultInstance();
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;
            if (!hasS2CCode()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasOwnGuild() && !getOwnGuild().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            if (hasEnemyGuild() && !getEnemyGuild().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 0x1) == 1) output.writeInt32(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2) output.writeMessage(2, (MessageLite) this.ownGuild_);
            if ((this.bitField0_ & 0x4) == 4) output.writeMessage(3, (MessageLite) this.enemyGuild_);
            getUnknownFields().writeTo(output);
        }

        public int getSerializedSize() {
            int size = this.memoizedSerializedSize;
            if (size != -1) return size;
            size = 0;
            if ((this.bitField0_ & 0x1) == 1) size += CodedOutputStream.computeInt32Size(1, this.s2CCode_);
            if ((this.bitField0_ & 0x2) == 2)
                size += CodedOutputStream.computeMessageSize(2, (MessageLite) this.ownGuild_);
            if ((this.bitField0_ & 0x4) == 4)
                size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.enemyGuild_);
            size += getUnknownFields().getSerializedSize();
            this.memoizedSerializedSize = size;
            return size;
        }

        protected Object writeReplace() throws ObjectStreamException {
            return super.writeReplace();
        }

        public static OnGuildFortPush parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OnGuildFortPush) PARSER.parseFrom(data);
        }

        public static OnGuildFortPush parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OnGuildFortPush) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OnGuildFortPush parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OnGuildFortPush) PARSER.parseFrom(data);
        }

        public static OnGuildFortPush parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OnGuildFortPush) PARSER.parseFrom(data, extensionRegistry);
        }

        public static OnGuildFortPush parseFrom(InputStream input) throws IOException {
            return (OnGuildFortPush) PARSER.parseFrom(input);
        }

        public static OnGuildFortPush parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnGuildFortPush) PARSER.parseFrom(input, extensionRegistry);
        }

        public static OnGuildFortPush parseDelimitedFrom(InputStream input) throws IOException {
            return (OnGuildFortPush) PARSER.parseDelimitedFrom(input);
        }

        public static OnGuildFortPush parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnGuildFortPush) PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static OnGuildFortPush parseFrom(CodedInputStream input) throws IOException {
            return (OnGuildFortPush) PARSER.parseFrom(input);
        }

        public static OnGuildFortPush parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OnGuildFortPush) PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(OnGuildFortPush prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        public static final class Builder extends GeneratedMessage.Builder<Builder> implements GuildFortHandler.OnGuildFortPushOrBuilder {
            private int bitField0_;
            private int s2CCode_;
            private GuildFortHandler.FortGuildStatistics ownGuild_;
            private SingleFieldBuilder<GuildFortHandler.FortGuildStatistics, GuildFortHandler.FortGuildStatistics.Builder, GuildFortHandler.FortGuildStatisticsOrBuilder> ownGuildBuilder_;
            private GuildFortHandler.FortGuildStatistics enemyGuild_;
            private SingleFieldBuilder<GuildFortHandler.FortGuildStatistics, GuildFortHandler.FortGuildStatistics.Builder, GuildFortHandler.FortGuildStatisticsOrBuilder> enemyGuildBuilder_;

            public static final Descriptors.Descriptor getDescriptor() {
                return GuildFortHandler.internal_static_pomelo_area_OnGuildFortPush_descriptor;
            }

            protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return GuildFortHandler.internal_static_pomelo_area_OnGuildFortPush_fieldAccessorTable.ensureFieldAccessorsInitialized(GuildFortHandler.OnGuildFortPush.class, Builder.class);
            }

            private Builder() {
                this.ownGuild_ = GuildFortHandler.FortGuildStatistics.getDefaultInstance();
                this.enemyGuild_ = GuildFortHandler.FortGuildStatistics.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessage.BuilderParent parent) {
                super(parent);
                this.ownGuild_ = GuildFortHandler.FortGuildStatistics.getDefaultInstance();
                this.enemyGuild_ = GuildFortHandler.FortGuildStatistics.getDefaultInstance();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GuildFortHandler.OnGuildFortPush.alwaysUseFieldBuilders) {
                    getOwnGuildFieldBuilder();
                    getEnemyGuildFieldBuilder();
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                this.s2CCode_ = 0;
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.ownGuildBuilder_ == null) {
                    this.ownGuild_ = GuildFortHandler.FortGuildStatistics.getDefaultInstance();
                } else {
                    this.ownGuildBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFD;
                if (this.enemyGuildBuilder_ == null) {
                    this.enemyGuild_ = GuildFortHandler.FortGuildStatistics.getDefaultInstance();
                } else {
                    this.enemyGuildBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return GuildFortHandler.internal_static_pomelo_area_OnGuildFortPush_descriptor;
            }

            public GuildFortHandler.OnGuildFortPush getDefaultInstanceForType() {
                return GuildFortHandler.OnGuildFortPush.getDefaultInstance();
            }

            public GuildFortHandler.OnGuildFortPush build() {
                GuildFortHandler.OnGuildFortPush result = buildPartial();
                if (!result.isInitialized()) throw newUninitializedMessageException(result);
                return result;
            }

            public GuildFortHandler.OnGuildFortPush buildPartial() {
                GuildFortHandler.OnGuildFortPush result = new GuildFortHandler.OnGuildFortPush(this);
                int from_bitField0_ = this.bitField0_;
                int to_bitField0_ = 0;
                if ((from_bitField0_ & 0x1) == 1) to_bitField0_ |= 0x1;
                result.s2CCode_ = this.s2CCode_;
                if ((from_bitField0_ & 0x2) == 2) to_bitField0_ |= 0x2;
                if (this.ownGuildBuilder_ == null) {
                    result.ownGuild_ = this.ownGuild_;
                } else {
                    result.ownGuild_ = (GuildFortHandler.FortGuildStatistics) this.ownGuildBuilder_.build();
                }
                if ((from_bitField0_ & 0x4) == 4) to_bitField0_ |= 0x4;
                if (this.enemyGuildBuilder_ == null) {
                    result.enemyGuild_ = this.enemyGuild_;
                } else {
                    result.enemyGuild_ = (GuildFortHandler.FortGuildStatistics) this.enemyGuildBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(Message other) {
                if (other instanceof GuildFortHandler.OnGuildFortPush)
                    return mergeFrom((GuildFortHandler.OnGuildFortPush) other);
                super.mergeFrom(other);
                return this;
            }

            public Builder mergeFrom(GuildFortHandler.OnGuildFortPush other) {
                if (other == GuildFortHandler.OnGuildFortPush.getDefaultInstance()) return this;
                if (other.hasS2CCode()) setS2CCode(other.getS2CCode());
                if (other.hasOwnGuild()) mergeOwnGuild(other.getOwnGuild());
                if (other.hasEnemyGuild()) mergeEnemyGuild(other.getEnemyGuild());
                mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                if (!hasS2CCode()) return false;
                if (hasOwnGuild() && !getOwnGuild().isInitialized()) return false;
                if (hasEnemyGuild() && !getEnemyGuild().isInitialized()) return false;
                return true;
            }

            public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                GuildFortHandler.OnGuildFortPush parsedMessage = null;
                try {
                    parsedMessage = (GuildFortHandler.OnGuildFortPush) GuildFortHandler.OnGuildFortPush.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GuildFortHandler.OnGuildFortPush) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) mergeFrom(parsedMessage);
                }
                return this;
            }

            public boolean hasS2CCode() {
                return ((this.bitField0_ & 0x1) == 1);
            }

            public int getS2CCode() {
                return this.s2CCode_;
            }

            public Builder setS2CCode(int value) {
                this.bitField0_ |= 0x1;
                this.s2CCode_ = value;
                onChanged();
                return this;
            }

            public Builder clearS2CCode() {
                this.bitField0_ &= 0xFFFFFFFE;
                this.s2CCode_ = 0;
                onChanged();
                return this;
            }

            public boolean hasOwnGuild() {
                return ((this.bitField0_ & 0x2) == 2);
            }

            public GuildFortHandler.FortGuildStatistics getOwnGuild() {
                if (this.ownGuildBuilder_ == null) return this.ownGuild_;
                return (GuildFortHandler.FortGuildStatistics) this.ownGuildBuilder_.getMessage();
            }

            public Builder setOwnGuild(GuildFortHandler.FortGuildStatistics value) {
                if (this.ownGuildBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.ownGuild_ = value;
                    onChanged();
                } else {
                    this.ownGuildBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x2;
                return this;
            }

            public Builder setOwnGuild(GuildFortHandler.FortGuildStatistics.Builder builderForValue) {
                if (this.ownGuildBuilder_ == null) {
                    this.ownGuild_ = builderForValue.build();
                    onChanged();
                } else {
                    this.ownGuildBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x2;
                return this;
            }

            public Builder mergeOwnGuild(GuildFortHandler.FortGuildStatistics value) {
                if (this.ownGuildBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) == 2 && this.ownGuild_ != GuildFortHandler.FortGuildStatistics.getDefaultInstance()) {
                        this.ownGuild_ = GuildFortHandler.FortGuildStatistics.newBuilder(this.ownGuild_).mergeFrom(value).buildPartial();
                    } else {
                        this.ownGuild_ = value;
                    }
                    onChanged();
                } else {
                    this.ownGuildBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x2;
                return this;
            }

            public Builder clearOwnGuild() {
                if (this.ownGuildBuilder_ == null) {
                    this.ownGuild_ = GuildFortHandler.FortGuildStatistics.getDefaultInstance();
                    onChanged();
                } else {
                    this.ownGuildBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFD;
                return this;
            }

            public GuildFortHandler.FortGuildStatistics.Builder getOwnGuildBuilder() {
                this.bitField0_ |= 0x2;
                onChanged();
                return (GuildFortHandler.FortGuildStatistics.Builder) getOwnGuildFieldBuilder().getBuilder();
            }

            public GuildFortHandler.FortGuildStatisticsOrBuilder getOwnGuildOrBuilder() {
                if (this.ownGuildBuilder_ != null)
                    return (GuildFortHandler.FortGuildStatisticsOrBuilder) this.ownGuildBuilder_.getMessageOrBuilder();
                return this.ownGuild_;
            }

            private SingleFieldBuilder<GuildFortHandler.FortGuildStatistics, GuildFortHandler.FortGuildStatistics.Builder, GuildFortHandler.FortGuildStatisticsOrBuilder> getOwnGuildFieldBuilder() {
                if (this.ownGuildBuilder_ == null) {
                    this.ownGuildBuilder_ = new SingleFieldBuilder(getOwnGuild(), getParentForChildren(), isClean());
                    this.ownGuild_ = null;
                }
                return this.ownGuildBuilder_;
            }

            public boolean hasEnemyGuild() {
                return ((this.bitField0_ & 0x4) == 4);
            }

            public GuildFortHandler.FortGuildStatistics getEnemyGuild() {
                if (this.enemyGuildBuilder_ == null) return this.enemyGuild_;
                return (GuildFortHandler.FortGuildStatistics) this.enemyGuildBuilder_.getMessage();
            }

            public Builder setEnemyGuild(GuildFortHandler.FortGuildStatistics value) {
                if (this.enemyGuildBuilder_ == null) {
                    if (value == null) throw new NullPointerException();
                    this.enemyGuild_ = value;
                    onChanged();
                } else {
                    this.enemyGuildBuilder_.setMessage(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder setEnemyGuild(GuildFortHandler.FortGuildStatistics.Builder builderForValue) {
                if (this.enemyGuildBuilder_ == null) {
                    this.enemyGuild_ = builderForValue.build();
                    onChanged();
                } else {
                    this.enemyGuildBuilder_.setMessage(builderForValue.build());
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder mergeEnemyGuild(GuildFortHandler.FortGuildStatistics value) {
                if (this.enemyGuildBuilder_ == null) {
                    if ((this.bitField0_ & 0x4) == 4 && this.enemyGuild_ != GuildFortHandler.FortGuildStatistics.getDefaultInstance()) {
                        this.enemyGuild_ = GuildFortHandler.FortGuildStatistics.newBuilder(this.enemyGuild_).mergeFrom(value).buildPartial();
                    } else {
                        this.enemyGuild_ = value;
                    }
                    onChanged();
                } else {
                    this.enemyGuildBuilder_.mergeFrom(value);
                }
                this.bitField0_ |= 0x4;
                return this;
            }

            public Builder clearEnemyGuild() {
                if (this.enemyGuildBuilder_ == null) {
                    this.enemyGuild_ = GuildFortHandler.FortGuildStatistics.getDefaultInstance();
                    onChanged();
                } else {
                    this.enemyGuildBuilder_.clear();
                }
                this.bitField0_ &= 0xFFFFFFFB;
                return this;
            }

            public GuildFortHandler.FortGuildStatistics.Builder getEnemyGuildBuilder() {
                this.bitField0_ |= 0x4;
                onChanged();
                return (GuildFortHandler.FortGuildStatistics.Builder) getEnemyGuildFieldBuilder().getBuilder();
            }

            public GuildFortHandler.FortGuildStatisticsOrBuilder getEnemyGuildOrBuilder() {
                if (this.enemyGuildBuilder_ != null)
                    return (GuildFortHandler.FortGuildStatisticsOrBuilder) this.enemyGuildBuilder_.getMessageOrBuilder();
                return this.enemyGuild_;
            }

            private SingleFieldBuilder<GuildFortHandler.FortGuildStatistics, GuildFortHandler.FortGuildStatistics.Builder, GuildFortHandler.FortGuildStatisticsOrBuilder> getEnemyGuildFieldBuilder() {
                if (this.enemyGuildBuilder_ == null) {
                    this.enemyGuildBuilder_ = new SingleFieldBuilder(getEnemyGuild(), getParentForChildren(), isClean());
                    this.enemyGuild_ = null;
                }
                return this.enemyGuildBuilder_;
            }
        }

        static {
            defaultInstance.initFields();
        }

    }


    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }


    static {
        String[] descriptorData = {"\n\026guildFortHandler.proto\022\013pomelo.area\032\fcommon.proto\032\nitem.proto\"|\n\rGuildAreaInfo\022\016\n\006areaId\030\001 \002(\005\022\017\n\007applied\030\002 \002(\005\022\017\n\007guildId\030\003 \002(\t\022\021\n\tguildName\030\004 \002(\t\022\022\n\nguildName1\030\005 \002(\t\022\022\n\nguildName2\030\006 \002(\t\"\031\n\027GetGuildAreaListRequest\"~\n\030GetGuildAreaListResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\022\021\n\tcurStatus\030\003 \002(\005\022,\n\bareaList\030\004 \003(\0132\032.pomelo.area.GuildAreaInfo\"Ð\002\n\017GuildAreaDetail\022\017\n\007guildId\030\001 \002(\t\022\021\n\tguildName\030\002 \001(\t", "\022\022\n\nguildLevel\030\003 \001(\005\022\025\n\rguildLeaderId\030\004 \001(\t\022\027\n\017guildLeaderName\030\005 \001(\t\022\030\n\020guildNumberCount\030\006 \001(\005\022\035\n\025guildNumberTotalCount\030\007 \001(\005\022.\n\017winnerAwardList\030\b \003(\0132\025.pomelo.item.MiniItem\022-\n\016dailyAwardList\030\t \003(\0132\025.pomelo.item.MiniItem\022\026\n\016dailyAwardFlag\030\n \002(\005\022\022\n\nareaStatus\030\013 \002(\005\022\021\n\tcountDown\030\f \001(\005\"+\n\031GetGuildAreaDetailRequest\022\016\n\006areaId\030\001 \002(\005\"q\n\032GetGuildAreaDetailResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\0220\n\nare", "aDetail\030\003 \002(\0132\034.pomelo.area.GuildAreaDetail\"í\001\n\022GuildAreaApplyInfo\022\021\n\tguildIcon\030\001 \002(\t\022\017\n\007guildId\030\002 \002(\t\022\021\n\tguildName\030\003 \002(\t\022\022\n\nguildLevel\030\004 \002(\005\022\025\n\rguildLeaderId\030\005 \002(\t\022\027\n\017guildLeaderName\030\006 \002(\t\022\030\n\020guildNumberCount\030\007 \002(\005\022\035\n\025guildNumberTotalCount\030\b \001(\005\022\021\n\tapplyFund\030\t \001(\005\022\020\n\bisWinner\030\n \001(\b\".\n\034GetGuildAreaApplyListRequest\022\016\n\006areaId\030\001 \002(\005\"\001\n\035GetGuildAreaApplyListResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t", "\0222\n\tapplyList\030\003 \003(\0132\037.pomelo.area.GuildAreaApplyInfo\022\021\n\tcountDown\030\004 \001(\005\"\027\n\025ApplyGuildFundRequest\"N\n\026ApplyGuildFundResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\022\021\n\tguildFund\030\003 \002(\005\"5\n\020ApplyFundRequest\022\016\n\006areaId\030\001 \002(\005\022\021\n\tapplyFund\030\002 \002(\005\"6\n\021ApplyFundResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"(\n\026ApplyCancelFundRequest\022\016\n\006areaId\030\001 \002(\005\"<\n\027ApplyCancelFundResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"m\n\tAreaA", "ward\022\016\n\006areaId\030\001 \002(\005\022\021\n\tguildName\030\002 \002(\t\022\016\n\006status\030\003 \002(\005\022-\n\016dailyAwardList\030\004 \003(\0132\025.pomelo.item.MiniItem\"\034\n\032ApplyDailyAwardListRequest\"^\n\033ApplyDailyAwardListResponse\022\020\n\bs2c_code\030\001 \002(\005\022-\n\rareaAwardList\030\002 \003(\0132\026.pomelo.area.AreaAward\"(\n\026ApplyDailyAwardRequest\022\016\n\006areaId\030\001 \002(\005\"<\n\027ApplyDailyAwardResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"$\n\022ApplyAccessRequest\022\016\n\006areaId\030\001 \002(\005\"8\n\023ApplyAccessResponse\022\020\n\bs2c", "_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\"ã\001\n\rFortGuildInfo\022\021\n\tguildIcon\030\001 \001(\t\022\017\n\007guildId\030\002 \002(\t\022\021\n\tguildName\030\003 \001(\t\022\022\n\nguildLevel\030\004 \001(\005\022\020\n\barmyFlag\030\005 \002(\005\022\016\n\006mumber\030\006 \002(\005\022\023\n\013defenseSoul\030\007 \002(\005\022\022\n\nattackSoul\030\b \002(\005\022\f\n\004kill\030\t \002(\005\022\017\n\007defense\030\n \002(\005\022\016\n\006attack\030\013 \002(\005\022\r\n\005score\030\f \002(\005\"\033\n\031ApplyFortGuildInfoRequest\"\001\n\032ApplyFortGuildInfoResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\022,\n\bownGuild\030\003 \001(\0132\032.pomelo.area.FortGuildInfo\022", ".\n\nenemyGuild\030\004 \001(\0132\032.pomelo.area.FortGuildInfo\"\001\n\016ReportListInfo\022\016\n\006areaId\030\001 \002(\005\022\030\n\020defenseGuildName\030\002 \001(\t\022\030\n\020defenseGuildIcon\030\003 \001(\t\022\027\n\017attackGuildName\030\004 \001(\t\022\027\n\017attackGuildIcon\030\005 \001(\t\022\016\n\006result\030\006 \002(\005\"O\n\nReportList\022\f\n\004date\030\001 \002(\t\0223\n\016reportListInfo\030\002 \003(\0132\033.pomelo.area.ReportListInfo\"\033\n\031ApplyAllReportListRequest\"l\n\032ApplyAllReportListResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\022+\n\nreportList\030\003 \003(\0132\027.po", "melo.area.ReportList\"\002\n\021ReportGuildDetail\022\021\n\tguildIcon\030\001 \001(\t\022\017\n\007guildId\030\002 \002(\t\022\021\n\tguildName\030\003 \001(\t\022\022\n\nguildLevel\030\004 \001(\005\022\020\n\bisWinner\030\005 \001(\005\022\017\n\007collect\030\006 \001(\005\022\017\n\007defense\030\007 \001(\005\022\f\n\004soul\030\b \001(\005\022\016\n\006attack\030\t \001(\005\022\f\n\004kill\030\n \001(\005\022\021\n\tkillScore\030\013 \001(\005\022\023\n\013destroyFlag\030\f \001(\005\022\030\n\020destroyFlagScore\030\r \001(\005\022\022\n\ntotalScore\030\016 \001(\005\"\001\n\fReportDetail\022\016\n\006areaId\030\001 \002(\005\022/\n\007detail1\030\002 \001(\0132\036.pomelo.area.ReportGuildDetail\022/\n\007detail2\030\003 \001(\0132\036", ".pomelo.area.ReportGuildDetail\"8\n\030ApplyReportDetailRequest\022\f\n\004date\030\001 \002(\t\022\016\n\006areaId\030\002 \002(\005\"o\n\031ApplyReportDetailResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\022/\n\freportDetail\030\003 \002(\0132\031.pomelo.area.ReportDetail\"Á\001\n\026ReportStatisticsDetail\022\f\n\004name\030\001 \001(\t\022\r\n\005level\030\002 \001(\005\022\013\n\003job\030\003 \001(\005\022\f\n\004kill\030\004 \001(\005\022\023\n\013destroyFlag\030\005 \001(\005\022\016\n\006damage\030\006 \001(\003\022\f\n\004cure\030\007 \001(\003\022\024\n\fdefenseScore\030\b \001(\005\022\022\n\nattackSoul\030\t \001(\005\022\022\n\ntotalScore\030\n \001(\005\"M\n", "\034ApplyReportStatisticsRequest\022\f\n\004date\030\001 \002(\t\022\016\n\006areaId\030\002 \002(\005\022\017\n\007guildId\030\003 \002(\t\"\001\n\035ApplyReportStatisticsResponse\022\020\n\bs2c_code\030\001 \002(\005\022\017\n\007s2c_msg\030\002 \001(\t\022=\n\020statisticsDetail\030\003 \003(\0132#.pomelo.area.ReportStatisticsDetail\"\001\n\023FortGuildStatistics\022\020\n\barmyFlag\030\001 \002(\005\022\016\n\006mumber\030\002 \002(\005\022\023\n\013defenseSoul\030\003 \002(\005\022\022\n\nattackSoul\030\004 \002(\005\022\f\n\004kill\030\005 \002(\005\022\017\n\007defense\030\006 \002(\005\022\016\n\006attack\030\007 \002(\005\022\r\n\005score\030\b \002(\005\"\001\n\017OnGuildFortPush\022\020\n\bs2c_cod", "e\030\001 \002(\005\0222\n\bownGuild\030\002 \001(\0132 .pomelo.area.FortGuildStatistics\0224\n\nenemyGuild\030\003 \001(\0132 .pomelo.area.FortGuildStatistics2æ\n\n\020guildFortHandler\022f\n\027getGuildAreaListRequest\022$.pomelo.area.GetGuildAreaListRequest\032%.pomelo.area.GetGuildAreaListResponse\022l\n\031getGuildAreaDetailRequest\022&.pomelo.area.GetGuildAreaDetailRequest\032'.pomelo.area.GetGuildAreaDetailResponse\022u\n\034getGuildAreaApplyListRequest\022).pomelo.area.GetGu", "ildAreaApplyListRequest\032*.pomelo.area.GetGuildAreaApplyListResponse\022`\n\025applyGuildFundRequest\022\".pomelo.area.ApplyGuildFundRequest\032#.pomelo.area.ApplyGuildFundResponse\022Q\n\020applyFundRequest\022\035.pomelo.area.ApplyFundRequest\032\036.pomelo.area.ApplyFundResponse\022c\n\026applyCancelFundRequest\022#.pomelo.area.ApplyCancelFundRequest\032$.pomelo.area.ApplyCancelFundResponse\022o\n\032applyDailyAwardListRequest\022'.pomelo.area.ApplyD", "ailyAwardListRequest\032(.pomelo.area.ApplyDailyAwardListResponse\022c\n\026applyDailyAwardRequest\022#.pomelo.area.ApplyDailyAwardRequest\032$.pomelo.area.ApplyDailyAwardResponse\022W\n\022applyAccessRequest\022\037.pomelo.area.ApplyAccessRequest\032 .pomelo.area.ApplyAccessResponse\022l\n\031applyFortGuildInfoRequest\022&.pomelo.area.ApplyFortGuildInfoRequest\032'.pomelo.area.ApplyFortGuildInfoResponse\022l\n\031applyAllReportListRequest\022&.pomelo", ".area.ApplyAllReportListRequest\032'.pomelo.area.ApplyAllReportListResponse\022i\n\030applyReportDetailRequest\022%.pomelo.area.ApplyReportDetailRequest\032&.pomelo.area.ApplyReportDetailResponse\022u\n\034applyReportStatisticsRequest\022).pomelo.area.ApplyReportStatisticsRequest\032*.pomelo.area.ApplyReportStatisticsResponse2N\n\rguildFortPush\022=\n\017onGuildFortPush\022\034.pomelo.area.OnGuildFortPush\032\f.pomelo.Void"};


        Descriptors.FileDescriptor.InternalDescriptorAssigner assigner = new Descriptors.FileDescriptor.InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor root) {
                GuildFortHandler.descriptor = root;
                return null;
            }
        };

        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[]{

                Common.getDescriptor(),
                ItemOuterClass.getDescriptor()}, assigner);
    }

    private static final Descriptors.Descriptor internal_static_pomelo_area_GuildAreaInfo_descriptor = getDescriptor().getMessageTypes().get(0);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GuildAreaInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GuildAreaInfo_descriptor, new String[]{"AreaId", "Applied", "GuildId", "GuildName", "GuildName1", "GuildName2"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetGuildAreaListRequest_descriptor = getDescriptor().getMessageTypes().get(1);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetGuildAreaListRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetGuildAreaListRequest_descriptor, new String[0]);


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetGuildAreaListResponse_descriptor = getDescriptor().getMessageTypes().get(2);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetGuildAreaListResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetGuildAreaListResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "CurStatus", "AreaList"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GuildAreaDetail_descriptor = getDescriptor().getMessageTypes().get(3);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GuildAreaDetail_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GuildAreaDetail_descriptor, new String[]{"GuildId", "GuildName", "GuildLevel", "GuildLeaderId", "GuildLeaderName", "GuildNumberCount", "GuildNumberTotalCount", "WinnerAwardList", "DailyAwardList", "DailyAwardFlag", "AreaStatus", "CountDown"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetGuildAreaDetailRequest_descriptor = getDescriptor().getMessageTypes().get(4);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetGuildAreaDetailRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetGuildAreaDetailRequest_descriptor, new String[]{"AreaId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetGuildAreaDetailResponse_descriptor = getDescriptor().getMessageTypes().get(5);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetGuildAreaDetailResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetGuildAreaDetailResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "AreaDetail"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GuildAreaApplyInfo_descriptor = getDescriptor().getMessageTypes().get(6);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GuildAreaApplyInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GuildAreaApplyInfo_descriptor, new String[]{"GuildIcon", "GuildId", "GuildName", "GuildLevel", "GuildLeaderId", "GuildLeaderName", "GuildNumberCount", "GuildNumberTotalCount", "ApplyFund", "IsWinner"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetGuildAreaApplyListRequest_descriptor = getDescriptor().getMessageTypes().get(7);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetGuildAreaApplyListRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetGuildAreaApplyListRequest_descriptor, new String[]{"AreaId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_GetGuildAreaApplyListResponse_descriptor = getDescriptor().getMessageTypes().get(8);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_GetGuildAreaApplyListResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_GetGuildAreaApplyListResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "ApplyList", "CountDown"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyGuildFundRequest_descriptor = getDescriptor().getMessageTypes().get(9);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyGuildFundRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyGuildFundRequest_descriptor, new String[0]);


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyGuildFundResponse_descriptor = getDescriptor().getMessageTypes().get(10);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyGuildFundResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyGuildFundResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "GuildFund"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyFundRequest_descriptor = getDescriptor().getMessageTypes().get(11);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyFundRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyFundRequest_descriptor, new String[]{"AreaId", "ApplyFund"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyFundResponse_descriptor = getDescriptor().getMessageTypes().get(12);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyFundResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyFundResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyCancelFundRequest_descriptor = getDescriptor().getMessageTypes().get(13);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyCancelFundRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyCancelFundRequest_descriptor, new String[]{"AreaId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyCancelFundResponse_descriptor = getDescriptor().getMessageTypes().get(14);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyCancelFundResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyCancelFundResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_AreaAward_descriptor = getDescriptor().getMessageTypes().get(15);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_AreaAward_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_AreaAward_descriptor, new String[]{"AreaId", "GuildName", "Status", "DailyAwardList"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyDailyAwardListRequest_descriptor = getDescriptor().getMessageTypes().get(16);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyDailyAwardListRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyDailyAwardListRequest_descriptor, new String[0]);


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyDailyAwardListResponse_descriptor = getDescriptor().getMessageTypes().get(17);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyDailyAwardListResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyDailyAwardListResponse_descriptor, new String[]{"S2CCode", "AreaAwardList"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyDailyAwardRequest_descriptor = getDescriptor().getMessageTypes().get(18);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyDailyAwardRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyDailyAwardRequest_descriptor, new String[]{"AreaId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyDailyAwardResponse_descriptor = getDescriptor().getMessageTypes().get(19);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyDailyAwardResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyDailyAwardResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyAccessRequest_descriptor = getDescriptor().getMessageTypes().get(20);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyAccessRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyAccessRequest_descriptor, new String[]{"AreaId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyAccessResponse_descriptor = getDescriptor().getMessageTypes().get(21);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyAccessResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyAccessResponse_descriptor, new String[]{"S2CCode", "S2CMsg"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_FortGuildInfo_descriptor = getDescriptor().getMessageTypes().get(22);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_FortGuildInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_FortGuildInfo_descriptor, new String[]{"GuildIcon", "GuildId", "GuildName", "GuildLevel", "ArmyFlag", "Mumber", "DefenseSoul", "AttackSoul", "Kill", "Defense", "Attack", "Score"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyFortGuildInfoRequest_descriptor = getDescriptor().getMessageTypes().get(23);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyFortGuildInfoRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyFortGuildInfoRequest_descriptor, new String[0]);


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyFortGuildInfoResponse_descriptor = getDescriptor().getMessageTypes().get(24);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyFortGuildInfoResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyFortGuildInfoResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "OwnGuild", "EnemyGuild"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ReportListInfo_descriptor = getDescriptor().getMessageTypes().get(25);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ReportListInfo_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ReportListInfo_descriptor, new String[]{"AreaId", "DefenseGuildName", "DefenseGuildIcon", "AttackGuildName", "AttackGuildIcon", "Result"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ReportList_descriptor = getDescriptor().getMessageTypes().get(26);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ReportList_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ReportList_descriptor, new String[]{"Date", "ReportListInfo"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyAllReportListRequest_descriptor = getDescriptor().getMessageTypes().get(27);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyAllReportListRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyAllReportListRequest_descriptor, new String[0]);


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyAllReportListResponse_descriptor = getDescriptor().getMessageTypes().get(28);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyAllReportListResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyAllReportListResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "ReportList"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ReportGuildDetail_descriptor = getDescriptor().getMessageTypes().get(29);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ReportGuildDetail_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ReportGuildDetail_descriptor, new String[]{"GuildIcon", "GuildId", "GuildName", "GuildLevel", "IsWinner", "Collect", "Defense", "Soul", "Attack", "Kill", "KillScore", "DestroyFlag", "DestroyFlagScore", "TotalScore"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ReportDetail_descriptor = getDescriptor().getMessageTypes().get(30);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ReportDetail_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ReportDetail_descriptor, new String[]{"AreaId", "Detail1", "Detail2"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyReportDetailRequest_descriptor = getDescriptor().getMessageTypes().get(31);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyReportDetailRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyReportDetailRequest_descriptor, new String[]{"Date", "AreaId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyReportDetailResponse_descriptor = getDescriptor().getMessageTypes().get(32);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyReportDetailResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyReportDetailResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "ReportDetail"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ReportStatisticsDetail_descriptor = getDescriptor().getMessageTypes().get(33);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ReportStatisticsDetail_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ReportStatisticsDetail_descriptor, new String[]{"Name", "Level", "Job", "Kill", "DestroyFlag", "Damage", "Cure", "DefenseScore", "AttackSoul", "TotalScore"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyReportStatisticsRequest_descriptor = getDescriptor().getMessageTypes().get(34);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyReportStatisticsRequest_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyReportStatisticsRequest_descriptor, new String[]{"Date", "AreaId", "GuildId"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_ApplyReportStatisticsResponse_descriptor = getDescriptor().getMessageTypes().get(35);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_ApplyReportStatisticsResponse_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_ApplyReportStatisticsResponse_descriptor, new String[]{"S2CCode", "S2CMsg", "StatisticsDetail"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_FortGuildStatistics_descriptor = getDescriptor().getMessageTypes().get(36);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_FortGuildStatistics_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_FortGuildStatistics_descriptor, new String[]{"ArmyFlag", "Mumber", "DefenseSoul", "AttackSoul", "Kill", "Defense", "Attack", "Score"});


    private static final Descriptors.Descriptor internal_static_pomelo_area_OnGuildFortPush_descriptor = getDescriptor().getMessageTypes().get(37);
    private static GeneratedMessage.FieldAccessorTable internal_static_pomelo_area_OnGuildFortPush_fieldAccessorTable = new GeneratedMessage.FieldAccessorTable(internal_static_pomelo_area_OnGuildFortPush_descriptor, new String[]{"S2CCode", "OwnGuild", "EnemyGuild"});
    private static Descriptors.FileDescriptor descriptor;

    static {
        Common.getDescriptor();
        ItemOuterClass.getDescriptor();
    }

    public static interface OnGuildFortPushOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasOwnGuild();

        GuildFortHandler.FortGuildStatistics getOwnGuild();

        GuildFortHandler.FortGuildStatisticsOrBuilder getOwnGuildOrBuilder();

        boolean hasEnemyGuild();

        GuildFortHandler.FortGuildStatistics getEnemyGuild();

        GuildFortHandler.FortGuildStatisticsOrBuilder getEnemyGuildOrBuilder();
    }

    public static interface FortGuildStatisticsOrBuilder extends MessageOrBuilder {
        boolean hasArmyFlag();

        int getArmyFlag();

        boolean hasMumber();

        int getMumber();

        boolean hasDefenseSoul();

        int getDefenseSoul();

        boolean hasAttackSoul();

        int getAttackSoul();

        boolean hasKill();

        int getKill();

        boolean hasDefense();

        int getDefense();

        boolean hasAttack();

        int getAttack();

        boolean hasScore();

        int getScore();
    }

    public static interface ApplyReportStatisticsResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        List<GuildFortHandler.ReportStatisticsDetail> getStatisticsDetailList();

        GuildFortHandler.ReportStatisticsDetail getStatisticsDetail(int param1Int);

        int getStatisticsDetailCount();

        List<? extends GuildFortHandler.ReportStatisticsDetailOrBuilder> getStatisticsDetailOrBuilderList();

        GuildFortHandler.ReportStatisticsDetailOrBuilder getStatisticsDetailOrBuilder(int param1Int);
    }

    public static interface ApplyReportStatisticsRequestOrBuilder extends MessageOrBuilder {
        boolean hasDate();

        String getDate();

        ByteString getDateBytes();

        boolean hasAreaId();

        int getAreaId();

        boolean hasGuildId();

        String getGuildId();

        ByteString getGuildIdBytes();
    }

    public static interface ReportStatisticsDetailOrBuilder extends MessageOrBuilder {
        boolean hasName();

        String getName();

        ByteString getNameBytes();

        boolean hasLevel();

        int getLevel();

        boolean hasJob();

        int getJob();

        boolean hasKill();

        int getKill();

        boolean hasDestroyFlag();

        int getDestroyFlag();

        boolean hasDamage();

        long getDamage();

        boolean hasCure();

        long getCure();

        boolean hasDefenseScore();

        int getDefenseScore();

        boolean hasAttackSoul();

        int getAttackSoul();

        boolean hasTotalScore();

        int getTotalScore();
    }

    public static interface ApplyReportDetailResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasReportDetail();

        GuildFortHandler.ReportDetail getReportDetail();

        GuildFortHandler.ReportDetailOrBuilder getReportDetailOrBuilder();
    }

    public static interface ApplyReportDetailRequestOrBuilder extends MessageOrBuilder {
        boolean hasDate();

        String getDate();

        ByteString getDateBytes();

        boolean hasAreaId();

        int getAreaId();
    }

    public static interface ReportDetailOrBuilder extends MessageOrBuilder {
        boolean hasAreaId();

        int getAreaId();

        boolean hasDetail1();

        GuildFortHandler.ReportGuildDetail getDetail1();

        GuildFortHandler.ReportGuildDetailOrBuilder getDetail1OrBuilder();

        boolean hasDetail2();

        GuildFortHandler.ReportGuildDetail getDetail2();

        GuildFortHandler.ReportGuildDetailOrBuilder getDetail2OrBuilder();
    }

    public static interface ReportGuildDetailOrBuilder extends MessageOrBuilder {
        boolean hasGuildIcon();

        String getGuildIcon();

        ByteString getGuildIconBytes();

        boolean hasGuildId();

        String getGuildId();

        ByteString getGuildIdBytes();

        boolean hasGuildName();

        String getGuildName();

        ByteString getGuildNameBytes();

        boolean hasGuildLevel();

        int getGuildLevel();

        boolean hasIsWinner();

        int getIsWinner();

        boolean hasCollect();

        int getCollect();

        boolean hasDefense();

        int getDefense();

        boolean hasSoul();

        int getSoul();

        boolean hasAttack();

        int getAttack();

        boolean hasKill();

        int getKill();

        boolean hasKillScore();

        int getKillScore();

        boolean hasDestroyFlag();

        int getDestroyFlag();

        boolean hasDestroyFlagScore();

        int getDestroyFlagScore();

        boolean hasTotalScore();

        int getTotalScore();
    }

    public static interface ApplyAllReportListResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        List<GuildFortHandler.ReportList> getReportListList();

        GuildFortHandler.ReportList getReportList(int param1Int);

        int getReportListCount();

        List<? extends GuildFortHandler.ReportListOrBuilder> getReportListOrBuilderList();

        GuildFortHandler.ReportListOrBuilder getReportListOrBuilder(int param1Int);
    }

    public static interface ApplyAllReportListRequestOrBuilder extends MessageOrBuilder {
    }

    public static interface ReportListOrBuilder extends MessageOrBuilder {
        boolean hasDate();

        String getDate();

        ByteString getDateBytes();

        List<GuildFortHandler.ReportListInfo> getReportListInfoList();

        GuildFortHandler.ReportListInfo getReportListInfo(int param1Int);

        int getReportListInfoCount();

        List<? extends GuildFortHandler.ReportListInfoOrBuilder> getReportListInfoOrBuilderList();

        GuildFortHandler.ReportListInfoOrBuilder getReportListInfoOrBuilder(int param1Int);
    }

    public static interface ReportListInfoOrBuilder extends MessageOrBuilder {
        boolean hasAreaId();

        int getAreaId();

        boolean hasDefenseGuildName();

        String getDefenseGuildName();

        ByteString getDefenseGuildNameBytes();

        boolean hasDefenseGuildIcon();

        String getDefenseGuildIcon();

        ByteString getDefenseGuildIconBytes();

        boolean hasAttackGuildName();

        String getAttackGuildName();

        ByteString getAttackGuildNameBytes();

        boolean hasAttackGuildIcon();

        String getAttackGuildIcon();

        ByteString getAttackGuildIconBytes();

        boolean hasResult();

        int getResult();
    }

    public static interface ApplyFortGuildInfoResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasOwnGuild();

        GuildFortHandler.FortGuildInfo getOwnGuild();

        GuildFortHandler.FortGuildInfoOrBuilder getOwnGuildOrBuilder();

        boolean hasEnemyGuild();

        GuildFortHandler.FortGuildInfo getEnemyGuild();

        GuildFortHandler.FortGuildInfoOrBuilder getEnemyGuildOrBuilder();
    }

    public static interface ApplyFortGuildInfoRequestOrBuilder extends MessageOrBuilder {
    }

    public static interface FortGuildInfoOrBuilder extends MessageOrBuilder {
        boolean hasGuildIcon();

        String getGuildIcon();

        ByteString getGuildIconBytes();

        boolean hasGuildId();

        String getGuildId();

        ByteString getGuildIdBytes();

        boolean hasGuildName();

        String getGuildName();

        ByteString getGuildNameBytes();

        boolean hasGuildLevel();

        int getGuildLevel();

        boolean hasArmyFlag();

        int getArmyFlag();

        boolean hasMumber();

        int getMumber();

        boolean hasDefenseSoul();

        int getDefenseSoul();

        boolean hasAttackSoul();

        int getAttackSoul();

        boolean hasKill();

        int getKill();

        boolean hasDefense();

        int getDefense();

        boolean hasAttack();

        int getAttack();

        boolean hasScore();

        int getScore();
    }

    public static interface ApplyAccessResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface ApplyAccessRequestOrBuilder extends MessageOrBuilder {
        boolean hasAreaId();

        int getAreaId();
    }

    public static interface ApplyDailyAwardResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface ApplyDailyAwardRequestOrBuilder extends MessageOrBuilder {
        boolean hasAreaId();

        int getAreaId();
    }

    public static interface ApplyDailyAwardListResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        List<GuildFortHandler.AreaAward> getAreaAwardListList();

        GuildFortHandler.AreaAward getAreaAwardList(int param1Int);

        int getAreaAwardListCount();

        List<? extends GuildFortHandler.AreaAwardOrBuilder> getAreaAwardListOrBuilderList();

        GuildFortHandler.AreaAwardOrBuilder getAreaAwardListOrBuilder(int param1Int);
    }

    public static interface ApplyDailyAwardListRequestOrBuilder extends MessageOrBuilder {
    }

    public static interface AreaAwardOrBuilder extends MessageOrBuilder {
        boolean hasAreaId();

        int getAreaId();

        boolean hasGuildName();

        String getGuildName();

        ByteString getGuildNameBytes();

        boolean hasStatus();

        int getStatus();

        List<ItemOuterClass.MiniItem> getDailyAwardListList();

        ItemOuterClass.MiniItem getDailyAwardList(int param1Int);

        int getDailyAwardListCount();

        List<? extends ItemOuterClass.MiniItemOrBuilder> getDailyAwardListOrBuilderList();

        ItemOuterClass.MiniItemOrBuilder getDailyAwardListOrBuilder(int param1Int);
    }

    public static interface ApplyCancelFundResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface ApplyCancelFundRequestOrBuilder extends MessageOrBuilder {
        boolean hasAreaId();

        int getAreaId();
    }

    public static interface ApplyFundResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();
    }

    public static interface ApplyFundRequestOrBuilder extends MessageOrBuilder {
        boolean hasAreaId();

        int getAreaId();

        boolean hasApplyFund();

        int getApplyFund();
    }

    public static interface ApplyGuildFundResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasGuildFund();

        int getGuildFund();
    }

    public static interface ApplyGuildFundRequestOrBuilder extends MessageOrBuilder {
    }

    public static interface GetGuildAreaApplyListResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        List<GuildFortHandler.GuildAreaApplyInfo> getApplyListList();

        GuildFortHandler.GuildAreaApplyInfo getApplyList(int param1Int);

        int getApplyListCount();

        List<? extends GuildFortHandler.GuildAreaApplyInfoOrBuilder> getApplyListOrBuilderList();

        GuildFortHandler.GuildAreaApplyInfoOrBuilder getApplyListOrBuilder(int param1Int);

        boolean hasCountDown();

        int getCountDown();
    }

    public static interface GetGuildAreaApplyListRequestOrBuilder extends MessageOrBuilder {
        boolean hasAreaId();

        int getAreaId();
    }

    public static interface GuildAreaApplyInfoOrBuilder extends MessageOrBuilder {
        boolean hasGuildIcon();

        String getGuildIcon();

        ByteString getGuildIconBytes();

        boolean hasGuildId();

        String getGuildId();

        ByteString getGuildIdBytes();

        boolean hasGuildName();

        String getGuildName();

        ByteString getGuildNameBytes();

        boolean hasGuildLevel();

        int getGuildLevel();

        boolean hasGuildLeaderId();

        String getGuildLeaderId();

        ByteString getGuildLeaderIdBytes();

        boolean hasGuildLeaderName();

        String getGuildLeaderName();

        ByteString getGuildLeaderNameBytes();

        boolean hasGuildNumberCount();

        int getGuildNumberCount();

        boolean hasGuildNumberTotalCount();

        int getGuildNumberTotalCount();

        boolean hasApplyFund();

        int getApplyFund();

        boolean hasIsWinner();

        boolean getIsWinner();
    }

    public static interface GetGuildAreaDetailResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasAreaDetail();

        GuildFortHandler.GuildAreaDetail getAreaDetail();

        GuildFortHandler.GuildAreaDetailOrBuilder getAreaDetailOrBuilder();
    }

    public static interface GetGuildAreaDetailRequestOrBuilder extends MessageOrBuilder {
        boolean hasAreaId();

        int getAreaId();
    }

    public static interface GuildAreaDetailOrBuilder extends MessageOrBuilder {
        boolean hasGuildId();

        String getGuildId();

        ByteString getGuildIdBytes();

        boolean hasGuildName();

        String getGuildName();

        ByteString getGuildNameBytes();

        boolean hasGuildLevel();

        int getGuildLevel();

        boolean hasGuildLeaderId();

        String getGuildLeaderId();

        ByteString getGuildLeaderIdBytes();

        boolean hasGuildLeaderName();

        String getGuildLeaderName();

        ByteString getGuildLeaderNameBytes();

        boolean hasGuildNumberCount();

        int getGuildNumberCount();

        boolean hasGuildNumberTotalCount();

        int getGuildNumberTotalCount();

        List<ItemOuterClass.MiniItem> getWinnerAwardListList();

        ItemOuterClass.MiniItem getWinnerAwardList(int param1Int);

        int getWinnerAwardListCount();

        List<? extends ItemOuterClass.MiniItemOrBuilder> getWinnerAwardListOrBuilderList();

        ItemOuterClass.MiniItemOrBuilder getWinnerAwardListOrBuilder(int param1Int);

        List<ItemOuterClass.MiniItem> getDailyAwardListList();

        ItemOuterClass.MiniItem getDailyAwardList(int param1Int);

        int getDailyAwardListCount();

        List<? extends ItemOuterClass.MiniItemOrBuilder> getDailyAwardListOrBuilderList();

        ItemOuterClass.MiniItemOrBuilder getDailyAwardListOrBuilder(int param1Int);

        boolean hasDailyAwardFlag();

        int getDailyAwardFlag();

        boolean hasAreaStatus();

        int getAreaStatus();

        boolean hasCountDown();

        int getCountDown();
    }

    public static interface GetGuildAreaListResponseOrBuilder extends MessageOrBuilder {
        boolean hasS2CCode();

        int getS2CCode();

        boolean hasS2CMsg();

        String getS2CMsg();

        ByteString getS2CMsgBytes();

        boolean hasCurStatus();

        int getCurStatus();

        List<GuildFortHandler.GuildAreaInfo> getAreaListList();

        GuildFortHandler.GuildAreaInfo getAreaList(int param1Int);

        int getAreaListCount();

        List<? extends GuildFortHandler.GuildAreaInfoOrBuilder> getAreaListOrBuilderList();

        GuildFortHandler.GuildAreaInfoOrBuilder getAreaListOrBuilder(int param1Int);
    }

    public static interface GetGuildAreaListRequestOrBuilder extends MessageOrBuilder {
    }

    public static interface GuildAreaInfoOrBuilder extends MessageOrBuilder {
        boolean hasAreaId();

        int getAreaId();

        boolean hasApplied();

        int getApplied();

        boolean hasGuildId();

        String getGuildId();

        ByteString getGuildIdBytes();

        boolean hasGuildName();

        String getGuildName();

        ByteString getGuildNameBytes();

        boolean hasGuildName1();

        String getGuildName1();

        ByteString getGuildName1Bytes();

        boolean hasGuildName2();

        String getGuildName2();

        ByteString getGuildName2Bytes();
    }
}


