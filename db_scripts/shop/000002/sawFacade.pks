create or replace package sawFacade is
    
    type sawInfo is record (
        id number,
        artcl number, 
        artclCls number,
        This number, 
        ThisCls number        
    );
    
    type sawInfoColl is ref cursor return sawInfo;
    
    function getsaw(sawId number) return sawInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newsaw(idCreateIfLessZero number) return number;
    function newDelayedsaw return number;
    
end sawFacade;
/

