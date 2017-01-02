CREATE TABLE `user` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '用户id', 
	`role` CHAR(8) NOT NULL DEFAULT '买家' COLLATE 'utf8_bin' COMMENT '用户角色', 
	`username` VARCHAR(50) NOT NULL UNIQUE COLLATE 'utf8_bin' COMMENT '用户名', 
	`showname` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT '显示名', 
	`password` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT '密码', 
	`sex` CHAR(4) COLLATE 'utf8_bin' COMMENT '性别', 
	`age` SMALLINT COMMENT '年龄', 
	`phone` CHAR(15) COLLATE 'utf8_bin' COMMENT '电话号码', 
	`email` VARCHAR(50) COLLATE 'utf8_bin' COMMENT '邮箱', 
	`address` VARCHAR(100) COLLATE 'utf8_bin' COMMENT '地址', 
	PRIMARY KEY(`id`)
) COLLATE = 'utf8_bin' ENGINE = InnoDB;

CREATE TABLE `book` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '图书id', 
	`name` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT '图书名字', 
	`author` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT '图书作者', 
	`isbn` CHAR(17) UNIQUE COLLATE 'utf8_bin' COMMENT '图书ISBN', 
	`press` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT '出版社', 
	`version` VARCHAR(10) COLLATE 'utf8_bin' COMMENT '版次', 
	`pages` INT(11) COMMENT '页数', 
	`words` INT(11) COMMENT '字数', 
	`press_date` VARCHAR(20) COLLATE 'utf8_bin' COMMENT '印刷时间', 
	`size` INT(11) COMMENT '开本', 
	`paper` VARCHAR(10) COLLATE 'utf8_bin' COMMENT '纸张', 
	`categories` VARCHAR(50) COLLATE 'utf8_bin' COMMENT '类别', 
	PRIMARY KEY(`id`)
) COLLATE = 'utf8_bin' ENGINE = InnoDB;

CREATE TABLE `commodity` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '商品id', 
	`id_book` INT(11) NOT NULL COMMENT '图书id', 
	`state` CHAR(12) NOT NULL DEFAULT '下架' COLLATE 'utf8_bin' COMMENT '是否在架', 
	`id_seller` INT(11) NOT NULL COMMENT '图书id', 
	`price` Double(11, 6) NOT NULL COMMENT '价格', 
	`number` INT(11) NOT NULL COMMENT '库存数量', 
	`title` VARCHAR(200) NOT NULL COLLATE 'utf8_bin' COMMENT '商品标题', 
	`description` VARCHAR(200) NOT NULL COLLATE 'utf8_bin' COMMENT '商品描述', 
	`image` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT '商品图片', 
	`view_count` INT(11) NOT NULL DEFAULT 0 COMMENT '被浏览的次数', 
	PRIMARY KEY(`id`), 
	CONSTRAINT `fk_book` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`), 
	CONSTRAINT `fk_seller` FOREIGN KEY (`id_seller`) REFERENCES `user` (`id`)
) COLLATE = 'utf8_bin' ENGINE = InnoDB;

CREATE TABLE `project` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '项目id', 
	`id_commodity` INT(11) NOT NULL COMMENT '商品id', 
	`number` INT(11) NOT NULL COMMENT '购买数量', 
	PRIMARY KEY(`id`), 
	CONSTRAINT `fk_commodity` FOREIGN KEY (`id_commodity`) REFERENCES `commodity` (`id`)
) COLLATE = 'utf8_bin' ENGINE = InnoDB;

CREATE TABLE `order` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '项目id', 
	`orderId` CHAR(11) NOT NULL UNIQUE COLLATE 'utf8_bin' COMMENT '订单号', 
	`state` CHAR(12) NOT NULL DEFAULT '待确认' COLLATE 'utf8_bin' COMMENT '订单状态', 
	`id_project` INT(11) NOT NULL COMMENT '项目id', 
	`id_buyer` INT(11) NOT NULL COMMENT '买家ID', 
	`timestamp` TIMESTAMP NOT NULL COMMENT '订单生成日期', 
	PRIMARY KEY(`id`), 
	CONSTRAINT `fk_project` FOREIGN KEY (`id_project`) REFERENCES `project`(`id`), 
	CONSTRAINT `fk_buyer` FOREIGN KEY (`id_buyer`) REFERENCES `user`(`id`)
) COLLATE = 'utf8_bin' ENGINE = InnoDB;
