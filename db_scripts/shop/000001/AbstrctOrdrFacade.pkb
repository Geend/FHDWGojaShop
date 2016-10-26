create or replace package body AbstrctOrdrFacade is
    
    function getClass(objectId number) return number is 
    result number;
    begin
        select Cls into result from AbstrctOrdr where id = objectId;
        return result;
    end getClass;
    procedure chkSpecAbstrctOrdr(AbstrctOrdrId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from AbstrctOrdr base, Specialization spec
             where base.id = AbstrctOrdrId and base.Cls = spec.descendant and spec.ancestor = 151;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 151 Actual: ' || currentClass);
    end chkSpecAbstrctOrdr;
    
    procedure cstmrDlvrTmSet(AbstrctOrdrId number, cstmrDlvrTmVal number, cstmrDlvrTmCls number)is
    begin 
        chkSpecAbstrctOrdr(AbstrctOrdrId);
        ClassFacade.checkIfObjectExists(cstmrDlvrTmVal, cstmrDlvrTmCls);
        ClassFacade.checkHasAsDescendant(150, cstmrDlvrTmCls);
        update AbstrctOrdr set AbstrctOrdrCstmrDlvrTm = cstmrDlvrTmVal where id = AbstrctOrdrId;
        update AbstrctOrdr set AbstrctOrdrCstmrDlvrTmCls = cstmrDlvrTmCls where id = AbstrctOrdrId;
    end cstmrDlvrTmSet;
    
    
    procedure ThisSet(AbstrctOrdrId number, ThisVal number, ThisCls number)is
    begin 
        chkSpecAbstrctOrdr(AbstrctOrdrId);
        ClassFacade.checkIfObjectExists(ThisVal, ThisCls);
        ClassFacade.checkHasAsDescendant(151, ThisCls);
        update AbstrctOrdr set AbstrctOrdrThis = ThisVal where id = AbstrctOrdrId;
        update AbstrctOrdr set AbstrctOrdrThisCls = ThisCls where id = AbstrctOrdrId;
    end ThisSet;
    
    
    function artclsGet(AbstrctOrdrId number) return ManyServices.ManyInfoCollection is 
    result ManyServices.ManyInfoCollection;
    begin
        chkSpecAbstrctOrdr(AbstrctOrdrId);
        open result for select artcls, Cls, id from AbstrctOrdrArtcls
            where frm = AbstrctOrdrId
            order by id asc;
        return result;
    end artclsGet;
    
    function artclsAdd(AbstrctOrdrId number, artclsVal number, artclsCls number) return number is
    result number;
    begin
        chkSpecAbstrctOrdr(AbstrctOrdrId);
        ClassFacade.checkIfObjectExists(artclsVal, artclsCls);
        ClassFacade.checkHasAsDescendant(148, artclsCls);
        select SAbstrctOrdrArtcls.nextVal into result from dual;
        insert into AbstrctOrdrArtcls (id, frm, artcls, Cls)
        values (result, AbstrctOrdrId, artclsVal, artclsCls);
        return result;
    end artclsAdd;
    
    procedure artclsRem(artclsId number) is
    begin
        delete from AbstrctOrdrArtcls where id = artclsId;
    end artclsRem;
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end AbstrctOrdrFacade;
/

