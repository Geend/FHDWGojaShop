create or replace package body ArtclSttFacade is
    
    function getClass(objectId number) return number is 
    result number;
    begin
        select Cls into result from ArtclStt where id = objectId;
        return result;
    end getClass;
    procedure chkSpecArtclStt(ArtclSttId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from ArtclStt base, Specialization spec
             where base.id = ArtclSttId and base.Cls = spec.descendant and spec.ancestor = 129;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 129 Actual: ' || currentClass);
    end chkSpecArtclStt;
    
    procedure ThisSet(ArtclSttId number, ThisVal number, ThisCls number)is
    begin 
        chkSpecArtclStt(ArtclSttId);
        ClassFacade.checkIfObjectExists(ThisVal, ThisCls);
        ClassFacade.checkHasAsDescendant(129, ThisCls);
        update ArtclStt set ArtclSttThis = ThisVal where id = ArtclSttId;
        update ArtclStt set ArtclSttThisCls = ThisCls where id = ArtclSttId;
    end ThisSet;
    
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end ArtclSttFacade;
/

