create or replace package body PrdcrFacade is
    
    procedure chkPrdcr(PrdcrId number) is
    currentClass number;
    begin
        select Cls into currentClass from Prdcr where id = PrdcrId;
        if currentClass <> 127 then
            raise_application_error(-20000, 'Object not of right class! Required: 127 Actual: ' || currentClass);
        end if; 
    end chkPrdcr;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newPrdcr(nmVal varchar2,idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SPrdcr.nextVal into result from dual;
        end if;
        insert into Prdcr (id,Cls,PrdcrNm)
            values (result,127,nmVal);
        return result;
    end newPrdcr;
    
    function newDelayedPrdcr return number is
    result number;
    begin
        select SPrdcr.nextVal into result from dual;
        return result;
    end newDelayedPrdcr;
    
    function getPrdcr(PrdcrId number) return PrdcrInfoColl is 
    result PrdcrInfoColl;
    begin
        chkPrdcr(PrdcrId);
        open result for select id,PrdcrNm,PrdcrThis,PrdcrThisCls from Prdcr
            where id = PrdcrId and Cls = 127;
        return result;
    end getPrdcr;
    
    function getClass(objectId number) return number is 
    result number;
    begin
        select Cls into result from Prdcr where id = objectId;
        return result;
    end getClass;
    procedure chkSpecPrdcr(PrdcrId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from Prdcr base, Specialization spec
             where base.id = PrdcrId and base.Cls = spec.descendant and spec.ancestor = 127;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 127 Actual: ' || currentClass);
    end chkSpecPrdcr;
    
    procedure nmSet(PrdcrId number, nmVal varchar2)is
    begin 
        chkSpecPrdcr(PrdcrId);
        update Prdcr set PrdcrNm = nmVal where id = PrdcrId;
    end nmSet;
    
    
    procedure ThisSet(PrdcrId number, ThisVal number, ThisCls number)is
    begin 
        chkSpecPrdcr(PrdcrId);
        ClassFacade.checkIfObjectExists(ThisVal, ThisCls);
        ClassFacade.checkHasAsDescendant(127, ThisCls);
        update Prdcr set PrdcrThis = ThisVal where id = PrdcrId;
        update Prdcr set PrdcrThisCls = ThisCls where id = PrdcrId;
    end ThisSet;
    
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end PrdcrFacade;
/

