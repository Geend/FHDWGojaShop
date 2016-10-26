create or replace package ShppngCrtFacade is
    
    type ShppngCrtAll is record (
        id number,
        Cls number,
        ShppngCrtThis number,
        ShppngCrtThisCls number
    );
    
    type ShppngCrtAllColl is ref cursor return ShppngCrtAll;
    
    
    type ShppngCrtInfo is record (
        id number,
        This number, 
        ThisCls number        
    );
    
    type ShppngCrtInfoColl is ref cursor return ShppngCrtInfo;
    
    function getShppngCrt(ShppngCrtId number) return ShppngCrtInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newShppngCrt(idCreateIfLessZero number) return number;
    function newDelayedShppngCrt return number;
    function getClass(objectId number) return number;
    procedure ThisSet(ShppngCrtId number, ThisVal number, ThisCls number);
    function artclsGet(ShppngCrtId number) return ManyServices.ManyInfoCollection;
    function artclsAdd(ShppngCrtId number, artclsVal number, artclsCls number) return number;
    procedure artclsRem(artclsId number);
    
end ShppngCrtFacade;
/

