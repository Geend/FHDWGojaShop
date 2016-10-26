create or replace package body InSlFacade is
    
    procedure chkInSl(InSlId number) is
    currentClass number;
    begin
        select Cls into currentClass from ArtclStt where id = InSlId;
        if currentClass <> 126 then
            raise_application_error(-20000, 'Object not of right class! Required: 126 Actual: ' || currentClass);
        end if; 
    end chkInSl;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newInSl(idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SArtclStt.nextVal into result from dual;
        end if;
        insert into ArtclStt (id,Cls)
            values (result,126);
        return result;
    end newInSl;
    
    function newDelayedInSl return number is
    result number;
    begin
        select SArtclStt.nextVal into result from dual;
        return result;
    end newDelayedInSl;
    
    function getInSl(InSlId number) return InSlInfoColl is 
    result InSlInfoColl;
    begin
        chkInSl(InSlId);
        open result for select id,ArtclSttThis,ArtclSttThisCls from ArtclStt
            where id = InSlId and Cls = 126;
        return result;
    end getInSl;
    
    procedure chkSpecInSl(InSlId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from ArtclStt base, Specialization spec
             where base.id = InSlId and base.Cls = spec.descendant and spec.ancestor = 126;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 126 Actual: ' || currentClass);
    end chkSpecInSl;
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end InSlFacade;
/

