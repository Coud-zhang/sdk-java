package com.yunzhanghu.sdk.tax.domain;




// 下载个税扣缴明细表请求
public class GetTaxFileRequest {
    
    // 商户 ID
    private String dealerId;
    
    // 商户签约主体
    private String entId;
    
    // 所属期
    private String yearMonth;
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerId() {
        return dealerId;
    }
    public void setEntId(String entId) {
        this.entId = entId;
    }

    public String getEntId() {
        return entId;
    }
    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public String getYearMonth() {
        return yearMonth;
    }


    @Override
    public String toString() {
        return "GetTaxFileRequest{" +
                ", dealerId='" + dealerId + '\'' +
                ", entId='" + entId + '\'' +
                ", yearMonth='" + yearMonth + '\'' +
                '}';
    }
}