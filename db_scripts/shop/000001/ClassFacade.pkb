create or replace package body ClassFacade is

  procedure insertType(typeId number, className varchar2, concreteVal number) is
  begin
    insert into  Cls (id, name, concrete) values (typeId, className, concreteVal);
  end;

  function getTypeInfos return TypeInfoCollection is
    result TypeInfoCollection;
  begin
	open result for select * from Cls;
	return result;
  end;
  
  procedure insertSpecialization(ancestorVal number, descendantVal number) is
  test number;
  begin
    select id into test from Specialization where ancestor = descendantVal and descendant = ancestorVal;
	raise_application_error(-20000, 'Cyclic specialization');
  exception
    when no_data_found then
	  begin
	    insert into Specialization select SSpecialization.nextVal, a.ancestor, b.descendant
			   					   from Specialization a, Specialization b
								   where a.descendant = ancestorVal and b.ancestor = descendantVal
								   and (a.ancestor, b.descendant)
								     not in (select ancestor, descendant from Specialization);
	  end;
  end;

  procedure insertAssociation(associationId number, associationName varchar2, ownerId number, targetId number, complexityId number) is
  begin
  	insert into Association (id, name, owner, target, complexity) values(associationId, associationName, ownerId, targetId, complexityId);
  end;

  procedure insertAssociation3(associationId number, associationName varchar2, ownerId number, keyId number, targetId number) is
  begin
  	insert into Association3 (id, name, owner, indxx, target) values (associationId, associationName, ownerId, keyId, targetId);
  end;

  function getAssociationInfos return AssociationInfoCollection is
    result AssociationInfoCollection;
  begin
	open result for select * from Association;
	return result;
  end;

  procedure checkConcrete(typeId number) is
  /* throws exception if not */
  concr number;
  begin
    select concrete into concr from Cls where id = typeId;
	if (concr <> concreteRepresentation) then
	  raise_application_error(-20000, 'Type not concrete');
	end if;
  end;

  procedure checkHasAsDescendant(ancestorVal number, descendantVal number) is
  /* throws exception if not */
  test number;
  begin
    select id into test from Specialization where ancestor = ancestorVal and descendant = descendantVal;
  exception
    when no_data_found then raise_application_error(-20000, descendantVal || ' is not a specialization of ' || ancestorVal);
  end;

  procedure checkIfObjectExists(objectId number, classId number) is
  test number;
  /* throws exception if not */
  begin

        if classId = 167 then
            select id into test from ArtclWrppr
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 121 then
            select id into test from Cmpnnt
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 122 then
            select id into test from ArtclStt
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 148 then
            select id into test from QntfdArtcl
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = -102 then
            select id into test from Srvr
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 123 then
            select id into test from Cmpnnt
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 149 then
            select id into test from AbstrctOrdr
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 124 then
            select id into test from ArtclStt
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 150 then
            select id into test from CstmrDlvrTm
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = -101 then
            select id into test from CmmndCrdntr
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 153 then
            select id into test from QntfdArtcl
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 130 then
            select id into test from ArtclStt
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 161 then
            select id into test from ArtclWrppr
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 147 then
            select id into test from AbstrctOrdr
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 125 then
            select id into test from CstmrAccnt
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 126 then
            select id into test from ArtclStt
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 127 then
            select id into test from Prdcr
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 152 then
            select id into test from ShppngCrt
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 104 then
            select id into test from CmmnDt
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = -105 then
            select id into test from CmmndExctr
                where id = objectId and Cls = classId;
            return;
        end if;
        if classId = 163 then
            select id into test from ArtclWrppr
                where id = objectId and Cls = classId;
            return;
        end if;

    raise_application_error(-20000, 'Object does not exist! objectId: ' || objectId || ' classId: ' || classId);
  exception
    when no_data_found then raise_application_error(-20000, 'Object does not exist! objectId: ' || objectId || ' classId: ' || classId);
  end;

  procedure initialize is
  numberOfEntries number;
  begin
    select count(*) into numberOfEntries from Cls;
    if numberOfEntries = 0 then

                insertType(Integer_CN, 'Integer', 1);
                insertType(String_CN, 'String', 1);
                insertType(Date_CN, 'Date', 1);
                insertType(Text_CN, 'Text', 1);
                insertType(Timestamp_CN, 'Timestamp', 1);
                insertType(Fraction_CN, 'Fraction', 1);
                insertType(oaw_CN, 'oaw', 1);
                insertType(PrdctGrp_CN, 'PrdctGrp', 1);
                insertType(RmnngStck_CN, 'RmnngStck', 1);
                insertType(oqa_CN, 'oqa', 1);
                insertType(Srvr_CN, 'Srvr', 1);
                insertType(Artcl_CN, 'Artcl', 1);
                insertType(PrOrdr_CN, 'PrOrdr', 1);
                insertType(NtInSl_CN, 'NtInSl', 1);
                insertType(CstmrDlvrTm_CN, 'CstmrDlvrTm', 1);
                insertType(CmmndCrdntr_CN, 'CmmndCrdntr', 1);
                insertType(QntfdArtcl_CN, 'QntfdArtcl', 0);
                insertType(scqa_CN, 'scqa', 1);
                insertType(NwCrtd_CN, 'NwCrtd', 1);
                insertType(Cmpnnt_CN, 'Cmpnnt', 0);
                insertType(saw_CN, 'saw', 1);
                insertType(Ordr_CN, 'Ordr', 1);
                insertType(CstmrAccnt_CN, 'CstmrAccnt', 1);
                insertType(InSl_CN, 'InSl', 1);
                insertType(AbstrctOrdr_CN, 'AbstrctOrdr', 0);
                insertType(Prdcr_CN, 'Prdcr', 1);
                insertType(ShppngCrt_CN, 'ShppngCrt', 1);
                insertType(ArtclStt_CN, 'ArtclStt', 0);
                insertType(CmmnDt_CN, 'CmmnDt', 1);
                insertType(ArtclWrppr_CN, 'ArtclWrppr', 0);
                insertType(CmmndExctr_CN, 'CmmndExctr', 1);
                insertType(scaw_CN, 'scaw', 1);
                insertType(RmnngStckCMD_CN, 'RmnngStckCMD', 0);
                insertType(InSlCMD_CN, 'InSlCMD', 0);
                insertType(OrdrCMD_CN, 'OrdrCMD', 0);
                insertType(ErrorDisplayCMD_CN, 'ErrorDisplayCMD', 0);
                insertType(PrOrdrCMD_CN, 'PrOrdrCMD', 0);
                insertType(Anything_CN, 'Anything', 0);
                insertType(DcrtsCMD_CN, 'DcrtsCMD', 0);
                insertType(Remote_CN, 'Remote', 0);
                insertType(CmpnntCMD_CN, 'CmpnntCMD', 0);
                insertType(PrtsHIERARCHY_CN, 'PrtsHIERARCHY', 0);
                insertType(CmmnDtCMD_CN, 'CmmnDtCMD', 0);
                insertType(CMDCMD_CN, 'CMDCMD', 0);
                insertType(PrtsHIERARCHYCMD_CN, 'PrtsHIERARCHYCMD', 0);
                insertType(SrvrCMD_CN, 'SrvrCMD', 0);
                insertType(Invoker_CN, 'Invoker', 0);
                insertType(ArtclSttCMD_CN, 'ArtclSttCMD', 0);
                insertType(scawCMD_CN, 'scawCMD', 0);
                insertType(scqaCMD_CN, 'scqaCMD', 0);
                insertType(CstmrDlvrTmCMD_CN, 'CstmrDlvrTmCMD', 0);
                insertType(QntfdArtclCMD_CN, 'QntfdArtclCMD', 0);
                insertType(AnythingCMD_CN, 'AnythingCMD', 0);
                insertType(oqaCMD_CN, 'oqaCMD', 0);
                insertType(CstmrAccntCMD_CN, 'CstmrAccntCMD', 0);
                insertType(PrtsHIERARCHYSttCMD_CN, 'PrtsHIERARCHYSttCMD', 0);
                insertType(PrdcrCMD_CN, 'PrdcrCMD', 0);
                insertType(Dcrts_CN, 'Dcrts', 0);
                insertType(PrdctGrpCMD_CN, 'PrdctGrpCMD', 0);
                insertType(ArtclCMD_CN, 'ArtclCMD', 0);
                insertType(oawCMD_CN, 'oawCMD', 0);
                insertType(ShppngCrtCMD_CN, 'ShppngCrtCMD', 0);
                insertType(NwCrtdCMD_CN, 'NwCrtdCMD', 0);
                insertType(AbstrctOrdrCMD_CN, 'AbstrctOrdrCMD', 0);
                insertType(CMD_CN, 'CMD', 0);
                insertType(ArtclWrpprCMD_CN, 'ArtclWrpprCMD', 0);
                insertType(InvokerCMD_CN, 'InvokerCMD', 0);
                insertType(NtInSlCMD_CN, 'NtInSlCMD', 0);
                insertType(sawCMD_CN, 'sawCMD', 0);
                insertAssociation(oawPrcAtOrdr_AN, 'oawPrcAtOrdr', 167, 6, 0);
                insertAssociation(PrdctGrpCmpnnts_AN, 'PrdctGrpCmpnnts', 121, 131, 1);
                insertAssociation(oqaArtcl_AN, 'oqaArtcl', 148, 167, 0);
                insertAssociation(SrvrThis_AN, 'SrvrThis', -102, -102, 0);
                insertAssociation(SrvrPassword_AN, 'SrvrPassword', -102, 2, 0);
                insertAssociation(SrvrUser_AN, 'SrvrUser', -102, 2, 0);
                insertAssociation(SrvrHackCount_AN, 'SrvrHackCount', -102, 1, 0);
                insertAssociation(SrvrHackDelay_AN, 'SrvrHackDelay', -102, 5, 0);
                insertAssociation(ArtclNm_AN, 'ArtclNm', 123, 2, 0);
                insertAssociation(ArtclPrc_AN, 'ArtclPrc', 123, 6, 0);
                insertAssociation(ArtclMnStck_AN, 'ArtclMnStck', 123, 1, 0);
                insertAssociation(ArtclMxStck_AN, 'ArtclMxStck', 123, 1, 0);
                insertAssociation(ArtclCrrntStck_AN, 'ArtclCrrntStck', 123, 1, 0);
                insertAssociation(ArtclPrdcrDlvrTm_AN, 'ArtclPrdcrDlvrTm', 123, 1, 0);
                insertAssociation(ArtclPrdcr_AN, 'ArtclPrdcr', 123, 127, 0);
                insertAssociation(ArtclStt_AN, 'ArtclStt', 123, 129, 0);
                insertAssociation(CstmrDlvrTmPrc_AN, 'CstmrDlvrTmPrc', 150, 6, 0);
                insertAssociation(CstmrDlvrTmDlvrTm_AN, 'CstmrDlvrTmDlvrTm', 150, 1, 0);
                insertAssociation(CstmrDlvrTmThis_AN, 'CstmrDlvrTmThis', 150, 150, 0);
                insertAssociation(CmmndCrdntrExctr_AN, 'CmmndCrdntrExctr', -101, -105, 1);
                insertAssociation(QntfdArtclQntt_AN, 'QntfdArtclQntt', 128, 1, 0);
                insertAssociation(QntfdArtclThis_AN, 'QntfdArtclThis', 128, 128, 0);
                insertAssociation(scqaArtcl_AN, 'scqaArtcl', 153, 163, 0);
                insertAssociation(CmpnntThis_AN, 'CmpnntThis', 131, 131, 0);
                insertAssociation(CstmrAccntBlnc_AN, 'CstmrAccntBlnc', 125, 6, 0);
                insertAssociation(CstmrAccntLmt_AN, 'CstmrAccntLmt', 125, 1, 0);
                insertAssociation(CstmrAccntShppngCrt_AN, 'CstmrAccntShppngCrt', 125, 152, 0);
                insertAssociation(CstmrAccntThis_AN, 'CstmrAccntThis', 125, 125, 0);
                insertAssociation(AbstrctOrdrArtcls_AN, 'AbstrctOrdrArtcls', 151, 148, 1);
                insertAssociation(AbstrctOrdrCstmrDlvrTm_AN, 'AbstrctOrdrCstmrDlvrTm', 151, 150, 0);
                insertAssociation(AbstrctOrdrThis_AN, 'AbstrctOrdrThis', 151, 151, 0);
                insertAssociation(PrdcrNm_AN, 'PrdcrNm', 127, 2, 0);
                insertAssociation(PrdcrThis_AN, 'PrdcrThis', 127, 127, 0);
                insertAssociation(ShppngCrtArtcls_AN, 'ShppngCrtArtcls', 152, 153, 1);
                insertAssociation(ShppngCrtThis_AN, 'ShppngCrtThis', 152, 152, 0);
                insertAssociation(ArtclSttThis_AN, 'ArtclSttThis', 129, 129, 0);
                insertAssociation(CmmnDtCrtdt_AN, 'CmmnDtCrtdt', 104, 3, 0);
                insertAssociation(CmmnDtCmmtdt_AN, 'CmmnDtCmmtdt', 104, 3, 0);
                insertAssociation(ArtclWrpprArtcl_AN, 'ArtclWrpprArtcl', 162, 123, 0);
                insertAssociation(ArtclWrpprThis_AN, 'ArtclWrpprThis', 162, 162, 0);
                insertAssociation(CmmndExctrCommands_AN, 'CmmndExctrCommands', -105, 110, 1);

    end if;
    select count(*) into numberOfEntries from Specialization;
    if numberOfEntries = 0 then

                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 1, 1);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 2, 2);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 3, 3);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 5, 5);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 4, 4);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 6, 6);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 167, 167);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 121, 121);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 122, 122);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 148, 148);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, -102, -102);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 123, 123);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 149, 149);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 124, 124);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 150, 150);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, -101, -101);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 128, 128);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 153, 153);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 130, 130);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 131, 131);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 161, 161);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 147, 147);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 125, 125);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 126, 126);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 151, 151);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 127, 127);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 152, 152);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 129, 129);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 104, 104);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 162, 162);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, -105, -105);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 163, 163);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 132, 132);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 133, 133);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 154, 154);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 108, 108);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 155, 155);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 109, 109);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 111, 111);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 112, 112);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 134, 134);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 135, 135);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 114, 114);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 115, 115);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 136, 136);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 117, 117);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 107, 107);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 138, 138);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 164, 164);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 156, 156);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 157, 157);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 139, 139);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 116, 116);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 158, 158);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 140, 140);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 141, 141);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 142, 142);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 106, 106);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 143, 143);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 144, 144);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 168, 168);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 159, 159);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 145, 145);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 160, 160);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 110, 110);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 165, 165);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 113, 113);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 146, 146);
                insert into Specialization(id, ancestor, descendant) values (SSpecialization.nextVal, 166, 166);
                insertSpecialization(ArtclWrppr_CN, oaw_CN);
                insertSpecialization(Cmpnnt_CN, PrdctGrp_CN);
                insertSpecialization(ArtclStt_CN, RmnngStck_CN);
                insertSpecialization(QntfdArtcl_CN, oqa_CN);
                insertSpecialization(Invoker_CN, Srvr_CN);
                insertSpecialization(Anything_CN, Srvr_CN);
                insertSpecialization(Remote_CN, Srvr_CN);
                insertSpecialization(Cmpnnt_CN, Artcl_CN);
                insertSpecialization(AbstrctOrdr_CN, PrOrdr_CN);
                insertSpecialization(ArtclStt_CN, NtInSl_CN);
                insertSpecialization(Anything_CN, CstmrDlvrTm_CN);
                insertSpecialization(Anything_CN, CmmndCrdntr_CN);
                insertSpecialization(Anything_CN, QntfdArtcl_CN);
                insertSpecialization(QntfdArtcl_CN, scqa_CN);
                insertSpecialization(ArtclStt_CN, NwCrtd_CN);
                insertSpecialization(Anything_CN, Cmpnnt_CN);
                insertSpecialization(PrtsHIERARCHY_CN, Cmpnnt_CN);
                insertSpecialization(ArtclWrppr_CN, saw_CN);
                insertSpecialization(AbstrctOrdr_CN, Ordr_CN);
                insertSpecialization(Anything_CN, CstmrAccnt_CN);
                insertSpecialization(ArtclStt_CN, InSl_CN);
                insertSpecialization(Anything_CN, AbstrctOrdr_CN);
                insertSpecialization(Anything_CN, Prdcr_CN);
                insertSpecialization(Anything_CN, ShppngCrt_CN);
                insertSpecialization(Anything_CN, ArtclStt_CN);
                insertSpecialization(Anything_CN, CmmnDt_CN);
                insertSpecialization(Anything_CN, ArtclWrppr_CN);
                insertSpecialization(Anything_CN, CmmndExctr_CN);
                insertSpecialization(ArtclWrppr_CN, scaw_CN);
                insertSpecialization(CMD_CN, RmnngStckCMD_CN);
                insertSpecialization(CMD_CN, InSlCMD_CN);
                insertSpecialization(CMD_CN, OrdrCMD_CN);
                insertSpecialization(CMD_CN, ErrorDisplayCMD_CN);
                insertSpecialization(CMD_CN, PrOrdrCMD_CN);
                insertSpecialization(CMD_CN, DcrtsCMD_CN);
                insertSpecialization(CMD_CN, CmpnntCMD_CN);
                insertSpecialization(CMD_CN, CmmnDtCMD_CN);
                insertSpecialization(CMD_CN, CMDCMD_CN);
                insertSpecialization(CMD_CN, PrtsHIERARCHYCMD_CN);
                insertSpecialization(CMD_CN, SrvrCMD_CN);
                insertSpecialization(CMD_CN, ArtclSttCMD_CN);
                insertSpecialization(CMD_CN, scawCMD_CN);
                insertSpecialization(CMD_CN, scqaCMD_CN);
                insertSpecialization(CMD_CN, CstmrDlvrTmCMD_CN);
                insertSpecialization(CMD_CN, QntfdArtclCMD_CN);
                insertSpecialization(CMD_CN, AnythingCMD_CN);
                insertSpecialization(CMD_CN, oqaCMD_CN);
                insertSpecialization(CMD_CN, CstmrAccntCMD_CN);
                insertSpecialization(CMD_CN, PrtsHIERARCHYSttCMD_CN);
                insertSpecialization(CMD_CN, PrdcrCMD_CN);
                insertSpecialization(CMD_CN, PrdctGrpCMD_CN);
                insertSpecialization(CMD_CN, ArtclCMD_CN);
                insertSpecialization(CMD_CN, oawCMD_CN);
                insertSpecialization(CMD_CN, ShppngCrtCMD_CN);
                insertSpecialization(CMD_CN, NwCrtdCMD_CN);
                insertSpecialization(CMD_CN, AbstrctOrdrCMD_CN);
                insertSpecialization(CMD_CN, ArtclWrpprCMD_CN);
                insertSpecialization(CMD_CN, InvokerCMD_CN);
                insertSpecialization(CMD_CN, NtInSlCMD_CN);
                insertSpecialization(CMD_CN, sawCMD_CN);

    end if;
  end;

  procedure deleteObject(objectId number, classId number) is
    oldObjectId number;
    oldClassId number;
  begin
    select id,instanceof into oldObjectId,oldClassId from DeletedObjects where id = objectId and instanceOf = classId;
  exception
    when no_data_found then
      begin
        insert into DeletedObjects (id, instanceOf) values (objectId,classId);
      end;
  end;

end;
/
