/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.rj.gd.streams.uc2.types.gen;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class UserPosition extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6074913071026731681L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserPosition\",\"namespace\":\"com.rj.gd.streams.uc2.types.gen\",\"fields\":[{\"name\":\"AccountId\",\"type\":\"string\"},{\"name\":\"UserAlias\",\"type\":\"string\"},{\"name\":\"LastUpdatedTime\",\"type\":{\"type\":\"int\",\"logicalType\":\"time-millis\"}},{\"name\":\"BlockedAmount\",\"type\":\"float\",\"default\":0.0},{\"name\":\"FreeAmount\",\"type\":\"float\",\"default\":0.0},{\"name\":\"Rows\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Item\",\"fields\":[{\"name\":\"Exchange\",\"type\":\"string\",\"doc\":\"NYSE,NASDAQ,APEX\"},{\"name\":\"Ticker\",\"type\":\"string\"},{\"name\":\"TotalSize\",\"type\":\"int\"},{\"name\":\"AvgPrice\",\"type\":\"float\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimeMillisConversion());
  }

  private static final BinaryMessageEncoder<UserPosition> ENCODER =
      new BinaryMessageEncoder<UserPosition>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserPosition> DECODER =
      new BinaryMessageDecoder<UserPosition>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<UserPosition> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<UserPosition> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<UserPosition> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserPosition>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this UserPosition to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a UserPosition from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a UserPosition instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static UserPosition fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence AccountId;
   private java.lang.CharSequence UserAlias;
   private java.time.LocalTime LastUpdatedTime;
   private float BlockedAmount;
   private float FreeAmount;
   private java.util.List<com.rj.gd.streams.uc2.types.gen.Item> Rows;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserPosition() {}

  /**
   * All-args constructor.
   * @param AccountId The new value for AccountId
   * @param UserAlias The new value for UserAlias
   * @param LastUpdatedTime The new value for LastUpdatedTime
   * @param BlockedAmount The new value for BlockedAmount
   * @param FreeAmount The new value for FreeAmount
   * @param Rows The new value for Rows
   */
  public UserPosition(java.lang.CharSequence AccountId, java.lang.CharSequence UserAlias, java.time.LocalTime LastUpdatedTime, java.lang.Float BlockedAmount, java.lang.Float FreeAmount, java.util.List<com.rj.gd.streams.uc2.types.gen.Item> Rows) {
    this.AccountId = AccountId;
    this.UserAlias = UserAlias;
    this.LastUpdatedTime = LastUpdatedTime.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    this.BlockedAmount = BlockedAmount;
    this.FreeAmount = FreeAmount;
    this.Rows = Rows;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return AccountId;
    case 1: return UserAlias;
    case 2: return LastUpdatedTime;
    case 3: return BlockedAmount;
    case 4: return FreeAmount;
    case 5: return Rows;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      new org.apache.avro.data.TimeConversions.TimeMillisConversion(),
      null,
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: AccountId = (java.lang.CharSequence)value$; break;
    case 1: UserAlias = (java.lang.CharSequence)value$; break;
    case 2: LastUpdatedTime = (java.time.LocalTime)value$; break;
    case 3: BlockedAmount = (java.lang.Float)value$; break;
    case 4: FreeAmount = (java.lang.Float)value$; break;
    case 5: Rows = (java.util.List<com.rj.gd.streams.uc2.types.gen.Item>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'AccountId' field.
   * @return The value of the 'AccountId' field.
   */
  public java.lang.CharSequence getAccountId() {
    return AccountId;
  }


  /**
   * Sets the value of the 'AccountId' field.
   * @param value the value to set.
   */
  public void setAccountId(java.lang.CharSequence value) {
    this.AccountId = value;
  }

  /**
   * Gets the value of the 'UserAlias' field.
   * @return The value of the 'UserAlias' field.
   */
  public java.lang.CharSequence getUserAlias() {
    return UserAlias;
  }


  /**
   * Sets the value of the 'UserAlias' field.
   * @param value the value to set.
   */
  public void setUserAlias(java.lang.CharSequence value) {
    this.UserAlias = value;
  }

  /**
   * Gets the value of the 'LastUpdatedTime' field.
   * @return The value of the 'LastUpdatedTime' field.
   */
  public java.time.LocalTime getLastUpdatedTime() {
    return LastUpdatedTime;
  }


  /**
   * Sets the value of the 'LastUpdatedTime' field.
   * @param value the value to set.
   */
  public void setLastUpdatedTime(java.time.LocalTime value) {
    this.LastUpdatedTime = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Gets the value of the 'BlockedAmount' field.
   * @return The value of the 'BlockedAmount' field.
   */
  public float getBlockedAmount() {
    return BlockedAmount;
  }


  /**
   * Sets the value of the 'BlockedAmount' field.
   * @param value the value to set.
   */
  public void setBlockedAmount(float value) {
    this.BlockedAmount = value;
  }

  /**
   * Gets the value of the 'FreeAmount' field.
   * @return The value of the 'FreeAmount' field.
   */
  public float getFreeAmount() {
    return FreeAmount;
  }


  /**
   * Sets the value of the 'FreeAmount' field.
   * @param value the value to set.
   */
  public void setFreeAmount(float value) {
    this.FreeAmount = value;
  }

  /**
   * Gets the value of the 'Rows' field.
   * @return The value of the 'Rows' field.
   */
  public java.util.List<com.rj.gd.streams.uc2.types.gen.Item> getRows() {
    return Rows;
  }


  /**
   * Sets the value of the 'Rows' field.
   * @param value the value to set.
   */
  public void setRows(java.util.List<com.rj.gd.streams.uc2.types.gen.Item> value) {
    this.Rows = value;
  }

  /**
   * Creates a new UserPosition RecordBuilder.
   * @return A new UserPosition RecordBuilder
   */
  public static com.rj.gd.streams.uc2.types.gen.UserPosition.Builder newBuilder() {
    return new com.rj.gd.streams.uc2.types.gen.UserPosition.Builder();
  }

  /**
   * Creates a new UserPosition RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserPosition RecordBuilder
   */
  public static com.rj.gd.streams.uc2.types.gen.UserPosition.Builder newBuilder(com.rj.gd.streams.uc2.types.gen.UserPosition.Builder other) {
    if (other == null) {
      return new com.rj.gd.streams.uc2.types.gen.UserPosition.Builder();
    } else {
      return new com.rj.gd.streams.uc2.types.gen.UserPosition.Builder(other);
    }
  }

  /**
   * Creates a new UserPosition RecordBuilder by copying an existing UserPosition instance.
   * @param other The existing instance to copy.
   * @return A new UserPosition RecordBuilder
   */
  public static com.rj.gd.streams.uc2.types.gen.UserPosition.Builder newBuilder(com.rj.gd.streams.uc2.types.gen.UserPosition other) {
    if (other == null) {
      return new com.rj.gd.streams.uc2.types.gen.UserPosition.Builder();
    } else {
      return new com.rj.gd.streams.uc2.types.gen.UserPosition.Builder(other);
    }
  }

  /**
   * RecordBuilder for UserPosition instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserPosition>
    implements org.apache.avro.data.RecordBuilder<UserPosition> {

    private java.lang.CharSequence AccountId;
    private java.lang.CharSequence UserAlias;
    private java.time.LocalTime LastUpdatedTime;
    private float BlockedAmount;
    private float FreeAmount;
    private java.util.List<com.rj.gd.streams.uc2.types.gen.Item> Rows;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.rj.gd.streams.uc2.types.gen.UserPosition.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.AccountId)) {
        this.AccountId = data().deepCopy(fields()[0].schema(), other.AccountId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.UserAlias)) {
        this.UserAlias = data().deepCopy(fields()[1].schema(), other.UserAlias);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.LastUpdatedTime)) {
        this.LastUpdatedTime = data().deepCopy(fields()[2].schema(), other.LastUpdatedTime);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.BlockedAmount)) {
        this.BlockedAmount = data().deepCopy(fields()[3].schema(), other.BlockedAmount);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.FreeAmount)) {
        this.FreeAmount = data().deepCopy(fields()[4].schema(), other.FreeAmount);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.Rows)) {
        this.Rows = data().deepCopy(fields()[5].schema(), other.Rows);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing UserPosition instance
     * @param other The existing instance to copy.
     */
    private Builder(com.rj.gd.streams.uc2.types.gen.UserPosition other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.AccountId)) {
        this.AccountId = data().deepCopy(fields()[0].schema(), other.AccountId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.UserAlias)) {
        this.UserAlias = data().deepCopy(fields()[1].schema(), other.UserAlias);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.LastUpdatedTime)) {
        this.LastUpdatedTime = data().deepCopy(fields()[2].schema(), other.LastUpdatedTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.BlockedAmount)) {
        this.BlockedAmount = data().deepCopy(fields()[3].schema(), other.BlockedAmount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.FreeAmount)) {
        this.FreeAmount = data().deepCopy(fields()[4].schema(), other.FreeAmount);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Rows)) {
        this.Rows = data().deepCopy(fields()[5].schema(), other.Rows);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'AccountId' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountId() {
      return AccountId;
    }


    /**
      * Sets the value of the 'AccountId' field.
      * @param value The value of 'AccountId'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder setAccountId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.AccountId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'AccountId' field has been set.
      * @return True if the 'AccountId' field has been set, false otherwise.
      */
    public boolean hasAccountId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'AccountId' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder clearAccountId() {
      AccountId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'UserAlias' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserAlias() {
      return UserAlias;
    }


    /**
      * Sets the value of the 'UserAlias' field.
      * @param value The value of 'UserAlias'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder setUserAlias(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.UserAlias = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'UserAlias' field has been set.
      * @return True if the 'UserAlias' field has been set, false otherwise.
      */
    public boolean hasUserAlias() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'UserAlias' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder clearUserAlias() {
      UserAlias = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'LastUpdatedTime' field.
      * @return The value.
      */
    public java.time.LocalTime getLastUpdatedTime() {
      return LastUpdatedTime;
    }


    /**
      * Sets the value of the 'LastUpdatedTime' field.
      * @param value The value of 'LastUpdatedTime'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder setLastUpdatedTime(java.time.LocalTime value) {
      validate(fields()[2], value);
      this.LastUpdatedTime = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'LastUpdatedTime' field has been set.
      * @return True if the 'LastUpdatedTime' field has been set, false otherwise.
      */
    public boolean hasLastUpdatedTime() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'LastUpdatedTime' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder clearLastUpdatedTime() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'BlockedAmount' field.
      * @return The value.
      */
    public float getBlockedAmount() {
      return BlockedAmount;
    }


    /**
      * Sets the value of the 'BlockedAmount' field.
      * @param value The value of 'BlockedAmount'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder setBlockedAmount(float value) {
      validate(fields()[3], value);
      this.BlockedAmount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'BlockedAmount' field has been set.
      * @return True if the 'BlockedAmount' field has been set, false otherwise.
      */
    public boolean hasBlockedAmount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'BlockedAmount' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder clearBlockedAmount() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'FreeAmount' field.
      * @return The value.
      */
    public float getFreeAmount() {
      return FreeAmount;
    }


    /**
      * Sets the value of the 'FreeAmount' field.
      * @param value The value of 'FreeAmount'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder setFreeAmount(float value) {
      validate(fields()[4], value);
      this.FreeAmount = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'FreeAmount' field has been set.
      * @return True if the 'FreeAmount' field has been set, false otherwise.
      */
    public boolean hasFreeAmount() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'FreeAmount' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder clearFreeAmount() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'Rows' field.
      * @return The value.
      */
    public java.util.List<com.rj.gd.streams.uc2.types.gen.Item> getRows() {
      return Rows;
    }


    /**
      * Sets the value of the 'Rows' field.
      * @param value The value of 'Rows'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder setRows(java.util.List<com.rj.gd.streams.uc2.types.gen.Item> value) {
      validate(fields()[5], value);
      this.Rows = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'Rows' field has been set.
      * @return True if the 'Rows' field has been set, false otherwise.
      */
    public boolean hasRows() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'Rows' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.UserPosition.Builder clearRows() {
      Rows = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserPosition build() {
      try {
        UserPosition record = new UserPosition();
        record.AccountId = fieldSetFlags()[0] ? this.AccountId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.UserAlias = fieldSetFlags()[1] ? this.UserAlias : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.LastUpdatedTime = fieldSetFlags()[2] ? this.LastUpdatedTime : (java.time.LocalTime) defaultValue(fields()[2]);
        record.BlockedAmount = fieldSetFlags()[3] ? this.BlockedAmount : (java.lang.Float) defaultValue(fields()[3]);
        record.FreeAmount = fieldSetFlags()[4] ? this.FreeAmount : (java.lang.Float) defaultValue(fields()[4]);
        record.Rows = fieldSetFlags()[5] ? this.Rows : (java.util.List<com.rj.gd.streams.uc2.types.gen.Item>) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserPosition>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserPosition>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserPosition>
    READER$ = (org.apache.avro.io.DatumReader<UserPosition>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










