create or replace package body scqaFacade is
    
    procedure chkscqa(scqaId number) is
    currentClass number;
    begin
        select Cls into currentClass from QntfdArtcl where id = scqaId;
        if currentClass <> 153 then
            raise_application_error(-20000, 'Object not of right class! Required: 153 Actual: ' || currentClass);
        end if; 
    end chkscqa;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newscqa(qnttVal number,idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SQntfdArtcl.nextVal into result from dual;
        end if;
        insert into QntfdArtcl (id,Cls,QntfdArtclQntt)
            values (result,153,qnttVal);
        return result;
    end newscqa;
    
    function newDelayedscqa return number is
    result number;
    begin
        select SQntfdArtcl.nextVal into result from dual;
        return result;
    end newDelayedscqa;
    
    function getscqa(scqaId number) return scqaInfoColl is 
    result scqaInfoColl;
    begin
        chkscqa(scqaId);
        open result for select id,QntfdArtclQntt,QntfdArtclThis,QntfdArtclThisCls,scqaArtcl,scqaArtclCls from QntfdArtcl
            where id = scqaId and Cls = 153;
        return result;
    end getscqa;
    
    procedure chkSpecscqa(scqaId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from QntfdArtcl base, Specialization spec
             where base.id = scqaId and base.Cls = spec.descendant and spec.ancestor = 153;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 153 Actual: ' || currentClass);
    end chkSpecscqa;
    
    procedure artclSet(scqaId number, artclVal number, artclCls number)is
    begin 
        chkSpecscqa(scqaId);
        ClassFacade.checkIfObjectExists(artclVal, artclCls);
        ClassFacade.checkHasAsDescendant(163, artclCls);
        update QntfdArtcl set scqaArtcl = artclVal where id = scqaId;
        update QntfdArtcl set scqaArtclCls = artclCls where id = scqaId;
    end artclSet;
    
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end scqaFacade;
/

