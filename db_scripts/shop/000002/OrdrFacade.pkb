create or replace package body OrdrFacade is
    
    procedure chkOrdr(OrdrId number) is
    currentClass number;
    begin
        select Cls into currentClass from AbstrctOrdr where id = OrdrId;
        if currentClass <> 147 then
            raise_application_error(-20000, 'Object not of right class! Required: 147 Actual: ' || currentClass);
        end if; 
    end chkOrdr;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newOrdr(idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SAbstrctOrdr.nextVal into result from dual;
        end if;
        insert into AbstrctOrdr (id,Cls)
            values (result,147);
        return result;
    end newOrdr;
    
    function newDelayedOrdr return number is
    result number;
    begin
        select SAbstrctOrdr.nextVal into result from dual;
        return result;
    end newDelayedOrdr;
    
    function getOrdr(OrdrId number) return OrdrInfoColl is 
    result OrdrInfoColl;
    begin
        chkOrdr(OrdrId);
        open result for select id,AbstrctOrdrCstmrDlvrTm,AbstrctOrdrCstmrDlvrTmCls,AbstrctOrdrThis,AbstrctOrdrThisCls from AbstrctOrdr
            where id = OrdrId and Cls = 147;
        return result;
    end getOrdr;
    
    procedure chkSpecOrdr(OrdrId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from AbstrctOrdr base, Specialization spec
             where base.id = OrdrId and base.Cls = spec.descendant and spec.ancestor = 147;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 147 Actual: ' || currentClass);
    end chkSpecOrdr;
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end OrdrFacade;
/

