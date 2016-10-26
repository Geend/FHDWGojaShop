create or replace package body PrOrdrFacade is
    
    procedure chkPrOrdr(PrOrdrId number) is
    currentClass number;
    begin
        select Cls into currentClass from AbstrctOrdr where id = PrOrdrId;
        if currentClass <> 149 then
            raise_application_error(-20000, 'Object not of right class! Required: 149 Actual: ' || currentClass);
        end if; 
    end chkPrOrdr;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newPrOrdr(idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SAbstrctOrdr.nextVal into result from dual;
        end if;
        insert into AbstrctOrdr (id,Cls)
            values (result,149);
        return result;
    end newPrOrdr;
    
    function newDelayedPrOrdr return number is
    result number;
    begin
        select SAbstrctOrdr.nextVal into result from dual;
        return result;
    end newDelayedPrOrdr;
    
    function getPrOrdr(PrOrdrId number) return PrOrdrInfoColl is 
    result PrOrdrInfoColl;
    begin
        chkPrOrdr(PrOrdrId);
        open result for select id,AbstrctOrdrCstmrDlvrTm,AbstrctOrdrCstmrDlvrTmCls,AbstrctOrdrThis,AbstrctOrdrThisCls from AbstrctOrdr
            where id = PrOrdrId and Cls = 149;
        return result;
    end getPrOrdr;
    
    procedure chkSpecPrOrdr(PrOrdrId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from AbstrctOrdr base, Specialization spec
             where base.id = PrOrdrId and base.Cls = spec.descendant and spec.ancestor = 149;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 149 Actual: ' || currentClass);
    end chkSpecPrOrdr;
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end PrOrdrFacade;
/

