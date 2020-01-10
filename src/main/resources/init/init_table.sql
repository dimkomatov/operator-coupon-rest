CREATE SEQUENCE suo_aismfc_coupon_seq START 1;

CREATE TABLE suo_aismfc_coupon
(
	mid INT PRIMARY KEY DEFAULT nextval('public.suo_aismfc_coupon_seq'::regclass) NOT NULL
	, msgId VARCHAR(64) NOT NULL
	, msgDate TIMESTAMP NOT NULL
	, operatorEMail TEXT NOT NULL
	, couponNumber TEXT NOT NULL
	, operatorId TEXT NOT NULL
	, serviceTypeCodeSuo TEXT NOT NULL
	, serviceTypeNameSuo TEXT NOT NULL
	, callIdSuo TEXT NOT NULL
	, created TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO suo_aismfc_coupon (msgid,msgdate,operatoremail,couponnumber,operatorid,servicetypecodesuo,servicetypenamesuo,callidsuo)
VALUES ('125194',{ts '2019-12-21 00:13:30.784'},'tg','1J005','3846435','37717','Прием','125194');
INSERT INTO suo_aismfc_coupon (msgid,msgdate,operatoremail,couponnumber,operatorid,servicetypecodesuo,servicetypenamesuo,callidsuo)
VALUES ('125195',{ts '2019-12-21 00:14:30.784'},'dm','1P009','3846436','37717','Прием','1251949');
INSERT INTO suo_aismfc_coupon (msgid,msgdate,operatoremail,couponnumber,operatorid,servicetypecodesuo,servicetypenamesuo,callidsuo)
VALUES ('125196',{ts '2019-12-21 00:15:30.784'},'lg','188005','38464226','37717','Уход','12519409');
INSERT INTO suo_aismfc_coupon (msgid,msgdate,operatoremail,couponnumber,operatorid,servicetypecodesuo,servicetypenamesuo,callidsuo)
VALUES ('125197',{ts '2019-12-21 00:17:30.784'},'lg','1880645','384642261','377117','Уход','112519409');