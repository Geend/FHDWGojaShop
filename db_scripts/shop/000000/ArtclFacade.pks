create or replace package ArtclFacade is
    
    type ArtclInfo is record (
        id number,
        This number, 
        ThisCls number,
        nm varchar2(2000),
        prc varchar2(2000),
        mnStck number,
        mxStck number,
        crrntStck number,
        prdcrDlvrTm number,
        prdcr number, 
        prdcrCls number,
        stt number, 
        sttCls number        
    );
    
    type ArtclInfoColl is ref cursor return ArtclInfo;
    
    function getArtcl(ArtclId number) return ArtclInfoColl;
    /* If idCreateIfLessZero is negative, a new id is generated. */
    function newArtcl(nmVal varchar2,prcVal varchar2,mnStckVal number,mxStckVal number,crrntStckVal number,prdcrDlvrTmVal number,idCreateIfLessZero number) return number;
    function newDelayedArtcl return number;
    procedure nmSet(ArtclId number, nmVal varchar2);
    procedure prcSet(ArtclId number, prcVal varchar2);
    procedure mnStckSet(ArtclId number, mnStckVal number);
    procedure mxStckSet(ArtclId number, mxStckVal number);
    procedure crrntStckSet(ArtclId number, crrntStckVal number);
    procedure prdcrDlvrTmSet(ArtclId number, prdcrDlvrTmVal number);
    procedure prdcrSet(ArtclId number, prdcrVal number, prdcrCls number);
    procedure sttSet(ArtclId number, sttVal number, sttCls number);
    
end ArtclFacade;
/

