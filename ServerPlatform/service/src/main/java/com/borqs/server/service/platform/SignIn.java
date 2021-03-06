/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.borqs.server.service.platform;

@SuppressWarnings("all")
public interface SignIn {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"SignIn\",\"namespace\":\"com.borqs.server.service.platform\",\"types\":[{\"type\":\"error\",\"name\":\"ResponseError\",\"namespace\":\"com.borqs.server.base\",\"fields\":[{\"name\":\"code\",\"type\":\"int\"},{\"name\":\"message\",\"type\":\"string\"}]}],\"messages\":{\"saveSignIn\":{\"request\":[{\"name\":\"sinIn\",\"type\":\"bytes\"}],\"response\":\"boolean\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getSignIn\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"asc\",\"type\":\"boolean\"},{\"name\":\"page\",\"type\":\"int\"},{\"name\":\"count\",\"type\":\"int\"}],\"response\":\"bytes\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getUserShaking\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"dateDiff\",\"type\":\"long\"},{\"name\":\"asc\",\"type\":\"boolean\"},{\"name\":\"page\",\"type\":\"int\"},{\"name\":\"count\",\"type\":\"int\"}],\"response\":\"bytes\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getUserNearBy\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"page\",\"type\":\"int\"},{\"name\":\"count\",\"type\":\"int\"}],\"response\":\"bytes\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"deleteSignIn\":{\"request\":[{\"name\":\"sign_ids\",\"type\":\"string\"}],\"response\":\"boolean\",\"errors\":[\"com.borqs.server.base.ResponseError\"]}}}");
  boolean saveSignIn(java.nio.ByteBuffer sinIn) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.nio.ByteBuffer getSignIn(java.lang.CharSequence userId, boolean asc, int page, int count) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.nio.ByteBuffer getUserShaking(java.lang.CharSequence userId, long dateDiff, boolean asc, int page, int count) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.nio.ByteBuffer getUserNearBy(java.lang.CharSequence userId, int page, int count) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  boolean deleteSignIn(java.lang.CharSequence sign_ids) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;

  @SuppressWarnings("all")
  public interface Callback extends SignIn {
    public static final org.apache.avro.Protocol PROTOCOL = com.borqs.server.service.platform.SignIn.PROTOCOL;
    void saveSignIn(java.nio.ByteBuffer sinIn, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void getSignIn(java.lang.CharSequence userId, boolean asc, int page, int count, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;
    void getUserShaking(java.lang.CharSequence userId, long dateDiff, boolean asc, int page, int count, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;
    void getUserNearBy(java.lang.CharSequence userId, int page, int count, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;
    void deleteSignIn(java.lang.CharSequence sign_ids, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
  }
}