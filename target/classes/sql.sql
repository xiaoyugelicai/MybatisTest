SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `username` varchar(100) DEFAULT NULL,
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES ('sarah', '2', '26');


SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_emp
-- ----------------------------
DROP TABLE IF EXISTS `test_emp`;
CREATE TABLE `test_emp` (
  `name` varchar(100) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `hiredate` datetime DEFAULT NULL,
  `depart` varchar(100) DEFAULT NULL,
  `empno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_emp
-- ----------------------------
INSERT INTO `test_emp` VALUES ('sarah', '24', '0000-00-00 00:00:00', '001', '2001');


SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_depart
-- ----------------------------
DROP TABLE IF EXISTS `test_depart`;
CREATE TABLE `test_depart` (
  `departno` varchar(10) DEFAULT NULL,
  `departname` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_depart
-- ----------------------------
INSERT INTO `test_depart` VALUES ('001', 'dp');
