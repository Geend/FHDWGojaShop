create sequence SObj nocache;
CREATE TABLE Obj (
    id NUMBER PRIMARY KEY,
    instanceOf NUMBER NOT NULL,
    oldId NUMBER,
    IntegerValue number,
    StringValue varchar2(2000),
    DateValue Date,
    TimestampValue Timestamp,
    FractionValue varchar2(2000),
    TextValue CLOB,
    OldOrNewEntry varchar(1)
    
);

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from Srvr;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from CstmrDlvrTm;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from CmmndCrdntr;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from QntfdArtcl;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from Cmpnnt;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from CstmrAccnt;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from AbstrctOrdr;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from Prdcr;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from ShppngCrt;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from ArtclStt;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from CmmnDt;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from ArtclWrppr;

insert into Obj (id,instanceOf,oldId)
select SObj.nextval, Cls, id
from CmmndExctr;

alter table Obj add CONSTRAINT FObjCls FOREIGN KEY (instanceOf) REFERENCES Cls(id);
create index OldObjectIndex on Obj (oldId);

create index IntegerValueIndex on Obj (IntegerValue);

create index StringValueIndex on Obj (StringValue);

create index DateValueIndex on Obj (DateValue);

create index TimestampValueIndex on Obj (TimestampValue);

create index FractionValueIndex on Obj (FractionValue);

alter table Association add constraint AssPK primary key (id);
alter table Association3 add constraint Ass3PK primary key (id);
CREATE SEQUENCE SLnk NOCACHE;
CREATE SEQUENCE SLnk3 NOCACHE;
CREATE TABLE Lnk (
    id NUMBER PRIMARY KEY,
    owner NUMBER NOT NULL,
    target NUMBER,
    instanceOf NUMBER NOT NULL,
    oldId NUMBER
);

CREATE TABLE Lnk3 (
    id NUMBER PRIMARY KEY,
    owner NUMBER NOT NULL,
    indxx NUMBER NOT NULL,
    target NUMBER NOT NULL,
    instanceOf NUMBER NOT NULL,
    oldId NUMBER
);

create table TextValue(
    id number primary key,
    value CLOB
);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10002
from Srvr t, Obj objTarget, Obj objOwner
where t.SrvrThis is not null and t.SrvrThis = objTarget.oldId and t.SrvrThisCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Obj(id, instanceOf, StringValue, OldOrNewEntry)
select SObj.nextval, 2, SrvrPassword, 'n'
from (select distinct SrvrPassword from Srvr)
where SrvrPassword not in (select StringValue from Obj where OldOrNewEntry = 'o' and StringValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10004
from Srvr t, Obj objTarget, Obj objOwner
where t.SrvrPassword is not null and t.SrvrPassword = objTarget.StringValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, StringValue, OldOrNewEntry)
select SObj.nextval, 2, SrvrUser, 'n'
from (select distinct SrvrUser from Srvr)
where SrvrUser not in (select StringValue from Obj where OldOrNewEntry = 'o' and StringValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10005
from Srvr t, Obj objTarget, Obj objOwner
where t.SrvrUser is not null and t.SrvrUser = objTarget.StringValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, IntegerValue, OldOrNewEntry)
select SObj.nextval, 1, SrvrHackCount, 'n'
from (select distinct SrvrHackCount from Srvr)
where SrvrHackCount not in (select IntegerValue from Obj where OldOrNewEntry = 'o' and IntegerValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10006
from Srvr t, Obj objTarget, Obj objOwner
where t.SrvrHackCount is not null and t.SrvrHackCount = objTarget.IntegerValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, TimestampValue, OldOrNewEntry)
select SObj.nextval, 5, SrvrHackDelay, 'n'
from (select distinct SrvrHackDelay from Srvr)
where SrvrHackDelay not in (select TimestampValue from Obj where OldOrNewEntry = 'o' and TimestampValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10007
from Srvr t, Obj objTarget, Obj objOwner
where t.SrvrHackDelay is not null and t.SrvrHackDelay = objTarget.TimestampValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, FractionValue, OldOrNewEntry)
select SObj.nextval, 6, CstmrDlvrTmPrc, 'n'
from (select distinct CstmrDlvrTmPrc from CstmrDlvrTm)
where CstmrDlvrTmPrc not in (select FractionValue from Obj where OldOrNewEntry = 'o' and FractionValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10031
from CstmrDlvrTm t, Obj objTarget, Obj objOwner
where t.CstmrDlvrTmPrc is not null and t.CstmrDlvrTmPrc = objTarget.FractionValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, IntegerValue, OldOrNewEntry)
select SObj.nextval, 1, CstmrDlvrTmDlvrTm, 'n'
from (select distinct CstmrDlvrTmDlvrTm from CstmrDlvrTm)
where CstmrDlvrTmDlvrTm not in (select IntegerValue from Obj where OldOrNewEntry = 'o' and IntegerValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10032
from CstmrDlvrTm t, Obj objTarget, Obj objOwner
where t.CstmrDlvrTmDlvrTm is not null and t.CstmrDlvrTmDlvrTm = objTarget.IntegerValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10033
from CstmrDlvrTm t, Obj objTarget, Obj objOwner
where t.CstmrDlvrTmThis is not null and t.CstmrDlvrTmThis = objTarget.oldId and t.CstmrDlvrTmThisCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf, oldId)
select SLnk.nextval, objOwner.id, objTarget.id, 10001, relation.id
from CmmndCrdntrExctr relation, CmmndCrdntr ownerTable, Obj objTarget, Obj objOwner
where relation.exctr = objTarget.oldId
and   relation.Cls = objTarget.instanceOf
and   relation.frm = objOwner.oldId
and   relation.frm = ownerTable.id
and   ownerTable.Cls = objOwner.instanceOf;

insert into Obj(id, instanceOf, IntegerValue, OldOrNewEntry)
select SObj.nextval, 1, QntfdArtclQntt, 'n'
from (select distinct QntfdArtclQntt from QntfdArtcl)
where QntfdArtclQntt not in (select IntegerValue from Obj where OldOrNewEntry = 'o' and IntegerValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10026
from QntfdArtcl t, Obj objTarget, Obj objOwner
where t.QntfdArtclQntt is not null and t.QntfdArtclQntt = objTarget.IntegerValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10027
from QntfdArtcl t, Obj objTarget, Obj objOwner
where t.QntfdArtclThis is not null and t.QntfdArtclThis = objTarget.oldId and t.QntfdArtclThisCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10043
from QntfdArtcl t, Obj objTarget, Obj objOwner
where t.oqaArtcl is not null and t.oqaArtcl = objTarget.oldId and t.oqaArtclCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10044
from QntfdArtcl t, Obj objTarget, Obj objOwner
where t.scqaArtcl is not null and t.scqaArtcl = objTarget.oldId and t.scqaArtclCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10029
from Cmpnnt t, Obj objTarget, Obj objOwner
where t.CmpnntThis is not null and t.CmpnntThis = objTarget.oldId and t.CmpnntThisCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf, oldId)
select SLnk.nextval, objOwner.id, objTarget.id, 10013, relation.id
from PrdctGrpCmpnnts relation, Cmpnnt ownerTable, Obj objTarget, Obj objOwner
where relation.cmpnnts = objTarget.oldId
and   relation.Cls = objTarget.instanceOf
and   relation.frm = objOwner.oldId
and   relation.frm = ownerTable.id
and   ownerTable.Cls = objOwner.instanceOf;

insert into Obj(id, instanceOf, StringValue, OldOrNewEntry)
select SObj.nextval, 2, ArtclNm, 'n'
from (select distinct ArtclNm from Cmpnnt)
where ArtclNm not in (select StringValue from Obj where OldOrNewEntry = 'o' and StringValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10014
from Cmpnnt t, Obj objTarget, Obj objOwner
where t.ArtclNm is not null and t.ArtclNm = objTarget.StringValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, FractionValue, OldOrNewEntry)
select SObj.nextval, 6, ArtclPrc, 'n'
from (select distinct ArtclPrc from Cmpnnt)
where ArtclPrc not in (select FractionValue from Obj where OldOrNewEntry = 'o' and FractionValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10015
from Cmpnnt t, Obj objTarget, Obj objOwner
where t.ArtclPrc is not null and t.ArtclPrc = objTarget.FractionValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, IntegerValue, OldOrNewEntry)
select SObj.nextval, 1, ArtclMnStck, 'n'
from (select distinct ArtclMnStck from Cmpnnt)
where ArtclMnStck not in (select IntegerValue from Obj where OldOrNewEntry = 'o' and IntegerValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10016
from Cmpnnt t, Obj objTarget, Obj objOwner
where t.ArtclMnStck is not null and t.ArtclMnStck = objTarget.IntegerValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, IntegerValue, OldOrNewEntry)
select SObj.nextval, 1, ArtclMxStck, 'n'
from (select distinct ArtclMxStck from Cmpnnt)
where ArtclMxStck not in (select IntegerValue from Obj where OldOrNewEntry = 'o' and IntegerValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10017
from Cmpnnt t, Obj objTarget, Obj objOwner
where t.ArtclMxStck is not null and t.ArtclMxStck = objTarget.IntegerValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, IntegerValue, OldOrNewEntry)
select SObj.nextval, 1, ArtclCrrntStck, 'n'
from (select distinct ArtclCrrntStck from Cmpnnt)
where ArtclCrrntStck not in (select IntegerValue from Obj where OldOrNewEntry = 'o' and IntegerValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10018
from Cmpnnt t, Obj objTarget, Obj objOwner
where t.ArtclCrrntStck is not null and t.ArtclCrrntStck = objTarget.IntegerValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, IntegerValue, OldOrNewEntry)
select SObj.nextval, 1, ArtclPrdcrDlvrTm, 'n'
from (select distinct ArtclPrdcrDlvrTm from Cmpnnt)
where ArtclPrdcrDlvrTm not in (select IntegerValue from Obj where OldOrNewEntry = 'o' and IntegerValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10019
from Cmpnnt t, Obj objTarget, Obj objOwner
where t.ArtclPrdcrDlvrTm is not null and t.ArtclPrdcrDlvrTm = objTarget.IntegerValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10020
from Cmpnnt t, Obj objTarget, Obj objOwner
where t.ArtclPrdcr is not null and t.ArtclPrdcr = objTarget.oldId and t.ArtclPrdcrCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10045
from Cmpnnt t, Obj objTarget, Obj objOwner
where t.ArtclStt is not null and t.ArtclStt = objTarget.oldId and t.ArtclSttCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Obj(id, instanceOf, FractionValue, OldOrNewEntry)
select SObj.nextval, 6, CstmrAccntBlnc, 'n'
from (select distinct CstmrAccntBlnc from CstmrAccnt)
where CstmrAccntBlnc not in (select FractionValue from Obj where OldOrNewEntry = 'o' and FractionValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10021
from CstmrAccnt t, Obj objTarget, Obj objOwner
where t.CstmrAccntBlnc is not null and t.CstmrAccntBlnc = objTarget.FractionValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, IntegerValue, OldOrNewEntry)
select SObj.nextval, 1, CstmrAccntLmt, 'n'
from (select distinct CstmrAccntLmt from CstmrAccnt)
where CstmrAccntLmt not in (select IntegerValue from Obj where OldOrNewEntry = 'o' and IntegerValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10022
from CstmrAccnt t, Obj objTarget, Obj objOwner
where t.CstmrAccntLmt is not null and t.CstmrAccntLmt = objTarget.IntegerValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10030
from CstmrAccnt t, Obj objTarget, Obj objOwner
where t.CstmrAccntShppngCrt is not null and t.CstmrAccntShppngCrt = objTarget.oldId and t.CstmrAccntShppngCrtCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10023
from CstmrAccnt t, Obj objTarget, Obj objOwner
where t.CstmrAccntThis is not null and t.CstmrAccntThis = objTarget.oldId and t.CstmrAccntThisCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf, oldId)
select SLnk.nextval, objOwner.id, objTarget.id, 10034, relation.id
from AbstrctOrdrArtcls relation, AbstrctOrdr ownerTable, Obj objTarget, Obj objOwner
where relation.artcls = objTarget.oldId
and   relation.Cls = objTarget.instanceOf
and   relation.frm = objOwner.oldId
and   relation.frm = ownerTable.id
and   ownerTable.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10035
from AbstrctOrdr t, Obj objTarget, Obj objOwner
where t.AbstrctOrdrCstmrDlvrTm is not null and t.AbstrctOrdrCstmrDlvrTm = objTarget.oldId and t.AbstrctOrdrCstmrDlvrTmCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10036
from AbstrctOrdr t, Obj objTarget, Obj objOwner
where t.AbstrctOrdrThis is not null and t.AbstrctOrdrThis = objTarget.oldId and t.AbstrctOrdrThisCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Obj(id, instanceOf, StringValue, OldOrNewEntry)
select SObj.nextval, 2, PrdcrNm, 'n'
from (select distinct PrdcrNm from Prdcr)
where PrdcrNm not in (select StringValue from Obj where OldOrNewEntry = 'o' and StringValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10024
from Prdcr t, Obj objTarget, Obj objOwner
where t.PrdcrNm is not null and t.PrdcrNm = objTarget.StringValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10025
from Prdcr t, Obj objTarget, Obj objOwner
where t.PrdcrThis is not null and t.PrdcrThis = objTarget.oldId and t.PrdcrThisCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf, oldId)
select SLnk.nextval, objOwner.id, objTarget.id, 10037, relation.id
from ShppngCrtArtcls relation, ShppngCrt ownerTable, Obj objTarget, Obj objOwner
where relation.artcls = objTarget.oldId
and   relation.Cls = objTarget.instanceOf
and   relation.frm = objOwner.oldId
and   relation.frm = ownerTable.id
and   ownerTable.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10038
from ShppngCrt t, Obj objTarget, Obj objOwner
where t.ShppngCrtThis is not null and t.ShppngCrtThis = objTarget.oldId and t.ShppngCrtThisCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10028
from ArtclStt t, Obj objTarget, Obj objOwner
where t.ArtclSttThis is not null and t.ArtclSttThis = objTarget.oldId and t.ArtclSttThisCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Obj(id, instanceOf, DateValue, OldOrNewEntry)
select SObj.nextval, 3, CmmnDtCrtdt, 'n'
from (select distinct CmmnDtCrtdt from CmmnDt)
where CmmnDtCrtdt not in (select DateValue from Obj where OldOrNewEntry = 'o' and DateValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10010
from CmmnDt t, Obj objTarget, Obj objOwner
where t.CmmnDtCrtdt is not null and t.CmmnDtCrtdt = objTarget.DateValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Obj(id, instanceOf, DateValue, OldOrNewEntry)
select SObj.nextval, 3, CmmnDtCmmtdt, 'n'
from (select distinct CmmnDtCmmtdt from CmmnDt)
where CmmnDtCmmtdt not in (select DateValue from Obj where OldOrNewEntry = 'o' and DateValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10011
from CmmnDt t, Obj objTarget, Obj objOwner
where t.CmmnDtCmmtdt is not null and t.CmmnDtCmmtdt = objTarget.DateValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10039
from ArtclWrppr t, Obj objTarget, Obj objOwner
where t.ArtclWrpprArtcl is not null and t.ArtclWrpprArtcl = objTarget.oldId and t.ArtclWrpprArtclCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10041
from ArtclWrppr t, Obj objTarget, Obj objOwner
where t.ArtclWrpprThis is not null and t.ArtclWrpprThis = objTarget.oldId and t.ArtclWrpprThisCls = objTarget.instanceOf and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

insert into Obj(id, instanceOf, FractionValue, OldOrNewEntry)
select SObj.nextval, 6, oawPrcAtOrdr, 'n'
from (select distinct oawPrcAtOrdr from ArtclWrppr)
where oawPrcAtOrdr not in (select FractionValue from Obj where OldOrNewEntry = 'o' and FractionValue is not null);

insert into Lnk(id, owner, target, instanceOf)
select SLnk.nextval, objOwner.id, objTarget.id, 10042
from ArtclWrppr t, Obj objTarget, Obj objOwner
where t.oawPrcAtOrdr is not null and t.oawPrcAtOrdr = objTarget.FractionValue and t.id = objOwner.oldId and t.Cls = objOwner.instanceOf;

update Obj set OldOrNewEntry = 'o' where OldOrNewEntry = 'n';

insert into Lnk(id, owner, target, instanceOf, oldId)
select SLnk.nextval, objOwner.id, objTarget.id, 10012, relation.id
from CmmndExctrCommands relation, CmmndExctr ownerTable, Obj objTarget, Obj objOwner
where relation.commands = objTarget.oldId
and   relation.Cls = objTarget.instanceOf
and   relation.frm = objOwner.oldId
and   relation.frm = ownerTable.id
and   ownerTable.Cls = objOwner.instanceOf;

alter table Lnk add CONSTRAINT FLnkOwner FOREIGN KEY (owner) REFERENCES Obj(id);
alter table Lnk add CONSTRAINT FLnkAssociation FOREIGN KEY (instanceOf) REFERENCES Association(id);
alter table Lnk3 add CONSTRAINT FLnk3Owner FOREIGN KEY (owner) REFERENCES Obj(id);
alter table Lnk3 add CONSTRAINT FLnk3Association3 FOREIGN KEY (instanceOf) REFERENCES Association3(id);
CREATE INDEX ILnkOwner ON Lnk (owner);
CREATE INDEX ILnkTarget ON Lnk (target);
CREATE INDEX ILnk3OwnerKey ON Lnk3 (owner, indxx);
CREATE INDEX ILnk3Target ON Lnk3 (target);
create table IntegerValue(
    id number primary key,
    value number not null
);

create table StringValue(
    id number primary key,
    value varchar2(2000)
);

create table DateValue(
    id number primary key,
    value Date
);

create table TimestampValue(
    id number primary key,
    value Timestamp
);

create table FractionValue(
    id number primary key,
    value varchar2(2000)
);

insert into IntegerValue(id, value)
select id, IntegerValue
from Obj
where IntegerValue is not null;
create unique index IntegerValueUnique on IntegerValue(value);

insert into StringValue(id, value)
select id, StringValue
from Obj
where StringValue is not null;
create unique index StringValueUnique on StringValue(value);

insert into DateValue(id, value)
select id, DateValue
from Obj
where DateValue is not null;
create unique index DateValueUnique on DateValue(value);

insert into TimestampValue(id, value)
select id, TimestampValue
from Obj
where TimestampValue is not null;
create unique index TimestampValueUnique on TimestampValue(value);

insert into FractionValue(id, value)
select id, FractionValue
from Obj
where FractionValue is not null;
create unique index FractionValueUnique on FractionValue(value);

alter table DeletedObjects drop constraint FDeletedObjectsInstanceOf;
alter table DeletedObjects rename to DeletedObjects_Old;
create table DeletedObjects(
    id number,
    instanceOf number not null,
    constraint FDeletedObjectsInstanceOf foreign key (instanceOf) references Cls(id)
);

insert into DeletedObjects(id, instanceOf)
select o.id, o.instanceOf
from Obj o, DeletedObjects_Old d
where o.oldId = d.id and o.instanceOf = d.instanceOf;

drop index DltdObjInx;
create unique index DltdObjInx on DeletedObjects (id, instanceOf);


alter table Srvr rename to Srvr_Old;
create or replace view Srvr as 
    select 
        o.id as id,
        o.instanceOf as Cls,
        SrvrThis.id as SrvrThis,
        SrvrThis.instanceOf as SrvrThisCls,
        SrvrPassword.value as SrvrPassword,
        SrvrUser.value as SrvrUser,
        SrvrHackCount.value as SrvrHackCount,
        SrvrHackDelay.value as SrvrHackDelay
    from
        Obj o,
        Specialization s,
        Obj SrvrThis, Lnk SrvrThis_Lnk,
        StringValue SrvrPassword, Lnk SrvrPassword_Lnk,
        StringValue SrvrUser, Lnk SrvrUser_Lnk,
        IntegerValue SrvrHackCount, Lnk SrvrHackCount_Lnk,
        TimestampValue SrvrHackDelay, Lnk SrvrHackDelay_Lnk
    where
        o.instanceOf = s.descendant and 
        s.ancestor = -102 and 
        SrvrThis_Lnk.instanceOf (+) = 10002 and o.id = SrvrThis_Lnk.owner (+) and SrvrThis_Lnk.target = SrvrThis.id (+) and 
        SrvrPassword_Lnk.instanceOf (+) = 10004 and o.id = SrvrPassword_Lnk.owner (+) and SrvrPassword_Lnk.target = SrvrPassword.id (+) and 
        SrvrUser_Lnk.instanceOf (+) = 10005 and o.id = SrvrUser_Lnk.owner (+) and SrvrUser_Lnk.target = SrvrUser.id (+) and 
        SrvrHackCount_Lnk.instanceOf (+) = 10006 and o.id = SrvrHackCount_Lnk.owner (+) and SrvrHackCount_Lnk.target = SrvrHackCount.id (+) and 
        SrvrHackDelay_Lnk.instanceOf (+) = 10007 and o.id = SrvrHackDelay_Lnk.owner (+) and SrvrHackDelay_Lnk.target = SrvrHackDelay.id (+);
    
alter table CstmrDlvrTm rename to CstmrDlvrTm_Old;
create or replace view CstmrDlvrTm as 
    select 
        o.id as id,
        o.instanceOf as Cls,
        CstmrDlvrTmPrc.value as CstmrDlvrTmPrc,
        CstmrDlvrTmDlvrTm.value as CstmrDlvrTmDlvrTm,
        CstmrDlvrTmThis.id as CstmrDlvrTmThis,
        CstmrDlvrTmThis.instanceOf as CstmrDlvrTmThisCls
    from
        Obj o,
        Specialization s,
        FractionValue CstmrDlvrTmPrc, Lnk CstmrDlvrTmPrc_Lnk,
        IntegerValue CstmrDlvrTmDlvrTm, Lnk CstmrDlvrTmDlvrTm_Lnk,
        Obj CstmrDlvrTmThis, Lnk CstmrDlvrTmThis_Lnk
    where
        o.instanceOf = s.descendant and 
        s.ancestor = 150 and 
        CstmrDlvrTmPrc_Lnk.instanceOf (+) = 10031 and o.id = CstmrDlvrTmPrc_Lnk.owner (+) and CstmrDlvrTmPrc_Lnk.target = CstmrDlvrTmPrc.id (+) and 
        CstmrDlvrTmDlvrTm_Lnk.instanceOf (+) = 10032 and o.id = CstmrDlvrTmDlvrTm_Lnk.owner (+) and CstmrDlvrTmDlvrTm_Lnk.target = CstmrDlvrTmDlvrTm.id (+) and 
        CstmrDlvrTmThis_Lnk.instanceOf (+) = 10033 and o.id = CstmrDlvrTmThis_Lnk.owner (+) and CstmrDlvrTmThis_Lnk.target = CstmrDlvrTmThis.id (+);
    
alter table CmmndCrdntr rename to CmmndCrdntr_Old;
create or replace view CmmndCrdntr as 
    select 
        o.id as id,
        o.instanceOf as Cls
    from
        Obj o,
        Specialization s
    where
        o.instanceOf = s.descendant and 
        s.ancestor = -101;
    
alter table QntfdArtcl rename to QntfdArtcl_Old;
create or replace view QntfdArtcl as 
    select 
        o.id as id,
        o.instanceOf as Cls,
        QntfdArtclQntt.value as QntfdArtclQntt,
        QntfdArtclThis.id as QntfdArtclThis,
        QntfdArtclThis.instanceOf as QntfdArtclThisCls,
        oqaArtcl.id as oqaArtcl,
        oqaArtcl.instanceOf as oqaArtclCls,
        scqaArtcl.id as scqaArtcl,
        scqaArtcl.instanceOf as scqaArtclCls
    from
        Obj o,
        Specialization s,
        IntegerValue QntfdArtclQntt, Lnk QntfdArtclQntt_Lnk,
        Obj QntfdArtclThis, Lnk QntfdArtclThis_Lnk,
        Obj oqaArtcl, Lnk oqaArtcl_Lnk,
        Obj scqaArtcl, Lnk scqaArtcl_Lnk
    where
        o.instanceOf = s.descendant and 
        s.ancestor = 128 and 
        QntfdArtclQntt_Lnk.instanceOf (+) = 10026 and o.id = QntfdArtclQntt_Lnk.owner (+) and QntfdArtclQntt_Lnk.target = QntfdArtclQntt.id (+) and 
        QntfdArtclThis_Lnk.instanceOf (+) = 10027 and o.id = QntfdArtclThis_Lnk.owner (+) and QntfdArtclThis_Lnk.target = QntfdArtclThis.id (+) and 
        oqaArtcl_Lnk.instanceOf (+) = 10043 and o.id = oqaArtcl_Lnk.owner (+) and oqaArtcl_Lnk.target = oqaArtcl.id (+) and 
        scqaArtcl_Lnk.instanceOf (+) = 10044 and o.id = scqaArtcl_Lnk.owner (+) and scqaArtcl_Lnk.target = scqaArtcl.id (+);
    
alter table Cmpnnt rename to Cmpnnt_Old;
create or replace view Cmpnnt as 
    select 
        o.id as id,
        o.instanceOf as Cls,
        CmpnntThis.id as CmpnntThis,
        CmpnntThis.instanceOf as CmpnntThisCls,
        ArtclNm.value as ArtclNm,
        ArtclPrc.value as ArtclPrc,
        ArtclMnStck.value as ArtclMnStck,
        ArtclMxStck.value as ArtclMxStck,
        ArtclCrrntStck.value as ArtclCrrntStck,
        ArtclPrdcrDlvrTm.value as ArtclPrdcrDlvrTm,
        ArtclPrdcr.id as ArtclPrdcr,
        ArtclPrdcr.instanceOf as ArtclPrdcrCls,
        ArtclStt.id as ArtclStt,
        ArtclStt.instanceOf as ArtclSttCls
    from
        Obj o,
        Specialization s,
        Obj CmpnntThis, Lnk CmpnntThis_Lnk,
        StringValue ArtclNm, Lnk ArtclNm_Lnk,
        FractionValue ArtclPrc, Lnk ArtclPrc_Lnk,
        IntegerValue ArtclMnStck, Lnk ArtclMnStck_Lnk,
        IntegerValue ArtclMxStck, Lnk ArtclMxStck_Lnk,
        IntegerValue ArtclCrrntStck, Lnk ArtclCrrntStck_Lnk,
        IntegerValue ArtclPrdcrDlvrTm, Lnk ArtclPrdcrDlvrTm_Lnk,
        Obj ArtclPrdcr, Lnk ArtclPrdcr_Lnk,
        Obj ArtclStt, Lnk ArtclStt_Lnk
    where
        o.instanceOf = s.descendant and 
        s.ancestor = 131 and 
        CmpnntThis_Lnk.instanceOf (+) = 10029 and o.id = CmpnntThis_Lnk.owner (+) and CmpnntThis_Lnk.target = CmpnntThis.id (+) and 
        ArtclNm_Lnk.instanceOf (+) = 10014 and o.id = ArtclNm_Lnk.owner (+) and ArtclNm_Lnk.target = ArtclNm.id (+) and 
        ArtclPrc_Lnk.instanceOf (+) = 10015 and o.id = ArtclPrc_Lnk.owner (+) and ArtclPrc_Lnk.target = ArtclPrc.id (+) and 
        ArtclMnStck_Lnk.instanceOf (+) = 10016 and o.id = ArtclMnStck_Lnk.owner (+) and ArtclMnStck_Lnk.target = ArtclMnStck.id (+) and 
        ArtclMxStck_Lnk.instanceOf (+) = 10017 and o.id = ArtclMxStck_Lnk.owner (+) and ArtclMxStck_Lnk.target = ArtclMxStck.id (+) and 
        ArtclCrrntStck_Lnk.instanceOf (+) = 10018 and o.id = ArtclCrrntStck_Lnk.owner (+) and ArtclCrrntStck_Lnk.target = ArtclCrrntStck.id (+) and 
        ArtclPrdcrDlvrTm_Lnk.instanceOf (+) = 10019 and o.id = ArtclPrdcrDlvrTm_Lnk.owner (+) and ArtclPrdcrDlvrTm_Lnk.target = ArtclPrdcrDlvrTm.id (+) and 
        ArtclPrdcr_Lnk.instanceOf (+) = 10020 and o.id = ArtclPrdcr_Lnk.owner (+) and ArtclPrdcr_Lnk.target = ArtclPrdcr.id (+) and 
        ArtclStt_Lnk.instanceOf (+) = 10045 and o.id = ArtclStt_Lnk.owner (+) and ArtclStt_Lnk.target = ArtclStt.id (+);
    
alter table CstmrAccnt rename to CstmrAccnt_Old;
create or replace view CstmrAccnt as 
    select 
        o.id as id,
        o.instanceOf as Cls,
        CstmrAccntBlnc.value as CstmrAccntBlnc,
        CstmrAccntLmt.value as CstmrAccntLmt,
        CstmrAccntShppngCrt.id as CstmrAccntShppngCrt,
        CstmrAccntShppngCrt.instanceOf as CstmrAccntShppngCrtCls,
        CstmrAccntThis.id as CstmrAccntThis,
        CstmrAccntThis.instanceOf as CstmrAccntThisCls
    from
        Obj o,
        Specialization s,
        FractionValue CstmrAccntBlnc, Lnk CstmrAccntBlnc_Lnk,
        IntegerValue CstmrAccntLmt, Lnk CstmrAccntLmt_Lnk,
        Obj CstmrAccntShppngCrt, Lnk CstmrAccntShppngCrt_Lnk,
        Obj CstmrAccntThis, Lnk CstmrAccntThis_Lnk
    where
        o.instanceOf = s.descendant and 
        s.ancestor = 125 and 
        CstmrAccntBlnc_Lnk.instanceOf (+) = 10021 and o.id = CstmrAccntBlnc_Lnk.owner (+) and CstmrAccntBlnc_Lnk.target = CstmrAccntBlnc.id (+) and 
        CstmrAccntLmt_Lnk.instanceOf (+) = 10022 and o.id = CstmrAccntLmt_Lnk.owner (+) and CstmrAccntLmt_Lnk.target = CstmrAccntLmt.id (+) and 
        CstmrAccntShppngCrt_Lnk.instanceOf (+) = 10030 and o.id = CstmrAccntShppngCrt_Lnk.owner (+) and CstmrAccntShppngCrt_Lnk.target = CstmrAccntShppngCrt.id (+) and 
        CstmrAccntThis_Lnk.instanceOf (+) = 10023 and o.id = CstmrAccntThis_Lnk.owner (+) and CstmrAccntThis_Lnk.target = CstmrAccntThis.id (+);
    
alter table AbstrctOrdr rename to AbstrctOrdr_Old;
create or replace view AbstrctOrdr as 
    select 
        o.id as id,
        o.instanceOf as Cls,
        AbstrctOrdrCstmrDlvrTm.id as AbstrctOrdrCstmrDlvrTm,
        AbstrctOrdrCstmrDlvrTm.instanceOf as AbstrctOrdrCstmrDlvrTmCls,
        AbstrctOrdrThis.id as AbstrctOrdrThis,
        AbstrctOrdrThis.instanceOf as AbstrctOrdrThisCls
    from
        Obj o,
        Specialization s,
        Obj AbstrctOrdrCstmrDlvrTm, Lnk AbstrctOrdrCstmrDlvrTm_Lnk,
        Obj AbstrctOrdrThis, Lnk AbstrctOrdrThis_Lnk
    where
        o.instanceOf = s.descendant and 
        s.ancestor = 151 and 
        AbstrctOrdrCstmrDlvrTm_Lnk.instanceOf (+) = 10035 and o.id = AbstrctOrdrCstmrDlvrTm_Lnk.owner (+) and AbstrctOrdrCstmrDlvrTm_Lnk.target = AbstrctOrdrCstmrDlvrTm.id (+) and 
        AbstrctOrdrThis_Lnk.instanceOf (+) = 10036 and o.id = AbstrctOrdrThis_Lnk.owner (+) and AbstrctOrdrThis_Lnk.target = AbstrctOrdrThis.id (+);
    
alter table Prdcr rename to Prdcr_Old;
create or replace view Prdcr as 
    select 
        o.id as id,
        o.instanceOf as Cls,
        PrdcrNm.value as PrdcrNm,
        PrdcrThis.id as PrdcrThis,
        PrdcrThis.instanceOf as PrdcrThisCls
    from
        Obj o,
        Specialization s,
        StringValue PrdcrNm, Lnk PrdcrNm_Lnk,
        Obj PrdcrThis, Lnk PrdcrThis_Lnk
    where
        o.instanceOf = s.descendant and 
        s.ancestor = 127 and 
        PrdcrNm_Lnk.instanceOf (+) = 10024 and o.id = PrdcrNm_Lnk.owner (+) and PrdcrNm_Lnk.target = PrdcrNm.id (+) and 
        PrdcrThis_Lnk.instanceOf (+) = 10025 and o.id = PrdcrThis_Lnk.owner (+) and PrdcrThis_Lnk.target = PrdcrThis.id (+);
    
alter table ShppngCrt rename to ShppngCrt_Old;
create or replace view ShppngCrt as 
    select 
        o.id as id,
        o.instanceOf as Cls,
        ShppngCrtThis.id as ShppngCrtThis,
        ShppngCrtThis.instanceOf as ShppngCrtThisCls
    from
        Obj o,
        Specialization s,
        Obj ShppngCrtThis, Lnk ShppngCrtThis_Lnk
    where
        o.instanceOf = s.descendant and 
        s.ancestor = 152 and 
        ShppngCrtThis_Lnk.instanceOf (+) = 10038 and o.id = ShppngCrtThis_Lnk.owner (+) and ShppngCrtThis_Lnk.target = ShppngCrtThis.id (+);
    
alter table ArtclStt rename to ArtclStt_Old;
create or replace view ArtclStt as 
    select 
        o.id as id,
        o.instanceOf as Cls,
        ArtclSttThis.id as ArtclSttThis,
        ArtclSttThis.instanceOf as ArtclSttThisCls
    from
        Obj o,
        Specialization s,
        Obj ArtclSttThis, Lnk ArtclSttThis_Lnk
    where
        o.instanceOf = s.descendant and 
        s.ancestor = 129 and 
        ArtclSttThis_Lnk.instanceOf (+) = 10028 and o.id = ArtclSttThis_Lnk.owner (+) and ArtclSttThis_Lnk.target = ArtclSttThis.id (+);
    
alter table CmmnDt rename to CmmnDt_Old;
create or replace view CmmnDt as 
    select 
        o.id as id,
        o.instanceOf as Cls,
        CmmnDtCrtdt.value as CmmnDtCrtdt,
        CmmnDtCmmtdt.value as CmmnDtCmmtdt
    from
        Obj o,
        Specialization s,
        DateValue CmmnDtCrtdt, Lnk CmmnDtCrtdt_Lnk,
        DateValue CmmnDtCmmtdt, Lnk CmmnDtCmmtdt_Lnk
    where
        o.instanceOf = s.descendant and 
        s.ancestor = 104 and 
        CmmnDtCrtdt_Lnk.instanceOf (+) = 10010 and o.id = CmmnDtCrtdt_Lnk.owner (+) and CmmnDtCrtdt_Lnk.target = CmmnDtCrtdt.id (+) and 
        CmmnDtCmmtdt_Lnk.instanceOf (+) = 10011 and o.id = CmmnDtCmmtdt_Lnk.owner (+) and CmmnDtCmmtdt_Lnk.target = CmmnDtCmmtdt.id (+);
    
alter table ArtclWrppr rename to ArtclWrppr_Old;
create or replace view ArtclWrppr as 
    select 
        o.id as id,
        o.instanceOf as Cls,
        ArtclWrpprArtcl.id as ArtclWrpprArtcl,
        ArtclWrpprArtcl.instanceOf as ArtclWrpprArtclCls,
        ArtclWrpprThis.id as ArtclWrpprThis,
        ArtclWrpprThis.instanceOf as ArtclWrpprThisCls,
        oawPrcAtOrdr.value as oawPrcAtOrdr
    from
        Obj o,
        Specialization s,
        Obj ArtclWrpprArtcl, Lnk ArtclWrpprArtcl_Lnk,
        Obj ArtclWrpprThis, Lnk ArtclWrpprThis_Lnk,
        FractionValue oawPrcAtOrdr, Lnk oawPrcAtOrdr_Lnk
    where
        o.instanceOf = s.descendant and 
        s.ancestor = 162 and 
        ArtclWrpprArtcl_Lnk.instanceOf (+) = 10039 and o.id = ArtclWrpprArtcl_Lnk.owner (+) and ArtclWrpprArtcl_Lnk.target = ArtclWrpprArtcl.id (+) and 
        ArtclWrpprThis_Lnk.instanceOf (+) = 10041 and o.id = ArtclWrpprThis_Lnk.owner (+) and ArtclWrpprThis_Lnk.target = ArtclWrpprThis.id (+) and 
        oawPrcAtOrdr_Lnk.instanceOf (+) = 10042 and o.id = oawPrcAtOrdr_Lnk.owner (+) and oawPrcAtOrdr_Lnk.target = oawPrcAtOrdr.id (+);
    
alter table CmmndExctr rename to CmmndExctr_Old;
create or replace view CmmndExctr as 
    select 
        o.id as id,
        o.instanceOf as Cls
    from
        Obj o,
        Specialization s
    where
        o.instanceOf = s.descendant and 
        s.ancestor = -105;
    


alter table PrdctGrpCmpnnts rename to PrdctGrpCmpnnts_Old;
create or replace view PrdctGrpCmpnnts as 
    select 
        l.id as id, 
        l.owner as frm, 
        l.target as cmpnnts,
        t.instanceOf as Cls
    from Lnk l, Obj t
    where l.target = t.id and l.instanceOf = 10013;

alter table CmmndCrdntrExctr rename to CmmndCrdntrExctr_Old;
create or replace view CmmndCrdntrExctr as 
    select 
        l.id as id, 
        l.owner as frm, 
        l.target as exctr,
        t.instanceOf as Cls
    from Lnk l, Obj t
    where l.target = t.id and l.instanceOf = 10001;

alter table AbstrctOrdrArtcls rename to AbstrctOrdrArtcls_Old;
create or replace view AbstrctOrdrArtcls as 
    select 
        l.id as id, 
        l.owner as frm, 
        l.target as artcls,
        t.instanceOf as Cls
    from Lnk l, Obj t
    where l.target = t.id and l.instanceOf = 10034;

alter table ShppngCrtArtcls rename to ShppngCrtArtcls_Old;
create or replace view ShppngCrtArtcls as 
    select 
        l.id as id, 
        l.owner as frm, 
        l.target as artcls,
        t.instanceOf as Cls
    from Lnk l, Obj t
    where l.target = t.id and l.instanceOf = 10037;

alter table CmmndExctrCommands rename to CmmndExctrCommands_Old;
create or replace view CmmndExctrCommands as 
    select 
        l.id as id, 
        l.owner as frm, 
        l.target as commands,
        t.instanceOf as Cls
    from Lnk l, Obj t
    where l.target = t.id and l.instanceOf = 10012;

