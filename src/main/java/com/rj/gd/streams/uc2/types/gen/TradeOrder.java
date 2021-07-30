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
public class TradeOrder extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1147972886850761579L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TradeOrder\",\"namespace\":\"com.rj.gd.streams.uc2.types.gen\",\"fields\":[{\"name\":\"OrderId\",\"type\":\"string\"},{\"name\":\"OrderTime\",\"type\":{\"type\":\"int\",\"logicalType\":\"time-millis\"}},{\"name\":\"AccountId\",\"type\":\"string\"},{\"name\":\"Ticker\",\"type\":\"string\"},{\"name\":\"OrderType\",\"type\":\"string\",\"doc\":\"MARKET,LIMIT\"},{\"name\":\"Operation\",\"type\":\"string\",\"doc\":\"BUY,SELL\"},{\"name\":\"Size\",\"type\":\"int\"},{\"name\":\"Price\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimeMillisConversion());
  }

  private static final BinaryMessageEncoder<TradeOrder> ENCODER =
      new BinaryMessageEncoder<TradeOrder>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TradeOrder> DECODER =
      new BinaryMessageDecoder<TradeOrder>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TradeOrder> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TradeOrder> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TradeOrder> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TradeOrder>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TradeOrder to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TradeOrder from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TradeOrder instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TradeOrder fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence OrderId;
   private java.time.LocalTime OrderTime;
   private java.lang.CharSequence AccountId;
   private java.lang.CharSequence Ticker;
  /** MARKET,LIMIT */
   private java.lang.CharSequence OrderType;
  /** BUY,SELL */
   private java.lang.CharSequence Operation;
   private int Size;
   private float Price;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TradeOrder() {}

  /**
   * All-args constructor.
   * @param OrderId The new value for OrderId
   * @param OrderTime The new value for OrderTime
   * @param AccountId The new value for AccountId
   * @param Ticker The new value for Ticker
   * @param OrderType MARKET,LIMIT
   * @param Operation BUY,SELL
   * @param Size The new value for Size
   * @param Price The new value for Price
   */
  public TradeOrder(java.lang.CharSequence OrderId, java.time.LocalTime OrderTime, java.lang.CharSequence AccountId, java.lang.CharSequence Ticker, java.lang.CharSequence OrderType, java.lang.CharSequence Operation, java.lang.Integer Size, java.lang.Float Price) {
    this.OrderId = OrderId;
    this.OrderTime = OrderTime.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
    this.AccountId = AccountId;
    this.Ticker = Ticker;
    this.OrderType = OrderType;
    this.Operation = Operation;
    this.Size = Size;
    this.Price = Price;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return OrderId;
    case 1: return OrderTime;
    case 2: return AccountId;
    case 3: return Ticker;
    case 4: return OrderType;
    case 5: return Operation;
    case 6: return Size;
    case 7: return Price;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      new org.apache.avro.data.TimeConversions.TimeMillisConversion(),
      null,
      null,
      null,
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
    case 0: OrderId = (java.lang.CharSequence)value$; break;
    case 1: OrderTime = (java.time.LocalTime)value$; break;
    case 2: AccountId = (java.lang.CharSequence)value$; break;
    case 3: Ticker = (java.lang.CharSequence)value$; break;
    case 4: OrderType = (java.lang.CharSequence)value$; break;
    case 5: Operation = (java.lang.CharSequence)value$; break;
    case 6: Size = (java.lang.Integer)value$; break;
    case 7: Price = (java.lang.Float)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'OrderId' field.
   * @return The value of the 'OrderId' field.
   */
  public java.lang.CharSequence getOrderId() {
    return OrderId;
  }


  /**
   * Sets the value of the 'OrderId' field.
   * @param value the value to set.
   */
  public void setOrderId(java.lang.CharSequence value) {
    this.OrderId = value;
  }

  /**
   * Gets the value of the 'OrderTime' field.
   * @return The value of the 'OrderTime' field.
   */
  public java.time.LocalTime getOrderTime() {
    return OrderTime;
  }


  /**
   * Sets the value of the 'OrderTime' field.
   * @param value the value to set.
   */
  public void setOrderTime(java.time.LocalTime value) {
    this.OrderTime = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
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
   * Gets the value of the 'Ticker' field.
   * @return The value of the 'Ticker' field.
   */
  public java.lang.CharSequence getTicker() {
    return Ticker;
  }


  /**
   * Sets the value of the 'Ticker' field.
   * @param value the value to set.
   */
  public void setTicker(java.lang.CharSequence value) {
    this.Ticker = value;
  }

  /**
   * Gets the value of the 'OrderType' field.
   * @return MARKET,LIMIT
   */
  public java.lang.CharSequence getOrderType() {
    return OrderType;
  }


  /**
   * Sets the value of the 'OrderType' field.
   * MARKET,LIMIT
   * @param value the value to set.
   */
  public void setOrderType(java.lang.CharSequence value) {
    this.OrderType = value;
  }

  /**
   * Gets the value of the 'Operation' field.
   * @return BUY,SELL
   */
  public java.lang.CharSequence getOperation() {
    return Operation;
  }


  /**
   * Sets the value of the 'Operation' field.
   * BUY,SELL
   * @param value the value to set.
   */
  public void setOperation(java.lang.CharSequence value) {
    this.Operation = value;
  }

  /**
   * Gets the value of the 'Size' field.
   * @return The value of the 'Size' field.
   */
  public int getSize() {
    return Size;
  }


  /**
   * Sets the value of the 'Size' field.
   * @param value the value to set.
   */
  public void setSize(int value) {
    this.Size = value;
  }

  /**
   * Gets the value of the 'Price' field.
   * @return The value of the 'Price' field.
   */
  public float getPrice() {
    return Price;
  }


  /**
   * Sets the value of the 'Price' field.
   * @param value the value to set.
   */
  public void setPrice(float value) {
    this.Price = value;
  }

  /**
   * Creates a new TradeOrder RecordBuilder.
   * @return A new TradeOrder RecordBuilder
   */
  public static com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder newBuilder() {
    return new com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder();
  }

  /**
   * Creates a new TradeOrder RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TradeOrder RecordBuilder
   */
  public static com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder newBuilder(com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder other) {
    if (other == null) {
      return new com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder();
    } else {
      return new com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder(other);
    }
  }

  /**
   * Creates a new TradeOrder RecordBuilder by copying an existing TradeOrder instance.
   * @param other The existing instance to copy.
   * @return A new TradeOrder RecordBuilder
   */
  public static com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder newBuilder(com.rj.gd.streams.uc2.types.gen.TradeOrder other) {
    if (other == null) {
      return new com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder();
    } else {
      return new com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder(other);
    }
  }

  /**
   * RecordBuilder for TradeOrder instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TradeOrder>
    implements org.apache.avro.data.RecordBuilder<TradeOrder> {

    private java.lang.CharSequence OrderId;
    private java.time.LocalTime OrderTime;
    private java.lang.CharSequence AccountId;
    private java.lang.CharSequence Ticker;
    /** MARKET,LIMIT */
    private java.lang.CharSequence OrderType;
    /** BUY,SELL */
    private java.lang.CharSequence Operation;
    private int Size;
    private float Price;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.OrderId)) {
        this.OrderId = data().deepCopy(fields()[0].schema(), other.OrderId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.OrderTime)) {
        this.OrderTime = data().deepCopy(fields()[1].schema(), other.OrderTime);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.AccountId)) {
        this.AccountId = data().deepCopy(fields()[2].schema(), other.AccountId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.Ticker)) {
        this.Ticker = data().deepCopy(fields()[3].schema(), other.Ticker);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.OrderType)) {
        this.OrderType = data().deepCopy(fields()[4].schema(), other.OrderType);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.Operation)) {
        this.Operation = data().deepCopy(fields()[5].schema(), other.Operation);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.Size)) {
        this.Size = data().deepCopy(fields()[6].schema(), other.Size);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.Price)) {
        this.Price = data().deepCopy(fields()[7].schema(), other.Price);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing TradeOrder instance
     * @param other The existing instance to copy.
     */
    private Builder(com.rj.gd.streams.uc2.types.gen.TradeOrder other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.OrderId)) {
        this.OrderId = data().deepCopy(fields()[0].schema(), other.OrderId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.OrderTime)) {
        this.OrderTime = data().deepCopy(fields()[1].schema(), other.OrderTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.AccountId)) {
        this.AccountId = data().deepCopy(fields()[2].schema(), other.AccountId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Ticker)) {
        this.Ticker = data().deepCopy(fields()[3].schema(), other.Ticker);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.OrderType)) {
        this.OrderType = data().deepCopy(fields()[4].schema(), other.OrderType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.Operation)) {
        this.Operation = data().deepCopy(fields()[5].schema(), other.Operation);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.Size)) {
        this.Size = data().deepCopy(fields()[6].schema(), other.Size);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.Price)) {
        this.Price = data().deepCopy(fields()[7].schema(), other.Price);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'OrderId' field.
      * @return The value.
      */
    public java.lang.CharSequence getOrderId() {
      return OrderId;
    }


    /**
      * Sets the value of the 'OrderId' field.
      * @param value The value of 'OrderId'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder setOrderId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.OrderId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'OrderId' field has been set.
      * @return True if the 'OrderId' field has been set, false otherwise.
      */
    public boolean hasOrderId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'OrderId' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder clearOrderId() {
      OrderId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'OrderTime' field.
      * @return The value.
      */
    public java.time.LocalTime getOrderTime() {
      return OrderTime;
    }


    /**
      * Sets the value of the 'OrderTime' field.
      * @param value The value of 'OrderTime'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder setOrderTime(java.time.LocalTime value) {
      validate(fields()[1], value);
      this.OrderTime = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'OrderTime' field has been set.
      * @return True if the 'OrderTime' field has been set, false otherwise.
      */
    public boolean hasOrderTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'OrderTime' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder clearOrderTime() {
      fieldSetFlags()[1] = false;
      return this;
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
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder setAccountId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.AccountId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'AccountId' field has been set.
      * @return True if the 'AccountId' field has been set, false otherwise.
      */
    public boolean hasAccountId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'AccountId' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder clearAccountId() {
      AccountId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'Ticker' field.
      * @return The value.
      */
    public java.lang.CharSequence getTicker() {
      return Ticker;
    }


    /**
      * Sets the value of the 'Ticker' field.
      * @param value The value of 'Ticker'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder setTicker(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.Ticker = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'Ticker' field has been set.
      * @return True if the 'Ticker' field has been set, false otherwise.
      */
    public boolean hasTicker() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'Ticker' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder clearTicker() {
      Ticker = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'OrderType' field.
      * MARKET,LIMIT
      * @return The value.
      */
    public java.lang.CharSequence getOrderType() {
      return OrderType;
    }


    /**
      * Sets the value of the 'OrderType' field.
      * MARKET,LIMIT
      * @param value The value of 'OrderType'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder setOrderType(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.OrderType = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'OrderType' field has been set.
      * MARKET,LIMIT
      * @return True if the 'OrderType' field has been set, false otherwise.
      */
    public boolean hasOrderType() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'OrderType' field.
      * MARKET,LIMIT
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder clearOrderType() {
      OrderType = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'Operation' field.
      * BUY,SELL
      * @return The value.
      */
    public java.lang.CharSequence getOperation() {
      return Operation;
    }


    /**
      * Sets the value of the 'Operation' field.
      * BUY,SELL
      * @param value The value of 'Operation'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder setOperation(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.Operation = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'Operation' field has been set.
      * BUY,SELL
      * @return True if the 'Operation' field has been set, false otherwise.
      */
    public boolean hasOperation() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'Operation' field.
      * BUY,SELL
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder clearOperation() {
      Operation = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'Size' field.
      * @return The value.
      */
    public int getSize() {
      return Size;
    }


    /**
      * Sets the value of the 'Size' field.
      * @param value The value of 'Size'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder setSize(int value) {
      validate(fields()[6], value);
      this.Size = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'Size' field has been set.
      * @return True if the 'Size' field has been set, false otherwise.
      */
    public boolean hasSize() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'Size' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder clearSize() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'Price' field.
      * @return The value.
      */
    public float getPrice() {
      return Price;
    }


    /**
      * Sets the value of the 'Price' field.
      * @param value The value of 'Price'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder setPrice(float value) {
      validate(fields()[7], value);
      this.Price = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'Price' field has been set.
      * @return True if the 'Price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'Price' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.TradeOrder.Builder clearPrice() {
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TradeOrder build() {
      try {
        TradeOrder record = new TradeOrder();
        record.OrderId = fieldSetFlags()[0] ? this.OrderId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.OrderTime = fieldSetFlags()[1] ? this.OrderTime : (java.time.LocalTime) defaultValue(fields()[1]);
        record.AccountId = fieldSetFlags()[2] ? this.AccountId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.Ticker = fieldSetFlags()[3] ? this.Ticker : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.OrderType = fieldSetFlags()[4] ? this.OrderType : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.Operation = fieldSetFlags()[5] ? this.Operation : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.Size = fieldSetFlags()[6] ? this.Size : (java.lang.Integer) defaultValue(fields()[6]);
        record.Price = fieldSetFlags()[7] ? this.Price : (java.lang.Float) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TradeOrder>
    WRITER$ = (org.apache.avro.io.DatumWriter<TradeOrder>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TradeOrder>
    READER$ = (org.apache.avro.io.DatumReader<TradeOrder>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










