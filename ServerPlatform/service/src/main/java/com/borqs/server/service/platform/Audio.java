/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.borqs.server.service.platform;

@SuppressWarnings("all")
public interface Audio {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"Audio\",\"namespace\":\"com.borqs.server.service.platform\",\"types\":[{\"type\":\"error\",\"name\":\"ResponseError\",\"namespace\":\"com.borqs.server.base\",\"fields\":[{\"name\":\"code\",\"type\":\"int\"},{\"name\":\"message\",\"type\":\"string\"}]}],\"messages\":{\"saveAudio\":{\"request\":[{\"name\":\"audio\",\"type\":\"bytes\"}],\"response\":\"boolean\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getAudio\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"asc\",\"type\":\"boolean\"},{\"name\":\"page\",\"type\":\"int\"},{\"name\":\"count\",\"type\":\"int\"}],\"response\":\"bytes\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getAudioById\":{\"request\":[{\"name\":\"audio_id\",\"type\":\"string\"}],\"response\":\"bytes\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"deleteAudio\":{\"request\":[{\"name\":\"audio_ids\",\"type\":\"string\"}],\"response\":\"boolean\",\"errors\":[\"com.borqs.server.base.ResponseError\"]}}}");
  boolean saveAudio(java.nio.ByteBuffer audio) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.nio.ByteBuffer getAudio(java.lang.CharSequence userId, boolean asc, int page, int count) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.nio.ByteBuffer getAudioById(java.lang.CharSequence audio_id) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  boolean deleteAudio(java.lang.CharSequence audio_ids) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;

  @SuppressWarnings("all")
  public interface Callback extends Audio {
    public static final org.apache.avro.Protocol PROTOCOL = com.borqs.server.service.platform.Audio.PROTOCOL;
    void saveAudio(java.nio.ByteBuffer audio, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void getAudio(java.lang.CharSequence userId, boolean asc, int page, int count, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;
    void getAudioById(java.lang.CharSequence audio_id, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;
    void deleteAudio(java.lang.CharSequence audio_ids, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
  }
}