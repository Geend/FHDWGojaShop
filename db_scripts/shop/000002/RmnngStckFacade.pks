create or replace package RmnngStckFacade is
    
    type RmnngStckInfo is record (
        id number,
        This number, 
        ThisCls number        
    );
    
    type RmnngStckInfoColl is ref cursor return RmnngStckInfo;
    
    function getRmnngStck(RmnngStckId number) return RmnngStckInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newRmnngStck(idCreateIfLessZero number) return number;
    function newDelayedRmnngStck return number;
    
end RmnngStckFacade;
/

