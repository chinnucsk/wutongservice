/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.borqs.server.service.platform;

@SuppressWarnings("all")
public interface SuggestedUser {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"SuggestedUser\",\"namespace\":\"com.borqs.server.service.platform\",\"types\":[{\"type\":\"error\",\"name\":\"ResponseError\",\"namespace\":\"com.borqs.server.base\",\"fields\":[{\"name\":\"code\",\"type\":\"int\"},{\"name\":\"message\",\"type\":\"string\"}]}],\"messages\":{\"refuseSuggestUser\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"suggested\",\"type\":\"string\"}],\"response\":\"boolean\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"deleteSuggestUser\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"suggested\",\"type\":\"string\"}],\"response\":\"boolean\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getSuggestUser\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"limit\",\"type\":\"int\"}],\"response\":\"bytes\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getIfExistSuggestUser\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"suggestUserId\",\"type\":\"string\"}],\"response\":\"bytes\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"createSuggestUser\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"suggestedUsers\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"int\"},{\"name\":\"reason\",\"type\":\"string\"}],\"response\":\"boolean\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"updateSuggestUser\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"suggestedUsers\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"int\"},{\"name\":\"reason\",\"type\":\"string\"}],\"response\":\"boolean\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getWhoSuggest\":{\"request\":[{\"name\":\"to\",\"type\":\"string\"},{\"name\":\"beSuggested\",\"type\":\"string\"}],\"response\":\"string\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"backSuggestUser\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"dateDiff\",\"type\":\"long\"}],\"response\":\"boolean\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getSuggestFromBothFriend\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"}],\"response\":\"bytes\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getSuggestFromHasMyContactinfo\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"}],\"response\":\"bytes\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getSuggestUserHistory\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"limit\",\"type\":\"int\"}],\"response\":\"bytes\",\"errors\":[\"com.borqs.server.base.ResponseError\"]},\"getWhoSuggestedHim\":{\"request\":[{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"beSuggested\",\"type\":\"string\"}],\"response\":\"bytes\",\"errors\":[\"com.borqs.server.base.ResponseError\"]}}}");
  boolean refuseSuggestUser(java.lang.CharSequence userId, java.lang.CharSequence suggested) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  boolean deleteSuggestUser(java.lang.CharSequence userId, java.lang.CharSequence suggested) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.nio.ByteBuffer getSuggestUser(java.lang.CharSequence userId, int limit) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.nio.ByteBuffer getIfExistSuggestUser(java.lang.CharSequence userId, java.lang.CharSequence suggestUserId) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  boolean createSuggestUser(java.lang.CharSequence userId, java.lang.CharSequence suggestedUsers, int type, java.lang.CharSequence reason) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  boolean updateSuggestUser(java.lang.CharSequence userId, java.lang.CharSequence suggestedUsers, int type, java.lang.CharSequence reason) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.lang.CharSequence getWhoSuggest(java.lang.CharSequence to, java.lang.CharSequence beSuggested) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  boolean backSuggestUser(java.lang.CharSequence userId, long dateDiff) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.nio.ByteBuffer getSuggestFromBothFriend(java.lang.CharSequence userId) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.nio.ByteBuffer getSuggestFromHasMyContactinfo(java.lang.CharSequence userId) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.nio.ByteBuffer getSuggestUserHistory(java.lang.CharSequence userId, int limit) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;
  java.nio.ByteBuffer getWhoSuggestedHim(java.lang.CharSequence userId, java.lang.CharSequence beSuggested) throws org.apache.avro.AvroRemoteException, com.borqs.server.base.ResponseError;

  @SuppressWarnings("all")
  public interface Callback extends SuggestedUser {
    public static final org.apache.avro.Protocol PROTOCOL = com.borqs.server.service.platform.SuggestedUser.PROTOCOL;
    void refuseSuggestUser(java.lang.CharSequence userId, java.lang.CharSequence suggested, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void deleteSuggestUser(java.lang.CharSequence userId, java.lang.CharSequence suggested, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void getSuggestUser(java.lang.CharSequence userId, int limit, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;
    void getIfExistSuggestUser(java.lang.CharSequence userId, java.lang.CharSequence suggestUserId, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;
    void createSuggestUser(java.lang.CharSequence userId, java.lang.CharSequence suggestedUsers, int type, java.lang.CharSequence reason, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void updateSuggestUser(java.lang.CharSequence userId, java.lang.CharSequence suggestedUsers, int type, java.lang.CharSequence reason, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void getWhoSuggest(java.lang.CharSequence to, java.lang.CharSequence beSuggested, org.apache.avro.ipc.Callback<java.lang.CharSequence> callback) throws java.io.IOException;
    void backSuggestUser(java.lang.CharSequence userId, long dateDiff, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    void getSuggestFromBothFriend(java.lang.CharSequence userId, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;
    void getSuggestFromHasMyContactinfo(java.lang.CharSequence userId, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;
    void getSuggestUserHistory(java.lang.CharSequence userId, int limit, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;
    void getWhoSuggestedHim(java.lang.CharSequence userId, java.lang.CharSequence beSuggested, org.apache.avro.ipc.Callback<java.nio.ByteBuffer> callback) throws java.io.IOException;
  }
}