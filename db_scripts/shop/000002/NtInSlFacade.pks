create or replace package NtInSlFacade is
    
    type NtInSlInfo is record (
        id number,
        This number, 
        ThisCls number        
    );
    
    type NtInSlInfoColl is ref cursor return NtInSlInfo;
    
    function getNtInSl(NtInSlId number) return NtInSlInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newNtInSl(idCreateIfLessZero number) return number;
    function newDelayedNtInSl return number;
    
end NtInSlFacade;
/

