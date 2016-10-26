create or replace package body oawFacade is
    
    procedure chkoaw(oawId number) is
    currentClass number;
    begin
        select Cls into currentClass from ArtclWrppr where id = oawId;
        if currentClass <> 167 then
            raise_application_error(-20000, 'Object not of right class! Required: 167 Actual: ' || currentClass);
        end if; 
    end chkoaw;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newoaw(prcAtOrdrVal varchar2,idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SArtclWrppr.nextVal into result from dual;
        end if;
        insert into ArtclWrppr (id,Cls,oawPrcAtOrdr)
            values (result,167,prcAtOrdrVal);
        return result;
    end newoaw;
    
    function newDelayedoaw return number is
    result number;
    begin
        select SArtclWrppr.nextVal into result from dual;
        return result;
    end newDelayedoaw;
    
    function getoaw(oawId number) return oawInfoColl is 
    result oawInfoColl;
    begin
        chkoaw(oawId);
        open result for select id,ArtclWrpprArtcl,ArtclWrpprArtclCls,ArtclWrpprThis,ArtclWrpprThisCls,oawPrcAtOrdr from ArtclWrppr
            where id = oawId and Cls = 167;
        return result;
    end getoaw;
    
    procedure chkSpecoaw(oawId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from ArtclWrppr base, Specialization spec
             where base.id = oawId and base.Cls = spec.descendant and spec.ancestor = 167;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 167 Actual: ' || currentClass);
    end chkSpecoaw;
    
    procedure prcAtOrdrSet(oawId number, prcAtOrdrVal varchar2)is
    begin 
        chkSpecoaw(oawId);
        update ArtclWrppr set oawPrcAtOrdr = prcAtOrdrVal where id = oawId;
    end prcAtOrdrSet;
    
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end oawFacade;
/

