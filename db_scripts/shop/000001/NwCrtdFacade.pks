create or replace package NwCrtdFacade is
    
    type NwCrtdInfo is record (
        id number,
        This number, 
        ThisCls number        
    );
    
    type NwCrtdInfoColl is ref cursor return NwCrtdInfo;
    
    function getNwCrtd(NwCrtdId number) return NwCrtdInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newNwCrtd(idCreateIfLessZero number) return number;
    function newDelayedNwCrtd return number;
    
end NwCrtdFacade;
/

