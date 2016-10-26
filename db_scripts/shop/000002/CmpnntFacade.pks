create or replace package CmpnntFacade is
    
    type CmpnntAll is record (
        id number,
        Cls number,
        CmpnntThis number,
        CmpnntThisCls number,
        ArtclNm varchar2(2000),
        ArtclPrc varchar2(2000),
        ArtclMnStck number,
        ArtclMxStck number,
        ArtclCrrntStck number,
        ArtclPrdcrDlvrTm number,
        ArtclPrdcr number,
        ArtclPrdcrCls number,
        ArtclStt number,
        ArtclSttCls number
    );
    
    type CmpnntAllColl is ref cursor return CmpnntAll;
    
    
    function getClass(objectId number) return number;
    procedure ThisSet(CmpnntId number, ThisVal number, ThisCls number);
    
end CmpnntFacade;
/

