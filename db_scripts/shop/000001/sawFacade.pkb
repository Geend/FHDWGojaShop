create or replace package body sawFacade is
    
    procedure chksaw(sawId number) is
    currentClass number;
    begin
        select Cls into currentClass from ArtclWrppr where id = sawId;
        if currentClass <> 161 then
            raise_application_error(-20000, 'Object not of right class! Required: 161 Actual: ' || currentClass);
        end if; 
    end chksaw;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newsaw(idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SArtclWrppr.nextVal into result from dual;
        end if;
        insert into ArtclWrppr (id,Cls)
            values (result,161);
        return result;
    end newsaw;
    
    function newDelayedsaw return number is
    result number;
    begin
        select SArtclWrppr.nextVal into result from dual;
        return result;
    end newDelayedsaw;
    
    function getsaw(sawId number) return sawInfoColl is 
    result sawInfoColl;
    begin
        chksaw(sawId);
        open result for select id,ArtclWrpprArtcl,ArtclWrpprArtclCls,ArtclWrpprThis,ArtclWrpprThisCls from ArtclWrppr
            where id = sawId and Cls = 161;
        return result;
    end getsaw;
    
    procedure chkSpecsaw(sawId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from ArtclWrppr base, Specialization spec
             where base.id = sawId and base.Cls = spec.descendant and spec.ancestor = 161;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 161 Actual: ' || currentClass);
    end chkSpecsaw;
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end sawFacade;
/

