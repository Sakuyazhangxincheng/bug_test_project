/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2022/10/2 22:08:25                           */
/*==============================================================*/


drop table if exists Data;

drop table if exists User;

/*==============================================================*/
/* Table: Data                                                  */
/*==============================================================*/
create table Data
(
   Id                   int not null,
   ck_oo_numberOfPrivateMethods double,
   LDHH_lcom            double,
   LDHH_fanIn           double,
   numberOfNonTrivialBugsFoundUntil double,
   WCHU_numberOfPublicAttributes double,
   WCHU_numberOfAttributes double,
   CvsWEntropy          double,
   LDHH_numberOfPublicMethods double,
   WCHU_fanIn           double,
   LDHH_numberOfPrivateAttributes double,
   CvsEntropy           double,
   LDHH_numberOfPublicAttributes double,
   WCHU_numberOfPrivateMethods double,
   WCHU_numberOfMethods double,
   ck_oo_numberOfPublicAttributes double,
   ck_oo_noc            double,
   numberOfCriticalBugsFoundUntil double,
   ck_oo_wmc            double,
   LDHH_numberOfPrivateMethods double,
   WCHU_numberOfPrivateAttributes double,
   WCHU_noc             double,
   ck_oo_fanOut         double,
   CvsLogEntropy        double,
   LDHH_numberOfAttributesInherited double,
   ck_oo_numberOfLinesOfCode double,
   ck_oo_dit            double,
   WCHU_wmc             double,
   LDHH_noc             double,
   ck_oo_numberOfMethods double,
   ck_oo_numberOfAttributesInherited double,
   WCHU_dit             double,
   ck_oo_lcom           double,
   ck_oo_fanIn          double,
   WCHU_numberOfAttributesInherited double,
   ck_oo_rfc            double,
   LDHH_wmc             double,
   LDHH_numberOfAttributes double,
   LDHH_numberOfLinesOfCode double,
   WCHU_fanOut          double,
   WCHU_lcom            double,
   ck_oo_cbo            double,
   WCHU_rfc             double,
   ck_oo_numberOfAttributes double,
   numberOfHighPriorityBugsFoundUntil double,
   ck_oo_numberOfPrivateAttributes double,
   numberOfMajorBugsFoundUntil double,
   WCHU_numberOfPublicMethods double,
   LDHH_dit             double,
   WCHU_cbo             double,
   CvsLinEntropy        double,
   WCHU_numberOfMethodsInherited double,
   numberOfBugsFoundUntil double,
   LDHH_fanOut          double,
   LDHH_numberOfMethodsInherited double,
   LDHH_rfc             double,
   ck_oo_numberOfMethodsInherited double,
   ck_oo_numberOfPublicMethods double,
   LDHH_cbo             double,
   WCHU_numberOfLinesOfCode double,
   CvsExpEntropy        double,
   LDHH_numberOfMethods double,
   classes                double,
   primary key (Id)
);

/*==============================================================*/
/* Table: User                                                  */
/*==============================================================*/
create table User
(
   Id                   int not null,
   name                 varchar(255),
   email                varchar(255),
   password             varchar(255),
   role                 int,
   primary key (Id)
);

