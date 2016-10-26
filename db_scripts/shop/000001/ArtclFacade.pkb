create or replace package body ArtclFacade is
    
    procedure chkArtcl(ArtclId number) is
    currentClass number;
    begin
        select Cls into currentClass from Cmpnnt where id = ArtclId;
        if currentClass <> 123 then
            raise_application_error(-20000, 'Object not of right class! Required: 123 Actual: ' || currentClass);
        end if; 
    end chkArtcl;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newArtcl(nmVal varchar2,prcVal varchar2,mnStckVal number,mxStckVal number,crrntStckVal number,prdcrDlvrTmVal number,idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SCmpnnt.nextVal into result from dual;
        end if;
        insert into Cmpnnt (id,Cls,ArtclNm,ArtclPrc,ArtclMnStck,ArtclMxStck,ArtclCrrntStck,ArtclPrdcrDlvrTm)
            values (result,123,nmVal,prcVal,mnStckVal,mxStckVal,crrntStckVal,prdcrDlvrTmVal);
        return result;
    end newArtcl;
    
    function newDelayedArtcl return number is
    result number;
    begin
        select SCmpnnt.nextVal into result from dual;
        return result;
    end newDelayedArtcl;
    
    function getArtcl(ArtclId number) return ArtclInfoColl is 
    result ArtclInfoColl;
    begin
        chkArtcl(ArtclId);
        open result for select id,CmpnntThis,CmpnntThisCls,ArtclNm,ArtclPrc,ArtclMnStck,ArtclMxStck,ArtclCrrntStck,ArtclPrdcrDlvrTm,ArtclPrdcr,ArtclPrdcrCls,ArtclStt,ArtclSttCls from Cmpnnt
            where id = ArtclId and Cls = 123;
        return result;
    end getArtcl;
    
    procedure chkSpecArtcl(ArtclId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from Cmpnnt base, Specialization spec
             where base.id = ArtclId and base.Cls = spec.descendant and spec.ancestor = 123;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 123 Actual: ' || currentClass);
    end chkSpecArtcl;
    
    procedure nmSet(ArtclId number, nmVal varchar2)is
    begin 
        chkSpecArtcl(ArtclId);
        update Cmpnnt set ArtclNm = nmVal where id = ArtclId;
    end nmSet;
    
    
    procedure prcSet(ArtclId number, prcVal varchar2)is
    begin 
        chkSpecArtcl(ArtclId);
        update Cmpnnt set ArtclPrc = prcVal where id = ArtclId;
    end prcSet;
    
    
    procedure mnStckSet(ArtclId number, mnStckVal number)is
    begin 
        chkSpecArtcl(ArtclId);
        update Cmpnnt set ArtclMnStck = mnStckVal where id = ArtclId;
    end mnStckSet;
    
    
    procedure mxStckSet(ArtclId number, mxStckVal number)is
    begin 
        chkSpecArtcl(ArtclId);
        update Cmpnnt set ArtclMxStck = mxStckVal where id = ArtclId;
    end mxStckSet;
    
    
    procedure crrntStckSet(ArtclId number, crrntStckVal number)is
    begin 
        chkSpecArtcl(ArtclId);
        update Cmpnnt set ArtclCrrntStck = crrntStckVal where id = ArtclId;
    end crrntStckSet;
    
    
    procedure prdcrDlvrTmSet(ArtclId number, prdcrDlvrTmVal number)is
    begin 
        chkSpecArtcl(ArtclId);
        update Cmpnnt set ArtclPrdcrDlvrTm = prdcrDlvrTmVal where id = ArtclId;
    end prdcrDlvrTmSet;
    
    
    procedure prdcrSet(ArtclId number, prdcrVal number, prdcrCls number)is
    begin 
        chkSpecArtcl(ArtclId);
        ClassFacade.checkIfObjectExists(prdcrVal, prdcrCls);
        ClassFacade.checkHasAsDescendant(127, prdcrCls);
        update Cmpnnt set ArtclPrdcr = prdcrVal where id = ArtclId;
        update Cmpnnt set ArtclPrdcrCls = prdcrCls where id = ArtclId;
    end prdcrSet;
    
    
    procedure sttSet(ArtclId number, sttVal number, sttCls number)is
    begin 
        chkSpecArtcl(ArtclId);
        ClassFacade.checkIfObjectExists(sttVal, sttCls);
        ClassFacade.checkHasAsDescendant(129, sttCls);
        update Cmpnnt set ArtclStt = sttVal where id = ArtclId;
        update Cmpnnt set ArtclSttCls = sttCls where id = ArtclId;
    end sttSet;
    
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end ArtclFacade;
/

