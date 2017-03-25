package com.vg.singleton;

public  class Fund {
	
	private String fundDescription;

	public String getFundDescription() {
		return fundDescription;
	}

	public void setFundDescription(String fundDescription) {
		this.fundDescription = fundDescription;
	}
	
	@Override
	public boolean equals(Object obj) {
		 boolean eq =false;
		 
		if (this == obj){
			eq=true;
		}
		else if(obj instanceof Fund){
			eq=true;
		}
			
		return eq;
		
	}
	
	@Override
	public int hashCode() {
		return 17 * super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fund " + this.hashCode();
	}
	
}
