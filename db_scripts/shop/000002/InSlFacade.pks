create or replace package InSlFacade is
    
    type InSlInfo is record (
        id number,
        This number, 
        ThisCls number        
    );
    
    type InSlInfoColl is ref cursor return InSlInfo;
    
    function getInSl(InSlId number) return InSlInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newInSl(idCreateIfLessZero number) return number;
    function newDelayedInSl return number;
    
end InSlFacade;
/

