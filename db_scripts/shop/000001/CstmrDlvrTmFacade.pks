create or replace package CstmrDlvrTmFacade is
    
    type CstmrDlvrTmAll is record (
        id number,
        Cls number,
        CstmrDlvrTmPrc varchar2(2000),
        CstmrDlvrTmDlvrTm number,
        CstmrDlvrTmThis number,
        CstmrDlvrTmThisCls number
    );
    
    type CstmrDlvrTmAllColl is ref cursor return CstmrDlvrTmAll;
    
    
    type CstmrDlvrTmInfo is record (
        id number,
        prc varchar2(2000),
        dlvrTm number,
        This number, 
        ThisCls number        
    );
    
    type CstmrDlvrTmInfoColl is ref cursor return CstmrDlvrTmInfo;
    
    function getCstmrDlvrTm(CstmrDlvrTmId number) return CstmrDlvrTmInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newCstmrDlvrTm(prcVal varchar2,dlvrTmVal number,idCreateIfLessZero number) return number;
    function newDelayedCstmrDlvrTm return number;
    function getClass(objectId number) return number;
    procedure prcSet(CstmrDlvrTmId number, prcVal varchar2);
    procedure dlvrTmSet(CstmrDlvrTmId number, dlvrTmVal number);
    procedure ThisSet(CstmrDlvrTmId number, ThisVal number, ThisCls number);
    
end CstmrDlvrTmFacade;
/

