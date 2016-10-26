create or replace package body CstmrDlvrTmFacade is
    
    procedure chkCstmrDlvrTm(CstmrDlvrTmId number) is
    currentClass number;
    begin
        select Cls into currentClass from CstmrDlvrTm where id = CstmrDlvrTmId;
        if currentClass <> 150 then
            raise_application_error(-20000, 'Object not of right class! Required: 150 Actual: ' || currentClass);
        end if; 
    end chkCstmrDlvrTm;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newCstmrDlvrTm(prcVal varchar2,dlvrTmVal number,idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SCstmrDlvrTm.nextVal into result from dual;
        end if;
        insert into CstmrDlvrTm (id,Cls,CstmrDlvrTmPrc,CstmrDlvrTmDlvrTm)
            values (result,150,prcVal,dlvrTmVal);
        return result;
    end newCstmrDlvrTm;
    
    function newDelayedCstmrDlvrTm return number is
    result number;
    begin
        select SCstmrDlvrTm.nextVal into result from dual;
        return result;
    end newDelayedCstmrDlvrTm;
    
    function getCstmrDlvrTm(CstmrDlvrTmId number) return CstmrDlvrTmInfoColl is 
    result CstmrDlvrTmInfoColl;
    begin
        chkCstmrDlvrTm(CstmrDlvrTmId);
        open result for select id,CstmrDlvrTmPrc,CstmrDlvrTmDlvrTm,CstmrDlvrTmThis,CstmrDlvrTmThisCls from CstmrDlvrTm
            where id = CstmrDlvrTmId and Cls = 150;
        return result;
    end getCstmrDlvrTm;
    
    function getClass(objectId number) return number is 
    result number;
    begin
        select Cls into result from CstmrDlvrTm where id = objectId;
        return result;
    end getClass;
    procedure chkSpecCstmrDlvrTm(CstmrDlvrTmId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from CstmrDlvrTm base, Specialization spec
             where base.id = CstmrDlvrTmId and base.Cls = spec.descendant and spec.ancestor = 150;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 150 Actual: ' || currentClass);
    end chkSpecCstmrDlvrTm;
    
    procedure prcSet(CstmrDlvrTmId number, prcVal varchar2)is
    begin 
        chkSpecCstmrDlvrTm(CstmrDlvrTmId);
        update CstmrDlvrTm set CstmrDlvrTmPrc = prcVal where id = CstmrDlvrTmId;
    end prcSet;
    
    
    procedure dlvrTmSet(CstmrDlvrTmId number, dlvrTmVal number)is
    begin 
        chkSpecCstmrDlvrTm(CstmrDlvrTmId);
        update CstmrDlvrTm set CstmrDlvrTmDlvrTm = dlvrTmVal where id = CstmrDlvrTmId;
    end dlvrTmSet;
    
    
    procedure ThisSet(CstmrDlvrTmId number, ThisVal number, ThisCls number)is
    begin 
        chkSpecCstmrDlvrTm(CstmrDlvrTmId);
        ClassFacade.checkIfObjectExists(ThisVal, ThisCls);
        ClassFacade.checkHasAsDescendant(150, ThisCls);
        update CstmrDlvrTm set CstmrDlvrTmThis = ThisVal where id = CstmrDlvrTmId;
        update CstmrDlvrTm set CstmrDlvrTmThisCls = ThisCls where id = CstmrDlvrTmId;
    end ThisSet;
    
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end CstmrDlvrTmFacade;
/

