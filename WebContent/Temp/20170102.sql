CREATE TABLE `user` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '�û�id', 
	`role` CHAR(8) NOT NULL DEFAULT '���' COLLATE 'utf8_bin' COMMENT '�û���ɫ', 
	`username` VARCHAR(50) NOT NULL UNIQUE COLLATE 'utf8_bin' COMMENT '�û���', 
	`showname` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT '��ʾ��', 
	`password` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT '����', 
	`sex` CHAR(4) COLLATE 'utf8_bin' COMMENT '�Ա�', 
	`age` SMALLINT COMMENT '����', 
	`phone` CHAR(15) COLLATE 'utf8_bin' COMMENT '�绰����', 
	`email` VARCHAR(50) COLLATE 'utf8_bin' COMMENT '����', 
	`address` VARCHAR(100) COLLATE 'utf8_bin' COMMENT '��ַ', 
	PRIMARY KEY(`id`)
) COLLATE = 'utf8_bin' ENGINE = InnoDB;

CREATE TABLE `book` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'ͼ��id', 
	`name` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT 'ͼ������', 
	`author` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT 'ͼ������', 
	`isbn` CHAR(17) UNIQUE COLLATE 'utf8_bin' COMMENT 'ͼ��ISBN', 
	`press` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT '������', 
	`version` VARCHAR(10) COLLATE 'utf8_bin' COMMENT '���', 
	`pages` INT(11) COMMENT 'ҳ��', 
	`words` INT(11) COMMENT '����', 
	`press_date` VARCHAR(20) COLLATE 'utf8_bin' COMMENT 'ӡˢʱ��', 
	`size` INT(11) COMMENT '����', 
	`paper` VARCHAR(10) COLLATE 'utf8_bin' COMMENT 'ֽ��', 
	`categories` VARCHAR(50) COLLATE 'utf8_bin' COMMENT '���', 
	PRIMARY KEY(`id`)
) COLLATE = 'utf8_bin' ENGINE = InnoDB;

CREATE TABLE `commodity` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '��Ʒid', 
	`id_book` INT(11) NOT NULL COMMENT 'ͼ��id', 
	`state` CHAR(12) NOT NULL DEFAULT '�¼�' COLLATE 'utf8_bin' COMMENT '�Ƿ��ڼ�', 
	`id_seller` INT(11) NOT NULL COMMENT 'ͼ��id', 
	`price` Double(11, 6) NOT NULL COMMENT '�۸�', 
	`number` INT(11) NOT NULL COMMENT '�������', 
	`title` VARCHAR(200) NOT NULL COLLATE 'utf8_bin' COMMENT '��Ʒ����', 
	`description` VARCHAR(200) NOT NULL COLLATE 'utf8_bin' COMMENT '��Ʒ����', 
	`image` VARCHAR(50) NOT NULL COLLATE 'utf8_bin' COMMENT '��ƷͼƬ', 
	`view_count` INT(11) NOT NULL DEFAULT 0 COMMENT '������Ĵ���', 
	PRIMARY KEY(`id`), 
	CONSTRAINT `fk_book` FOREIGN KEY (`id_book`) REFERENCES `book` (`id`), 
	CONSTRAINT `fk_seller` FOREIGN KEY (`id_seller`) REFERENCES `user` (`id`)
) COLLATE = 'utf8_bin' ENGINE = InnoDB;

CREATE TABLE `project` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '��Ŀid', 
	`id_commodity` INT(11) NOT NULL COMMENT '��Ʒid', 
	`number` INT(11) NOT NULL COMMENT '��������', 
	PRIMARY KEY(`id`), 
	CONSTRAINT `fk_commodity` FOREIGN KEY (`id_commodity`) REFERENCES `commodity` (`id`)
) COLLATE = 'utf8_bin' ENGINE = InnoDB;

CREATE TABLE `order` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '��Ŀid', 
	`orderId` CHAR(11) NOT NULL UNIQUE COLLATE 'utf8_bin' COMMENT '������', 
	`state` CHAR(12) NOT NULL DEFAULT '��ȷ��' COLLATE 'utf8_bin' COMMENT '����״̬', 
	`id_project` INT(11) NOT NULL COMMENT '��Ŀid', 
	`id_buyer` INT(11) NOT NULL COMMENT '���ID', 
	`timestamp` TIMESTAMP NOT NULL COMMENT '������������', 
	PRIMARY KEY(`id`), 
	CONSTRAINT `fk_project` FOREIGN KEY (`id_project`) REFERENCES `project`(`id`), 
	CONSTRAINT `fk_buyer` FOREIGN KEY (`id_buyer`) REFERENCES `user`(`id`)
) COLLATE = 'utf8_bin' ENGINE = InnoDB;
