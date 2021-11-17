package com.gubinjie.yuanyuan.service.impl;

import com.gubinjie.yuanyuan.service.QrService;
import com.gubinjie.yuanyuan.utils.QRCodeUtil;

public class QrServiceImpl implements QrService {

    @Override
    public String achieveQr(String url) {
        return QRCodeUtil.getBase64QRCode(url);
    }
}
