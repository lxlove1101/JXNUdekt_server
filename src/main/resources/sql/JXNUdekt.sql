DROP DATABASE IF EXISTS mini_programs_jxnudekt;
CREATE DATABASE mini_programs_jxnudekt
  DEFAULT CHARSET utf8mb4
  COLLATE utf8mb4_general_ci;
USE mini_programs_jxnudekt;

-- 一级类表
DROP TABLE IF EXISTS dim_activity_type1;
CREATE TABLE dim_activity_type1 (
  id         SMALLINT AUTO_INCREMENT, -- 主键id
  name       VARCHAR(20) NOT NULL, -- 一级类名称
  tag        VARCHAR(10) NOT NULL, -- 一级类标识
  isValid    INT(2)      NOT NULL, -- 是否可用  0:不可用 1:可用
  createTime DATETIME    NOT NULL, -- 创建时间
  modifyTime DATETIME    NOT NULL, -- 修改时间
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  AUTO_INCREMENT = 1;

INSERT INTO dim_activity_type1
VALUES (1, '思想成长', 'A', 1, NOW(), NOW()),
       (2, '实践学习', 'B', 1, NOW(), NOW()),
       (3, '志愿公益', 'C', 1, NOW(), NOW()),
       (4, '创新创业', 'D', 1, NOW(), NOW()),
       (5, '文体活动', 'E', 1, NOW(), NOW()),
       (6, '社会工作', 'F', 1, NOW(), NOW()),
       (7, '技能特长', 'G', 1, NOW(), NOW()),
       (8, '教师技能', 'H', 1, NOW(), NOW());

-- 二级类表
DROP TABLE IF EXISTS dim_activity_type2;
CREATE TABLE dim_activity_type2 (
  id         SMALLINT AUTO_INCREMENT, -- 主键id
  name       VARCHAR(20) NOT NULL, -- 二级类名称
  tag        VARCHAR(10) NOT NULL, -- 二级类标识
  type1Id    SMALLINT    NOT NULL, -- 对应的一级类主键id
  isValid    INT(2)      NOT NULL, -- 是否可用  0:不可用 1:可用
  createTime DATETIME    NOT NULL, -- 创建时间
  modifyTime DATETIME    NOT NULL, -- 修改时间
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  AUTO_INCREMENT = 1;

INSERT INTO dim_activity_type2
VALUES (1, '学术讲座', 'A01', 1, 1, NOW(), NOW()),
       (2, '新生导航课', 'A02', 1, 1, NOW(), NOW()),
       (3, '日常实践活动', 'B01', 2, 1, NOW(), NOW()),
       (4, '假期社会实践', 'C01', 3, 1, NOW(), NOW()),
       (5, '公益社会实践', 'C02', 3, 1, NOW(), NOW()),
       (6, '学术课题', 'D01', 4, 1, NOW(), NOW()),
       (7, '学术论文', 'D02', 4, 1, NOW(), NOW()),
       (8, '科技制作', 'D03', 4, 1, NOW(), NOW()),
       (9, '调查报告', 'D04', 4, 1, NOW(), NOW()),
       (10, '创业实践', 'D05', 4, 1, NOW(), NOW()),
       (11, '其他项目创新', 'D06', 4, 1, NOW(), NOW()),
       (12, '艺术活动', 'E01', 5, 1, NOW(), NOW()),
       (13, '社团活动', 'E02', 5, 1, NOW(), NOW()),
       (14, '学生干部实践', 'F01', 6, 1, NOW(), NOW()),
       (15, '勤工俭(助)学', 'F02', 6, 1, NOW(), NOW()),
       (16, '知识技能竞赛', 'G01', 7, 1, NOW(), NOW()),
       (17, '三字一话', 'H01', 8, 1, NOW(), NOW()),
       (18, '现代教育技术', 'H02', 8, 1, NOW(), NOW()),
       (19, '课堂教学技能', 'H03', 8, 1, NOW(), NOW());

-- 三级类表
DROP TABLE IF EXISTS dim_activity_type3;
CREATE TABLE dim_activity_type3 (
  id         SMALLINT AUTO_INCREMENT, -- 主键id
  name       VARCHAR(128) NOT NULL, -- 三级类名称
  tag        VARCHAR(10)  NOT NULL, -- 三级类标识
  type1Id    SMALLINT     NOT NULL, -- 对应的一级类主键id
  type2Id    SMALLINT     NOT NULL, -- 对应的二级类主键id
  isValid    INT(2)       NOT NULL, -- 是否可用  0:不可用 1:可用
  createTime DATETIME     NOT NULL, -- 创建时间
  modifyTime DATETIME     NOT NULL, -- 修改时间
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  AUTO_INCREMENT = 1;

INSERT INTO dim_activity_type3
VALUES (1, '在校期间参加校、院举办的学术讲座', 'A0101', 1, 1, 1, NOW(), NOW()),
       (2, '应学院、学校要求面向校内外听众开设讲座', 'A0102', 1, 1, 1, NOW(), NOW()),
       (3, '学院开展的新生导航课程', 'A0201', 1, 2, 1, NOW(), NOW()),
       (4, '参与日常社会实践活动', 'B0101', 2, 3, 1, NOW(), NOW()),
       (5, '策划组织日常社会实践活动', 'B0102', 2, 3, 1, NOW(), NOW()),
       (6, '参与学校、学院组队的社会实践', 'C0101', 3, 4, 1, NOW(), NOW()),
       (7, '个人主动联系社会实践地点', 'C0102', 3, 4, 1, NOW(), NOW()),
       (8, '参与省级以上组织组队的社会实践', 'C0103', 3, 4, 1, NOW(), NOW()),
       (9, '参与学校后勤公司组织的校内劳动周劳动', 'C0201', 3, 5, 1, NOW(), NOW()),
       (10, '参与学院组织的社会公益活动或青年志愿者服务', 'C0202', 3, 5, 1, NOW(), NOW()),
       (11, '积极参与学校和省市级单位组织的社会公益活动或青年志愿者服务', 'C0203', 3, 5, 1, NOW(), NOW()),
       (12, '学生利用自身的专业特长辅导其他专业的学生', 'C0204', 3, 5, 1, NOW(), NOW()),
       (13, '申报校级学生学术课题', 'D0101', 4, 6, 1, NOW(), NOW()),
       (14, '申报或参与校级以上课题', 'D0102', 4, 6, 1, NOW(), NOW()),
       (15, '参与学院组织的学术论文竞赛交流活动', 'D0201', 4, 7, 1, NOW(), NOW()),
       (16, '经学院选拔参与学校组织的校内学术论文竞赛交流活动', 'D0202', 4, 7, 1, NOW(), NOW()),
       (17, '代表学校参与省级或省级以上学术论文竞赛交流活动', 'D0203', 4, 7, 1, NOW(), NOW()),
       (18, '以个人名义参与省级或省级以上学术论文竞赛交流活动', 'D0204', 4, 7, 1, NOW(), NOW()),
       (19, '学生在省级以上公开发表学术论文', 'D0205', 4, 7, 1, NOW(), NOW()),
       (20, '参与学院组织的科技制作活动', 'D0301', 4, 8, 1, NOW(), NOW()),
       (21, '经学院选拔参与学校组织的校内科技制作活动', 'D0302', 4, 8, 1, NOW(), NOW()),
       (22, '代表学校参与省级或省级以上科技制作活动', 'D0303', 4, 8, 1, NOW(), NOW()),
       (23, '以个人名义参与省级或省级以上科技制作活动', 'D0304', 4, 8, 1, NOW(), NOW()),
       (24, '发明申请专利获得批准', 'D0305', 4, 8, 1, NOW(), NOW()),
       (25, '参与学院组织的社会调查活动', 'D0401', 4, 9, 1, NOW(), NOW()),
       (26, '经学院选拔参与学校组织的调查活动', 'D0402', 4, 9, 1, NOW(), NOW()),
       (27, '代表学校参与省级或省级以上社会调查活动', 'D0403', 4, 9, 1, NOW(), NOW()),
       (28, '参与学院组织的创业设计大赛活动', 'D0501', 4, 10, 1, NOW(), NOW()),
       (29, '经学院选拔参与学校组织的创业设计大赛活动', 'D0502', 4, 10, 1, NOW(), NOW()),
       (30, '代表学校参与省级或省级以上创业设计大赛活动', 'D0503', 4, 10, 1, NOW(), NOW()),
       (31, '以团队或个人名义开展创业实践活动', 'D0504', 4, 10, 1, NOW(), NOW()),
       (32, '参与经学院或有关职能部门认可，认为确实具有创新的活动项目', 'D0601', 4, 11, 1, NOW(), NOW()),
       (33, '参与学院大学生素质拓展艺术团体训练', 'E0101', 5, 12, 1, NOW(), NOW()),
       (34, '参与学院组织的艺术教育类实践活动', 'E0102', 5, 12, 1, NOW(), NOW()),
       (35, '参与学校组织的艺术教育类实践活动', 'E0103', 5, 12, 1, NOW(), NOW()),
       (36, '代表学校参与省级或省级以上艺术教育类实践活动', 'E0104', 5, 12, 1, NOW(), NOW()),
       (37, '以个人名义参与其他社会机构组织的艺术教育活动', 'E0105', 5, 12, 1, NOW(), NOW()),
       (38, '参加社团组织', 'E0201', 5, 13, 1, NOW(), NOW()),
       (39, '担任干部', 'F0101', 6, 14, 1, NOW(), NOW()),
       (40, '参加勤工俭（助）学活动', 'F0201', 6, 15, 1, NOW(), NOW()),
       (41, '参与学院组织的知识技能竞赛活动', 'G0101', 7, 16, 1, NOW(), NOW()),
       (42, '经学院选拔参与学校组织的知识技能竞赛活动', 'G0102', 7, 16, 1, NOW(), NOW()),
       (43, '代表学校参与省级或省级以上知识技能竞赛活动', 'G0103', 7, 16, 1, NOW(), NOW()),
       (44, '以个人名义参与省级或省级以上知识技能竞赛活动', 'G0104', 7, 16, 1, NOW(), NOW()),
       (45, '参加校素质拓展中心开展的各种技能培训', 'G0105', 7, 16, 1, NOW(), NOW()),
       (46, '参与学院组织的“三字一话”竞赛活动', 'H0101', 8, 17, 1, NOW(), NOW()),
       (47, '经学院选拔参与学校组织的“三字一话”竞赛活动', 'H0102', 8, 17, 1, NOW(), NOW()),
       (48, '代表学校参与省级或省级以上“三字一话”竞赛活动', 'H0103', 8, 17, 1, NOW(), NOW()),
       (49, '参与“三字一话”为内容的培训', 'H0104', 8, 17, 1, NOW(), NOW()),
       (50, '参与学院组织的现代教育技术竞赛活动', 'H0201', 8, 18, 1, NOW(), NOW()),
       (51, '经学院选拔参与学校组织的现代教育技术竞赛活动', 'H0202', 8, 18, 1, NOW(), NOW()),
       (52, '代表学校参与省级或省级以上现代教育技术竞赛活动', 'H0203', 8, 18, 1, NOW(), NOW()),
       (53, '参与现代教育技术培训', 'H0204', 8, 18, 1, NOW(), NOW()),
       (54, '参与学院组织的课堂教学技能竞赛活动', 'H0301', 8, 19, 1, NOW(), NOW()),
       (55, '经学院选拔参与学校组织的课堂教学技能竞赛活动', 'H0302', 8, 19, 1, NOW(), NOW()),
       (56, '代表学校参与省级或省级以上课堂教学技能竞赛活动', 'H0303', 8, 19, 1, NOW(), NOW());

-- 学生用户信息表
DROP TABLE IF EXISTS user_stu;
CREATE TABLE user_stu (
  id         BIGINT AUTO_INCREMENT, -- 主键id
  userId     VARCHAR(32) UNIQUE NOT NULL, -- 用户id(学号)
  password   VARCHAR(20)        NOT NULL, -- 密码
  username   VARCHAR(20)        NOT NULL, -- 用户姓名
  classId    SMALLINT           NOT NULL, -- 班级id
  collegeId  SMALLINT           NOT NULL, -- 学院id
  headImg    VARCHAR(255), -- 头像地址
  sex        TINYINT, -- 性别 0:女 1:男
  telephone  VARCHAR(20), -- 手机号码
  email      VARCHAR(35), -- 邮箱地址
  status     INT(2), -- 用户状态 1:正常 0:暂停登录
  createTime DATETIME           NOT NULL, -- 创建时间
  modifyTime DATETIME           NOT NULL, -- 修改时间
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  AUTO_INCREMENT = 1;

INSERT INTO user_stu
VALUES (null, '201526702027', '123456', '廖翔', 1, 1, 'http://test', 0, '13257097636', '534868492@qq.com', 1, NOW(), NOW()),
       (null, '201526702028', '123456', '廖翔1', 1, 1, 'http://test', 0, '13257097636', '534868492@qq.com', 1, NOW(), NOW()),
       (null, '201526702029', '123456', '廖翔2', 1, 1, 'http://test', 0, '13257097636', '534868492@qq.com', 1, NOW(), NOW()),
       (null, '201526702030', '123456', '廖翔3', 1, 1, 'http://test', 0, '13257097636', '534868492@qq.com', 1, NOW(), NOW()),
       (null, '201526702031', '123456', '廖翔4', 1, 1, 'http://test', 0, '13257097636', '534868492@qq.com', 1, NOW(), NOW());

-- 活动实表
DROP TABLE IF EXISTS FACT_ACTIVITY_INFO;
CREATE TABLE FACT_ACTIVITY_INFO (
  id           BIGINT AUTO_INCREMENT, -- 主键id
  name         VARCHAR(64) NOT NULL,  -- 活动名字
  type1Id      BIGINT      NOT NULL,  -- 活动对应的一级类id
  type2Id      BIGINT      NOT NULL,  -- 活动对应的二级类id
  type3Id      BIGINT      NOT NULL,  -- 活动对应的三级类id
  score        TINYINT     NOT NULL,  -- 活动分数
  status       TINYINT     NOT NULL,  -- 活动状态  0->不可用 1->审核通过 2->未审核
  collegeId    BIGINT      NOT NULL,  -- 学院id
  createUserId VARCHAR(32) NOT NULL,  -- 创建者用户id
  modifyUserId VARCHAR(32) NOT NULL,  -- 修改者用户id
  createTime   DATETIME    NOT NULL,  -- 创建时间
  modifyTime   DATETIME    NOT NULL,  -- 修改时间
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  AUTO_INCREMENT = 1;

-- 学生提交的活动
DROP TABLE IF EXISTS FACT_ACTIVITY_STU_COMMIT;
CREATE TABLE FACT_ACTIVITY_STU_COMMIT (
  id          BIGINT AUTO_INCREMENT,
  userId      VARCHAR(32) NOT NULL,
  activityId  BIGINT      NOT NULL,
  checkStatus TINYINT     NOT NULL,
  checkUserId VARCHAR(32),
  createTime  DATETIME    NOT NULL,
  modifyTime  DATETIME    NOT NULL,
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  AUTO_INCREMENT = 1;

DROP TABLE IF EXISTS FACT_ACTIVITY_STU_INPUT;
CREATE TABLE FACT_ACTIVITY_STU_INPUT (
  id           BIGINT AUTO_INCREMENT,
  userId       VARCHAR(32)  NOT NULL,
  type3Id      VARCHAR(10)  NOT NULL,
  activityName VARCHAR(128) NOT NULL,
  score        TINYINT,
  checkStatus  TINYINT      NOT NULL,
  checkUserId  VARCHAR(32),
  createTime   DATETIME     NOT NULL,
  modifyTime   DATETIME     NOT NULL
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  AUTO_INCREMENT = 1;

-- 学院维表
DROP TABLE IF EXISTS dim_college;
CREATE TABLE dim_college (
  id          SMALLINT AUTO_INCREMENT,
  collegeName VARCHAR(20) UNIQUE NOT NULL,
  tag         VARCHAR(20)        NOT NULL,
  status      TINYINT            NOT NULL,
  createTime  DATETIME           NOT NULL,
  modifyTime  DATETIME           NOT NULL,
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  AUTO_INCREMENT = 1;

INSERT INTO dim_college
VALUES (null, '软件学院', 'ruanjian', 1, NOW(), NOW()),
       (null, '计算机学院', 'jisuanji', 1, NOW(), NOW()),
       (null, '公费师范生学院', 'gongfei', 1, NOW(), NOW()),
       (null, '音乐学院', 'yinyue', 1, NOW(), NOW()),
       (null, '文旅学院', 'wenlv', 1, NOW(), NOW()),
       (null, '文学院', 'wen', 1, NOW(), NOW()),
       (null, '理电学院', 'lidian', 1, NOW(), NOW());

-- 班级维表
DROP TABLE IF EXISTS DIM_CLASS;
CREATE TABLE DIM_CLASS (
  id         BIGINT AUTO_INCREMENT,
  className  VARCHAR(32) UNIQUE NOT NULL,
  tag        VARCHAR(10)        NOT NULL,
  collegeId  BIGINT             NOT NULL,
  createTime DATETIME           NOT NULL,
  modifyTime DATETIME           NOT NULL,
  endTime    DATETIME           NOT NULL,
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = UTF8
  AUTO_INCREMENT = 1;