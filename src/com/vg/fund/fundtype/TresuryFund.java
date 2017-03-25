package com.vg.fund.fundtype;

import com.vg.fund.share.ShareType;;

public class TresuryFund extends Fund {
	private ShareType shareType;

	@Override
	public ShareType getShareType() {
		// TODO Auto-generated method stub
		return shareType;
	}

	@Override
	public void setShareType(ShareType shareType) {
		this.shareType=shareType;
		
	}

	@Override
	public void fundFact() {
		
		System.out.println(" Tresury fund of ");
		this.getShareType().shareClass();
		
	}

}