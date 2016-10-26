create or replace package body QntfdArtclFacade is
    
    function getClass(objectId number) return number is 
    result number;
    begin
        select Cls into result from QntfdArtcl where id = objectId;
        return result;
    end getClass;
    procedure chkSpecQntfdArtcl(QntfdArtclId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from QntfdArtcl base, Specialization spec
             where base.id = QntfdArtclId and base.Cls = spec.descendant and spec.ancestor = 128;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 128 Actual: ' || currentClass);
    end chkSpecQntfdArtcl;
    
    procedure qnttSet(QntfdArtclId number, qnttVal number)is
    begin 
        chkSpecQntfdArtcl(QntfdArtclId);
        update QntfdArtcl set QntfdArtclQntt = qnttVal where id = QntfdArtclId;
    end qnttSet;
    
    
    procedure ThisSet(QntfdArtclId number, ThisVal number, ThisCls number)is
    begin 
        chkSpecQntfdArtcl(QntfdArtclId);
        ClassFacade.checkIfObjectExists(ThisVal, ThisCls);
        ClassFacade.checkHasAsDescendant(128, ThisCls);
        update QntfdArtcl set QntfdArtclThis = ThisVal where id = QntfdArtclId;
        update QntfdArtcl set QntfdArtclThisCls = ThisCls where id = QntfdArtclId;
    end ThisSet;
    
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end QntfdArtclFacade;
/

