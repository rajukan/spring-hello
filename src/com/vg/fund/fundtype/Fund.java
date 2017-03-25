package com.vg.fund.fundtype;
import com.vg.fund.share.ShareType;

public abstract class Fund {
	private ShareType shareType;
	public abstract ShareType getShareType();
	public abstract void setShareType(ShareType shareType);
	public abstract void fundFact(); 
}
