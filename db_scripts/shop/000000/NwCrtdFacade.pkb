create or replace package body NwCrtdFacade is
    
    procedure chkNwCrtd(NwCrtdId number) is
    currentClass number;
    begin
        select Cls into currentClass from ArtclStt where id = NwCrtdId;
        if currentClass <> 130 then
            raise_application_error(-20000, 'Object not of right class! Required: 130 Actual: ' || currentClass);
        end if; 
    end chkNwCrtd;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newNwCrtd(idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SArtclStt.nextVal into result from dual;
        end if;
        insert into ArtclStt (id,Cls)
            values (result,130);
        return result;
    end newNwCrtd;
    
    function newDelayedNwCrtd return number is
    result number;
    begin
        select SArtclStt.nextVal into result from dual;
        return result;
    end newDelayedNwCrtd;
    
    function getNwCrtd(NwCrtdId number) return NwCrtdInfoColl is 
    result NwCrtdInfoColl;
    begin
        chkNwCrtd(NwCrtdId);
        open result for select id,ArtclSttThis,ArtclSttThisCls from ArtclStt
            where id = NwCrtdId and Cls = 130;
        return result;
    end getNwCrtd;
    
    procedure chkSpecNwCrtd(NwCrtdId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from ArtclStt base, Specialization spec
             where base.id = NwCrtdId and base.Cls = spec.descendant and spec.ancestor = 130;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 130 Actual: ' || currentClass);
    end chkSpecNwCrtd;
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end NwCrtdFacade;
/

