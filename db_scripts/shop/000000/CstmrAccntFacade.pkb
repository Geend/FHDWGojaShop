create or replace package body CstmrAccntFacade is
    
    procedure chkCstmrAccnt(CstmrAccntId number) is
    currentClass number;
    begin
        select Cls into currentClass from CstmrAccnt where id = CstmrAccntId;
        if currentClass <> 125 then
            raise_application_error(-20000, 'Object not of right class! Required: 125 Actual: ' || currentClass);
        end if; 
    end chkCstmrAccnt;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newCstmrAccnt(blncVal varchar2,lmtVal number,idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SCstmrAccnt.nextVal into result from dual;
        end if;
        insert into CstmrAccnt (id,Cls,CstmrAccntBlnc,CstmrAccntLmt)
            values (result,125,blncVal,lmtVal);
        return result;
    end newCstmrAccnt;
    
    function newDelayedCstmrAccnt return number is
    result number;
    begin
        select SCstmrAccnt.nextVal into result from dual;
        return result;
    end newDelayedCstmrAccnt;
    
    function getCstmrAccnt(CstmrAccntId number) return CstmrAccntInfoColl is 
    result CstmrAccntInfoColl;
    begin
        chkCstmrAccnt(CstmrAccntId);
        open result for select id,CstmrAccntBlnc,CstmrAccntLmt,CstmrAccntShppngCrt,CstmrAccntShppngCrtCls,CstmrAccntThis,CstmrAccntThisCls from CstmrAccnt
            where id = CstmrAccntId and Cls = 125;
        return result;
    end getCstmrAccnt;
    
    function getClass(objectId number) return number is 
    result number;
    begin
        select Cls into result from CstmrAccnt where id = objectId;
        return result;
    end getClass;
    procedure chkSpecCstmrAccnt(CstmrAccntId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from CstmrAccnt base, Specialization spec
             where base.id = CstmrAccntId and base.Cls = spec.descendant and spec.ancestor = 125;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 125 Actual: ' || currentClass);
    end chkSpecCstmrAccnt;
    
    procedure blncSet(CstmrAccntId number, blncVal varchar2)is
    begin 
        chkSpecCstmrAccnt(CstmrAccntId);
        update CstmrAccnt set CstmrAccntBlnc = blncVal where id = CstmrAccntId;
    end blncSet;
    
    
    procedure lmtSet(CstmrAccntId number, lmtVal number)is
    begin 
        chkSpecCstmrAccnt(CstmrAccntId);
        update CstmrAccnt set CstmrAccntLmt = lmtVal where id = CstmrAccntId;
    end lmtSet;
    
    
    procedure shppngCrtSet(CstmrAccntId number, shppngCrtVal number, shppngCrtCls number)is
    begin 
        chkSpecCstmrAccnt(CstmrAccntId);
        ClassFacade.checkIfObjectExists(shppngCrtVal, shppngCrtCls);
        ClassFacade.checkHasAsDescendant(152, shppngCrtCls);
        update CstmrAccnt set CstmrAccntShppngCrt = shppngCrtVal where id = CstmrAccntId;
        update CstmrAccnt set CstmrAccntShppngCrtCls = shppngCrtCls where id = CstmrAccntId;
    end shppngCrtSet;
    
    
    procedure ThisSet(CstmrAccntId number, ThisVal number, ThisCls number)is
    begin 
        chkSpecCstmrAccnt(CstmrAccntId);
        ClassFacade.checkIfObjectExists(ThisVal, ThisCls);
        ClassFacade.checkHasAsDescendant(125, ThisCls);
        update CstmrAccnt set CstmrAccntThis = ThisVal where id = CstmrAccntId;
        update CstmrAccnt set CstmrAccntThisCls = ThisCls where id = CstmrAccntId;
    end ThisSet;
    
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end CstmrAccntFacade;
/

