create or replace package OrdrFacade is
    
    type OrdrInfo is record (
        id number,
        cstmrDlvrTm number, 
        cstmrDlvrTmCls number,
        This number, 
        ThisCls number        
    );
    
    type OrdrInfoColl is ref cursor return OrdrInfo;
    
    function getOrdr(OrdrId number) return OrdrInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newOrdr(idCreateIfLessZero number) return number;
    function newDelayedOrdr return number;
    
end OrdrFacade;
/

