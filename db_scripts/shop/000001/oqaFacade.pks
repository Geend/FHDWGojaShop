create or replace package oqaFacade is
    
    type oqaInfo is record (
        id number,
        qntt number,
        This number, 
        ThisCls number,
        artcl number, 
        artclCls number        
    );
    
    type oqaInfoColl is ref cursor return oqaInfo;
    
    function getoqa(oqaId number) return oqaInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newoqa(qnttVal number,idCreateIfLessZero number) return number;
    function newDelayedoqa return number;
    procedure artclSet(oqaId number, artclVal number, artclCls number);
    
end oqaFacade;
/

