create or replace package body NtInSlFacade is
    
    procedure chkNtInSl(NtInSlId number) is
    currentClass number;
    begin
        select Cls into currentClass from ArtclStt where id = NtInSlId;
        if currentClass <> 124 then
            raise_application_error(-20000, 'Object not of right class! Required: 124 Actual: ' || currentClass);
        end if; 
    end chkNtInSl;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newNtInSl(idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SArtclStt.nextVal into result from dual;
        end if;
        insert into ArtclStt (id,Cls)
            values (result,124);
        return result;
    end newNtInSl;
    
    function newDelayedNtInSl return number is
    result number;
    begin
        select SArtclStt.nextVal into result from dual;
        return result;
    end newDelayedNtInSl;
    
    function getNtInSl(NtInSlId number) return NtInSlInfoColl is 
    result NtInSlInfoColl;
    begin
        chkNtInSl(NtInSlId);
        open result for select id,ArtclSttThis,ArtclSttThisCls from ArtclStt
            where id = NtInSlId and Cls = 124;
        return result;
    end getNtInSl;
    
    procedure chkSpecNtInSl(NtInSlId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from ArtclStt base, Specialization spec
             where base.id = NtInSlId and base.Cls = spec.descendant and spec.ancestor = 124;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 124 Actual: ' || currentClass);
    end chkSpecNtInSl;
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end NtInSlFacade;
/

