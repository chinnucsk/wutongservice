package com.borqs.server.base.util.email;

import com.borqs.server.base.conf.Configuration;

public interface AsyncTaskListener
{
	void sendEmail(String title, String to, String username, String content, Configuration config, String type, String lang);
}