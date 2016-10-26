create or replace package body RmnngStckFacade is
    
    procedure chkRmnngStck(RmnngStckId number) is
    currentClass number;
    begin
        select Cls into currentClass from ArtclStt where id = RmnngStckId;
        if currentClass <> 122 then
            raise_application_error(-20000, 'Object not of right class! Required: 122 Actual: ' || currentClass);
        end if; 
    end chkRmnngStck;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newRmnngStck(idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SArtclStt.nextVal into result from dual;
        end if;
        insert into ArtclStt (id,Cls)
            values (result,122);
        return result;
    end newRmnngStck;
    
    function newDelayedRmnngStck return number is
    result number;
    begin
        select SArtclStt.nextVal into result from dual;
        return result;
    end newDelayedRmnngStck;
    
    function getRmnngStck(RmnngStckId number) return RmnngStckInfoColl is 
    result RmnngStckInfoColl;
    begin
        chkRmnngStck(RmnngStckId);
        open result for select id,ArtclSttThis,ArtclSttThisCls from ArtclStt
            where id = RmnngStckId and Cls = 122;
        return result;
    end getRmnngStck;
    
    procedure chkSpecRmnngStck(RmnngStckId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from ArtclStt base, Specialization spec
             where base.id = RmnngStckId and base.Cls = spec.descendant and spec.ancestor = 122;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 122 Actual: ' || currentClass);
    end chkSpecRmnngStck;
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end RmnngStckFacade;
/

