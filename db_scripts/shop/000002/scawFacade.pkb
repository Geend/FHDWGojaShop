create or replace package body scawFacade is
    
    procedure chkscaw(scawId number) is
    currentClass number;
    begin
        select Cls into currentClass from ArtclWrppr where id = scawId;
        if currentClass <> 163 then
            raise_application_error(-20000, 'Object not of right class! Required: 163 Actual: ' || currentClass);
        end if; 
    end chkscaw;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newscaw(idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SArtclWrppr.nextVal into result from dual;
        end if;
        insert into ArtclWrppr (id,Cls)
            values (result,163);
        return result;
    end newscaw;
    
    function newDelayedscaw return number is
    result number;
    begin
        select SArtclWrppr.nextVal into result from dual;
        return result;
    end newDelayedscaw;
    
    function getscaw(scawId number) return scawInfoColl is 
    result scawInfoColl;
    begin
        chkscaw(scawId);
        open result for select id,ArtclWrpprArtcl,ArtclWrpprArtclCls,ArtclWrpprThis,ArtclWrpprThisCls from ArtclWrppr
            where id = scawId and Cls = 163;
        return result;
    end getscaw;
    
    procedure chkSpecscaw(scawId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from ArtclWrppr base, Specialization spec
             where base.id = scawId and base.Cls = spec.descendant and spec.ancestor = 163;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 163 Actual: ' || currentClass);
    end chkSpecscaw;
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end scawFacade;
/

