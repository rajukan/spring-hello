package com.vg.fund.fundtype;

import com.vg.fund.share.ShareType;



public class BondIndexFund extends Fund {

	private ShareType shareType;
	
	@Override
	public ShareType getShareType() {
		return shareType;
	}

	@Override
	public void setShareType(ShareType shareType) {

		this.shareType=shareType;
	}

	@Override
	public void fundFact() {
		
		System.out.println(" BondIndex fund of ");
		this.getShareType().shareClass();
		
	}

	}