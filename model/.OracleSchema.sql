create table Cls(
    id number primary key,
    name varchar2(2000) not null,
    concrete number not null
);

create table DeletedObjects(
    id number,
    instanceOf number not null,
    constraint FDeletedObjectsInstanceOf foreign key (instanceOf) references Cls(id) on delete cascade
);
create unique index DltdObjInx on DeletedObjects (id, instanceOf);

create sequence SSpecialization nocache;

create table Specialization (
    id number primary key,
    ancestor number,
    constraint FSpecializationAncestor foreign key (ancestor) references Cls(id) on delete cascade,
    descendant number,
    constraint FSpecializationDescendant foreign key (descendant) references Cls(id) on delete cascade
);

create table Association (
    id number,
    owner number,
    name varchar2(2000),
    constraint FAssociationOwner foreign key (owner) references Cls(id) on delete cascade,
    target number,
    constraint FAssociationTarget foreign key (target) references Cls(id) on delete cascade,
    complexity number
);

create table Association3 (
    id number,
    owner number,
    name varchar2(2000),
    constraint FAssociation3Owner foreign key (owner) references Cls(id) on delete cascade,
    indxx number,
    constraint FAssociation3Indxx foreign key (indxx) references Cls(id) on delete cascade,
    target number,
    constraint FAssociation3Target foreign key (target) references Cls(id) on delete cascade
);

create sequence SPrdcrLst nocache;

create table PrdcrLst(
    id number primary key,
    Cls number not null,
    constraint FPrdcrLstCls foreign key (Cls) references Cls (id) on delete cascade,
    PrdcrLstThis number,
    PrdcrLstThisCls number,
    constraint FPrdcrLstThis foreign key (PrdcrLstThisCls) references Cls (id)    
);

create sequence SSrvr nocache;

create table Srvr(
    id number primary key,
    Cls number not null,
    constraint FSrvrCls foreign key (Cls) references Cls (id) on delete cascade,
    SrvrMngr number,
    SrvrMngrCls number,
    constraint FSrvrMngr foreign key (SrvrMngrCls) references Cls (id),
    SrvrPrmngr number,
    SrvrPrmngrCls number,
    constraint FSrvrPrmngr foreign key (SrvrPrmngrCls) references Cls (id),
    SrvrThis number,
    SrvrThisCls number,
    constraint FSrvrThis foreign key (SrvrThisCls) references Cls (id),
    SrvrPassword varchar2(2000),
    SrvrUser varchar2(2000),
    SrvrHackCount number,
    SrvrHackDelay Timestamp    
);
create index IMngrSrvr on Srvr (SrvrMngr, SrvrMngrCls);
create index IUserSrvr on Srvr (SrvrUser);


create sequence SCrtPrdctGrpCMD nocache;

create table CrtPrdctGrpCMD(
    id number primary key,
    Cls number not null,
    constraint FCrtPrdctGrpCMDCls foreign key (Cls) references Cls (id) on delete cascade,
    CrtPrdctGrpCMDNm varchar2(2000),
    CrtPrdctGrpCMDInvoker number,
    CrtPrdctGrpCMDInvokerCls number,
    constraint FCrtPrdctGrpCMDInvoker foreign key (CrtPrdctGrpCMDInvokerCls) references Cls (id),
    CrtPrdctGrpCMDCReceiver number,
    CrtPrdctGrpCMDCReceiverCls number,
    constraint FCrtPrdctGrpCMDCReceiver foreign key (CrtPrdctGrpCMDCReceiverCls) references Cls (id),
    CrtPrdctGrpCMDMyCmmnDt number,
    CrtPrdctGrpCMDMyCmmnDtCls number,
    constraint FCrtPrdctGrpCMDMyCmmnDt foreign key (CrtPrdctGrpCMDMyCmmnDtCls) references Cls (id)    
);

create sequence SCrtPrdcrCMD nocache;

create table CrtPrdcrCMD(
    id number primary key,
    Cls number not null,
    constraint FCrtPrdcrCMDCls foreign key (Cls) references Cls (id) on delete cascade,
    CrtPrdcrCMDNm varchar2(2000),
    CrtPrdcrCMDInvoker number,
    CrtPrdcrCMDInvokerCls number,
    constraint FCrtPrdcrCMDInvoker foreign key (CrtPrdcrCMDInvokerCls) references Cls (id),
    CrtPrdcrCMDCReceiver number,
    CrtPrdcrCMDCReceiverCls number,
    constraint FCrtPrdcrCMDCReceiver foreign key (CrtPrdcrCMDCReceiverCls) references Cls (id),
    CrtPrdcrCMDMyCmmnDt number,
    CrtPrdcrCMDMyCmmnDtCls number,
    constraint FCrtPrdcrCMDMyCmmnDt foreign key (CrtPrdcrCMDMyCmmnDtCls) references Cls (id)    
);

create sequence SCspgCMD nocache;

create table CspgCMD(
    id number primary key,
    Cls number not null,
    constraint FCspgCMDCls foreign key (Cls) references Cls (id) on delete cascade,
    CspgCMDNm varchar2(2000),
    CspgCMDInvoker number,
    CspgCMDInvokerCls number,
    constraint FCspgCMDInvoker foreign key (CspgCMDInvokerCls) references Cls (id),
    CspgCMDCReceiver number,
    CspgCMDCReceiverCls number,
    constraint FCspgCMDCReceiver foreign key (CspgCMDCReceiverCls) references Cls (id),
    CspgCMDMyCmmnDt number,
    CspgCMDMyCmmnDtCls number,
    constraint FCspgCMDMyCmmnDt foreign key (CspgCMDMyCmmnDtCls) references Cls (id)    
);

create sequence SCmmndCrdntr nocache;

create table CmmndCrdntr(
    id number primary key,
    Cls number not null,
    constraint FCmmndCrdntrCls foreign key (Cls) references Cls (id) on delete cascade    
);

create sequence SPrdcr nocache;

create table Prdcr(
    id number primary key,
    Cls number not null,
    constraint FPrdcrCls foreign key (Cls) references Cls (id) on delete cascade,
    PrdcrNm varchar2(2000),
    PrdcrThis number,
    PrdcrThisCls number,
    constraint FPrdcrThis foreign key (PrdcrThisCls) references Cls (id)    
);

create sequence SAddArtclCMD nocache;

create table AddArtclCMD(
    id number primary key,
    Cls number not null,
    constraint FAddArtclCMDCls foreign key (Cls) references Cls (id) on delete cascade,
    AddArtclCMDNm varchar2(2000),
    AddArtclCMDPrc varchar2(2000),
    AddArtclCMDMnStck number,
    AddArtclCMDMxStck number,
    AddArtclCMDPrdcrDlvrTm number,
    AddArtclCMDPrdcr number,
    AddArtclCMDPrdcrCls number,
    constraint FAddArtclCMDPrdcr foreign key (AddArtclCMDPrdcrCls) references Cls (id),
    AddArtclCMDInvoker number,
    AddArtclCMDInvokerCls number,
    constraint FAddArtclCMDInvoker foreign key (AddArtclCMDInvokerCls) references Cls (id),
    AddArtclCMDCReceiver number,
    AddArtclCMDCReceiverCls number,
    constraint FAddArtclCMDCReceiver foreign key (AddArtclCMDCReceiverCls) references Cls (id),
    AddArtclCMDMyCmmnDt number,
    AddArtclCMDMyCmmnDtCls number,
    constraint FAddArtclCMDMyCmmnDt foreign key (AddArtclCMDMyCmmnDtCls) references Cls (id)    
);

create sequence SArtclStt nocache;

create table ArtclStt(
    id number primary key,
    Cls number not null,
    constraint FArtclSttCls foreign key (Cls) references Cls (id) on delete cascade,
    ArtclSttThis number,
    ArtclSttThisCls number,
    constraint FArtclSttThis foreign key (ArtclSttThisCls) references Cls (id)    
);

create sequence SCmpnntLst nocache;

create table CmpnntLst(
    id number primary key,
    Cls number not null,
    constraint FCmpnntLstCls foreign key (Cls) references Cls (id) on delete cascade,
    CmpnntLstThis number,
    CmpnntLstThisCls number,
    constraint FCmpnntLstThis foreign key (CmpnntLstThisCls) references Cls (id)    
);

create sequence SCmpnnt nocache;

create table Cmpnnt(
    id number primary key,
    Cls number not null,
    constraint FCmpnntCls foreign key (Cls) references Cls (id) on delete cascade,
    CmpnntNm varchar2(2000),
    CmpnntThis number,
    CmpnntThisCls number,
    constraint FCmpnntThis foreign key (CmpnntThisCls) references Cls (id),
    ArtclPrc varchar2(2000),
    ArtclMnStck number,
    ArtclMxStck number,
    ArtclCrrntStck number,
    ArtclPrdcrDlvrTm number,
    ArtclPrdcr number,
    ArtclPrdcrCls number,
    constraint FArtclPrdcr foreign key (ArtclPrdcrCls) references Cls (id),
    ArtclStt number,
    ArtclSttCls number,
    constraint FArtclStt foreign key (ArtclSttCls) references Cls (id)    
);

create sequence SCmmnDt nocache;

create table CmmnDt(
    id number primary key,
    Cls number not null,
    constraint FCmmnDtCls foreign key (Cls) references Cls (id) on delete cascade,
    CmmnDtCrtdt Date,
    CmmnDtCmmtdt Date    
);

create sequence SCmmndExctr nocache;

create table CmmndExctr(
    id number primary key,
    Cls number not null,
    constraint FCmmndExctrCls foreign key (Cls) references Cls (id) on delete cascade    
);

create sequence SPrdcrLstCurrProd nocache;

create table PrdcrLstCurrProd(
    id number primary key,
    frm number not null,
    currProd number not null,
    Cls number not null,
    constraint FPrdcrLstCurrProdCls foreign key(Cls) references Cls(id) on delete cascade,
    constraint FPrdcrLstCurrProdfrm foreign key(frm) references PrdcrLst(id)
);
create index IFrmPrdcrLstCurrProd on PrdcrLstCurrProd(frm);

create sequence SPrdctGrpCmpnnts nocache;

create table PrdctGrpCmpnnts(
    id number primary key,
    frm number not null,
    cmpnnts number not null,
    Cls number not null,
    constraint FPrdctGrpCmpnntsCls foreign key(Cls) references Cls(id) on delete cascade,
    constraint FPrdctGrpCmpnntsfrm foreign key(frm) references Cmpnnt(id)
);
create index IFrmPrdctGrpCmpnnts on PrdctGrpCmpnnts(frm);

create sequence SCmmndCrdntrExctr nocache;

create table CmmndCrdntrExctr(
    id number primary key,
    frm number not null,
    exctr number not null,
    Cls number not null,
    constraint FCmmndCrdntrExctrCls foreign key(Cls) references Cls(id) on delete cascade,
    constraint FCmmndCrdntrExctrfrm foreign key(frm) references CmmndCrdntr(id)
);
create index IFrmCmmndCrdntrExctr on CmmndCrdntrExctr(frm);

create sequence SCmpnntLstCurrComps nocache;

create table CmpnntLstCurrComps(
    id number primary key,
    frm number not null,
    currComps number not null,
    Cls number not null,
    constraint FCmpnntLstCurrCompsCls foreign key(Cls) references Cls(id) on delete cascade,
    constraint FCmpnntLstCurrCompsfrm foreign key(frm) references CmpnntLst(id)
);
create index IFrmCmpnntLstCurrComps on CmpnntLstCurrComps(frm);

create sequence SCmmndExctrCommands nocache;

create table CmmndExctrCommands(
    id number primary key,
    frm number not null,
    commands number not null,
    Cls number not null,
    constraint FCmmndExctrCommandsCls foreign key(Cls) references Cls(id) on delete cascade,
    constraint FCmmndExctrCommandsfrm foreign key(frm) references CmmndExctr(id)
);
create index IFrmCmmndExctrCommands on CmmndExctrCommands(frm);

