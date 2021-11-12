DROP TABLE IF EXISTS cat;

CREATE TABLE cat
(
    id BIGINT(20) NOT NULL COMMENT '主键ID',
    name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age INT(11) NULL DEFAULT NULL COMMENT '年龄',
    color VARCHAR(50) NULL DEFAULT NULL COMMENT '颜色',
    score DOUBLE NULL DEFAULT NULL COMMENT '分数',
    PRIMARY KEY (id)
);