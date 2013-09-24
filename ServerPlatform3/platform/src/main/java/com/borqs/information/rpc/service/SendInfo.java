/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.borqs.information.rpc.service;
@SuppressWarnings("all")
public class SendInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"SendInfo\",\"namespace\":\"com.borqs.information.rpc.service\",\"fields\":[{\"name\":\"appId\",\"type\":\"string\"},{\"name\":\"senderId\",\"type\":\"string\"},{\"name\":\"receiverId\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"action\",\"type\":[\"null\",\"string\"]},{\"name\":\"uri\",\"type\":[\"null\",\"string\"]},{\"name\":\"title\",\"type\":[\"null\",\"string\"]},{\"name\":\"data\",\"type\":[\"null\",\"string\"]},{\"name\":\"processMethod\",\"type\":[\"null\",\"int\"]},{\"name\":\"importance\",\"type\":[\"null\",\"int\"]},{\"name\":\"guid\",\"type\":[\"null\",\"string\"]},{\"name\":\"body\",\"type\":[\"null\",\"string\"]},{\"name\":\"bodyHtml\",\"type\":[\"null\",\"string\"]},{\"name\":\"titleHtml\",\"type\":[\"null\",\"string\"]},{\"name\":\"objectId\",\"type\":[\"null\",\"string\"]}]}");
  public CharSequence appId;
  public CharSequence senderId;
  public CharSequence receiverId;
  public CharSequence type;
  public CharSequence action;
  public CharSequence uri;
  public CharSequence title;
  public CharSequence data;
  public Integer processMethod;
  public Integer importance;
  public CharSequence guid;
  public CharSequence body;
  public CharSequence bodyHtml;
  public CharSequence titleHtml;
  public CharSequence objectId;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return appId;
    case 1: return senderId;
    case 2: return receiverId;
    case 3: return type;
    case 4: return action;
    case 5: return uri;
    case 6: return title;
    case 7: return data;
    case 8: return processMethod;
    case 9: return importance;
    case 10: return guid;
    case 11: return body;
    case 12: return bodyHtml;
    case 13: return titleHtml;
    case 14: return objectId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: appId = (CharSequence)value$; break;
    case 1: senderId = (CharSequence)value$; break;
    case 2: receiverId = (CharSequence)value$; break;
    case 3: type = (CharSequence)value$; break;
    case 4: action = (CharSequence)value$; break;
    case 5: uri = (CharSequence)value$; break;
    case 6: title = (CharSequence)value$; break;
    case 7: data = (CharSequence)value$; break;
    case 8: processMethod = (Integer)value$; break;
    case 9: importance = (Integer)value$; break;
    case 10: guid = (CharSequence)value$; break;
    case 11: body = (CharSequence)value$; break;
    case 12: bodyHtml = (CharSequence)value$; break;
    case 13: titleHtml = (CharSequence)value$; break;
    case 14: objectId = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}