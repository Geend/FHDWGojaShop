create or replace package oawFacade is
    
    type oawInfo is record (
        id number,
        artcl number, 
        artclCls number,
        This number, 
        ThisCls number,
        prcAtOrdr varchar2(2000)        
    );
    
    type oawInfoColl is ref cursor return oawInfo;
    
    function getoaw(oawId number) return oawInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newoaw(prcAtOrdrVal varchar2,idCreateIfLessZero number) return number;
    function newDelayedoaw return number;
    procedure prcAtOrdrSet(oawId number, prcAtOrdrVal varchar2);
    
end oawFacade;
/

