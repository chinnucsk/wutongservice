#!/bin/bash
source /etc/profile
/home/wutong/workWT/dist-r3-distribution/bin/bsapp -Dlogback.configurationFile=/home/wutong/workWT/dist-r3-distribution/etc/production.logback.xml com.borqs.server.qiupu.util.market.AppMarketInfoReader /home/wutong/workWT/dist-r3-distribution/etc/production.config.properties
