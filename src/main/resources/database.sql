-- 数据库
create database if not exists ssh_crm character set utf8;
-- user表
create table if not exists t_user(
                                     uid int primary key auto_increment,
                                     username varchar(50),
                                     password varchar(50),
                                     address varchar(50)
);
insert into t_user(username,password,address) values("小赵","123","张家港");
insert into t_user(username,password,address) values("小猪","321","扬州");
insert into t_user(username,password,address) values("小郭","123","四川");
insert into t_user(username,password,address) values("小聪","321","东莞");
insert into t_user(username,password,address) values("rose","46","英国");
insert into t_user(username,password,address) values("lucy","45646s","美国");
insert into t_user(username,password,address) values("tom","sfs342","俄罗斯");
insert into t_user(username,password,address) values("admin","234@rw","北美");
-- 创建数据字典
create table if not exists t_dict(
                                     id varchar(50) primary key,
                                     dname varchar(50)
);
insert into t_dict values("1","vip");
insert into t_dict values("2","普通成员");
insert into t_dict values("3","管理员");
insert into t_dict values("4","超级vip");
-- customer表
create table if not exists t_customer(
                                         cid int primary key auto_increment,
                                         custName varchar(50),
                                         custLevel varchar(50),
                                         custPhone varchar(50),
                                         custMobile varchar(50),
                                         custSource varchar(50),
                                         constraint customer_dict_fk foreign key (custLevel) references t_dict(id)
);
insert into t_customer(custName,custLevel,custPhone,custMobile,custSource) values("百度","4","123","321","报纸");
insert into t_customer(custName,custLevel,custPhone,custMobile,custSource) values("阿里巴巴","1","123","321","书籍");
insert into t_customer(custName,custLevel,custPhone,custMobile,custSource) values("腾讯","1","345","534","网络");
insert into t_customer(custName,custLevel,custPhone,custMobile,custSource) values("水滴筹","1","345","345","电视");
insert into t_customer(custName,custLevel,custPhone,custMobile,custSource) values("蘑菇街","1","78567","678","电视");
insert into t_customer(custName,custLevel,custPhone,custMobile,custSource) values("京东","2","678","678","电线杆");
insert into t_customer(custName,custLevel,custPhone,custMobile,custSource) values("字节跳动","2","234","2342","网络");
insert into t_customer(custName,custLevel,custPhone,custMobile,custSource) values("华为","3","678","678","网络");
insert into t_customer(custName,custLevel,custPhone,custMobile,custSource) values("小米","4","6786","6786","网络");
-- 创建t_linkMan
create table if not exists t_linkman(
                                        linkid int primary key auto_increment,
                                        lkmName varchar(50),
                                        lkmGender varchar(50),
                                        lkmPhone varchar(50),
                                        lkmMobile varchar(50),
                                        clid int,
                                        constraint customer_linkMan_fk foreign key (clid) REFERENCES t_customer(cid)
);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("程思鹏","男","123","12313",1);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("毛吉安娜","男","123123","1313",2);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("陶克宇","男","567","457",3);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("何曼诗","男","567","35677",4);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid)values("梁芳茹","男","567","837367",5);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("王云杰","男","56757","345634",2);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("李天宇","女","58979","373567",5);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("为俊男","女","365346","373567",6);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("王正一","女","3653456","3673722",3);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("何星宇","女","363465","262456",4);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("李毅","女","354636","26256",5);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("降一成","女","35634","254626",6);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("赵立伟","女","36546","4684",7);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("韩建辉","女","3463456","2352",7);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("李闯光","女","2452","235426",6);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("于子文","女","2345235","23542",7);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("定义","女","2525","23542",3);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("照付","女","25425","2534235",5);
insert into t_linkMan (lkmName,lkmGender,lkmPhone,lkmMobile,clid) values("方宇杰","女","2542354","25325",6);
-- 拜访表
create table if not exists t_visit(
                                      vid int primary key auto_increment,
                                      vaddress varchar(50),
                                      vcontent varchar(50),
                                      uvid int,
                                      cvid int,
                                      constraint customer_visit_fk foreign key (cvid) references t_customer(cid),
                                      constraint user_visit_fk foreign key (uvid) references t_user(uid)
);
insert into t_visit(vaddress,vcontent,uvid,cvid) values("日本","东京热",1,2);
insert into t_visit(vaddress,vcontent,uvid,cvid) values("尚硅谷","学习",2,7);
insert into t_visit(vaddress,vcontent,uvid,cvid) values("黑马","学习it",3,5);
insert into t_visit(vaddress,vcontent,uvid,cvid) values("中国","学习文字",4,4);
insert into t_visit(vaddress,vcontent,uvid,cvid) values("中关村","学习技术",4,7);
insert into t_visit(vaddress,vcontent,uvid,cvid) values("张家港","交谈",4,3);
insert into t_visit(vaddress,vcontent,uvid,cvid) values("上海","面试",6,5);
insert into t_visit(vaddress,vcontent,uvid,cvid) values("湖北","旅游",7,3);
insert into t_visit(vaddress,vcontent,uvid,cvid) values("天津","学习",4,5);










