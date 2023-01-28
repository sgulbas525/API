package com.dover.assesment.pojos.payment;

import com.dover.assesment.pojos.payment.request.*;
import com.dover.assesment.utilities.DateTimeStampGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;

import java.util.HashMap;

import java.util.Set;

public class PaymentRequestConstructor {

    PaymentRequest paymentRequest;
    String paymentDateStamp;

    Debtor dbtr;

    Bank dbtr_bank;
    String dbtr_countryCode;
    String dbtr_bank_bicNb;
    String dbtr_bank_routingNb;
    String dbtr_bank_nm;

    Account dbtr_account;
    String dbtr_account_iban;
    String dbtr_account_bban;

    Creditor cdtr;
    String cdtr_countryCode;
    String cdtr_bank_bicNb;
    String cdtr_bank_routingNb;
    String cdtr_bank_nm;
    String cdtr_account_iban;
    String cdtr_account_bban;

    PaymentInformation pymtinf;
    String pymtinf_amt_ccy;
    String pymtinf_amt_amt;


    public String constructThePayload(HashMap<String, String> valuesMap) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        String constructedJson = "";
        Set<String> keys = valuesMap.keySet();

        try {
            for (String key : keys) {
                if (key.contains("dbtr")) {
                    switch (key.trim()) {
                        case "dbtr.countryCode":
                            dbtr_countryCode = valuesMap.get(key);
                            break;
                        case "dbtr.bank.bicNb":
                            dbtr_bank_bicNb = valuesMap.get(key);
                            break;
                        case "dbtr.bank.routingNb":
                            dbtr_bank_routingNb = valuesMap.get(key);
                            break;
                        case "dbtr.bank.nm":
                            dbtr_bank_nm = valuesMap.get(key);
                            break;
                        case "dbtr.account.iban":
                            dbtr_account_iban = valuesMap.get(key);
                            break;
                        case "dbtr.account.bban":
                            dbtr_account_bban = valuesMap.get(key);
                            break;
                        default:
                            throw new IllegalArgumentException("Unexpedted Value : " + key.trim());
                    }
                } else if (key.contains("cdtr.")) {
                    switch (key.trim()) {
                        case "cdtr.countryCode":
                            cdtr_countryCode = valuesMap.get(key);
                            break;
                        case "cdtr.bank.bicNb":
                            cdtr_bank_bicNb = valuesMap.get(key);
                            break;
                        case "cdtr.bank.routingNb":
                            cdtr_bank_routingNb = valuesMap.get(key);
                            break;
                        case "cdtr.bank.nm":
                            cdtr_bank_nm = valuesMap.get(key);
                            break;
                        case "cdtr.account.iban":
                            cdtr_account_iban = valuesMap.get(key);
                            break;
                        case "cdtr.account.bban":
                            cdtr_account_bban = valuesMap.get(key);
                            break;

                        default:
                            throw new IllegalArgumentException("Unexpedted Value : " + key.trim());
                    }
                } else if (key.contains("pymtinf")) {
                    switch (key.trim()) {
                        case "pymtinf.amt.ccy":
                            pymtinf_amt_ccy = valuesMap.get(key);
                            break;
                        case "pymtinf.amt.amt":
                            pymtinf_amt_amt = valuesMap.get(key);
                            break;
                        default:
                            throw new IllegalArgumentException("Unexpedted Value : " + key.trim());
                    }
                } else {
                    if (key.trim().equalsIgnoreCase("paymentDateStamp") && valuesMap.get(key).equalsIgnoreCase("Dynamic_Value")) {
                        paymentDateStamp = DateTimeStampGenerator.getCurrentDateTime();
                    } else if (key.trim().equalsIgnoreCase("paymentDateStamp")) {
                        paymentDateStamp = valuesMap.get(key);
                    }
                }
            }

            Account dbtr_account = new Account();
            dbtr_account.setBban(dbtr_account_bban);
            dbtr_account.setIban(dbtr_account_iban);


            Bank dbtr_bank = new Bank();
            dbtr_bank.setNm(dbtr_bank_nm);
            dbtr_bank.setBicNb(dbtr_bank_bicNb);
            dbtr_bank.setRoutingNb(dbtr_bank_routingNb);


            dbtr = Debtor.builder().
                    countryCode(dbtr_countryCode).
                    account(dbtr_account).
                    bank(dbtr_bank)
                    .build();

            Account cdtr_account = new Account();
            cdtr_account.setBban(cdtr_account_bban);
            cdtr_account.setIban(cdtr_account_iban);

            Bank cdtr_bank = new Bank();
            cdtr_bank.setNm(cdtr_bank_nm);
            cdtr_bank.setBicNb(cdtr_bank_bicNb);
            cdtr_bank.setRoutingNb(cdtr_bank_routingNb);

            cdtr = Creditor.builder().
                    countryCode(cdtr_countryCode).
                    account(cdtr_account).
                    bank(cdtr_bank).
                    build();


            Amt pymtinf_amt = new Amt();
            pymtinf_amt.setAmt(pymtinf_amt_amt);
            pymtinf_amt.setCcy(pymtinf_amt_ccy);

            pymtinf = PaymentInformation.
                    builder().
                    amt(pymtinf_amt)
                    .build();


//            paymentRequest = new PaymentRequest();
//            paymentRequest.setCdtr(cdtr);
//            paymentRequest.setDbtr(dbtr);
//            paymentRequest.setPymtinf(pymtinf);
//            paymentRequest.setPaymentDateStamp(paymentDateStamp);


            paymentRequest = PaymentRequest.
                    builder().
                    dbtr(dbtr).
                    cdtr(cdtr).
                    pymtinf(pymtinf)
                    .paymentDateStamp(paymentDateStamp)
                    .build();


        } catch (
                Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }


        return objectMapper.writeValueAsString(paymentRequest);
    }

}
