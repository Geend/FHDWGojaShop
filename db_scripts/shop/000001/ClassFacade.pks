create or replace package ClassFacade is
  
	abstractRepresentation constant number := 0;
  	concreteRepresentation constant number := 1;

	oneRepresentation constant number := 0;
  	manyRepresentation constant number := 1;

	type ObjectInfo is record(
		objectId number,
		classId number
	);
		
	type ObjectInfoCollection is ref cursor return ObjectInfo;

	type ObjectThisInfo is record(
		objectId number,
		classId number,
		thisId number,
		thisClassId number
	);
		
	type ObjectThisInfoCollection is ref cursor return ObjectThisInfo;

	type TypeInfo is record(
		typeId number,
		typeName varchar2(2000),
		abstractInfo number
	);
	
	type TypeInfoCollection is ref cursor return TypeInfo;
	
	type AssociationInfo is record(
		associationId number,
		ownerId number,
		associationName varchar2(2000),
		targetId number,
		complexityInfo number
	);
	
	type AssociationInfoCollection is ref cursor return AssociationInfo;

    Integer_CN constant number := 1;
    String_CN constant number := 2;
    Date_CN constant number := 3;
    Text_CN constant number := 4;
    Timestamp_CN constant number := 5;
    Fraction_CN constant number := 6;
    oaw_CN constant number := 167;
        oawPrcAtOrdr_AN constant number := 10042;
    PrdctGrp_CN constant number := 121;
        PrdctGrpCmpnnts_AN constant number := 10013;
    RmnngStck_CN constant number := 122;
    oqa_CN constant number := 148;
        oqaArtcl_AN constant number := 10043;
    Srvr_CN constant number := -102;
        SrvrThis_AN constant number := 10002;
        SrvrPassword_AN constant number := 10004;
        SrvrUser_AN constant number := 10005;
        SrvrHackCount_AN constant number := 10006;
        SrvrHackDelay_AN constant number := 10007;
    Artcl_CN constant number := 123;
        ArtclNm_AN constant number := 10014;
        ArtclPrc_AN constant number := 10015;
        ArtclMnStck_AN constant number := 10016;
        ArtclMxStck_AN constant number := 10017;
        ArtclCrrntStck_AN constant number := 10018;
        ArtclPrdcrDlvrTm_AN constant number := 10019;
        ArtclPrdcr_AN constant number := 10020;
        ArtclStt_AN constant number := 10045;
    PrOrdr_CN constant number := 149;
    NtInSl_CN constant number := 124;
    CstmrDlvrTm_CN constant number := 150;
        CstmrDlvrTmPrc_AN constant number := 10031;
        CstmrDlvrTmDlvrTm_AN constant number := 10032;
        CstmrDlvrTmThis_AN constant number := 10033;
    CmmndCrdntr_CN constant number := -101;
        CmmndCrdntrExctr_AN constant number := 10001;
    QntfdArtcl_CN constant number := 128;
        QntfdArtclQntt_AN constant number := 10026;
        QntfdArtclThis_AN constant number := 10027;
    scqa_CN constant number := 153;
        scqaArtcl_AN constant number := 10044;
    NwCrtd_CN constant number := 130;
    Cmpnnt_CN constant number := 131;
        CmpnntThis_AN constant number := 10029;
    saw_CN constant number := 161;
    Ordr_CN constant number := 147;
    CstmrAccnt_CN constant number := 125;
        CstmrAccntBlnc_AN constant number := 10021;
        CstmrAccntLmt_AN constant number := 10022;
        CstmrAccntShppngCrt_AN constant number := 10030;
        CstmrAccntThis_AN constant number := 10023;
    InSl_CN constant number := 126;
    AbstrctOrdr_CN constant number := 151;
        AbstrctOrdrArtcls_AN constant number := 10034;
        AbstrctOrdrCstmrDlvrTm_AN constant number := 10035;
        AbstrctOrdrThis_AN constant number := 10036;
    Prdcr_CN constant number := 127;
        PrdcrNm_AN constant number := 10024;
        PrdcrThis_AN constant number := 10025;
    ShppngCrt_CN constant number := 152;
        ShppngCrtArtcls_AN constant number := 10037;
        ShppngCrtThis_AN constant number := 10038;
    ArtclStt_CN constant number := 129;
        ArtclSttThis_AN constant number := 10028;
    CmmnDt_CN constant number := 104;
        CmmnDtCrtdt_AN constant number := 10010;
        CmmnDtCmmtdt_AN constant number := 10011;
    ArtclWrppr_CN constant number := 162;
        ArtclWrpprArtcl_AN constant number := 10039;
        ArtclWrpprThis_AN constant number := 10041;
    CmmndExctr_CN constant number := -105;
        CmmndExctrCommands_AN constant number := 10012;
    scaw_CN constant number := 163;
    RmnngStckCMD_CN constant number := 132;
    InSlCMD_CN constant number := 133;
    OrdrCMD_CN constant number := 154;
    ErrorDisplayCMD_CN constant number := 108;
    PrOrdrCMD_CN constant number := 155;
    Anything_CN constant number := 109;
    DcrtsCMD_CN constant number := 111;
    Remote_CN constant number := 112;
    CmpnntCMD_CN constant number := 134;
    PrtsHIERARCHY_CN constant number := 135;
    CmmnDtCMD_CN constant number := 114;
    CMDCMD_CN constant number := 115;
    PrtsHIERARCHYCMD_CN constant number := 136;
    SrvrCMD_CN constant number := 117;
    Invoker_CN constant number := 107;
    ArtclSttCMD_CN constant number := 138;
    scawCMD_CN constant number := 164;
    scqaCMD_CN constant number := 156;
    CstmrDlvrTmCMD_CN constant number := 157;
    QntfdArtclCMD_CN constant number := 139;
    AnythingCMD_CN constant number := 116;
    oqaCMD_CN constant number := 158;
    CstmrAccntCMD_CN constant number := 140;
    PrtsHIERARCHYSttCMD_CN constant number := 141;
    PrdcrCMD_CN constant number := 142;
    Dcrts_CN constant number := 106;
    PrdctGrpCMD_CN constant number := 143;
    ArtclCMD_CN constant number := 144;
    oawCMD_CN constant number := 168;
    ShppngCrtCMD_CN constant number := 159;
    NwCrtdCMD_CN constant number := 145;
    AbstrctOrdrCMD_CN constant number := 160;
    CMD_CN constant number := 110;
    ArtclWrpprCMD_CN constant number := 165;
    InvokerCMD_CN constant number := 113;
    NtInSlCMD_CN constant number := 146;
    sawCMD_CN constant number := 166;

  	procedure insertType(typeId number, className varchar2, concreteVal number);
  	function getTypeInfos return TypeInfoCollection;
  	procedure insertSpecialization(ancestorVal number, descendantVal number);
  	procedure insertAssociation(associationId number, associationName varchar2, ownerId number, targetId number, complexityId number);
  	procedure insertAssociation3(associationId number, associationName varchar2, ownerId number, keyId number, targetId number);
  	function getAssociationInfos return AssociationInfoCollection;
  	procedure checkConcrete(typeId number);
  	/* throws exception if not */
  	procedure checkHasAsDescendant(ancestorVal number, descendantVal number);
  	/* throws exception if not */
  	procedure checkIfObjectExists(objectId number, classId number);
  	/* throws exception if not */
	procedure initialize;
	procedure deleteObject(objectId number, classId number);
end;
/
