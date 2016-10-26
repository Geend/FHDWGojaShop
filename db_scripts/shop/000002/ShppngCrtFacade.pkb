create or replace package body ShppngCrtFacade is
    
    procedure chkShppngCrt(ShppngCrtId number) is
    currentClass number;
    begin
        select Cls into currentClass from ShppngCrt where id = ShppngCrtId;
        if currentClass <> 152 then
            raise_application_error(-20000, 'Object not of right class! Required: 152 Actual: ' || currentClass);
        end if; 
    end chkShppngCrt;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newShppngCrt(idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SShppngCrt.nextVal into result from dual;
        end if;
        insert into ShppngCrt (id,Cls)
            values (result,152);
        return result;
    end newShppngCrt;
    
    function newDelayedShppngCrt return number is
    result number;
    begin
        select SShppngCrt.nextVal into result from dual;
        return result;
    end newDelayedShppngCrt;
    
    function getShppngCrt(ShppngCrtId number) return ShppngCrtInfoColl is 
    result ShppngCrtInfoColl;
    begin
        chkShppngCrt(ShppngCrtId);
        open result for select id,ShppngCrtThis,ShppngCrtThisCls from ShppngCrt
            where id = ShppngCrtId and Cls = 152;
        return result;
    end getShppngCrt;
    
    function getClass(objectId number) return number is 
    result number;
    begin
        select Cls into result from ShppngCrt where id = objectId;
        return result;
    end getClass;
    procedure chkSpecShppngCrt(ShppngCrtId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from ShppngCrt base, Specialization spec
             where base.id = ShppngCrtId and base.Cls = spec.descendant and spec.ancestor = 152;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 152 Actual: ' || currentClass);
    end chkSpecShppngCrt;
    
    procedure ThisSet(ShppngCrtId number, ThisVal number, ThisCls number)is
    begin 
        chkSpecShppngCrt(ShppngCrtId);
        ClassFacade.checkIfObjectExists(ThisVal, ThisCls);
        ClassFacade.checkHasAsDescendant(152, ThisCls);
        update ShppngCrt set ShppngCrtThis = ThisVal where id = ShppngCrtId;
        update ShppngCrt set ShppngCrtThisCls = ThisCls where id = ShppngCrtId;
    end ThisSet;
    
    
    function artclsGet(ShppngCrtId number) return ManyServices.ManyInfoCollection is 
    result ManyServices.ManyInfoCollection;
    begin
        chkSpecShppngCrt(ShppngCrtId);
        open result for select artcls, Cls, id from ShppngCrtArtcls
            where frm = ShppngCrtId
            order by id asc;
        return result;
    end artclsGet;
    
    function artclsAdd(ShppngCrtId number, artclsVal number, artclsCls number) return number is
    result number;
    begin
        chkSpecShppngCrt(ShppngCrtId);
        ClassFacade.checkIfObjectExists(artclsVal, artclsCls);
        ClassFacade.checkHasAsDescendant(153, artclsCls);
        select SShppngCrtArtcls.nextVal into result from dual;
        insert into ShppngCrtArtcls (id, frm, artcls, Cls)
        values (result, ShppngCrtId, artclsVal, artclsCls);
        return result;
    end artclsAdd;
    
    procedure artclsRem(artclsId number) is
    begin
        delete from ShppngCrtArtcls where id = artclsId;
    end artclsRem;
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end ShppngCrtFacade;
/

