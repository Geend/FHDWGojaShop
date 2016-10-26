create or replace package body oqaFacade is
    
    procedure chkoqa(oqaId number) is
    currentClass number;
    begin
        select Cls into currentClass from QntfdArtcl where id = oqaId;
        if currentClass <> 148 then
            raise_application_error(-20000, 'Object not of right class! Required: 148 Actual: ' || currentClass);
        end if; 
    end chkoqa;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newoqa(qnttVal number,idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SQntfdArtcl.nextVal into result from dual;
        end if;
        insert into QntfdArtcl (id,Cls,QntfdArtclQntt)
            values (result,148,qnttVal);
        return result;
    end newoqa;
    
    function newDelayedoqa return number is
    result number;
    begin
        select SQntfdArtcl.nextVal into result from dual;
        return result;
    end newDelayedoqa;
    
    function getoqa(oqaId number) return oqaInfoColl is 
    result oqaInfoColl;
    begin
        chkoqa(oqaId);
        open result for select id,QntfdArtclQntt,QntfdArtclThis,QntfdArtclThisCls,oqaArtcl,oqaArtclCls from QntfdArtcl
            where id = oqaId and Cls = 148;
        return result;
    end getoqa;
    
    procedure chkSpecoqa(oqaId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from QntfdArtcl base, Specialization spec
             where base.id = oqaId and base.Cls = spec.descendant and spec.ancestor = 148;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 148 Actual: ' || currentClass);
    end chkSpecoqa;
    
    procedure artclSet(oqaId number, artclVal number, artclCls number)is
    begin 
        chkSpecoqa(oqaId);
        ClassFacade.checkIfObjectExists(artclVal, artclCls);
        ClassFacade.checkHasAsDescendant(167, artclCls);
        update QntfdArtcl set oqaArtcl = artclVal where id = oqaId;
        update QntfdArtcl set oqaArtclCls = artclCls where id = oqaId;
    end artclSet;
    
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end oqaFacade;
/

