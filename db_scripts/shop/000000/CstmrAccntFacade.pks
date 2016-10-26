create or replace package CstmrAccntFacade is
    
    type CstmrAccntAll is record (
        id number,
        Cls number,
        CstmrAccntBlnc varchar2(2000),
        CstmrAccntLmt number,
        CstmrAccntShppngCrt number,
        CstmrAccntShppngCrtCls number,
        CstmrAccntThis number,
        CstmrAccntThisCls number
    );
    
    type CstmrAccntAllColl is ref cursor return CstmrAccntAll;
    
    
    type CstmrAccntInfo is record (
        id number,
        blnc varchar2(2000),
        lmt number,
        shppngCrt number, 
        shppngCrtCls number,
        This number, 
        ThisCls number        
    );
    
    type CstmrAccntInfoColl is ref cursor return CstmrAccntInfo;
    
    function getCstmrAccnt(CstmrAccntId number) return CstmrAccntInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newCstmrAccnt(blncVal varchar2,lmtVal number,idCreateIfLessZero number) return number;
    function newDelayedCstmrAccnt return number;
    function getClass(objectId number) return number;
    procedure blncSet(CstmrAccntId number, blncVal varchar2);
    procedure lmtSet(CstmrAccntId number, lmtVal number);
    procedure shppngCrtSet(CstmrAccntId number, shppngCrtVal number, shppngCrtCls number);
    procedure ThisSet(CstmrAccntId number, ThisVal number, ThisCls number);
    
end CstmrAccntFacade;
/

