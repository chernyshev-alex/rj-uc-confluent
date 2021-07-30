package com.rj.gd.streams.uc2;

import com.rj.gd.streams.uc2.types.gen.Notification;
import com.rj.gd.streams.uc2.types.gen.PosInvoice;

public class RecordBuilder {

    static Notification getNotification(PosInvoice invoice) {
        Notification notification =  new Notification();
        notification.setInvoiceNumber(invoice.getInvoiceNo());
        notification.setCustomerCardNo(invoice.getCustomerCardNo());
        notification.setTotalAmount(invoice.getTotalAmount());
        notification.setEarnedLoyaltyPoints(invoice.getTotalAmount() * 0.2f);
        return notification;
    }

}
