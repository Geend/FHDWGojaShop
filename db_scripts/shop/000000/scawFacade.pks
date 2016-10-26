create or replace package scawFacade is
    
    type scawInfo is record (
        id number,
        artcl number, 
        artclCls number,
        This number, 
        ThisCls number        
    );
    
    type scawInfoColl is ref cursor return scawInfo;
    
    function getscaw(scawId number) return scawInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newscaw(idCreateIfLessZero number) return number;
    function newDelayedscaw return number;
    
end scawFacade;
/

