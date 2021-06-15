package com.kh.interactFunding.funding.model.service;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.interactFunding.funding.model.dao.FundingDao;
import com.kh.interactFunding.funding.model.vo.Attachment;
import com.kh.interactFunding.funding.model.vo.Funding;

import com.kh.interactFunding.funding.model.vo.Funding_reward;

import com.kh.interactFunding.funding.model.vo.FundingExt;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FundingServiceImpl implements FundingService{
	
	@Autowired
	private FundingDao fundingDao;
	
	//김윤수
	
	//김경태
	
	//김주연
	@Override
	public int ready1FundingInsertNo(Funding funding) {
		return fundingDao.ready1FundingInsertNo(funding);
	}
	@Override
	public int saveCharge(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return fundingDao.saveCharge(param);
	}
	@Override
	public int saveBasicInfo(FundingExt funding) {
		int result = 0;
		result = fundingDao.saveBasicInfo(funding);
		log.debug("funding = {}",funding);
		
		//attachment 등록
		if(funding.getAttachList().size() > 0) {
			for(Attachment attach: funding.getAttachList()) {
				attach.setFunding_no(funding.getFundingNo()); //이번에 발급받은 funindg pk|  attach no fk세팅
				result = insertAttachment(attach);
			}
		}	
		return result;
	}
	@Override
	public int insertAttachment(Attachment attach) {
		return fundingDao.insertAttachment(attach);
	}
	@Override
	public int saveStory(Funding funding) {
		// TODO Auto-generated method stub
		return fundingDao.saveStory(funding);
	}
	
	
	//박요한
	@Override
	public List<Funding> news(Map<String, Object> param) {
		return fundingDao.news(param);
	}
	
	@Override
	public List<Funding> community(Map<String, Object> param) {
		return fundingDao.community(param);
	}
	
	@Override
	public List<Funding> supporter(Map<String, Object> param) {
		return fundingDao.supporter(param);
	}
	
	//배기원
	@Override
	public List<Funding> indexfundingList() {
		return fundingDao.indexfundingList();
	}
	
	
	@Override
	public List<Funding> indexfundinglike() {
		// TODO Auto-generated method stub
		return fundingDao.indexfundinglike();
	}


	@Override
	public List<Funding_reward> indexfuding_rewardList() {
		return fundingDao.indexfuding_rewardList();
	}



	//이승우
	public List<Funding> fundingList(Map<String, Object> map) {
		return fundingDao.fundingList(map);
	}
	//천호현
	@Override
	public Funding selectOneFunding(int funding_no) {
		return fundingDao.selectOneFunding(funding_no);
	}

	@Override
	public List<Funding> selectFunding(int funding_no) {
		return fundingDao.selectFunding(funding_no);
	}

	
	
}
