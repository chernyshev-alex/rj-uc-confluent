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
public class Address extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2820154343461793875L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Address\",\"namespace\":\"com.rj.gd.streams.uc2.types.gen\",\"fields\":[{\"name\":\"AddressLine\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"ContactNumber\",\"type\":\"string\",\"default\":\"\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Address> ENCODER =
      new BinaryMessageEncoder<Address>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Address> DECODER =
      new BinaryMessageDecoder<Address>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Address> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Address> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Address> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Address>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Address to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Address from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Address instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Address fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence AddressLine;
   private java.lang.CharSequence ContactNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Address() {}

  /**
   * All-args constructor.
   * @param AddressLine The new value for AddressLine
   * @param ContactNumber The new value for ContactNumber
   */
  public Address(java.lang.CharSequence AddressLine, java.lang.CharSequence ContactNumber) {
    this.AddressLine = AddressLine;
    this.ContactNumber = ContactNumber;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return AddressLine;
    case 1: return ContactNumber;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: AddressLine = (java.lang.CharSequence)value$; break;
    case 1: ContactNumber = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'AddressLine' field.
   * @return The value of the 'AddressLine' field.
   */
  public java.lang.CharSequence getAddressLine() {
    return AddressLine;
  }


  /**
   * Sets the value of the 'AddressLine' field.
   * @param value the value to set.
   */
  public void setAddressLine(java.lang.CharSequence value) {
    this.AddressLine = value;
  }

  /**
   * Gets the value of the 'ContactNumber' field.
   * @return The value of the 'ContactNumber' field.
   */
  public java.lang.CharSequence getContactNumber() {
    return ContactNumber;
  }


  /**
   * Sets the value of the 'ContactNumber' field.
   * @param value the value to set.
   */
  public void setContactNumber(java.lang.CharSequence value) {
    this.ContactNumber = value;
  }

  /**
   * Creates a new Address RecordBuilder.
   * @return A new Address RecordBuilder
   */
  public static com.rj.gd.streams.uc2.types.gen.Address.Builder newBuilder() {
    return new com.rj.gd.streams.uc2.types.gen.Address.Builder();
  }

  /**
   * Creates a new Address RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Address RecordBuilder
   */
  public static com.rj.gd.streams.uc2.types.gen.Address.Builder newBuilder(com.rj.gd.streams.uc2.types.gen.Address.Builder other) {
    if (other == null) {
      return new com.rj.gd.streams.uc2.types.gen.Address.Builder();
    } else {
      return new com.rj.gd.streams.uc2.types.gen.Address.Builder(other);
    }
  }

  /**
   * Creates a new Address RecordBuilder by copying an existing Address instance.
   * @param other The existing instance to copy.
   * @return A new Address RecordBuilder
   */
  public static com.rj.gd.streams.uc2.types.gen.Address.Builder newBuilder(com.rj.gd.streams.uc2.types.gen.Address other) {
    if (other == null) {
      return new com.rj.gd.streams.uc2.types.gen.Address.Builder();
    } else {
      return new com.rj.gd.streams.uc2.types.gen.Address.Builder(other);
    }
  }

  /**
   * RecordBuilder for Address instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Address>
    implements org.apache.avro.data.RecordBuilder<Address> {

    private java.lang.CharSequence AddressLine;
    private java.lang.CharSequence ContactNumber;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.rj.gd.streams.uc2.types.gen.Address.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.AddressLine)) {
        this.AddressLine = data().deepCopy(fields()[0].schema(), other.AddressLine);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.ContactNumber)) {
        this.ContactNumber = data().deepCopy(fields()[1].schema(), other.ContactNumber);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Address instance
     * @param other The existing instance to copy.
     */
    private Builder(com.rj.gd.streams.uc2.types.gen.Address other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.AddressLine)) {
        this.AddressLine = data().deepCopy(fields()[0].schema(), other.AddressLine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ContactNumber)) {
        this.ContactNumber = data().deepCopy(fields()[1].schema(), other.ContactNumber);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'AddressLine' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddressLine() {
      return AddressLine;
    }


    /**
      * Sets the value of the 'AddressLine' field.
      * @param value The value of 'AddressLine'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.Address.Builder setAddressLine(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.AddressLine = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'AddressLine' field has been set.
      * @return True if the 'AddressLine' field has been set, false otherwise.
      */
    public boolean hasAddressLine() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'AddressLine' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.Address.Builder clearAddressLine() {
      AddressLine = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ContactNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getContactNumber() {
      return ContactNumber;
    }


    /**
      * Sets the value of the 'ContactNumber' field.
      * @param value The value of 'ContactNumber'.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.Address.Builder setContactNumber(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ContactNumber = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ContactNumber' field has been set.
      * @return True if the 'ContactNumber' field has been set, false otherwise.
      */
    public boolean hasContactNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ContactNumber' field.
      * @return This builder.
      */
    public com.rj.gd.streams.uc2.types.gen.Address.Builder clearContactNumber() {
      ContactNumber = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Address build() {
      try {
        Address record = new Address();
        record.AddressLine = fieldSetFlags()[0] ? this.AddressLine : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ContactNumber = fieldSetFlags()[1] ? this.ContactNumber : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Address>
    WRITER$ = (org.apache.avro.io.DatumWriter<Address>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Address>
    READER$ = (org.apache.avro.io.DatumReader<Address>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.AddressLine);

    out.writeString(this.ContactNumber);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.AddressLine = in.readString(this.AddressLine instanceof Utf8 ? (Utf8)this.AddressLine : null);

      this.ContactNumber = in.readString(this.ContactNumber instanceof Utf8 ? (Utf8)this.ContactNumber : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.AddressLine = in.readString(this.AddressLine instanceof Utf8 ? (Utf8)this.AddressLine : null);
          break;

        case 1:
          this.ContactNumber = in.readString(this.ContactNumber instanceof Utf8 ? (Utf8)this.ContactNumber : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










