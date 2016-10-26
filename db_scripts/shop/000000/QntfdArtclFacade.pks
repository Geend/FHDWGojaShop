create or replace package QntfdArtclFacade is
    
    type QntfdArtclAll is record (
        id number,
        Cls number,
        QntfdArtclQntt number,
        QntfdArtclThis number,
        QntfdArtclThisCls number,
        oqaArtcl number,
        oqaArtclCls number,
        scqaArtcl number,
        scqaArtclCls number
    );
    
    type QntfdArtclAllColl is ref cursor return QntfdArtclAll;
    
    
    function getClass(objectId number) return number;
    procedure qnttSet(QntfdArtclId number, qnttVal number);
    procedure ThisSet(QntfdArtclId number, ThisVal number, ThisCls number);
    
end QntfdArtclFacade;
/

