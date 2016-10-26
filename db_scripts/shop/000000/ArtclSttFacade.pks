create or replace package ArtclSttFacade is
    
    type ArtclSttAll is record (
        id number,
        Cls number,
        ArtclSttThis number,
        ArtclSttThisCls number
    );
    
    type ArtclSttAllColl is ref cursor return ArtclSttAll;
    
    
    function getClass(objectId number) return number;
    procedure ThisSet(ArtclSttId number, ThisVal number, ThisCls number);
    
end ArtclSttFacade;
/

