create or replace package PrdcrFacade is
    
    type PrdcrAll is record (
        id number,
        Cls number,
        PrdcrNm varchar2(2000),
        PrdcrThis number,
        PrdcrThisCls number
    );
    
    type PrdcrAllColl is ref cursor return PrdcrAll;
    
    
    type PrdcrInfo is record (
        id number,
        nm varchar2(2000),
        This number, 
        ThisCls number        
    );
    
    type PrdcrInfoColl is ref cursor return PrdcrInfo;
    
    function getPrdcr(PrdcrId number) return PrdcrInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newPrdcr(nmVal varchar2,idCreateIfLessZero number) return number;
    function newDelayedPrdcr return number;
    function getClass(objectId number) return number;
    procedure nmSet(PrdcrId number, nmVal varchar2);
    procedure ThisSet(PrdcrId number, ThisVal number, ThisCls number);
    
end PrdcrFacade;
/

