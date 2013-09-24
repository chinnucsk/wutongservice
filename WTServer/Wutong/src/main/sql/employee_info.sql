CREATE TABLE `employee_info` (
  `circle_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `employee_id` varchar(64) NOT NULL DEFAULT '',
  `email` varchar(128) NOT NULL,
  `name` varchar(128) NOT NULL DEFAULT '',
  `name_en` varchar(128) NOT NULL DEFAULT '',
  `tel` varchar(32) NOT NULL DEFAULT '',
  `mobile_tel` varchar(32) NOT NULL DEFAULT '',
  `department` varchar(128) NOT NULL DEFAULT '',
  `department_en` varchar(128) NOT NULL DEFAULT '',
  `job_title` varchar(128) NOT NULL DEFAULT '',
  `job_title_en` varchar(128) NOT NULL DEFAULT '',
  `comment` varchar(4096) NOT NULL DEFAULT '',
  `sk` varchar(1024) NOT NULL DEFAULT '',
  PRIMARY KEY (`circle_id`,`email`),
  KEY `circle_id` (`circle_id`),
  KEY `name` (`name`),
  KEY `email` (`email`),
  KEY `department` (`department`),
  KEY `job_title` (`job_title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;