/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50738
 Source Host           : localhost:3306
 Source Schema         : bugcheck

 Target Server Type    : MySQL
 Target Server Version : 50738
 File Encoding         : 65001

 Date: 14/11/2022 00:07:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for data
-- ----------------------------
DROP TABLE IF EXISTS `data`;
CREATE TABLE `data`  (
  `Id` int(11) NOT NULL,
  `ck_oo_numberOfPrivateMethods` double NULL DEFAULT NULL,
  `LDHH_lcom` double NULL DEFAULT NULL,
  `LDHH_fanIn` double NULL DEFAULT NULL,
  `numberOfNonTrivialBugsFoundUntil` double NULL DEFAULT NULL,
  `WCHU_numberOfPublicAttributes` double NULL DEFAULT NULL,
  `WCHU_numberOfAttributes` double NULL DEFAULT NULL,
  `CvsWEntropy` double NULL DEFAULT NULL,
  `LDHH_numberOfPublicMethods` double NULL DEFAULT NULL,
  `WCHU_fanIn` double NULL DEFAULT NULL,
  `LDHH_numberOfPrivateAttributes` double NULL DEFAULT NULL,
  `CvsEntropy` double NULL DEFAULT NULL,
  `LDHH_numberOfPublicAttributes` double NULL DEFAULT NULL,
  `WCHU_numberOfPrivateMethods` double NULL DEFAULT NULL,
  `WCHU_numberOfMethods` double NULL DEFAULT NULL,
  `ck_oo_numberOfPublicAttributes` double NULL DEFAULT NULL,
  `ck_oo_noc` double NULL DEFAULT NULL,
  `numberOfCriticalBugsFoundUntil` double NULL DEFAULT NULL,
  `ck_oo_wmc` double NULL DEFAULT NULL,
  `LDHH_numberOfPrivateMethods` double NULL DEFAULT NULL,
  `WCHU_numberOfPrivateAttributes` double NULL DEFAULT NULL,
  `WCHU_noc` double NULL DEFAULT NULL,
  `ck_oo_fanOut` double NULL DEFAULT NULL,
  `CvsLogEntropy` double NULL DEFAULT NULL,
  `LDHH_numberOfAttributesInherited` double NULL DEFAULT NULL,
  `ck_oo_numberOfLinesOfCode` double NULL DEFAULT NULL,
  `ck_oo_dit` double NULL DEFAULT NULL,
  `WCHU_wmc` double NULL DEFAULT NULL,
  `LDHH_noc` double NULL DEFAULT NULL,
  `ck_oo_numberOfMethods` double NULL DEFAULT NULL,
  `ck_oo_numberOfAttributesInherited` double NULL DEFAULT NULL,
  `WCHU_dit` double NULL DEFAULT NULL,
  `ck_oo_lcom` double NULL DEFAULT NULL,
  `ck_oo_fanIn` double NULL DEFAULT NULL,
  `WCHU_numberOfAttributesInherited` double NULL DEFAULT NULL,
  `ck_oo_rfc` double NULL DEFAULT NULL,
  `LDHH_wmc` double NULL DEFAULT NULL,
  `LDHH_numberOfAttributes` double NULL DEFAULT NULL,
  `LDHH_numberOfLinesOfCode` double NULL DEFAULT NULL,
  `WCHU_fanOut` double NULL DEFAULT NULL,
  `WCHU_lcom` double NULL DEFAULT NULL,
  `ck_oo_cbo` double NULL DEFAULT NULL,
  `WCHU_rfc` double NULL DEFAULT NULL,
  `ck_oo_numberOfAttributes` double NULL DEFAULT NULL,
  `numberOfHighPriorityBugsFoundUntil` double NULL DEFAULT NULL,
  `ck_oo_numberOfPrivateAttributes` double NULL DEFAULT NULL,
  `numberOfMajorBugsFoundUntil` double NULL DEFAULT NULL,
  `WCHU_numberOfPublicMethods` double NULL DEFAULT NULL,
  `LDHH_dit` double NULL DEFAULT NULL,
  `WCHU_cbo` double NULL DEFAULT NULL,
  `CvsLinEntropy` double NULL DEFAULT NULL,
  `WCHU_numberOfMethodsInherited` double NULL DEFAULT NULL,
  `numberOfBugsFoundUntil` double NULL DEFAULT NULL,
  `LDHH_fanOut` double NULL DEFAULT NULL,
  `LDHH_numberOfMethodsInherited` double NULL DEFAULT NULL,
  `LDHH_rfc` double NULL DEFAULT NULL,
  `ck_oo_numberOfMethodsInherited` double NULL DEFAULT NULL,
  `ck_oo_numberOfPublicMethods` double NULL DEFAULT NULL,
  `LDHH_cbo` double NULL DEFAULT NULL,
  `WCHU_numberOfLinesOfCode` double NULL DEFAULT NULL,
  `CvsExpEntropy` double NULL DEFAULT NULL,
  `LDHH_numberOfMethods` double NULL DEFAULT NULL,
  `classes` double NULL DEFAULT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of data
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `Id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `role` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'zxc', '2499249525@qq.com', '123123', NULL);
INSERT INTO `user` VALUES (2, '234213', '3216232944@qq.com', '123', NULL);
INSERT INTO `user` VALUES (3, 'qwfqwf', '3216232944@qq.com', '123', NULL);
INSERT INTO `user` VALUES (4, 'ZXCZXC', '3216232944@qq.com', '123123', NULL);
INSERT INTO `user` VALUES (5, 'ZXCZXCZXC', '3216232944@qq.com', '123', NULL);
INSERT INTO `user` VALUES (6, 'ZXC123', '3216232944@qq.com', '123123', NULL);
INSERT INTO `user` VALUES (7, 'zcx', '739428149@qq.com', '123123', NULL);
INSERT INTO `user` VALUES (8, 'zcxzcx', '3216232944@qq.com', '123123', NULL);
INSERT INTO `user` VALUES (9, '123', NULL, NULL, NULL);
INSERT INTO `user` VALUES (10, '123123', '2499249525@qq.com', '123123', NULL);

SET FOREIGN_KEY_CHECKS = 1;
