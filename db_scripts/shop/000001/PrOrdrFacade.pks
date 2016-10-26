create or replace package PrOrdrFacade is
    
    type PrOrdrInfo is record (
        id number,
        cstmrDlvrTm number, 
        cstmrDlvrTmCls number,
        This number, 
        ThisCls number        
    );
    
    type PrOrdrInfoColl is ref cursor return PrOrdrInfo;
    
    function getPrOrdr(PrOrdrId number) return PrOrdrInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newPrOrdr(idCreateIfLessZero number) return number;
    function newDelayedPrOrdr return number;
    
end PrOrdrFacade;
/

