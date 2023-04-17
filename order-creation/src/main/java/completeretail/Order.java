/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package completeretail;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Order extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3154251031323173291L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Order\",\"namespace\":\"completeretail\",\"fields\":[{\"name\":\"orderNumber\",\"type\":\"long\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"store\",\"type\":\"string\"},{\"name\":\"requestTime\",\"type\":\"string\"},{\"name\":\"customerID\",\"type\":\"long\"},{\"name\":\"storeSize\",\"type\":\"int\"},{\"name\":\"items\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"item\",\"fields\":[{\"name\":\"itemName\",\"type\":\"string\"},{\"name\":\"itemQuantity\",\"type\":\"int\"},{\"name\":\"itemPrice\",\"type\":\"double\"}]}}}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Order> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Order> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

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
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
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

  private long orderNumber;
  private java.lang.CharSequence status;
  private java.lang.CharSequence store;
  private java.lang.CharSequence requestTime;
  private long customerID;
  private int storeSize;
  private java.util.List<completeretail.item> items;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Order() {}

  /**
   * All-args constructor.
   * @param orderNumber The new value for orderNumber
   * @param status The new value for status
   * @param store The new value for store
   * @param requestTime The new value for requestTime
   * @param customerID The new value for customerID
   * @param storeSize The new value for storeSize
   * @param items The new value for items
   */
  public Order(java.lang.Long orderNumber, java.lang.CharSequence status, java.lang.CharSequence store, java.lang.CharSequence requestTime, java.lang.Long customerID, java.lang.Integer storeSize, java.util.List<completeretail.item> items) {
    this.orderNumber = orderNumber;
    this.status = status;
    this.store = store;
    this.requestTime = requestTime;
    this.customerID = customerID;
    this.storeSize = storeSize;
    this.items = items;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return orderNumber;
    case 1: return status;
    case 2: return store;
    case 3: return requestTime;
    case 4: return customerID;
    case 5: return storeSize;
    case 6: return items;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: orderNumber = (java.lang.Long)value$; break;
    case 1: status = (java.lang.CharSequence)value$; break;
    case 2: store = (java.lang.CharSequence)value$; break;
    case 3: requestTime = (java.lang.CharSequence)value$; break;
    case 4: customerID = (java.lang.Long)value$; break;
    case 5: storeSize = (java.lang.Integer)value$; break;
    case 6: items = (java.util.List<completeretail.item>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'orderNumber' field.
   * @return The value of the 'orderNumber' field.
   */
  public long getOrderNumber() {
    return orderNumber;
  }


  /**
   * Sets the value of the 'orderNumber' field.
   * @param value the value to set.
   */
  public void setOrderNumber(long value) {
    this.orderNumber = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'store' field.
   * @return The value of the 'store' field.
   */
  public java.lang.CharSequence getStore() {
    return store;
  }


  /**
   * Sets the value of the 'store' field.
   * @param value the value to set.
   */
  public void setStore(java.lang.CharSequence value) {
    this.store = value;
  }

  /**
   * Gets the value of the 'requestTime' field.
   * @return The value of the 'requestTime' field.
   */
  public java.lang.CharSequence getRequestTime() {
    return requestTime;
  }


  /**
   * Sets the value of the 'requestTime' field.
   * @param value the value to set.
   */
  public void setRequestTime(java.lang.CharSequence value) {
    this.requestTime = value;
  }

  /**
   * Gets the value of the 'customerID' field.
   * @return The value of the 'customerID' field.
   */
  public long getCustomerID() {
    return customerID;
  }


  /**
   * Sets the value of the 'customerID' field.
   * @param value the value to set.
   */
  public void setCustomerID(long value) {
    this.customerID = value;
  }

  /**
   * Gets the value of the 'storeSize' field.
   * @return The value of the 'storeSize' field.
   */
  public int getStoreSize() {
    return storeSize;
  }


  /**
   * Sets the value of the 'storeSize' field.
   * @param value the value to set.
   */
  public void setStoreSize(int value) {
    this.storeSize = value;
  }

  /**
   * Gets the value of the 'items' field.
   * @return The value of the 'items' field.
   */
  public java.util.List<completeretail.item> getItems() {
    return items;
  }


  /**
   * Sets the value of the 'items' field.
   * @param value the value to set.
   */
  public void setItems(java.util.List<completeretail.item> value) {
    this.items = value;
  }

  /**
   * Creates a new Order RecordBuilder.
   * @return A new Order RecordBuilder
   */
  public static completeretail.Order.Builder newBuilder() {
    return new completeretail.Order.Builder();
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Order RecordBuilder
   */
  public static completeretail.Order.Builder newBuilder(completeretail.Order.Builder other) {
    if (other == null) {
      return new completeretail.Order.Builder();
    } else {
      return new completeretail.Order.Builder(other);
    }
  }

  /**
   * Creates a new Order RecordBuilder by copying an existing Order instance.
   * @param other The existing instance to copy.
   * @return A new Order RecordBuilder
   */
  public static completeretail.Order.Builder newBuilder(completeretail.Order other) {
    if (other == null) {
      return new completeretail.Order.Builder();
    } else {
      return new completeretail.Order.Builder(other);
    }
  }

  /**
   * RecordBuilder for Order instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Order>
    implements org.apache.avro.data.RecordBuilder<Order> {

    private long orderNumber;
    private java.lang.CharSequence status;
    private java.lang.CharSequence store;
    private java.lang.CharSequence requestTime;
    private long customerID;
    private int storeSize;
    private java.util.List<completeretail.item> items;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(completeretail.Order.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.orderNumber)) {
        this.orderNumber = data().deepCopy(fields()[0].schema(), other.orderNumber);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.store)) {
        this.store = data().deepCopy(fields()[2].schema(), other.store);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.requestTime)) {
        this.requestTime = data().deepCopy(fields()[3].schema(), other.requestTime);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.customerID)) {
        this.customerID = data().deepCopy(fields()[4].schema(), other.customerID);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.storeSize)) {
        this.storeSize = data().deepCopy(fields()[5].schema(), other.storeSize);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.items)) {
        this.items = data().deepCopy(fields()[6].schema(), other.items);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing Order instance
     * @param other The existing instance to copy.
     */
    private Builder(completeretail.Order other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.orderNumber)) {
        this.orderNumber = data().deepCopy(fields()[0].schema(), other.orderNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.status)) {
        this.status = data().deepCopy(fields()[1].schema(), other.status);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.store)) {
        this.store = data().deepCopy(fields()[2].schema(), other.store);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.requestTime)) {
        this.requestTime = data().deepCopy(fields()[3].schema(), other.requestTime);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.customerID)) {
        this.customerID = data().deepCopy(fields()[4].schema(), other.customerID);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.storeSize)) {
        this.storeSize = data().deepCopy(fields()[5].schema(), other.storeSize);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.items)) {
        this.items = data().deepCopy(fields()[6].schema(), other.items);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'orderNumber' field.
      * @return The value.
      */
    public long getOrderNumber() {
      return orderNumber;
    }


    /**
      * Sets the value of the 'orderNumber' field.
      * @param value The value of 'orderNumber'.
      * @return This builder.
      */
    public completeretail.Order.Builder setOrderNumber(long value) {
      validate(fields()[0], value);
      this.orderNumber = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'orderNumber' field has been set.
      * @return True if the 'orderNumber' field has been set, false otherwise.
      */
    public boolean hasOrderNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'orderNumber' field.
      * @return This builder.
      */
    public completeretail.Order.Builder clearOrderNumber() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public completeretail.Order.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.status = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public completeretail.Order.Builder clearStatus() {
      status = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'store' field.
      * @return The value.
      */
    public java.lang.CharSequence getStore() {
      return store;
    }


    /**
      * Sets the value of the 'store' field.
      * @param value The value of 'store'.
      * @return This builder.
      */
    public completeretail.Order.Builder setStore(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.store = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'store' field has been set.
      * @return True if the 'store' field has been set, false otherwise.
      */
    public boolean hasStore() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'store' field.
      * @return This builder.
      */
    public completeretail.Order.Builder clearStore() {
      store = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'requestTime' field.
      * @return The value.
      */
    public java.lang.CharSequence getRequestTime() {
      return requestTime;
    }


    /**
      * Sets the value of the 'requestTime' field.
      * @param value The value of 'requestTime'.
      * @return This builder.
      */
    public completeretail.Order.Builder setRequestTime(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.requestTime = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'requestTime' field has been set.
      * @return True if the 'requestTime' field has been set, false otherwise.
      */
    public boolean hasRequestTime() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'requestTime' field.
      * @return This builder.
      */
    public completeretail.Order.Builder clearRequestTime() {
      requestTime = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'customerID' field.
      * @return The value.
      */
    public long getCustomerID() {
      return customerID;
    }


    /**
      * Sets the value of the 'customerID' field.
      * @param value The value of 'customerID'.
      * @return This builder.
      */
    public completeretail.Order.Builder setCustomerID(long value) {
      validate(fields()[4], value);
      this.customerID = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'customerID' field has been set.
      * @return True if the 'customerID' field has been set, false otherwise.
      */
    public boolean hasCustomerID() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'customerID' field.
      * @return This builder.
      */
    public completeretail.Order.Builder clearCustomerID() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'storeSize' field.
      * @return The value.
      */
    public int getStoreSize() {
      return storeSize;
    }


    /**
      * Sets the value of the 'storeSize' field.
      * @param value The value of 'storeSize'.
      * @return This builder.
      */
    public completeretail.Order.Builder setStoreSize(int value) {
      validate(fields()[5], value);
      this.storeSize = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'storeSize' field has been set.
      * @return True if the 'storeSize' field has been set, false otherwise.
      */
    public boolean hasStoreSize() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'storeSize' field.
      * @return This builder.
      */
    public completeretail.Order.Builder clearStoreSize() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'items' field.
      * @return The value.
      */
    public java.util.List<completeretail.item> getItems() {
      return items;
    }


    /**
      * Sets the value of the 'items' field.
      * @param value The value of 'items'.
      * @return This builder.
      */
    public completeretail.Order.Builder setItems(java.util.List<completeretail.item> value) {
      validate(fields()[6], value);
      this.items = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'items' field has been set.
      * @return True if the 'items' field has been set, false otherwise.
      */
    public boolean hasItems() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'items' field.
      * @return This builder.
      */
    public completeretail.Order.Builder clearItems() {
      items = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Order build() {
      try {
        Order record = new Order();
        record.orderNumber = fieldSetFlags()[0] ? this.orderNumber : (java.lang.Long) defaultValue(fields()[0]);
        record.status = fieldSetFlags()[1] ? this.status : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.store = fieldSetFlags()[2] ? this.store : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.requestTime = fieldSetFlags()[3] ? this.requestTime : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.customerID = fieldSetFlags()[4] ? this.customerID : (java.lang.Long) defaultValue(fields()[4]);
        record.storeSize = fieldSetFlags()[5] ? this.storeSize : (java.lang.Integer) defaultValue(fields()[5]);
        record.items = fieldSetFlags()[6] ? this.items : (java.util.List<completeretail.item>) defaultValue(fields()[6]);
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
    out.writeLong(this.orderNumber);

    out.writeString(this.status);

    out.writeString(this.store);

    out.writeString(this.requestTime);

    out.writeLong(this.customerID);

    out.writeInt(this.storeSize);

    long size0 = this.items.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (completeretail.item e0: this.items) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.orderNumber = in.readLong();

      this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);

      this.store = in.readString(this.store instanceof Utf8 ? (Utf8)this.store : null);

      this.requestTime = in.readString(this.requestTime instanceof Utf8 ? (Utf8)this.requestTime : null);

      this.customerID = in.readLong();

      this.storeSize = in.readInt();

      long size0 = in.readArrayStart();
      java.util.List<completeretail.item> a0 = this.items;
      if (a0 == null) {
        a0 = new SpecificData.Array<completeretail.item>((int)size0, SCHEMA$.getField("items").schema());
        this.items = a0;
      } else a0.clear();
      SpecificData.Array<completeretail.item> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<completeretail.item>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          completeretail.item e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new completeretail.item();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.orderNumber = in.readLong();
          break;

        case 1:
          this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);
          break;

        case 2:
          this.store = in.readString(this.store instanceof Utf8 ? (Utf8)this.store : null);
          break;

        case 3:
          this.requestTime = in.readString(this.requestTime instanceof Utf8 ? (Utf8)this.requestTime : null);
          break;

        case 4:
          this.customerID = in.readLong();
          break;

        case 5:
          this.storeSize = in.readInt();
          break;

        case 6:
          long size0 = in.readArrayStart();
          java.util.List<completeretail.item> a0 = this.items;
          if (a0 == null) {
            a0 = new SpecificData.Array<completeretail.item>((int)size0, SCHEMA$.getField("items").schema());
            this.items = a0;
          } else a0.clear();
          SpecificData.Array<completeretail.item> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<completeretail.item>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              completeretail.item e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new completeretail.item();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










