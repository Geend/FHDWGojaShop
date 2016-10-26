create or replace package body PrdctGrpFacade is
    
    procedure chkPrdctGrp(PrdctGrpId number) is
    currentClass number;
    begin
        select Cls into currentClass from Cmpnnt where id = PrdctGrpId;
        if currentClass <> 121 then
            raise_application_error(-20000, 'Object not of right class! Required: 121 Actual: ' || currentClass);
        end if; 
    end chkPrdctGrp;
    
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newPrdctGrp(idCreateIfLessZero number) return number is
    result number;
    begin
        if idCreateIfLessZero >=  0 then
            result := idCreateIfLessZero;
        else
            select SCmpnnt.nextVal into result from dual;
        end if;
        insert into Cmpnnt (id,Cls)
            values (result,121);
        return result;
    end newPrdctGrp;
    
    function newDelayedPrdctGrp return number is
    result number;
    begin
        select SCmpnnt.nextVal into result from dual;
        return result;
    end newDelayedPrdctGrp;
    
    function getPrdctGrp(PrdctGrpId number) return PrdctGrpInfoColl is 
    result PrdctGrpInfoColl;
    begin
        chkPrdctGrp(PrdctGrpId);
        open result for select id,CmpnntThis,CmpnntThisCls from Cmpnnt
            where id = PrdctGrpId and Cls = 121;
        return result;
    end getPrdctGrp;
    
    procedure chkSpecPrdctGrp(PrdctGrpId number) is
    currentClass number;
    begin
        select base.Cls into currentClass from Cmpnnt base, Specialization spec
             where base.id = PrdctGrpId and base.Cls = spec.descendant and spec.ancestor = 121;
    exception
        when no_data_found then
            raise_application_error(-20000, 'Object not of right class! Required specialization of: 121 Actual: ' || currentClass);
    end chkSpecPrdctGrp;
    
    function cmpnntsGet(PrdctGrpId number) return ManyServices.ManyInfoCollection is 
    result ManyServices.ManyInfoCollection;
    begin
        chkSpecPrdctGrp(PrdctGrpId);
        open result for select cmpnnts, Cls, id from PrdctGrpCmpnnts
            where frm = PrdctGrpId
            order by id asc;
        return result;
    end cmpnntsGet;
    
    function cmpnntsAdd(PrdctGrpId number, cmpnntsVal number, cmpnntsCls number) return number is
    result number;
    begin
        chkSpecPrdctGrp(PrdctGrpId);
        ClassFacade.checkIfObjectExists(cmpnntsVal, cmpnntsCls);
        ClassFacade.checkHasAsDescendant(131, cmpnntsCls);
        select SPrdctGrpCmpnnts.nextVal into result from dual;
        insert into PrdctGrpCmpnnts (id, frm, cmpnnts, Cls)
        values (result, PrdctGrpId, cmpnntsVal, cmpnntsCls);
        return result;
    end cmpnntsAdd;
    
    procedure cmpnntsRem(cmpnntsId number) is
    begin
        delete from PrdctGrpCmpnnts where id = cmpnntsId;
    end cmpnntsRem;
    
    /* Start of protected part that is not overridden by persistence generator */
    
    /* End of protected part that is not overridden by persistence generator */
    
end PrdctGrpFacade;
/

