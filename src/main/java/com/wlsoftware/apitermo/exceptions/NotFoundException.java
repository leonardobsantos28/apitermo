package com.wlsoftware.apitermo.exceptions;

import com.wlsoftware.apitermo.util.MessageUtils;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super(MessageUtils.NENHUM_REGISTRO_ENCONTRADO);
    }

}
