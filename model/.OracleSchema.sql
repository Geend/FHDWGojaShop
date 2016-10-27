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
    CspgCMDCResult number,
    CspgCMDCResultCls number,
    constraint FCspgCMDCResult foreign key (CspgCMDCResultCls) references Cls (id),
    CspgCMDMyCmmnDt number,
    CspgCMDMyCmmnDtCls number,
    constraint FCspgCMDMyCmmnDt foreign key (CspgCMDMyCmmnDtCls) references Cls (id)    
);

create sequence SSrvr nocache;

create table Srvr(
    id number primary key,
    Cls number not null,
    constraint FSrvrCls foreign key (Cls) references Cls (id) on delete cascade,
    SrvrRtPrdctGrp number,
    SrvrRtPrdctGrpCls number,
    constraint FSrvrRtPrdctGrp foreign key (SrvrRtPrdctGrpCls) references Cls (id),
    SrvrThis number,
    SrvrThisCls number,
    constraint FSrvrThis foreign key (SrvrThisCls) references Cls (id),
    SrvrPassword varchar2(2000),
    SrvrUser varchar2(2000),
    SrvrHackCount number,
    SrvrHackDelay Timestamp    
);
create index IUserSrvr on Srvr (SrvrUser);


create sequence SCrtArtclCMD nocache;

create table CrtArtclCMD(
    id number primary key,
    Cls number not null,
    constraint FCrtArtclCMDCls foreign key (Cls) references Cls (id) on delete cascade,
    CrtArtclCMDNm varchar2(2000),
    CrtArtclCMDPrc varchar2(2000),
    CrtArtclCMDMnStck number,
    CrtArtclCMDMxStck number,
    CrtArtclCMDPrdcrDlvrTm number,
    CrtArtclCMDPrdcr number,
    CrtArtclCMDPrdcrCls number,
    constraint FCrtArtclCMDPrdcr foreign key (CrtArtclCMDPrdcrCls) references Cls (id),
    CrtArtclCMDInvoker number,
    CrtArtclCMDInvokerCls number,
    constraint FCrtArtclCMDInvoker foreign key (CrtArtclCMDInvokerCls) references Cls (id),
    CrtArtclCMDCReceiver number,
    CrtArtclCMDCReceiverCls number,
    constraint FCrtArtclCMDCReceiver foreign key (CrtArtclCMDCReceiverCls) references Cls (id),
    CrtArtclCMDCResult number,
    CrtArtclCMDCResultCls number,
    constraint FCrtArtclCMDCResult foreign key (CrtArtclCMDCResultCls) references Cls (id),
    CrtArtclCMDMyCmmnDt number,
    CrtArtclCMDMyCmmnDtCls number,
    constraint FCrtArtclCMDMyCmmnDt foreign key (CrtArtclCMDMyCmmnDtCls) references Cls (id)    
);

create sequence SCstmrDlvrTm nocache;

create table CstmrDlvrTm(
    id number primary key,
    Cls number not null,
    constraint FCstmrDlvrTmCls foreign key (Cls) references Cls (id) on delete cascade,
    CstmrDlvrTmPrc varchar2(2000),
    CstmrDlvrTmDlvrTm number,
    CstmrDlvrTmThis number,
    CstmrDlvrTmThisCls number,
    constraint FCstmrDlvrTmThis foreign key (CstmrDlvrTmThisCls) references Cls (id)    
);

create sequence SCmmndCrdntr nocache;

create table CmmndCrdntr(
    id number primary key,
    Cls number not null,
    constraint FCmmndCrdntrCls foreign key (Cls) references Cls (id) on delete cascade    
);

create sequence SQntfdArtcl nocache;

create table QntfdArtcl(
    id number primary key,
    Cls number not null,
    constraint FQntfdArtclCls foreign key (Cls) references Cls (id) on delete cascade,
    QntfdArtclQntt number,
    QntfdArtclThis number,
    QntfdArtclThisCls number,
    constraint FQntfdArtclThis foreign key (QntfdArtclThisCls) references Cls (id),
    oqaArtcl number,
    oqaArtclCls number,
    constraint FoqaArtcl foreign key (oqaArtclCls) references Cls (id),
    scqaArtcl number,
    scqaArtclCls number,
    constraint FscqaArtcl foreign key (scqaArtclCls) references Cls (id)    
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

create sequence SCstmrAccnt nocache;

create table CstmrAccnt(
    id number primary key,
    Cls number not null,
    constraint FCstmrAccntCls foreign key (Cls) references Cls (id) on delete cascade,
    CstmrAccntBlnc varchar2(2000),
    CstmrAccntLmt number,
    CstmrAccntShppngCrt number,
    CstmrAccntShppngCrtCls number,
    constraint FCstmrAccntShppngCrt foreign key (CstmrAccntShppngCrtCls) references Cls (id),
    CstmrAccntThis number,
    CstmrAccntThisCls number,
    constraint FCstmrAccntThis foreign key (CstmrAccntThisCls) references Cls (id)    
);

create sequence SAbstrctOrdr nocache;

create table AbstrctOrdr(
    id number primary key,
    Cls number not null,
    constraint FAbstrctOrdrCls foreign key (Cls) references Cls (id) on delete cascade,
    AbstrctOrdrCstmrDlvrTm number,
    AbstrctOrdrCstmrDlvrTmCls number,
    constraint FAbstrctOrdrCstmrDlvrTm foreign key (AbstrctOrdrCstmrDlvrTmCls) references Cls (id),
    AbstrctOrdrThis number,
    AbstrctOrdrThisCls number,
    constraint FAbstrctOrdrThis foreign key (AbstrctOrdrThisCls) references Cls (id)    
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

create sequence SShppngCrt nocache;

create table ShppngCrt(
    id number primary key,
    Cls number not null,
    constraint FShppngCrtCls foreign key (Cls) references Cls (id) on delete cascade,
    ShppngCrtThis number,
    ShppngCrtThisCls number,
    constraint FShppngCrtThis foreign key (ShppngCrtThisCls) references Cls (id)    
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

create sequence SCmmnDt nocache;

create table CmmnDt(
    id number primary key,
    Cls number not null,
    constraint FCmmnDtCls foreign key (Cls) references Cls (id) on delete cascade,
    CmmnDtCrtdt Date,
    CmmnDtCmmtdt Date    
);

create sequence SArtclWrppr nocache;

create table ArtclWrppr(
    id number primary key,
    Cls number not null,
    constraint FArtclWrpprCls foreign key (Cls) references Cls (id) on delete cascade,
    ArtclWrpprArtcl number,
    ArtclWrpprArtclCls number,
    constraint FArtclWrpprArtcl foreign key (ArtclWrpprArtclCls) references Cls (id),
    ArtclWrpprThis number,
    ArtclWrpprThisCls number,
    constraint FArtclWrpprThis foreign key (ArtclWrpprThisCls) references Cls (id),
    oawPrcAtOrdr varchar2(2000)    
);

create sequence SCmmndExctr nocache;

create table CmmndExctr(
    id number primary key,
    Cls number not null,
    constraint FCmmndExctrCls foreign key (Cls) references Cls (id) on delete cascade    
);

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

create sequence SAbstrctOrdrArtcls nocache;

create table AbstrctOrdrArtcls(
    id number primary key,
    frm number not null,
    artcls number not null,
    Cls number not null,
    constraint FAbstrctOrdrArtclsCls foreign key(Cls) references Cls(id) on delete cascade,
    constraint FAbstrctOrdrArtclsfrm foreign key(frm) references AbstrctOrdr(id)
);
create index IFrmAbstrctOrdrArtcls on AbstrctOrdrArtcls(frm);

create sequence SShppngCrtArtcls nocache;

create table ShppngCrtArtcls(
    id number primary key,
    frm number not null,
    artcls number not null,
    Cls number not null,
    constraint FShppngCrtArtclsCls foreign key(Cls) references Cls(id) on delete cascade,
    constraint FShppngCrtArtclsfrm foreign key(frm) references ShppngCrt(id)
);
create index IFrmShppngCrtArtcls on ShppngCrtArtcls(frm);

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

