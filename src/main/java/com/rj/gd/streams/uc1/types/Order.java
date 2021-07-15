/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.rj.gd.streams.uc1.types;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Order extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 394319155009603373L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Order\",\"namespace\":\"com.rj.gd.streams.uc1.types\",\"fields\":[{\"name\":\"accountId\",\"type\":\"string\"},{\"name\":\"Ticker\",\"type\":\"string\"},{\"name\":\"Size\",\"type\":\"int\",\"default\":0},{\"name\":\"Open\",\"type\":\"float\",\"default\":0.0},{\"name\":\"Close\",\"type\":\"float\",\"default\":0.0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Order> ENCODER =
      new BinaryMessageEncoder<Order>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Order> DECODER =
      new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Order> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Order> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Order> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Order>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Order to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Order from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Order instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Order fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence accountId;
   private java.lang.CharSequence Ticker;
   private int Size;
   private float Open;
   private float Close;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Order() {}

  /**
   * All-args constructor.
   * @param accountId The new value for accountId
   * @param Ticker The new value for Ticker
   * @param Size The new value for Size
   * @param Open The new value for Open
   * @param Close The new value for Close
   */
  public Order(java.lang.CharSequence accountId, java.lang.CharSequence Ticker, java.lang.Integer Size, java.lang.Float Open, java.lang.Float Close) {
    this.accountId = accountId;
    this.Ticker = Ticker;
    this.Size = Size;
    this.Open = Open;
    this.Close = Close;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return accountId;
    case 1: return Ticker;
    case 2: return Size;
    case 3: return Open;
    case 4: return Close;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: accountId = (java.lang.CharSequence)value$; break;
    case 1: Ticker = (java.lang.CharSequence)value$; break;
    case 2: Size = (java.lang.Integer)value$; break;
    case 3: Open = (java.lang.Float)value$; break;
    case 4: Close = (java.lang.Float)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'accountId' field.
   * @return The value of the 'accountId' field.
   */
  public java.lang.CharSequence getAccountId() {
    return accountId;
  }


  /**
   * Sets the value of the 'accountId' field.
   * @param value the value to set.
   */
  public void setAccountId(java.lang.CharSequence value) {
    this.accountId = value;
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
   * Gets the value of the 'Open' field.
   * @return The value of the 'Open' field.
   */
  public float getOpen() {
    return Open;
  }


  /**
   * Sets the value of the 'Open' field.
   * @param value the value to set.
   */
  public void setOpen(float value) {
    this.Open = value;
  }

  /**
   * Gets the value of the 'Close' field.
   * @return The value of the 'Close' field.
   */
  public float getClose() {
    return Close;
  }


  /**
   * Sets the value of the 'Close' field.
   * @param value the value to set.
   */
  public void setClose(float value) {
    this.Close = value;
  }

  /**
   * Creates a new Order RecordBuilder.
   * @return A new Order RecordBuilder
   */
  public static com.rj.gd.streams.uc1.types.Order.Builder newBuilder() {
    return new com.rj.gd.streams.uc1.types.Order.Builder();
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Order RecordBuilder
   */
  public static com.rj.gd.streams.uc1.types.Order.Builder newBuilder(com.rj.gd.streams.uc1.types.Order.Builder other) {
    if (other == null) {
      return new com.rj.gd.streams.uc1.types.Order.Builder();
    } else {
      return new com.rj.gd.streams.uc1.types.Order.Builder(other);
    }
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Order instance.
   * @param other The existing instance to copy.
   * @return A new Order RecordBuilder
   */
  public static com.rj.gd.streams.uc1.types.Order.Builder newBuilder(com.rj.gd.streams.uc1.types.Order other) {
    if (other == null) {
      return new com.rj.gd.streams.uc1.types.Order.Builder();
    } else {
      return new com.rj.gd.streams.uc1.types.Order.Builder(other);
    }
  }

  /**
   * RecordBuilder for Order instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Order>
    implements org.apache.avro.data.RecordBuilder<Order> {

    private java.lang.CharSequence accountId;
    private java.lang.CharSequence Ticker;
    private int Size;
    private float Open;
    private float Close;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.rj.gd.streams.uc1.types.Order.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.accountId)) {
        this.accountId = data().deepCopy(fields()[0].schema(), other.accountId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.Ticker)) {
        this.Ticker = data().deepCopy(fields()[1].schema(), other.Ticker);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.Size)) {
        this.Size = data().deepCopy(fields()[2].schema(), other.Size);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.Open)) {
        this.Open = data().deepCopy(fields()[3].schema(), other.Open);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.Close)) {
        this.Close = data().deepCopy(fields()[4].schema(), other.Close);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Order instance
     * @param other The existing instance to copy.
     */
    private Builder(com.rj.gd.streams.uc1.types.Order other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.accountId)) {
        this.accountId = data().deepCopy(fields()[0].schema(), other.accountId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Ticker)) {
        this.Ticker = data().deepCopy(fields()[1].schema(), other.Ticker);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Size)) {
        this.Size = data().deepCopy(fields()[2].schema(), other.Size);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Open)) {
        this.Open = data().deepCopy(fields()[3].schema(), other.Open);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.Close)) {
        this.Close = data().deepCopy(fields()[4].schema(), other.Close);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'accountId' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccountId() {
      return accountId;
    }


    /**
      * Sets the value of the 'accountId' field.
      * @param value The value of 'accountId'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc1.types.Order.Builder setAccountId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.accountId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'accountId' field has been set.
      * @return True if the 'accountId' field has been set, false otherwise.
      */
    public boolean hasAccountId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'accountId' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc1.types.Order.Builder clearAccountId() {
      accountId = null;
      fieldSetFlags()[0] = false;
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
    public com.rj.gd.streams.uc1.types.Order.Builder setTicker(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.Ticker = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Ticker' field has been set.
      * @return True if the 'Ticker' field has been set, false otherwise.
      */
    public boolean hasTicker() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'Ticker' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc1.types.Order.Builder clearTicker() {
      Ticker = null;
      fieldSetFlags()[1] = false;
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
    public com.rj.gd.streams.uc1.types.Order.Builder setSize(int value) {
      validate(fields()[2], value);
      this.Size = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'Size' field has been set.
      * @return True if the 'Size' field has been set, false otherwise.
      */
    public boolean hasSize() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'Size' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc1.types.Order.Builder clearSize() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'Open' field.
      * @return The value.
      */
    public float getOpen() {
      return Open;
    }


    /**
      * Sets the value of the 'Open' field.
      * @param value The value of 'Open'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc1.types.Order.Builder setOpen(float value) {
      validate(fields()[3], value);
      this.Open = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'Open' field has been set.
      * @return True if the 'Open' field has been set, false otherwise.
      */
    public boolean hasOpen() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'Open' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc1.types.Order.Builder clearOpen() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'Close' field.
      * @return The value.
      */
    public float getClose() {
      return Close;
    }


    /**
      * Sets the value of the 'Close' field.
      * @param value The value of 'Close'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc1.types.Order.Builder setClose(float value) {
      validate(fields()[4], value);
      this.Close = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'Close' field has been set.
      * @return True if the 'Close' field has been set, false otherwise.
      */
    public boolean hasClose() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'Close' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc1.types.Order.Builder clearClose() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Order build() {
      try {
        Order record = new Order();
        record.accountId = fieldSetFlags()[0] ? this.accountId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.Ticker = fieldSetFlags()[1] ? this.Ticker : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.Size = fieldSetFlags()[2] ? this.Size : (java.lang.Integer) defaultValue(fields()[2]);
        record.Open = fieldSetFlags()[3] ? this.Open : (java.lang.Float) defaultValue(fields()[3]);
        record.Close = fieldSetFlags()[4] ? this.Close : (java.lang.Float) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Order>
    WRITER$ = (org.apache.avro.io.DatumWriter<Order>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Order>
    READER$ = (org.apache.avro.io.DatumReader<Order>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.accountId);

    out.writeString(this.Ticker);

    out.writeInt(this.Size);

    out.writeFloat(this.Open);

    out.writeFloat(this.Close);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.accountId = in.readString(this.accountId instanceof Utf8 ? (Utf8)this.accountId : null);

      this.Ticker = in.readString(this.Ticker instanceof Utf8 ? (Utf8)this.Ticker : null);

      this.Size = in.readInt();

      this.Open = in.readFloat();

      this.Close = in.readFloat();

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.accountId = in.readString(this.accountId instanceof Utf8 ? (Utf8)this.accountId : null);
          break;

        case 1:
          this.Ticker = in.readString(this.Ticker instanceof Utf8 ? (Utf8)this.Ticker : null);
          break;

        case 2:
          this.Size = in.readInt();
          break;

        case 3:
          this.Open = in.readFloat();
          break;

        case 4:
          this.Close = in.readFloat();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










