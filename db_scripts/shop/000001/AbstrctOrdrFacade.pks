create or replace package AbstrctOrdrFacade is
    
    type AbstrctOrdrAll is record (
        id number,
        Cls number,
        AbstrctOrdrCstmrDlvrTm number,
        AbstrctOrdrCstmrDlvrTmCls number,
        AbstrctOrdrThis number,
        AbstrctOrdrThisCls number
    );
    
    type AbstrctOrdrAllColl is ref cursor return AbstrctOrdrAll;
    
    
    function getClass(objectId number) return number;
    procedure cstmrDlvrTmSet(AbstrctOrdrId number, cstmrDlvrTmVal number, cstmrDlvrTmCls number);
    procedure ThisSet(AbstrctOrdrId number, ThisVal number, ThisCls number);
    function artclsGet(AbstrctOrdrId number) return ManyServices.ManyInfoCollection;
    function artclsAdd(AbstrctOrdrId number, artclsVal number, artclsCls number) return number;
    procedure artclsRem(artclsId number);
    
end AbstrctOrdrFacade;
/

