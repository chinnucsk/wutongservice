package com.borqs.server.wutong.setting;


import com.borqs.server.base.context.Context;
import com.borqs.server.base.data.Record;

public interface SettingLogic {

    boolean set(Context ctx, String userId, Record values);

    Record gets(Context ctx, String userId, String keys) ;

    Record getsByStartsWith(Context ctx, String userId, String startsWith) ;

    String getDefault(Context ctx, String userId, String key) ;

    Record getByUsers(Context ctx, String key, String users) ;

    boolean setPreferences(Context ctx, String viewerId, Record values);
}