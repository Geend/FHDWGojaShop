create or replace package PrdctGrpFacade is
    
    type PrdctGrpInfo is record (
        id number,
        This number, 
        ThisCls number        
    );
    
    type PrdctGrpInfoColl is ref cursor return PrdctGrpInfo;
    
    function getPrdctGrp(PrdctGrpId number) return PrdctGrpInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newPrdctGrp(idCreateIfLessZero number) return number;
    function newDelayedPrdctGrp return number;
    function cmpnntsGet(PrdctGrpId number) return ManyServices.ManyInfoCollection;
    function cmpnntsAdd(PrdctGrpId number, cmpnntsVal number, cmpnntsCls number) return number;
    procedure cmpnntsRem(cmpnntsId number);
    
end PrdctGrpFacade;
/

