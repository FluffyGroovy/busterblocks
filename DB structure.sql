-- Create table
create table GENRE
(
  GENRE_ID    NUMBER(20) not null,
  DESCRIPTION VARCHAR2(200) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate primary, unique and foreign key constraints 
alter table GENRE
  add constraint GENRE_PK primary key (GENRE_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );


-- Create table
create table ACTOR
(
  ACTOR_ID   NUMBER(20) not null,
  ACTOR_NAME VARCHAR2(200) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate primary, unique and foreign key constraints 
alter table ACTOR
  add constraint ACTOR_PK primary key (ACTOR_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );


-- Create table
create table VIDEO_STATUS
(
  VIDEO_STATUS_ID NUMBER(20) not null,
  DESCRIPTION     VARCHAR2(200) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate primary, unique and foreign key constraints 
alter table VIDEO_STATUS
  add constraint VIDEO_STATUS_PK primary key (VIDEO_STATUS_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );


-- Create table
create table MOVIE
(
  MOVIE_ID            NUMBER(20) not null,
  MOVIE_NAME          VARCHAR2(200) not null,
  GENRE_ID            NUMBER(20),
  DURATION_IN_MINUTES NUMBER(4)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate primary, unique and foreign key constraints 
alter table MOVIE
  add constraint MOVIE_PK primary key (MOVIE_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );


-- Create table
create table VIDEO
(
  VIDEO_ID      NUMBER(20) not null,
  MOVIE_ID      NUMBER(20) not null,
  DATE_RELEASED DATE not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate primary, unique and foreign key constraints 
alter table VIDEO
  add constraint VIDEO_PK primary key (VIDEO_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );


-- Create table
create table VIDEO_ITEM
(
  VIDEO_ITEM_ID   NUMBER(20) not null,
  SERIAL_NUMBER   VARCHAR2(100) not null,
  VIDEO_ID        NUMBER(20) not null,
  DATE_CREATED    DATE,
  VIDEO_STATUS_ID NUMBER(20) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate primary, unique and foreign key constraints 
alter table VIDEO_ITEM
  add constraint VIDEO_ITEM_PK primary key (VIDEO_ITEM_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate indexes 
create index VIDEO_ITEM_UK on VIDEO_ITEM (SERIAL_NUMBER)
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );


-- Create table
create table MOVIE_ACTOR
(
  MOVIE_ID NUMBER(20) not null,
  ACTOR_ID NUMBER(20) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate primary, unique and foreign key constraints 
alter table MOVIE_ACTOR
  add constraint MOVIE_ACTOR_PK primary key (MOVIE_ID, ACTOR_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate indexes 
create index MOVIE_ACTOR_UK on MOVIE_ACTOR (ACTOR_ID, MOVIE_ID)
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );


create or replace view video_view as
select m.movie_id,
       m.movie_name,
       g.genre_id,
       g.description as genre_description,
       a.actor_id,
       a.actor_name,
       m.duration_in_minutes,
       v.video_id,
       v.date_released as date_video_released,
       vi.video_item_id,
       vi.serial_number,
       vi.date_created as date_video_item_created,
       vs.video_status_id,
       vs.description as video_status_description
from movie m, video v, video_item vi, genre g, movie_actor ma, actor a, video_status vs
where m.movie_id = v.movie_id(+)
  and v.video_id = vi.video_id(+)
  and m.genre_id = g.genre_id(+)
  and m.movie_id = ma.movie_id(+)
  and ma.actor_id = a.actor_id(+)
  and vi.video_status_id = vs.video_status_id(+);


-- Create table
create table CUSTOMER
(
  CUSTOMER_ID    NUMBER(20) not null,
  FIRST_NAME     VARCHAR2(100) not null,
  SURNAME        VARCHAR2(100) not null,
  CONTACT_NUMBER VARCHAR2(100),
  ID_NUMBER      VARCHAR2(100)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate primary, unique and foreign key constraints 
alter table CUSTOMER
  add constraint CUSTOMER_PK primary key (CUSTOMER_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate indexes 
create index CUSTOMER_UK on CUSTOMER (CONTACT_NUMBER)
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
create index CUSTOMER_UK2 on CUSTOMER (ID_NUMBER)
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );


-- Create table
create table VIDEO_RENTAL
(
  VIDEO_RENTAL_ID NUMBER(20) not null,
  VIDEO_ITEM_ID   NUMBER(20) not null,
  CUSTOMER_ID     NUMBER(20) not null,
  DATE_BORROWED   DATE not null,
  DATE_DUE        DATE,
  DATE_RETURNED   DATE,
  COMMENTS        VARCHAR2(1000)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
-- Create/Recreate primary, unique and foreign key constraints 
alter table VIDEO_RENTAL
  add constraint VIDEO_RENTAL_PK primary key (VIDEO_RENTAL_ID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );


create or replace view last_video_rental_view as
select "VIDEO_RENTAL_ID","VIDEO_ITEM_ID","CUSTOMER_ID","DATE_BORROWED","DATE_DUE","DATE_RETURNED","COMMENTS"
  from video_rental vr1
 where vr1.date_borrowed =
       (select max(vr2.date_borrowed)
          from video_rental vr2
         where vr1.video_item_id = vr2.video_item_id);


create sequence GENERIC_SEQUENCE;
select GENERIC_SEQUENCE.nextval as NEW_ID from dual;
