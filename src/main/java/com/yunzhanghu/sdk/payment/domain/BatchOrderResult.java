package com.yunzhanghu.sdk.payment.domain;



// 批量下单返回订单信息
public class BatchOrderResult {
    
    // 平台企业订单号
    private String orderId;
    
    // 综合服务平台流水号
    private String ref;
    
    // 订单金额
    private String pay;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return "BatchOrderResult{" +
             " orderId='" + orderId + '\'' + 
             ", ref='" + ref + '\'' + 
             ", pay='" + pay + '\'' + 
           '}';
    }
}