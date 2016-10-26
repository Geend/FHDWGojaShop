create or replace package scqaFacade is
    
    type scqaInfo is record (
        id number,
        qntt number,
        This number, 
        ThisCls number,
        artcl number, 
        artclCls number        
    );
    
    type scqaInfoColl is ref cursor return scqaInfo;
    
    function getscqa(scqaId number) return scqaInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newscqa(qnttVal number,idCreateIfLessZero number) return number;
    function newDelayedscqa return number;
    procedure artclSet(scqaId number, artclVal number, artclCls number);
    
end scqaFacade;
/

