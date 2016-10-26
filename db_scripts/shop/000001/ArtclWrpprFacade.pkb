create or replace package body ArtclWrpprFacade is
    
    function getClass(objectId number) return number is 
    result number;
    begin
        select Cls into result from ArtclWrppr where id = objectId;
        return result;
    end getClass;
    procedure chkSpecArtclWrppr(ArtclWrpprId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from ArtclWrppr base, Specialization spec
             where base.id = ArtclWrpprId and base.Cls = spec.descendant and spec.ancestor = 162;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 162 Actual: ' || currentClass);
    end chkSpecArtclWrppr;
    
    procedure artclSet(ArtclWrpprId number, artclVal number, artclCls number)is
    begin 
        chkSpecArtclWrppr(ArtclWrpprId);
        ClassFacade.checkIfObjectExists(artclVal, artclCls);
        ClassFacade.checkHasAsDescendant(123, artclCls);
        update ArtclWrppr set ArtclWrpprArtcl = artclVal where id = ArtclWrpprId;
        update ArtclWrppr set ArtclWrpprArtclCls = artclCls where id = ArtclWrpprId;
    end artclSet;
    
    
    procedure ThisSet(ArtclWrpprId number, ThisVal number, ThisCls number)is
    begin 
        chkSpecArtclWrppr(ArtclWrpprId);
        ClassFacade.checkIfObjectExists(ThisVal, ThisCls);
        ClassFacade.checkHasAsDescendant(162, ThisCls);
        update ArtclWrppr set ArtclWrpprThis = ThisVal where id = ArtclWrpprId;
        update ArtclWrppr set ArtclWrpprThisCls = ThisCls where id = ArtclWrpprId;
    end ThisSet;
    
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end ArtclWrpprFacade;
/

