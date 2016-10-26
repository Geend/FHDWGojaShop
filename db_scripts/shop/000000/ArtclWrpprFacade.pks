create or replace package ArtclWrpprFacade is
    
    type ArtclWrpprAll is record (
        id number,
        Cls number,
        ArtclWrpprArtcl number,
        ArtclWrpprArtclCls number,
        ArtclWrpprThis number,
        ArtclWrpprThisCls number,
        oawPrcAtOrdr varchar2(2000)
    );
    
    type ArtclWrpprAllColl is ref cursor return ArtclWrpprAll;
    
    
    function getClass(objectId number) return number;
    procedure artclSet(ArtclWrpprId number, artclVal number, artclCls number);
    procedure ThisSet(ArtclWrpprId number, ThisVal number, ThisCls number);
    
end ArtclWrpprFacade;
/

